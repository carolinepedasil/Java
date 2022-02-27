public class TestaTernario {
    public static void main(String[] args) {
        // (condicao) ? cao_verdadeiro : caso_falso
        int i = 5;
        int resultado = (i == 5) ? 100 : 0;
        System.out.println(resultado);
        // Object resultado2 = (i == 5) ? 100 : 0;
        System.out.println(i == 5 ? 100 : 0);


        int i = 5;
        System.out.println(i == 5 ? "verdadeiro": "falso");// verdadeiro
        System.out.println(i != 5 ? 1: 2);                   // 2

        String mensagem = i % 2 == 0 ? "é par" : "é ímpar";
    }
}
