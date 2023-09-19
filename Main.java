import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // variaveis locais da main
        int n = 0;
        int end = 0;
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
        while (end != 1) {
            for (int i = 0; i < n; i++) {
                int stop = 0;
                int black_jack_count = 0;
                // loop de cada jogador
                while (stop != 1) {
                    Carta carta = baralho.comprar();
                    System.out.println("\njogador " + (i + 1) + " retirou um: " + carta);
                    // Ás valendo 11 ou 1
                    if (carta.getValue() == 1 && players[i].getPoints() <= 10) {
                        players[i].setPoints(players[i].getPoints() + 11);
                    } else {
                        players[i].setPoints(players[i].getPoints() + carta.getValue()); //soma dos pontos
                    }
                    // exibindo quantidade de pontos
                    System.out.println("Total = " + players[i].getPoints());
                    // processo para verificar se ganhou 
                    if (players[i].getPoints() == 21) {
                        if (black_jack_count == 1) {
                            System.out.println("O Jogador " + (i +1) + " Venceu Com BLACK JACK !!!" ); 
                        } else {
                            System.out.println("O Jogador " + (i +1) + " Venceu Com 21 Pontos !!!" ); 
                        }  
                        return;
                    } else {
                        // se perdeu
                        if (players[i].getPoints() > 21) {
                            System.out.println("estourou a banca,jogador  perdeu \n");
                            stop = 1;
                        } else {
                            // se quer cuma nova carta ou nao
                            System.out.println("\n jogador " + (i + 1) + " deseja Contiuar?:\n");
                            System.out.println("Sim - 1");
                            System.out.println("Não - 0");
                            if (input.nextInt() == 0) {
                                stop = 1;
                            }
                        }
                        black_jack_count++;
                    }
                }
                end = 1;
            }
        }

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
