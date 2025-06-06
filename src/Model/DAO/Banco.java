package Model.DAO;

import Model.Agendamento;
import Model.Cliente;
import Model.DadosInvalidosException;
import Model.Servico;
import Model.Usuario;
import java.util.ArrayList;

public class Banco {
    public static ArrayList<Usuario> usuario;
    public static ArrayList<Cliente> cliente;
    public static ArrayList<Servico> servico; 
    public static ArrayList<Agendamento> agendamento;

    public static void inicia() throws DadosInvalidosException {
        usuario = new ArrayList<>();
        cliente = new ArrayList<>();
        servico = new ArrayList<>();
        agendamento = new ArrayList<>();

        Usuario usuario1 = new Usuario(1, "Pablo", 'M', "18/07/1990", "99999-9999", "pablo@email.com", "12345", "12345", "administrador");
        Usuario usuario2 = new Usuario(2, "Antonio", 'M', "09/05/1996", "98888-8888", "antonio@email.com", "12345", "12345", "funcionario");
        Usuario usuario3 = new Usuario(3, "Guilherme", 'M', "09/05/1996", "98888-8888", "antonio@email.com", "12345", "12345", "funcionario");

        usuario.add(usuario1);
        usuario.add(usuario2);
        usuario.add(usuario3);

        

        Cliente cliente1 = new Cliente(1, "Pablo");
        Cliente cliente2 = new Cliente(2, "Neto");
        Cliente cliente3 = new Cliente(3, "Arthur");
        Cliente cliente4 = new Cliente(4, "Sormany");
        Cliente cliente5 = new Cliente(5, "Antonio");
        Cliente cliente6 = new Cliente(6, "Guilherme");
        Cliente cliente7 = new Cliente(7, "Joao");
        Cliente cliente8 = new Cliente(8, "Carlos");
        Cliente cliente9 = new Cliente(9, "Amaurylio");
        Cliente cliente10 = new Cliente(10, "Antonio");

        cliente.add(cliente1); 
        cliente.add(cliente2);
        cliente.add(cliente3);
        cliente.add(cliente4);
        cliente.add(cliente5);
        cliente.add(cliente6);
        cliente.add(cliente7);
        cliente.add(cliente8);
        cliente.add(cliente9);
        cliente.add(cliente10);

        Servico servico1 = new Servico(1, "Corte Simples", 18);
        Servico servico2 = new Servico(2, "Corte Degrade", 30);
        Servico servico3 = new Servico(3, "Barba Simples", 15);
        Servico servico4 = new Servico(4, "Barba Desenhada", 25);
        Servico servico5 = new Servico(5, "Sombrancelhas", 10);
        Servico servico6 = new Servico(6, "Penteados", 35);

        servico.add(servico1);
        servico.add(servico2);
        servico.add(servico3);
        servico.add(servico4);
        servico.add(servico5);
        servico.add(servico6);

    }
}
