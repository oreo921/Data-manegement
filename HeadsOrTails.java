import java.util.Random;
class Toss {
   public String chanceFunc() {
      Random r = new Random();
      int chance = r.nextInt(2);
      if (chance == 1) {
         return"tails";
      } else {
         return"heads";
      }
   }
}

public class HeadsOrTails {
   public static void main(String[] args) {
      Toss t = new Toss();
      int heads = 0;
      int tails = 0;
      int chances = 3;
      
      System.out.println("Who are you?");
      Scanner scan = new Scanner(System.in);
      String str = scan.next();
      System.out.println("Hello,"+str);
      System.out.println("Tossing a coin...");
      
	   for (int i = 1; i<= chances; i++) {
	  System.out.print("Round"+i+":");
         if (t.chanceFunc().equals("tails")) {
            tails++;
	    System.out.println("Tails");
         } else {
            heads++;
	    System.out.println("Heads");
         }
      }
      System.out.println("Heads: " + heads +", Tails:"+ tails);
   }
}
