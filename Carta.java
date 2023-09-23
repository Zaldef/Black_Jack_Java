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

   public void desenharCarta() {
      if (num == "A"){   
         if(naipe == "Ouros"){
            System.out.println(" _______ ");
            System.out.println("|" + num + "  ^   |");
            System.out.println("|  / \\  |");
            System.out.println("|  \\ /  |");
            System.out.println("|   .   |");
            System.out.println("|______V|");
         }
         else if(naipe == "Espada"){
            System.out.println(" _______ ");
            System.out.println("|" + num + "  .   |");
            System.out.println("|  /.\\  |");
            System.out.println("| (_._) |");
            System.out.println("|   |   |");
            System.out.println("|______V|");
         }
         else if(naipe == "Copas"){
            System.out.println(" _______ ");
            System.out.println("|" + num + " _ _  |");
            System.out.println("| ( v ) |");
            System.out.println("|  \\ /  |");
            System.out.println("|   .   |");
            System.out.println("|______V|");
         }
         else if(naipe == "Paus"){
            System.out.println(" _______ ");
            System.out.println("|" + num + "  _   |");
            System.out.println("|  ( )  |");
            System.out.println("| (_'_) |");
            System.out.println("|   |   |");
            System.out.println("|______V|");
         }
      }
      else if (num == "2"){   
         if(naipe == "Ouros"){
            System.out.println(" _______ ");
            System.out.println("|" + num + "      |");
            System.out.println("|   o   |");
            System.out.println("|       |");
            System.out.println("|   o   |");
            System.out.println("|______z|");
         }
         else if(naipe == "Espada"){
            System.out.println(" _______ ");
            System.out.println("|" + num + "      |");
            System.out.println("|   ^   |");
            System.out.println("|       |");
            System.out.println("|   ^   |");
            System.out.println("|______z|");
         }
         else if(naipe == "Copas"){
            System.out.println(" _______ ");
            System.out.println("|" + num + "      |");
            System.out.println("|   v   |");
            System.out.println("|       |");
            System.out.println("|   v   |");
            System.out.println("|______z|");
         }
         else if(naipe == "Paus"){
            System.out.println(" _______ ");
            System.out.println("|" + num + "      |");
            System.out.println("|  & &  |");
            System.out.println("|       |");
            System.out.println("|   &   |");
            System.out.println("|______z|");
         }
      }
      else if (num == "3"){   
         if(naipe == "Ouros"){
            System.out.println(" _______ ");
            System.out.println("|" + num + "      |");
            System.out.println("|  o o  |");
            System.out.println("|       |");
            System.out.println("|   o   |");
            System.out.println("|______E|");
         }
         else if(naipe == "Espada"){
            System.out.println(" _______ ");
            System.out.println("|" + num + "      |");
            System.out.println("|  ^ ^  |");
            System.out.println("|       |");
            System.out.println("|   ^   |");
            System.out.println("|______E|");
         }
         else if(naipe == "Copas"){
            System.out.println(" _______ ");
            System.out.println("|" + num + "      |");
            System.out.println("|  v v  |");
            System.out.println("|       |");
            System.out.println("|   v   |");
            System.out.println("|______E|");
         }
         else if(naipe == "Paus"){
            System.out.println(" _______ ");
            System.out.println("|" + num + "      |");
            System.out.println("|  & &  |");
            System.out.println("|       |");
            System.out.println("|   &   |");
            System.out.println("|______E|");
         }
      }
      else if (num == "4"){   
         if(naipe == "Ouros"){
            System.out.println(" _______ ");
            System.out.println("|" + num + "      |");
            System.out.println("|  o o  |");
            System.out.println("|       |");
            System.out.println("|  o o  |");
            System.out.println("|______h|");
         }
         else if(naipe == "Espada"){
            System.out.println(" _______ ");
            System.out.println("|" + num + "      |");
            System.out.println("|  ^ ^  |");
            System.out.println("|       |");
            System.out.println("|  ^ ^  |");
            System.out.println("|______h|");
         }
         else if(naipe == "Copas"){
            System.out.println(" _______ ");
            System.out.println("|" + num + "      |");
            System.out.println("|  v v  |");
            System.out.println("|       |");
            System.out.println("|  v v  |");
            System.out.println("|______h|");
         }
         else if(naipe == "Paus"){
            System.out.println(" _______ ");
            System.out.println("|" + num + "      |");
            System.out.println("|  & &  |");
            System.out.println("|       |");
            System.out.println("|  & &  |");
            System.out.println("|______h|");
         }
      }
      else if (num == "5"){   
         if(naipe == "Ouros"){
            System.out.println(" _______ ");
            System.out.println("|" + num + "      |");
            System.out.println("|  o o  |");
            System.out.println("|   o   |");
            System.out.println("|  o o  |");
            System.out.println("|______S|");
         }
         else if(naipe == "Espada"){
            System.out.println(" _______ ");
            System.out.println("|" + num + "      |");
            System.out.println("|  ^ ^  |");
            System.out.println("|   ^   |");
            System.out.println("|  ^ ^  |");
            System.out.println("|______S|");
         }
         else if(naipe == "Copas"){
            System.out.println(" _______ ");
            System.out.println("|" + num + "      |");
            System.out.println("|  v v  |");
            System.out.println("|   v   |");
            System.out.println("|  v v  |");
            System.out.println("|______S|");
         }
         else if(naipe == "Paus"){
            System.out.println(" _______ ");
            System.out.println("|" + num + "      |");
            System.out.println("|  & &  |");
            System.out.println("|   &   |");
            System.out.println("|  & &  |");
            System.out.println("|______S|");
         }
      }
      else if (num == "6"){   
         if(naipe == "Ouros"){
            System.out.println(" _______ ");
            System.out.println("|" + num + "      |");
            System.out.println("|  o o  |");
            System.out.println("|  o o  |");
            System.out.println("|  o o  |");
            System.out.println("|______9|");
         }
         else if(naipe == "Espada"){
            System.out.println(" _______ ");
            System.out.println("|" + num + "      |");
            System.out.println("|  ^ ^  |");
            System.out.println("|  ^ ^  |");
            System.out.println("|  ^ ^  |");
            System.out.println("|______9|");
         }
         else if(naipe == "Copas"){
            System.out.println(" _______ ");
            System.out.println("|" + num + "      |");
            System.out.println("|  v v  |");
            System.out.println("|  v v  |");
            System.out.println("|  v v  |");
            System.out.println("|______9|");
         }
         else if(naipe == "Paus"){
            System.out.println(" _______ ");
            System.out.println("|" + num + "      |");
            System.out.println("|  & &  |");
            System.out.println("|  & &  |");
            System.out.println("|  & &  |");
            System.out.println("|______9|");
         }
      }
      else if (num == "7"){   
         if(naipe == "Ouros"){
            System.out.println(" _______ ");
            System.out.println("|" + num + "      |");
            System.out.println("|  o o  |");
            System.out.println("| o o o |");
            System.out.println("|  o o  |");
            System.out.println("|______L|");
         }
         else if(naipe == "Espada"){
            System.out.println(" _______ ");
            System.out.println("|" + num + "      |");
            System.out.println("|  ^ ^  |");
            System.out.println("| ^ ^ ^ |");
            System.out.println("|  ^ ^  |");
            System.out.println("|______L|");
         }
         else if(naipe == "Copas"){
            System.out.println(" _______ ");
            System.out.println("|" + num + "      |");
            System.out.println("|  v v  |");
            System.out.println("| v v v |");
            System.out.println("|  v v  |");
            System.out.println("|______L|");
         }
         else if(naipe == "Paus"){
            System.out.println(" _______ ");
            System.out.println("|" + num + "      |");
            System.out.println("|  & &  |");
            System.out.println("| & & & |");
            System.out.println("|  & &  |");
            System.out.println("|______L|");
         }
      }
      else if (num == "8"){   
         if(naipe == "Ouros"){
            System.out.println(" _______ ");
            System.out.println("|" + num + "      |");
            System.out.println("| o o o |");
            System.out.println("|  o o  |");
            System.out.println("| o o o |");
            System.out.println("|______8|");
         }
         else if(naipe == "Espada"){
            System.out.println(" _______ ");
            System.out.println("|" + num + "      |");
            System.out.println("| ^ ^ ^ |");
            System.out.println("|  ^ ^  |");
            System.out.println("| ^ ^ ^ |");
            System.out.println("|______8|");
         }
         else if(naipe == "Copas"){
            System.out.println(" _______ ");
            System.out.println("|" + num + "      |");
            System.out.println("| v v v |");
            System.out.println("|  v v  |");
            System.out.println("| v v v |");
            System.out.println("|______8|");
         }
         else if(naipe == "Paus"){
            System.out.println(" _______ ");
            System.out.println("|" + num + "      |");
            System.out.println("| & & & |");
            System.out.println("|  & &  |");
            System.out.println("| & & & |");
            System.out.println("|______8|");
         }
      }
      else if (num == "9"){   
         if(naipe == "Ouros"){
            System.out.println(" _______ ");
            System.out.println("|" + num + "      |");
            System.out.println("| o o o |");
            System.out.println("| o o o |");
            System.out.println("| o o o |");
            System.out.println("|______6|");
         }
         else if(naipe == "Espada"){
            System.out.println(" _______ ");
            System.out.println("|" + num + "      |");
            System.out.println("| ^ ^ ^ |");
            System.out.println("| ^ ^ ^ |");
            System.out.println("| ^ ^ ^ |");
            System.out.println("|______6|");
         }
         else if(naipe == "Copas"){
            System.out.println(" _______ ");
            System.out.println("|" + num + "      |");
            System.out.println("| v v v |");
            System.out.println("| v v v |");
            System.out.println("| v v v |");
            System.out.println("|______6|");
         }
         else if(naipe == "Paus"){
            System.out.println(" _______ ");
            System.out.println("|" + num + "      |");
            System.out.println("| & & & |");
            System.out.println("| & & & |");
            System.out.println("| & & & |");
            System.out.println("|______6|");
         }
      }
      else if (num == "10"){   
         if(naipe == "Ouros"){
            System.out.println(" _______ ");
            System.out.println("|" + num + "  o  |");
            System.out.println("| o o o |");
            System.out.println("| o o o |");
            System.out.println("| o o o |");
            System.out.println("|_____0I|");
         }
         else if(naipe == "Espada"){
            System.out.println(" _______ ");
            System.out.println("|" + num + "  ^  |");
            System.out.println("| ^ ^ ^ |");
            System.out.println("| ^ ^ ^ |");
            System.out.println("| ^ ^ ^ |");
            System.out.println("|_____0I|");
         }
         else if(naipe == "Copas"){
            System.out.println(" _______ ");
            System.out.println("|" + num + "  v  |");
            System.out.println("| v v v |");
            System.out.println("| v v v |");
            System.out.println("| v v v |");
            System.out.println("|_____0I|");
         }
         else if(naipe == "Paus"){
            System.out.println(" _______ ");
            System.out.println("|" + num + "  &  |");
            System.out.println("| & & & |");
            System.out.println("| & & & |");
            System.out.println("| & & & |");
            System.out.println("|_____0I|");
         }
      }
      else if (num == "J"){   
         if(naipe == "Ouros"){
            System.out.println(" _______ ");
            System.out.println("|" + num + "    WW|");
            System.out.println("| /\\{) |");
            System.out.println("| \\/%  |");
            System.out.println("|    %  |");
            System.out.println("|___%%[ |");
         }
         else if(naipe == "Espada"){
            System.out.println(" _______ ");
            System.out.println("|" + num + "    WW|");
            System.out.println("|  ^ {) |");
            System.out.println("| (.)%  |");
            System.out.println("|  | %  |");
            System.out.println("|___%%[ |");
         }
         else if(naipe == "Copas"){
            System.out.println(" _______ ");
            System.out.println("|" + num + "    WW|");
            System.out.println("|    {) |");
            System.out.println("| (v)%  |");
            System.out.println("|  v %  |");
            System.out.println("|___%%[ |");
         }
         else if(naipe == "Paus"){
            System.out.println(" _______ ");
            System.out.println("|" + num + "    WW|");
            System.out.println("|  o {) |");
            System.out.println("| o o%  |");
            System.out.println("|  | %  |");
            System.out.println("|___%%[ |");
         }
      }
      else if (num == "Q"){   
         if(naipe == "Ouros"){
            System.out.println(" _______ ");
            System.out.println("|" + num + "    WW|");
            System.out.println("|  /\\{( |");
            System.out.println("|  \\/%% |");
            System.out.println("|    %% |");
            System.out.println("|___%%%O|");
         }
         else if(naipe == "Espada"){
            System.out.println(" _______ ");
            System.out.println("|" + num + "    WW|");
            System.out.println("|  ^ {( |");
            System.out.println("| (.)%% |");
            System.out.println("|  | %% |");
            System.out.println("|___%%%O|");
         }
         else if(naipe == "Copas"){
            System.out.println(" _______ ");
            System.out.println("|" + num + "    WW|");
            System.out.println("|    {( |");
            System.out.println("| (v)%% |");
            System.out.println("|  v %% |");
            System.out.println("|___%%%O|");
         }
         else if(naipe == "Paus"){
            System.out.println(" _______ ");
            System.out.println("|" + num + "    WW|");
            System.out.println("|  o {( |");
            System.out.println("| o o%% |");
            System.out.println("|  | %% |");
            System.out.println("|___%%%O|");
         }
      }
      else if (num == "K"){   
         if(naipe == "Ouros"){
            System.out.println(" _______ ");
            System.out.println("|" + num + "    WW|");
            System.out.println("|  /\\{( |");
            System.out.println("|  \\/%% |");
            System.out.println("|    %% |");
            System.out.println("|___%%%>|");
         }
         else if(naipe == "Espada"){
            System.out.println(" _______ ");
            System.out.println("|" + num + "    WW|");
            System.out.println("|  ^ {( |");
            System.out.println("| (.)%% |");
            System.out.println("|  | %% |");
            System.out.println("|___%%%>|");
         }
         else if(naipe == "Copas"){
            System.out.println(" _______ ");
            System.out.println("|" + num + "    WW|");
            System.out.println("|    {( |");
            System.out.println("| (v)%% |");
            System.out.println("|  v %% |");
            System.out.println("|___%%%>|");
         }
         else if(naipe == "Paus"){
            System.out.println(" _______ ");
            System.out.println("|" + num + "    WW|");
            System.out.println("|  o {( |");
            System.out.println("| o o%% |");
            System.out.println("|  | %% |");
            System.out.println("|___%%%>|");
         }
      }
   }
} // end class Carta
