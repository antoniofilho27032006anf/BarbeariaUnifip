package Test;

import Model.Servico;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ServicoDAOArquivo {

    private final String caminhoArquivo = "servicos.txt";

    public void salvarTodos(List<Servico> servicos) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(caminhoArquivo))) {
            for (Servico servico : servicos) {
                String linha = servico.getId() + ";" + servico.getDescricao() + ";" + servico.getValor();
                writer.write(linha);
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Erro ao salvar serviços: " + e.getMessage());
        }
    }

    public List<Servico> carregarTodos() {
        List<Servico> lista = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] dados = linha.split(";");
                int id = Integer.parseInt(dados[0]);
                String descricao = dados[1];
                float valor = Float.parseFloat(dados[2]);

                Servico servico = new Servico(id, descricao, valor);
                lista.add(servico);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo de serviços não encontrado. Será criado ao salvar.");
        } catch (IOException e) {
            System.err.println("Erro ao carregar serviços: " + e.getMessage());
        }
        return lista;
    }
}