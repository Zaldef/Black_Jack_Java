import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // variaveis locais da main
        boolean end = false;
        int n;
        // Instanciando um baralho novo e ja o embaralhando
        BaralhoDeCartas baralho = new BaralhoDeCartas();
        baralho.embaralhar();
        // Quantidade de jogadores
        System.out.println("Digite o numero de jogadores:");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        Player players[] = new Player[n];
        for (int i = 0; i < n; i++) {
            players[i] = new Player();
        }
        ////////////////////////////////////////////////
        // loop principal do game
        while (end == false) {
            for (int i = 0; i < n; i++) {
                int BJC = 0;
                Boolean stop = false;
                Carta carta;
                // loop de cada jogador
                System.out.println("\n\n\n\n\n");
                while (stop == false) {
                    BJC = 0;
                    carta = baralho.comprar();

                    //desenha a carta
                    carta.desenharCarta();
                    System.out.println("\njogador " + (i + 1) + " retirou um: " + carta);

                    players[i].somaPoints(carta);
                    // exibindo quantidade de pontos
                    System.out.println("Total = " + players[i].getPoints());
                    stop = players[i].verificaPoints(BJC);
                    // se quer cuma nova carta ou nao
                    if( stop == false){
                        System.out.println("\n jogador " + (i + 1) + " deseja Contiuar?:\n");
                        System.out.println("Sim - 1");
                        System.out.println("Não - 0");
                        if (input.nextInt() == 0) {
                          stop =  true;
                        }
                    }   
                    BJC++;
                }
                end = true;
            }
        }
        //fazer verificação de que nao houve ganhadores
        // fazer rodada da banca
        // limitar BJC a 6
        int Winer = 0;
        int WinerPoints = 0;
        for (int index = 0; index < n; index++) {
            System.out.println("O Jogador " +(index +1) + " Fez " + players[index].getPoints() + " Pontos" );
            if (players[index].getPoints() > 0 && players[index].getPoints() <=21) {
                if (players[index].getPoints() > WinerPoints) {
                Winer = index + 1;
                WinerPoints = players[index].getPoints(); 
                } 
            }
        }
        System.out.println("\n O Jogador " + Winer + " Venceu Com " + WinerPoints + " Pontos" );
    }
}
