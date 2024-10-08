import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        Tamagotchi t1 = new Tamagotchi();
        System.out.print("Name your new Tamagotchi: ");
        t1.name = keyboard.nextLine();
        
        while (t1.getAlive()){
            System.out.println("Hello Tamagotchi!");
            System.out.println();
            System.out.println("Menu: \n 1. Teach Tamagotchi a new word. \n 2. Greet Tamagotchi. \n 3. Feed Tamagotchi. \n 4. Do nothing.");
            System.out.print("Choice: ");
            int choice = keyboard.nextInt();
            keyboard.nextLine();
            System.out.println();

            switch (choice) {
                case 1:
                    System.out.print("Type the word your Tamagotchi, "+t1.name+", should learn: ");
                    String word = keyboard.nextLine();
                    t1.teach(word);
                    break;
                case 2:
                    //jj
                    break;
                case 3:
                    //jj
                    break;
                case 4:
                    //jj
                    break;
                default:
                    break;
            }
        }
        keyboard.close();
    }
}
