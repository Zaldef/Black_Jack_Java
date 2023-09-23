import java.security.SecureRandom;

public class BaralhoDeCartas
{
   private Carta[] baralho; // array que vi guaradar os objetos do tipo carta
   private int CartaAtual; // aponta para o topo do baralho
   private static final int Num_Cartas = 52; // constante de Cartas
   // random number generator
   private static final SecureRandom randomNumbers = new SecureRandom();

   // construtor que vai povoar o baralho com as cartas
   public BaralhoDeCartas(){
      String[] nums = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
      String[] naipes = {"Copas", "Ouros", "Paus", "Espada"};
      baralho = new Carta[Num_Cartas]; // Cria um array de cartas
      CartaAtual = 0; // primeira Carta a ser comprada será baralho[0]
      // insere as cartas no baralho
      for (int count = 0; count < baralho.length; count++){
         baralho[count] = new Carta(nums[count % 13], naipes[count / 13],(count%13));
      }
   } 

   // embaralhar baralho de Cartas
   public void embaralhar(){
      //  resetando a carta a ser comprada
      CartaAtual = 0; 
      // for each Carta, pick another random Carta (0-51) and swap them
      for (int first = 0; first < baralho.length; first++) {
         // select a random number between 0 and 51 
         int second =  randomNumbers.nextInt(Num_Cartas);
         // swap current Carta with randomly selected Carta
         Carta temp = baralho[first];        
         baralho[first] = baralho[second];   
         baralho[second] = temp;            
      } 
   } 

   // comprar Carta
   public Carta comprar()
   {
      if (CartaAtual < baralho.length)
         return baralho[CartaAtual++]; // se houver uma carta no baralho e pós incrementa para apontar para a proxima carta
      else        
         return null; // retorna nulo para mostrar que o baralho está vazio
   } 
}