import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello Tamagotchi!");
        System.out.println();
        
        Scanner keyboard = new Scanner(System.in);
        Tamagotchi t1 = new Tamagotchi();
        System.out.print("Name your new Tamagotchi: ");
        t1.name = keyboard.nextLine();

        int choice = 0;
        
        while (t1.getAlive()){
            System.out.println();
            t1.tick();
            t1.printStats();
            System.out.println();
            System.out.println("Menu: \n 1. Teach Tamagotchi a new word. \n 2. Greet Tamagotchi. \n 3. Feed Tamagotchi. \n 4. Do nothing.");
            System.out.print("Choice: ");
            try{
                choice = keyboard.nextInt();
                keyboard.nextLine();
            }catch(Exception e){
                choice = 5;
            }
            System.out.println();

            switch (choice) {
                case 1:
                    System.out.print("Type the word your Tamagotchi, "+t1.name+", should learn: ");
                    String word = keyboard.nextLine();
                    t1.teach(word);
                    break;
                case 2:
                    System.out.print("You said: Hi!");
                    t1.speak();
                    break;
                case 3:
                    t1.feed();
                    break;
                case 4:
                    // (Does nothing!)
                    break;
                default:
                    System.out.println("You made a faulty input, please enter the number corresponding to the alternative in the menu.");
                    break;
            }
        }
        System.out.println("Your Tomagotchi, "+t1.name+", is dead. Please restart the game to create a new Tomagotchi.");
        System.out.println();
        keyboard.close();
    }
}
