class TestaAritmetica {
    public public static void main(String[] args) {
        int dois = 2;
        int dez = 10;

        int doze = dez + dois;
        int oito = dez - dois;
        int vinte = dez * dois;
        int cinco = dez / dois;
        int restoDaDivisao = 5 % 2;

        //System.out.println((dois + 0) / 0);

        double positivoInfinito = 5.0 / 0;
        double negativoInfinito = -5.0 / 0;
        System.out.println(positivoInfinito + negativoInfinito); // número não definido (NaN)

        int idade = 15;
        long anos = 5;

        // ok, o maior tipo era long
        long daquiCincoAnos = idade + anos; 

        // não compila, o maior tipo era long, devolve long
        int daquiCincoAnos2 = idade + anos; 

        byte b = 1;
        short s = 2;

        // devolve no mínimo int, compila
        int i = b + s; 

        // não compila, ele devolve no mínimo int
        byte b2 = i + s; 

        // compila forçando o casting, correndo risco de perder 
        // informação
        byte b2 = (byte) (i + s); 

        int i = 200;
        int v = 0;

        // compila, mas exception
        System.out.println(i / v); 

        // compila e roda, infinito positivo
        System.out.println(i / 0.0); 
    }
}