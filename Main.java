import Factories.*;
public class Main {
    public static void main(String[] args) {

        for (int j = 0; j <= 7; j++) {
            System.out.println((j+1) + ".");
            PawnFactory.getPawn("white").draw(j, 2);
        }

        for (int i = 7; i <= 15; i++) {
            System.out.println((i+1) + ".");
            PawnFactory.getPawn("black").draw(i, 7);
        }
        
    }

}
