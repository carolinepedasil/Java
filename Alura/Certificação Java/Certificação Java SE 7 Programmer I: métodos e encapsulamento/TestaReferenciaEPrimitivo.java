class TestaReferenciaEPrimitivo {

    public static void main(String[] args) {
        int i = 2;
        teste(i);
        System.out.println(i); 

        Prova prova = new Prova();
        prova.tempo = 100;
        teste(prova);
        System.out.println(prova.tempo); 
    }

    static void teste(int i) {
        i = 3;
    }

    private static void teste(int i) {
        for (int j = 0; j < i; j++) {
            new String("j = " + j);
        }
    }

    static void teste(Prova prova) {
        prova.tempo = 210;
    }

    class Prova {
        // double tempo;
        int tempo;
    }

    class TestaReferenciaEPrimitivo {
        public static void main(String[] args) {
            Prova prova = new Prova();
            prova.tempo = 100;
            teste(prova);
            System.out.println(prova.tempo);

            teste2(prova);
            System.out.println(prova.tempo);


            int i = 2;
            i = teste(i);
            System.out.println(i);
        }
        static void teste2(Prova prova) {
            prova = new Prova();
            prova.tempo = 520;
        }

        static void teste(Prova prova) {
            prova.tempo = 210;
        }

        static int teste(int i) {
            i = 5;
            System.out.println(i);
            return i;
        }
    }

}