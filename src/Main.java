import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {

        methodFor(23);
        cicloDoWhile();
        // ciclo while;
        int i = 1; // viene dichiarata una condizione ed inizializata
        while (i <= 10){// si esamina la condizione booleana da verificare;
            out.println("Sei inteligente " +i);
            i++;
        }
        // Ciclo for.
      for (int n = 10; n > 0; n--) {
          out.println("Sei inteligente " + n);
      }
      // Ciclo for sugli array
      String [] strings = {"Antonio", "Marcello", "Ionut", "Pasquale", "Ludwig"};
      for(var a = 0; a < strings.length; a++){
          out.println(strings[a]);
      }
        int j = 1;
        labelPerBloccoDiCodice: {
            while (true){
              if (j > 10)
                  break labelPerBloccoDiCodice;
                  System.out.println(j);
                  j++;
          }
      }

    }
    // Ciclo for in un metodo con la variabile contattore al esterno;
    public static void methodFor(int j){
        int i;
        for(i = 0; i < j; ++i){
            out.println(i);
        }
        out.println("numero iterazionii " + i);
    }
    public static void cicloDoWhile(){
        int i = 10;
        do{
            out.println(i);
        } while(i <10);
    }
    public static void enhancedForLoop(){
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        for(int tmp : arr){
            out.println(tmp);
        }
    }
}