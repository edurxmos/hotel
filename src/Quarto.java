public class Quarto {
    private Integer numero;
    private Boolean ocupado;
    private Integer tipo;

    public Quarto(boolean ocupado) {
        this.ocupado = false;
        tipoQuarto();
    }

    public Quarto(int numero) {
        this.numero = numero;
        this.ocupado = true;
        tipoQuarto();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean getOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public void tipoQuarto() {
        int tipo;
        if(getNumero() <= 4){
            tipo = 1;
        } else if(getNumero() <= 7){
            tipo = 2;
        } else {
            tipo = 3;
        }
        setTipo(tipo);
    }



    @Override
    public String toString() {
        return "Quarto{" +
                "numero=" + numero +
                ", ocupado=" + ocupado +
                '}';
    }

}
