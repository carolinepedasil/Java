public class Pessoa{

    private String nome;

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        if(nome!= null && nome.trim().length() >= 3)
            this.nome = nome;
        else{
            throw new IllegalArgumentException(
             "Nome deve possuir " + "pelo menos 3 caracteres");
        }
    }
}