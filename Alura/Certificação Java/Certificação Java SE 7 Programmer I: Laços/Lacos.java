int i = 20;

//imprime 20, já que só faz o teste após a execução do código
do {
    System.out.println(i);
    i++;
} while(i < 10);

int j = 20;

//não imprime nada, já que testa antes de executar o bloco
while(j < 10){
    System.out.println(i);
    i++;
}


while(conta.getSaldo() > 0) {
    conta.saca(1000);
}


int saques;
for(saques = 0; conta.getSaldo() > 0; saques++) {
    conta.saca(1000);
}
System.out.println("Saquei " + saques + " vezes");