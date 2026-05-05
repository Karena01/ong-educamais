import javax.persistence.*;

@Entity
public class Doacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;
    private Double valor;

    // Getters e Setters (necessários para o Java acessar os dados)
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    // ... repetir para email e valor
}
