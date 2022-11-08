private public int x; // não compila

package forma;

class Forma{
    double lado;
    double getArea(){
        return 0;
    }
}

package forma;

class Quadrado extends Forma{}

package forma.outro;
import forma.*;

class Triangulo extends Forma{}

package forma;

public class Forma{
    public double lado;
    public double getArea(){
        return 0;
    }
}

package forma.outro;
import forma.*;

public class TesteOutroPacote{

    public static void main(String... args){
        Forma f = new Forma(); //acesso a classe forma
        f.lado = 5.5; //acesso ao atributo lado
        f.getArea(); //acesso ao método getArea()
    }
}

package forma;

public class Forma{
    protected double lado; // agora protected
    public double getArea(){}
}

package forma.outro;
import forma.*;

public class TesteOutroPacote{

    public static void main(String... args){
        Forma f = new Forma(); 
        f.lado = 5.5; // erro de compilação
        f.getArea(); 
    }
}

package forma;

public class Teste{

    public static void main(String... args){
        Forma f = new Forma(); 
        f.lado = 5.5; // compila normal, mesmo pacote
    }
}

package forma.outro;
import forma.*;

class Triangulo extends Forma{

    public void imprimeLado(){
        //Como é uma classe filha, acessa 
        //normalmente os membros protected da classe mãe.
        System.out.println("O Lado é " + lado);
    }
}

package outro;
import forma.*;

class Triangulo extends Forma{

    public void imprimeLado(){
        // compila
        System.out.println("O Lado é " + lado); 

        // não compila
        System.out.println("O Lado é " + ((Forma) this).lado); 
    }
}

package forma;

public class Forma{
    protected double lado; 
    public double getArea(){
        return 0;
    }
    double getPerimetro(){ //default access 
        return 0;
    }
}

package outro;
import forma.*;

class Triangulo extends Forma{

    public void imprimePerimetro(){
        //Erro de compilação na linha abaixo
        System.out.println("O Perímetro é " + getPerimetro());
    }
}

default class Bola{ //ERRO
    default String cor; // ERRO
}

package forma;

class Quadrado extends Forma{}


package outro;
import forma.*;

public class TesteOutroPacote{

    public static void main(String... args){
        Quadrado q = new Quadrado(); // erro, esta classe não é
                                     //visível
    }
}

package outro;

//import de todas as classes PÚBLICAS do pacote, nenhum erro
import forma.*; 


public class TesteOutroPacote{

    public static void main(String... args){
        // erro na linha 8, Quadrado não é visível, pois não 
        // é pública
        Quadrado q = new Quadrado(); 
    }
}

package outro;
// erro na linha 3, não podemos importar classes não públicas 
import forma.Quadrado;

public class TesteOutroPacote{

    public static void main(String... args){

        //Erro, pois Quadrado não é acessível.
        Quadrado q = new Quadrado(); 
    }
}

package forma;

public class Forma{
    protected double lado;
    public double getArea(){}

    //cor só pode ser acessada dentro da classe Forma,
    //nem as classe Quadrado e Triangulo conseguem acessar
    private String cor;

}