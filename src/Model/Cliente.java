package Model;

public class Cliente extends Pessoa {

    private String nuit; // identificador tipo CPF

    public Cliente(int id, String nome) {
        super(id, nome);
    }

    public Cliente(int id, String nome, String nuit) {
        super(id, nome);
        this.nuit = nuit;
    }

    public String getNuit() {
        return nuit;
    }

    public void setNuit(String nuit) {
        this.nuit = nuit;
    }
    
    @Override
    public String toString(){
        // Isso faz o JComboBox mostrar o nome do cliente automaticamente
        return getNome();
    }
}