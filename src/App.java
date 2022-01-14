import java.util.Scanner;

class Jokenpo {
	public static void main (String args []){
		
		Scanner input = new Scanner(System.in);

		String nomeJogador1;
		String nomeJogador2;
		int pontuacaoJogador1;
		int pontuacaoJogador2;

		System.out.println("Digite seu nome jogador 1: ");
		nomeJogador1 = input.next();

		System.out.println("Digite seu nome jogador 2: ");
		nomeJogador2 = input.next();

		Scanner sc = new Scanner(System.in);
		int escolhaDoJogador1, escolhaDoJogador2;
		
		System.out.println("Escolha escolha entre 0, 1 e 2 , sendo : ");
		System.out.println("Pedra = 0");
		System.out.println("Papel = 1");
		System.out.println("Tesoura = 2");
		
		System.out.println(nomeJogador1 + ": ");
		escolhaDoJogador1 = sc.nextInt();
		
		System.out.println(nomeJogador2 + ": ");
		escolhaDoJogador2 = sc.nextInt();
		
		System.out.println("Primeira rodada");

		switch (escolhaDoJogador1){
			case 0: 
				switch (escolhaDoJogador2){
					case 0:
						System.out.println("Empate");
						break;
					case 1:
						System.out.println(nomeJogador2 + " ganhou");
						pontuacaoJogador2 = 1;
						break;
					case 2:
						System.out.println(nomeJogador1 + " ganhou");
						pontuacaoJogador1 = 1;
						break;
						default: 
							System.out.println ("Insira valores de 0 a 2");
				} break;
			case 1:
				switch(escolhaDoJogador2) {
					case 0: 
						System.out.println(nomeJogador1 + " ganhou");
						pontuacaoJogador1 = 1;
						break;
						case 1:
						System.out.println(" Empatou");
						break;
					case 2:
						System.out.println(nomeJogador2 + " ganhou");
						pontuacaoJogador2 = 1;
						break;
					default: 
						System.out.println ("Insira valores de 0 a 2");
				} break;
			case 2:
				switch(escolhaDoJogador2) {
						case 0:
							System.out.println(nomeJogador2 + " ganhou");
							pontuacaoJogador2 = 1;
							break;
						case 1:
							System.out.println(nomeJogador1 + " ganhou");
							pontuacaoJogador1 = 1;
							break;
						case 2:
							System.out.println("Empate");
							break;
						default: 
							System.out.println ("Insira valores de 0 a 2");
				} break;
			default: 
				System.out.println ("Insira valores de 0 a 2");
		}

		System.out.println("Escolha escolha entre 0, 1 e 2 , sendo : ");
		System.out.println("Pedra = 0");
		System.out.println("Papel = 1");
		System.out.println("Tesoura = 2");
		
		System.out.println(nomeJogador1 + ": ");
		escolhaDoJogador1 = sc.nextInt();
		
		System.out.println(nomeJogador2 + ": ");
		escolhaDoJogador2 = sc.nextInt();

		System.out.println("Segunda rodada");

		switch (escolhaDoJogador1){
			case 0: 
				switch (escolhaDoJogador2){
					case 0:
						System.out.println("Empate");
						break;
					case 1:
						System.out.println(nomeJogador2 + " ganhou");
						break;
					case 2:
						System.out.println(nomeJogador1 + " ganhou");
						break;
						default: 
							System.out.println ("Insira valores de 0 a 2");
				} break;
			case 1:
				switch(escolhaDoJogador2) {
					case 0: 
						System.out.println(nomeJogador1 + " ganhou");
						break;
					case 1:
						System.out.println(" Empatou");
						break;
					case 2:
						System.out.println(nomeJogador2 + " ganhou");
						break;
					default: 
						System.out.println ("Insira valores de 0 a 2");
				} break;
			case 2:
				switch(escolhaDoJogador2) {
						case 0:
							System.out.println(nomeJogador2 + " ganhou");
							break;
						case 1:
							System.out.println(nomeJogador1 + " ganhou");
							break;
						case 2:
							System.out.println("Empate");
							break;
						default: 
							System.out.println ("Insira valores de 0 a 2");
				} break;
			default: 
				System.out.println ("Insira valores de 0 a 2");
		} 

		System.out.println("Escolha escolha entre 0, 1 e 2 , sendo : ");
		System.out.println("Pedra = 0");
		System.out.println("Papel = 1");
		System.out.println("Tesoura = 2");
		
		System.out.println(nomeJogador1 + ": ");
		escolhaDoJogador1 = sc.nextInt();
		
		System.out.println(nomeJogador2 + ": ");
		escolhaDoJogador2 = sc.nextInt();

		System.out.println("Terceira rodada");

		switch (escolhaDoJogador1){
			case 0: 
				switch (escolhaDoJogador2){
					case 0:
						System.out.println("Empate");
						break;
					case 1:
						System.out.println(nomeJogador2 + " ganhou");
						break;
					case 2:
						System.out.println(nomeJogador1 + " ganhou");
						break;
						default: 
							System.out.println ("Insira valores de 0 a 2");
				} break;
			case 1:
				switch(escolhaDoJogador2) {
					case 0: 
						System.out.println(nomeJogador1 + " ganhou");
						break;
					case 1:
						System.out.println(" Empatou");
						break;
					case 2:
						System.out.println(nomeJogador2 + " ganhou");
						break;
					default: 
						System.out.println ("Insira valores de 0 a 2");
				} break;
			case 2:
				switch(escolhaDoJogador2) {
						case 0:
							System.out.println(nomeJogador2 + " ganhou");
							break;
						case 1:
							System.out.println(nomeJogador1 + " ganhou");
							break;
						case 2:
							System.out.println("Empate");
							break;
						default: 
							System.out.println ("Insira valores de 0 a 2");
				} break;
			default: 
				System.out.println ("Insira valores de 0 a 2");
		}

		/* //pontuacao da rodada 1
		if (pontuacaoJogador1 > pontuacaoJogador2) {
			int ganhouJogador1 = 1;
		} else if (pontuacaoJogador1 == pontuacaoJogador2) {
			int empate = 0;
		} else {
			int ganhouJogador2 = 1;
		} */
	}
}
