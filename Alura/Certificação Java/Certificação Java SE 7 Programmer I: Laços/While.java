int i = 1;
while (i < 10) {
    System.out.println(i);
    i++;
}

while (CONDICAO) {
    // CODIGO
}

int i = 0;
while( i < 10)
System.out.println(i++);

int i = 1;
//Quando fica false?
while(i < 10){
    System.out.println(i);
}

class A {
    int a() {
        while(true) { //nunca fica false
            System.out.println("Faz algo");
        }
        return 1; // não compila, nunca chegará aqui
    }
}

class A {
    int a() {
        final boolean RODANDO = true;
        while(RODANDO) {
            System.out.println("Faz algo");
        }
        return 1; // não compila, nunca chegará aqui
    }
}

class A {
    int a() {
        boolean rodando = true; // não final
        while(rodando) {
            System.out.println("Faz algo");
        }
        return 1; 
        // compila, não tem como saber se o valor de rodando
        // vai mudar
    }
}

//unreachable statement, não compila.
while(false) { //código aqui } 

//unreachable statement, não compila.
while(1 > 2) { //código aqui }

int a = 1;
int b = 2;
while(a > b){ //compila, mas nunca executa
    System.out.println("OI");
}