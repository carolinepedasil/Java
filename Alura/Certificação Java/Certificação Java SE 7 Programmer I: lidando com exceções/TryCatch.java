try {
    // trecho que pode gerar um erro na execução.
} catch (Throwable t) { // pegando todos os possíveis erros de 
                        //execução.
    // tratamento para o possível erro de execução.
}

try {
    // trecho que pode gerar um erro na execução.
} catch (Exception e) { // pegando todas as exceptions.
    // tratamento para o possível erro de execução.
}

try {
    System.out.println("não acontece SQLException");
} catch(SQLException e){ // pegando SQLException.
    // tratamento.
}

try {
    new java.io.FileInputStream("a.txt");
} catch(java.io.FileNotFoundException e){
    // tratamento.
}

try {
    System.out.println("Ok");
} catch (RuntimeException e) { // pegando RuntimeException 
                               // (unckecked).
    // tratamento.
}

try {
    System.out.println("Ok");
} catch (Throwable e) { 
    // tratamento
}

String nome = null;
try {
    nome.toLowerCase();
    System.out.println("segunda linha do try");
} catch(NullPointerException ex) {
    System.out.println("peguei");
}
System.out.println("continuando normal");

String nome = null;
try {
    nome.toLowerCase();
    System.out.println("segunda linha do try");
} catch(IndexOutOfBoundsException ex) {
    System.out.println("peguei");
}
System.out.println("continuando normal");

try {
    new java.io.FileInputStream("a.txt");
} catch(java.io.IOException e){
    // tratamento.
}

void metodo(){
    try {
        abreConexao();
        fazConsultas();
        fechaConexao();
    } catch (SQLException e) {
        // tratamento
    }
}

void metodo(){
    try {
        abreConexao();
        fazConsultas(); // Não precisa mais fechar a conexao 
                        // aqui.
    } catch(SQLException e) {
        // tratamento
    } finally {
        fechaConexao(); // fechando a conexao no sucesso ou no
                        // fracasso.
    }
}

class A {
    void metodo() {
        try{
            //A
            //B
        }catch(SQLException e){
            //C
        }finally{
            //D
        }
        //E
    }
}

class A{
  void metodo() {
    try {
      System.out.println("imprime algo");
    } finally {
      // sempre permite fechar
    }
  }
}