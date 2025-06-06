package Model.DAO;

import Model.Cliente;
import java.util.ArrayList;

public class ClienteDAO {
    
    public void insert(Cliente cliente){
        Banco.cliente.add(cliente);
    }
    
    public boolean update(Cliente cliente){
        for (int i = 0; i < Banco.cliente.size(); i++) {
            if (idSaoIguais(Banco.cliente.get(i), cliente)) {
                Banco.cliente.set(i, cliente);
                return true;
            }
        }
        return false;
    }
    
    public boolean delete(Cliente cliente){
        for (int i = 0; i < Banco.cliente.size(); i++) {
            if (idSaoIguais(Banco.cliente.get(i), cliente)) {
                Banco.cliente.remove(i);
                return true;
            }
        }
        return false;
    }
    
    public ArrayList<Cliente> selectAll(){
        return Banco.cliente;
    }

    private boolean idSaoIguais(Cliente cliente, Cliente clienteAComparar) {
        return cliente.getId() == clienteAComparar.getId();
    }
}
