int i = 1; // Inicialização
while (i < 10) { // Condição
    System.out.println(i); // Comandos
    i++; // Atualização
}

for (int i = 1; i < 10; i++) {
    System.out.println(i);
}

for(;;){
    // CODIGO
}

//loop infinito
for (;true;){
    // CODIGO
}

// Declarando três variáveis do tipo int e inicializando as três.
// Repare que o "," separa as declarações e inicializações.
for (int i = 1, j = 2, k = 3;;){
    // CODIGO
}

// Declarando três variáveis de tipos diferentes
int a;
double b;
boolean c;

// Inicializando as três variáveis já declaradas
for (a = 1, b = 2.0, c = true;;){
    // CODIGO
}

//a cada volta do laço, incrementamos o i e decrementamos o j
for (int i=1,j=2;; i++,j--){
    //código
}

for (int i=1, long j=0; i< 10; i++){ // erro
    //código
}

for (int i = 0; i < 10; i += 3) { //somatório
//código
}

for (int i = 0; i < 10; System.out.println(i++)) { // bizarro
//código
}

int[] numeros = {1,2,3,4,5,6};
for (int num : numeros) { //enhanced for
    System.out.println(num);
}

for(VARIAVEL : COLEÇÃO){
    CODIGO
}

int[] numeros = {1,2,3,4,5,6};

for(int i=0; i < numeros.length; i++){
    int num = numeros[i]; //declaração da variável e atribuição
    System.out.println(num);
}

ArrayList<String> nomes = //lista com vários nomes

//percorrendo a lista com o for simples
for(Iterator<String> iterator = nomes.iterator();
    iterator.hasNext();){
    String nome = iterator.next();
    System.out.println(nome);
}

//percorrendo com o enhanced for
for (String nome : nomes) {
    System.out.println(nome);
}

ArrayList<String> nomes = //lista com vários nomes

//tentando remover nomes da lista
for (String nome : nomes) {
    nome = null;
}

//o que imprime abaixo?
for (String nome : nomes) {
    System.out.println(nome);
}