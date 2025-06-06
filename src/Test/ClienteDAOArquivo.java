package Test;

import Model.Cliente;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAOArquivo {

    private final String caminhoArquivo = "clientes.txt";

    public void salvarTodos(List<Cliente> clientes) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(caminhoArquivo))) {
            for (Cliente cliente : clientes) {
                String linha = cliente.getId() + ";" + cliente.getNome() + ";" + cliente.getTelefone();
                writer.write(linha);
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Erro ao salvar clientes: " + e.getMessage());
        }
    }

    public List<Cliente> carregarTodos() {
        List<Cliente> lista = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] dados = linha.split(";");
                int id = Integer.parseInt(dados[0]);
                String nome = dados[1];
                String telefone = dados[2];

                Cliente cliente = new Cliente(id, nome, telefone);
                lista.add(cliente);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo de clientes não encontrado. Será criado ao salvar.");
        } catch (IOException e) {
            System.err.println("Erro ao carregar clientes: " + e.getMessage());
        }
        return lista;
    }
}