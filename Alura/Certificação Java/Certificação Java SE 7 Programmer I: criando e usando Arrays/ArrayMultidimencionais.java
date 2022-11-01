// Um array de duas dimensões.
int[][] tabela;

// Um array de três dimensões.
int[][] cubo[];

// Um array de quatro dimensões.
int[] [][]hipercubo[];

// Perceba que as dimensões podem ser definidas do lado 
// esquerdo ou direito da variável.

// Inicializando a primeira dimensão com 10 e a segunda com 15
tabela = new int[10][15];

// Inicializando a primeira dimensão com 10 e deixando as outras
// para serem iniciadas depois
cubo = new int[10][][];

// Inicializando com valores
int[][] teste = new int[][]{{1,2,3},{3,2,1},{1,1,1}};

// Acessando a posição (0,1)
System.out.println(tabela[0][1]);

int[][] estranha = new int[2][];
estranha[0] = new int[20];
estranha[1] = new int[10];
for(int i=0;i<estranha.length;i++) {
    System.out.println(estranha[i].length); // imprime 20 e 10
}