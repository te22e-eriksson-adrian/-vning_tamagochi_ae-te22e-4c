import java.util.ArrayList;
import java.util.Random;

public class Tamagotchi {
    // Attributes
    private int hunger = 0;
    private int boredome = 0;
    private boolean isAlive = true;
    private Random generator = new Random();
    public String name;
    private ArrayList<String> words = new ArrayList<>();

    // Methods
    public void feed(){
        if (hunger <= 1) {
            if (hunger == 0) {
                // (Do noting!)
            }else{
                hunger-=1;
            }
        }else{
            hunger-=2;
        }
        System.out.println();
        System.out.println("Hunger: "+hunger);
    }
    public void speak(){
        int randomIndex = generator.nextInt(words.size());
        try{
            Thread.sleep(100);
        }catch(Exception e){
            System.out.println();
            System.out.println("CAUTION: Minor Error - (Could not wait!)");
        }
        System.out.println();
        System.out.println(name+" responded: "+words.get(randomIndex));
        reduceBoredome();
    }
    public void teach(String word){
        words.add(word);
        reduceBoredome();
    }
    public void tick(){
        hunger+=1;
        boredome+=1;
    }
    public void printStats(){
        System.out.println("Current values for "+name+": \n- Hunger: "+hunger+"\n- Boredom: "+boredome);
        if (isAlive) {
            System.out.println(name+", (your Tomagotchi), is alive!");
        }
    }
    public boolean getAlive(){
        if (hunger < 10 || boredome < 10) {
            isAlive = true;
        }else{
            isAlive = false;
        }
        return isAlive;
    }
    private void reduceBoredome(){
        if (boredome <= 1) {
            if (boredome == 0) {
                // (Do noting!)
            }else{
                boredome-=1;
            }
        }else{
            boredome-=2;
        }
        System.out.println();
        System.out.println("Boredome: "+boredome);
    }
}