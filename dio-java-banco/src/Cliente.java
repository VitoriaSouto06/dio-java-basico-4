import java.time.LocalDate;

public class Cliente {
    private String nome;
    private String email;
    private LocalDate dataNascimento;
    private String telefone;

    

    public Cliente(String nome, String email, LocalDate dataNascimento, String telefone) {
        this.nome = nome;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

   

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }


    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    

}
