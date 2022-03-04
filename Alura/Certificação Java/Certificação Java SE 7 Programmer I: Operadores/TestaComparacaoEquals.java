class Cliente {
    String nome;

    public Cliente(String nome){
        this.nome = nome;
    }

    public boolean equals(Object o){
        Cliente outro = (Cliente)o;
        return this.nome.equals(outro.nome);
    }
    
}

class TestaComparacaoEquals{
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Carol");
        Cliente c2 = new Cliente("Caroline");

        Cliente c3 = new Cliente("Caroline");

        System.out.println(c1 == c2); //false
        System.out.println(c1 == c1); //true
        System.out.println(c2 == c3); //false, pois não é a mesma referência: são objetos diferentes na memória

        System.out.println(c1.equals(c2)); //false
        System.out.println(c1.equals(c1)); //true
        System.out.println(c2.equals(c3)); //true
        System.out.println(c2.equals((Object)c3));
    }
}