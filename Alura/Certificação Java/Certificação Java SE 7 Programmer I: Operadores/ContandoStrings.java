public class ContandoStrings {
    public static void main(String[] args) {

        String h = new String ("hello "); //Cria 2 objetos, um literal (que vai para o pool) e o outro com o new
        String h1 = "hello "; //nenhum objeto criado, usa o mesmo do pool
        String w = "world"; //novo objeto criado e inserido no pool
    
        System.out.println("hello "); //nenhum  objeto criado, usa do pool
        System.out.println(h1 + "world"); //criado um novo objeto resultante da concatenação, mas este não vai para o pool
        System.out.println("Hello " == h1); //Novo objeto criado e colocado no pool (Hello com H maiúsculo).

        //Foram criados 5 objetos strings
    }
}
