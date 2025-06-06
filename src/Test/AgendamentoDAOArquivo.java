package Test;

import Model.Agendamento;
import Model.Cliente;
import Model.Servico;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AgendamentoDAOArquivo {

    private final String caminhoArquivo = "agendamentos.txt";
    private final SimpleDateFormat formatoDataHora = new SimpleDateFormat("dd/MM/yyyy HH:mm");

    public void salvarTodos(List<Agendamento> agendamentos) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(caminhoArquivo))) {
            for (Agendamento ag : agendamentos) {
                String linha = ag.getId() + ";"
                        + ag.getCliente().getId() + ";"
                        + ag.getServico().getId() + ";"
                        + ag.getValor() + ";"
                        + formatoDataHora.format(ag.getData()) + ";"
                        + ag.getObservacao();
                writer.write(linha);
                writer.newLine();
            }
        } catch (IOException e) {
        }
    }

    public List<Agendamento> carregarTodos(List<Cliente> clientes, List<Servico> servicos) {
        List<Agendamento> lista = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] dados = linha.split(";");
                int id = Integer.parseInt(dados[0]);
                int clienteId = Integer.parseInt(dados[1]);
                int servicoId = Integer.parseInt(dados[2]);
                float valor = Float.parseFloat(dados[3]);
                Date data = formatoDataHora.parse(dados[4]);
                String observacao = dados[5];

                Cliente cliente = clientes.stream().filter(c -> c.getId() == clienteId).findFirst().orElse(null);
                Servico servico = servicos.stream().filter(s -> s.getId() == servicoId).findFirst().orElse(null);

                if (cliente != null && servico != null) {
                    Agendamento ag = new Agendamento(id, cliente, servico, valor, dados[4]);
                    ag.setObservacao(observacao);
                    lista.add(ag);
                }
            }
        } catch (Exception e) {
        }
        return lista;
    }
}
