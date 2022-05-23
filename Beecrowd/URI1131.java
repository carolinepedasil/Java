import java.io.IOException;
import java.util.Scanner;

/*
    A Federação Gaúcha de Futebol contratou você para escrever um programa para fazer uma estatística do resultado de vários GRENAIS. 
    Escreva um programa para ler o número de gols marcados pelo Inter e pelo Grêmio em um GRENAL. 
    Logo após escrever a mensagem "Novo grenal (1-sim 2-nao)" e solicitar uma resposta. 
    Se a resposta for 1, o algoritmo deve ser executado novamente solicitando o número de gols marcados pelos times em uma nova partida, caso contrário deve ser encerrado imprimindo:

    - Quantos GRENAIS fizeram parte da estatística.
    - O número de vitórias do Inter.
    - O número de vitórias do Grêmio.
    - O número de Empates.
    - Uma mensagem indicando qual o time que venceu o maior número de GRENAIS (ou "Nao houve vencedor", caso termine empatado).

    ENTRADA:
    O arquivo de entrada contém 2 valores inteiros, correspondentes aos gols marcados pelo Inter e pelo Grêmio respectivamente. 
    Em seguida háverá um inteiro (1 ou 2), correspondente à repetição do programa.

    SAÍDA:
    Após cada leitura dos gols, deve ser impressa a mensagem "Novo grenal (1-sim 2-nao)". 
    Quando o algoritmo for encerrado devem ser mostradas as estatísticas conforme a descrição apresentada acima. 
    Obs: a palavra "Gremio" deve ser impressa sem acento, conforme o exemplo abaixo.
*/

public class URI1131 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
		int inter;
		int gremio;
		
		int novoGrenal = 1;
		
		int totalJogos = 0;
		int vitoriasInter = 0;
		int vitoriasGremio = 0;
		int empates = 0;
		
		while (novoGrenal == 1) {
		    
		    totalJogos++;
		
    		inter = sc.nextInt();
    		gremio = sc.nextInt();
    		
    		if (inter > gremio) {
    		    vitoriasInter++;
			} else if (gremio > inter) {
			    vitoriasGremio++;
			} else {
			    empates++;
			}
    		
            System.out.println("Novo grenal (1-sim 2-nao)");
            novoGrenal = sc.nextInt();
            
            while (novoGrenal != 1 && novoGrenal != 2) {
				System.out.println("Novo grenal (1-sim 2-nao)");
				novoGrenal = sc.nextInt();
			}
            
		}
		
		System.out.println(totalJogos + " grenais");
		System.out.println("Inter:" + vitoriasInter);
		System.out.println("Gremio:" + vitoriasGremio);
		System.out.println("Empates:" + empates);
		
		if (vitoriasInter > vitoriasGremio) {
            System.out.println("Inter venceu mais");
        } else if (vitoriasGremio > vitoriasInter) {
            System.out.println("Gremio venceu mais");
        } else if (vitoriasInter == vitoriasGremio) {
            System.out.println("Nao houve vencedor");
        }
        
        sc.close();
 
    }
 
}