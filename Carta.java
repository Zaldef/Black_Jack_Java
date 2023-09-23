public class Carta {
   private final String num; // num da carta ("Ace", "Deuce", ...)
   private final String naipe; // naipe da carta 
   private final int value;

   // two-argument constructor initializes carta's num and naipe
   public Carta(String num, String naipe, int value) {
      this.num = num;
      this.naipe = naipe;
      if (value >= 10) {
         this.value = 10;
      }

      else {
         this.value = value + 1;
      }

   }

   public int getValue() {
      return value;
   }

   // return String representation de Carta
   public String toString() {
      return num + " de " + naipe;
   }

} // end class Carta
