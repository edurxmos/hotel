public class Hospede extends Pessoa {
    private String email;

    public Hospede(String nome, int idade, String sexo, String email) {
        super(nome, idade, sexo);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Hóspede{" + super.toString() +
                "email='" + email + '\'' +
                '}';
    }
}
