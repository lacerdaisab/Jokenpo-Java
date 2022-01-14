import java.util.Scanner;

class Jokenpo {
        public static void main (String args []){
		
        Scanner input = new Scanner(System.in);

        String nomeJogador1;
        String nomeJogador2;

        System.out.println("Digite seu nome jogador 1: ");
        nomeJogador1 = input.next();

        System.out.println("Digite seu nome jogador 2: ");
        nomeJogador2 = input.next();

		Scanner sc = new Scanner(System.in);
		int escolhaDoJogador1, escolhaDoJogador2;
		
		System.out.println("Escolha escolha entre 0, 1 e 2 , sendo : ");
		System.out.println("Pedra = 0 ");
		System.out.println("Papel = 1  ");
		System.out.println("Tesoura = 2");
		
		System.out.println(nomeJogador1 + ": ");
		escolhaDoJogador1 = sc.nextInt();
		
		System.out.println(nomeJogador2 + ": ");
		escolhaDoJogador2 = sc.nextInt();
		
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
							System.out.println ("Jogue novamente");
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
						System.out.println ("Jogue novamente");
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
				            System.out.println ("Jogue novamente");
				} break;
			default: 
				System.out.println ("Jogue novamente");
		}
	}
}
