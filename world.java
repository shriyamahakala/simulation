import java.util.Scanner;
import java.util.Random;
public class world {
    static boolean cont = true;
    static Scanner scan = new Scanner(System.in);
    static Random rand = new Random();
    continent happy = new continent("happy", 1500.0);
    continent dark = new continent("dark", 50000.0);
    land myLand = new land();
    public static void main(String[] args) {
        world thisWorld = new world();
        thisWorld.getLand();
        while(cont){
            int num = rand.nextInt(4);
            thisWorld.action(num);
            System.out.println("Type stop to stop playing. Type anything else to continue");
            if (scan.nextLine().toLowerCase()=="stop"){
                cont = false;
            }
            scan.close();
        }
        
    }
    
    public void getLand(){
        System.out.println("What continent would you like to take land from? The continents to choose from are happy and dark");
        String conName = scan.nextLine();
            if (conName.equals("happy")){
                System.out.println("Happy has " + happy.space() + " miles squared up for grab. Enter how much land you want to take");
                double landTakeH = scan.nextDouble();
                if (happy.space()>=landTakeH){
                    happy.changeSpace(landTakeH);
                    myLand.setConSize(happy, landTakeH);
                    System.out.println("Your territory has been defined");
                }
                else{
                    System.out.println("You have entered too much land. Please enter a number not greater than the amount of land left.");
                    landTakeH = scan.nextDouble(); 
                }
            }
            else if (conName.equals("dark")){
                System.out.println("Dark has " + dark.space() + " miles squared up for grab. Enter how much land you want to take.");
                double landTakeD = scan.nextDouble();
                if (dark.space()>=landTakeD){
                    dark.changeSpace(landTakeD);
                    myLand.setConSize(dark, landTakeD);
                    System.out.println("Your territory has been defined");
                    
                }
                else{
                    System.out.println("You have entered too much land. Please enter a number not greater than the amount of land left.");
                    landTakeD = scan.nextDouble(); 
                }
            }
            else {
                System.out.println("This is an invalid continent name. Enter either happy or dark");
                conName = (scan.nextLine()).toLowerCase();
            }
            
    }

    public void action(int num){
        //int num = rand.nextInt(4); Get random number in main method in a loop
        switch(num) {
            case 0:
                System.out.println("You have been offered a deal to buy 500 miles squared of land for 2000 gold. Type yes to accept. Type anything else to decline.");
                System.out.println(myLand.buyLand(scan.nextLine()));
                System.out.println(myLand.inventory());
              break;
            case 1:
               System.out.println("You have been attacked");
               System.out.println(myLand.smallLevelAttack());
               System.out.println(myLand.inventory());
              break;
            case 2: 
                System.out.println("You have been attacked");
                System.out.println(myLand.highLevelAttack());
                System.out.println(myLand.inventory());
            case 3:
                System.out.println(myLand.recruit());
                System.out.println(myLand.inventory());
            default:
              System.out.println("There has been an error");
          }
    }



}
