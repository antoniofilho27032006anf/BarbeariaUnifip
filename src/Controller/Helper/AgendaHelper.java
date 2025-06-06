package Controller.Helper;

import Model.Agendamento;
import Model.Cliente;
import Model.Servico;
import View.Agenda;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class AgendaHelper {

    private final Agenda view;

    public AgendaHelper(Agenda view) {
        this.view = view;
    }

    public void preencherTabela(ArrayList<Agendamento> agendamentos) {
        DefaultTableModel tableModel = (DefaultTableModel) view.getjTableAgendamentos().getModel();
        tableModel.setNumRows(0);

        agendamentos.forEach((agendamento) -> {
            tableModel.addRow(new Object[]{
                agendamento.getId(),
                agendamento.getCliente().getNome(),
                agendamento.getServico().getDescricao(),
                agendamento.getValor(),
                agendamento.getDataFormatada(),
                agendamento.getHoraFormatada(),
                agendamento.getObservacao()
            });
        });
    }

    public void preencherClientes(ArrayList<Cliente> clientes) {
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getjComboBoxCampoCliente().getModel();
        comboBoxModel.removeAllElements();
        clientes.forEach((cliente) -> {
            comboBoxModel.addElement(cliente);
        });
    }

    public void preencherServicos(ArrayList<Servico> servicos) {
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getjComboBoxCampoServico().getModel();
        comboBoxModel.removeAllElements();
        servicos.forEach((servico) -> {
            comboBoxModel.addElement(servico);
        });
    }

    public Servico obterServico() {
        return (Servico) view.getjComboBoxCampoServico().getSelectedItem();
    }

    public void setarValor(float valor) {
        view.getjTextFieldCampoValor().setText(String.valueOf(valor));
    }
}