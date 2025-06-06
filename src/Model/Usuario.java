package Model;

public class Usuario extends Pessoa {
    private String senha;
    private String perfil;

    // Construtor completo
    public Usuario(int id, String nome, char sexo, String dataNascimento, String telefone, String email, String rg,
                   String senha, String perfil) throws DadosInvalidosException {
        super(id, nome, sexo, dataNascimento, telefone, email, rg);
        this.senha = senha;
        this.perfil = perfil;
    }

    // Construtor simplificado só com nome e senha (para login)
    public Usuario(String nome, String senha) {
        super(0, nome); // id 0, pois não é usado nesse contexto
        this.senha = senha;
        this.perfil = null;
    }

    // Getters e Setters

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + getId() +
                ", nome='" + getNome() + '\'' +
                ", sexo=" + getSexo() +
                ", dataNascimento=" + getDataNascimento() +
                ", telefone='" + getTelefone() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", rg='" + getRg() + '\'' +
                ", senha='" + senha + '\'' +
                ", perfil='" + perfil + '\'' +
                '}';
    }
}