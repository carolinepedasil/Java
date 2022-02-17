class TestaCarro {
    public static void main(String args[]) {

        Carro a = new Carro;
        a.modelo = "Palio"; // acessando diretamente o atributo
        a.setModelo("Palio 2"); // acessando o atributo por um método

        // acessando o método e passando o retorno como argumento para o método println
        System.out.println(a.getDadosDeImpressao());
        System.out.println(a.ano);
        System.out.println(a.modelo.length());
    }
}