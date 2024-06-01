public class Ocupacao {
    private Quarto quarto;
    private Hospede hospede;
    public Integer dias;
    private Double valor;

    public Ocupacao(Quarto quarto, Hospede hospede, int dias) {
        this.hospede = hospede;
        this.quarto = quarto;
        this.dias = dias;
        calcDiaria();
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    public Hospede getHospede() {
        return hospede;
    }

    public void setHospede(Hospede hospede) {
        this.hospede = hospede;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void calcDiaria(){
        double valorTotal = 0.0;
        if (quarto.getTipo() == 1) {
            valorTotal = 50.0 * this.dias;
        } else if (quarto.getTipo() == 2) {
            valorTotal = 80.0 * this.dias;
        } else {
            valorTotal = 120.0 * this.dias;
        }
        setValor(valorTotal);
    }

    @Override
    public String toString() {
        String tipoQuarto = "";
        if (quarto.getTipo() == 1) {
            tipoQuarto = "Básico";
        } else if (quarto.getTipo() == 2) {
            tipoQuarto = "Intermediário";
        } else {
            tipoQuarto = "Luxo";
        }
        return "Hóspede: "+hospede.getNome()
                +" , Idade: "+hospede.getIdade()
                +" , Sexo: "+hospede.getSexo()
                +" , \nEmail: "+hospede.getEmail()
                +"\nQuarto: "+ quarto.getNumero()
                +" , Tipo: "+ tipoQuarto
                +" , Dias: "+ this.dias
                +" , Valor: R$"+valor;
    }

}

