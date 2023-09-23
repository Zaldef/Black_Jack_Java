public class Player {
    //atributos
    private int points;
    private int n = 1;
    //constructor
    public Player(){
        this.points = 0;
        n++;
    }
    //metodos
    public int getPoints(){
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void somaPoints(Carta carta) {
        // Ás valendo 11 ou 1
        if (carta.getValue() == 1 && this.points <= 10) {
            points += 11;
        } else {
            points += carta.getValue(); //soma dos pontos
        }
    }

    public boolean verificaPoints(int BJC){
        if (points == 21) {
            if (BJC == 1) {
                System.out.println("O Jogador " + (this.n +1) + " Venceu Com BLACK JACK !!!" );
                
            } else {
                System.out.println("O Jogador " + (this.n +1) + " Venceu Com 21 Pontos !!!" ); 
                return true;
            }
        } else {
            // se perdeu
            if (points > 21 ) {
                System.out.println("Estourou a banca, jogador perdeu \n");
                return true;
            } 
        }
        if (BJC == 5){
            System.out.println("Estourou o limite de cartas, jogador perdeu \n");
            return true;
        }
        return false;
    }
}
