class Carro {

    String modelo;
    int ano;

    Carro() {
        this.ano = 2014;
    }

    void reseta() {
        this.ano = 2014;
    }

    public String getDadosDeImpressao() {
        return modelo + "::" + ano;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}