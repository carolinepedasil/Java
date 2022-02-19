class TestaStrings {

    public static void main(String[] args) {
        String nomeDireto = "Java";
        String nomeIndireto = new String("Java");

        char[] nome = new char[]{'J', 'a', 'v', 'a'};
        String nome1 = new String(nome);

        StringBuilder sb1 = new StringBuilder("Java");
        String nome2 = new String(sb1);

        String nomeNulo = null;

        String nomeDaProva = "Certificação" + " " + "Java";
        String nomeDaProvaComNulo = nomeDaProva + " " + nomeNulo;
        System.out.println(nomeDaProva);
        System.out.println(nomeDaProvaComNulo);

        //System.out.println(nomeNulo.toString());

        System.out.println("Certificação " + 1500);
        System.out.println(1500 + " Certificação");
        System.out.println(15 + 00 + " Certificação");
        System.out.println(1 + 500 + " Certificação");


        String texto = "Pretendo fazer a prova de certificação de Java";

        System.out.println(texto.indexOf("Pretendo")); // imprime 0
        System.out.println(texto.indexOf("Pretendia")); // imprime -1
        System.out.println(texto.indexOf("tendo")); // imprime 3

        System.out.println(texto.indexOf("a")); // imprime 10
        System.out.println(texto.lastIndexOf("a")); // imprime 45
        System.out.println(texto.lastIndexOf("Pretendia")); //imprime -1

        System.out.println(texto.startsWith("Pretendo")); // true
        System.out.println(texto.startsWith("Pretendia")); // false

        System.out.println(texto.endsWith("Java")); // true
        System.out.println(texto.endsWith("Oracle")); // false
    }
}