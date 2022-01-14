import java.text.spi.BreakIteratorProvider;
import java.util.Scanner;

class Jokenpo {
	public static void main (String args []){
		
		Scanner input = new Scanner(System.in);

		String nomeJogador1;
		String nomeJogador2;
		int pontuacaoJogador1 = 0;
		int pontuacaoJogador2 = 0;

		System.out.println("Esse é um jogo conhecido como pedra, papel, tesoura.");
		System.out.println("Ele é composto por 3 partidas e com 2 jogadores.");
		System.out.println("Que vença o melhor! ;)");

		//recebe o nome dos jogadores
		System.out.println("\nDigite o nome do jogador 1: ");
		nomeJogador1 = input.next();

		System.out.println("\nDigite o nome do jogador 2: ");
		nomeJogador2 = input.next();

		//faz o jogo se repetir 3 vezes
		for (int i = 1; i <= 3; i++) {
			//scannea se eh pedra, papel ou tesoura
			Scanner sc = new Scanner(System.in);
			int escolhaDoJogador1, escolhaDoJogador2;
			
			System.out.println("\n\n\nEscolha os números de 1 a 3 sendo: ");
			System.out.println("Pedra - 1; Papel - 2; Tesoura - 3");

			//recebe se eh pedra, papel ou tesoura
			System.out.println("\n" + nomeJogador1 + ": ");
			escolhaDoJogador1 = sc.nextInt();
			
			//mostra a escolha do jogador
			switch(escolhaDoJogador1) {
				case 1:
				System.out.println(nomeJogador1 + " escolheu pedra\n");
				break;
				case 2:
				System.out.println(nomeJogador1 + " escolheu papel\n");
				break;
				case 3:
				System.out.println(nomeJogador1 + " escolheu tesoura\n");
				break;
			}

			//recebe se eh pedra, papel ou tesoura
			System.out.println("\n" + nomeJogador2 + ": ");
			escolhaDoJogador2 = sc.nextInt();

			//mostra a escolha do jogador
			switch(escolhaDoJogador2) {
				case 1:
					System.out.println(nomeJogador2 + " escolheu pedra\n");
					break;
				case 2:
					System.out.println(nomeJogador2 + " escolheu papel\n");
					break;
				case 3:
					System.out.println(nomeJogador2 + " escolheu tesoura\n");
					break;
			}

			//mostra quem ganhou ou se teve empate nas partidas
			if (escolhaDoJogador1 == escolhaDoJogador2) {
				System.out.println("Empate.");
			}
			else if ((escolhaDoJogador1 - escolhaDoJogador2) == -1 || 
					(escolhaDoJogador1 - escolhaDoJogador2) == 2) {
				//mostra quem e qual partida ganhou
				System.out.println(nomeJogador1 + " ganhou a partida " + i + ".");
				pontuacaoJogador1++;
				
			}
			else {
				//mostra quem e qual partida ganhou
				System.out.println(nomeJogador2 + " ganhou a partida "  + i + ".");
				pontuacaoJogador2++;
			}
		}

		//placar final
		if (pontuacaoJogador1 > pontuacaoJogador2) {
			System.out.println("\n" + nomeJogador1 + " ganhou o jogo.");
			System.out.println("Placar: 2 x 1");
		}
		else if (pontuacaoJogador1 < pontuacaoJogador2) {
			System.out.println("\n" + nomeJogador2 + " ganhou o jogo.");
			System.out.println("Placar: 1 x 2");
		}
		else {
			System.out.println("O jogo empatou.");
		}
	}
}
