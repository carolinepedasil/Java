class Pessoa {
    String nome;
}

class Teste {
    public static void main(String[] args) {
        // Apenas declarando a variável, nenhum objeto foi criado aqui
        Pessoa p = new Pessoa(); // criando um novo objeto do tipo Pessoa

        // Agora um objeto foi criado e atribuído a variável
        p = new Pessoa();

        Pessoa p = new Pessoa(); // criação
        p.nome = "Mário"; // acessando e usando o objeto

        // atribuímos a p o valor null
        // o objeto não está mais acessível
        p = null

        // criando um objeto sem variável
        new Pessoa();

        int valor = 100;
        if( valor > 50) {
            Pessoa p = new Pessoa();
            p.nome = "João";
        } // Após esta linha, o objeto do tipo Pessoa não está mais acessível
    }
}