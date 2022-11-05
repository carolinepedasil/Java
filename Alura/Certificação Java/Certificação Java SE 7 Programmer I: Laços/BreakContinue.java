int i = 1;
while (i < 10) {
    i++;
    if (i == 5)
        break; // sai do while com i valendo 5
    System.out.println(i);
}
System.out.println("Fim");

int i = 1;
while (i < 10) {
    i++;
    if (i == 5)
        continue; // vai para a condição com o i valendo 5
    System.out.println(i);
}

while(true) {
    if(1==2) break;
    System.out.println("em loop infinito compilável");
}

for (int i = 1; i < 10; i++) {
    if (i == 8) {
        break; // sai do for sem executar mais nada do laço.
    }
    if (i == 5) {
        // pula para a atualização sem executar o resto do corpo.
        continue; 
    }
    System.out.println(i);
}

for (int i = 1; i < 10; i++) { //laço externo
    for (int j = 1; j < 10; j++) { // laço interno
        if (i * j == 25)    {
            break; // qual for será quebrado?
        }
    }
}

externo: //label
for(int i=0; i<10;i++){
    //código
}

externo: for (int i = 1; i < 10; i++) {
  interno: for (int j = 1; j < 10; j++) {
    if (i * j == 25)    {
        break externo; // quebrando o for externo
    }
    if (i * j == 16) {
        continue interno; // pulando um iteração do for interno
    }
  }
}

for (int i = 1; i <= 10; i++) {
    System.out.println(i);
}


void rotuloEmQualquerLugar() {
    rotulo: System.out.println("oi");
}

void rotuloEmQualquerLugarComBreakNaoCompila() {
    rotulo: System.out.println("oi");
    if(1<10) continue rotulo; // erro de compilação
}


void rotuloEmQualquerLugarComBreakNaoCompila() {
    rotulo: System.out.println("oi");
    for(int i=0;i<10;i++) {
        break rotulo; // não compila
    }
}

void rotuloEmOutroLaco() {
    rotulo:
    for(int i=0;i<10;i++) {
        System.out.println("oi");
    }
    for(int i=0;i<10;i++) {
        break rotulo; // não compila
    }
}

void rotulosRepetidos() {
    rotulo: for (int i = 0; i < 10; i++) {
        break rotulo;
    }
    rotulo: for (int i = 0; i < 10; i++) {
        break rotulo;
    }
}
void rotulosRepetidosNestedNaoCompila() {
    rotulo: for (int i = 0; i < 10; i++) {
        rotulo: for (int j = 0; j < 10; j++) {
            break rotulo;
        }
    }
}

class A {
    int rotulo = 15;
    void rotulosENomesDeVariaveisNaoConflitam() {
        rotulo: for (int i = 0; i < 10; i++) {
            int rotulo = 10;
            break rotulo;
        }
    }
}

void rotulosNoMesmoStatement() {
    primeiro: segundo: for (int i = 0; i < 10; i++) {
        System.out.println(i);
    }
}

class TestaLacos {
    public static void main(String[] args) {

        for(int i = 0; i < 4; i++) {
            System.out.println("Estou antes do switch");
            mario:
            guilherme: switch(i) {
                case 0:
                case 1:
                    System.out.println("Caso " + i);
                    for(int j = 0; j < 3; j++) {
                        System.out.println(j);
                        if(j==1) break mario;
                    }
                case 2:
                    System.out.println("Estou em i = " + i);
                    continue;
                case 3:
                    System.out.println("Cheguei no 3");
                    break;
                default:
                    System.out.println("Estranho...");
                    break;
            } 
            System.out.println("Estou apos o switch");
        }
    }
}