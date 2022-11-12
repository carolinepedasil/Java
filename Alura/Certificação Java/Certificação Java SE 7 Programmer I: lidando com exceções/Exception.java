public void fazAlgo(int[] idades) {
    System.out.println(idades[0]);
}

public void fazAlgo(int[] idades) {
    if(idades[0]==null) return; 
    // return para caso o Java devolva nulo ao acessar 
    // uma posição inválida

    System.out.println(idades[0]);
}

/*
Exception in thread "main"
java.lang.ArrayIndexOutOfBoundsException: 0
    at SuaClasse.fazAlgo(SuaClasse.java:20)
    at SuaClasse.main(SuaClasse.java:30)
*/