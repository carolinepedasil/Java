public class TestaSwitch {
    public static void main(String[] args) {
        int opcao = 1;
        switch(opcao) {
            case 1:
                System.out.println("PRIMEIRA OPÇÃO");
                break;
            case 2:
                System.out.println("SEGUNDA OPÇÃO");
                break;
            case 3:
                System.out.println("TERCEIRA OPÇÃO");
                break;
            default:
                System.out.println("default");
                break;
        }

        //argumento do switch int, e cases int
        int valor = 20;
        switch (valor){ 
            case 10 : System.out.println(10);
            case 20 : System.out.println(20);
        }

        //Argumento String, e cases String
        String s = "Oi";        
        switch (s) {
            case "Oi": System.out.println("Olá");
            case "Hi": System.out.println("Hello");
        }

        //Argumento Byte, e cases byte
        Byte b = 10;
        switch (b) {
            case 10: System.out.println("DEZ");
        }

        //argumento do switch int, e cases string, não compila
        int mix = 20;
        switch (mix){ 
            case "10" : System.out.println(10);
            case "20" : System.out.println(20);
        }

        double mix = 20;
        switch (mix){  // não compila
            case 10.0 : System.out.println(10);
            case 20.0 : System.out.println(20);
        }

        //argumento do switch byte
        byte valor = 20;

        switch (valor){ 
            // Apesar de ser inteiro, 10 cabe em um byte, o compilador
            // fará o cast automaticamente
            case 10 : 
                System.out.println(10);
        }

        switch (valor){ 
            // Neste caso, o número é muito grande, o compilador não 
            // fará o cast e teremos um erro de compilação pois os tipos
            // são incompatíveis
            case 32768 :  //erro
                System.out.println(10);
        }

        int valor = 20;
        final int CINCO = 5;
        int trinta = 30;

        switch (valor) {
            case CINCO: // constante
                System.out.println(5);
            case 10: // literal
                System.out.println(10);
            case CINCO * 4: // operação com constante e literal
                System.out.println(20);
            case trinta: // erro, variável
                System.out.println(30);
            case trinta + CINCO: //erro, operação envolvendo variável
                System.out.println(35);
            case null: // erro, null em case
                System.out.println("null");
        }

        int v = 10;
        final int DEZ = 10;
        final int VINTE; // final, mas não inicializada
        VINTE = 20; // inicializada

        switch (v) {
        case DEZ:
            System.out.println("DEZ!");
            break;
        case VINTE: //erro
            System.out.println("DEZ!");
            break;
        }
    }
}