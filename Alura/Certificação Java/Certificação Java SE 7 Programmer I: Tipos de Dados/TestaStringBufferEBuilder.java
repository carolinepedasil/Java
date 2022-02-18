class TestaStringBufferEBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Carol");
        sb.append(" - ");
        sb.append("Ensino e Inovação");
        System.out.println(sb);

        // vazio
        StringBuilder sb1 = new StringBuilder(); 
        // conteudo inicial
        StringBuilder sb2 = new StringBuilder("java"); 
        // tamanho inicial do array para colocar a string
        StringBuilder sb3 = new StringBuilder(50); 
        // baseado em outro objeto do mesmo tipo
        StringBuilder sb4 = new StringBuilder(sb2);

        StringBuilder sb2 = new StringBuilder(50);
        System.out.println(sb2.toString());

        StringBuilder sb3 = new StringBuilder(sb);
        
        sb3.append(" e Java");
        sb3.append('x');
        sb3.append(sb);
        sb3.append(new Carro());
        System.out.println(sb3);

        StringBuilder sb4 = new StringBuilder("Carol");
        sb4.insert(9, "Ensino e ");
        System.out.println(sb4);
        sb4.delete(6, 15);
        System.out.println(sb4);

        String valor = sb4.toString();
        System.out.println(new StringBuffer("Caroline").reverse());

        StringBuilder sb5 = new StringBuilder("Carol - Ensino e Inovação");
        sb5.substring(6, 15);
        System.out.println(sb5);
    }
}