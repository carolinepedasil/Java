int i = 1;
do { //executa ao menos 1 vez
    System.out.println(i);
    i++;
} while (i < 10); // se der true, volta e executa novamente.

int i = 1;
do {
    System.out.println(i);
    i++;
} while (i < 10) // não compila, faltou o ;

int i = 0;
//compila normal
do
    System.out.println(i++);
while(i<10);

//erro, mais de uma linha dentro do do .. while
do
    System.out.print("o valor é: "); //erro
    System.out.println(i++);
while(i<10);