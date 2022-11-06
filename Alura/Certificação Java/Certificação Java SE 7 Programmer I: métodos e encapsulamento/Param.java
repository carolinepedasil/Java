class Param {
    void teste(int a, int b) {

    }
}

// chamada
p.teste(1, 2);

class Param {
    void teste (final int a) {
        a = 10; // não compila
    }
}

class Param {
    void primitivo (double d) {

    }

    void referencia (Object o) {

    }
}


Param p = new Param();
p.primitivo(10);
p.primitivo(10L);
p.primitivo(10F);
p.primitivo((short) 10);
p.primitivo((byte) 10);
p.primitivo('Z');


Param p = new Param();
p.referencia(new Carro());
p.referencia(new Moto());


class A {
    int numero() {
        return 5;
    }
    void nada() {
        return;
    }
}

class A {
    void nada() {
        // return; // pois esta linha é opcional
    }
}

class A {
    void nada(int i) {
        if(i >= 0) return;
        System.out.println("negativo");
    }
}

class A {
    void nada(int i) {
        if(i >= 0) {
            return;

            // não compila, pois nunca chegará aqui
            System.out.println("era positivo ou zero"); 
        }
        System.out.println("negativo");
    }
}

String metodo(int a) {
    if(a > 0) {
        return "positivo";
    } else if(a < 0) {
        return "negativo";
    }
    //não compila, o que acontece se não for nem if nem else if?
}

String metodo(int a) {
    if(a > 0) {
        return "positivo";
    } else if(a <= 0) {
        return "negativo ou zero";
    }
    //não compila, o que acontece se não for nem if nem else if?
    //o compilador não consegue analisar os dois casos
}

String metodo(int a) {
    if(a > 0) {
        return "positivo";
    } else if(a < 0) {
        return "negativo";
    }
    return "zero";
}

String metodo2(int a) {
    if(a > 0) {
        return "positivo";
    } else if(a < 0) {
        return "negativo";
    }
    throw new RuntimeException("não quero zero!");
}

void metodo() {
    System.out.println("oi");
}

void metodo2() {
    // não compila, o método acima não retorna nada
    int i = metodo(); 
}

int metodo() {
    System.out.println("oi");
    return 5;
}

void metodo2() {
    int i = metodo(); // i = 5
    // chamei novamente e não retornei nada, sem problemas
    metodo(); 
}