public class land{
    continent c;
    double size;
    int soldiers = 100;
    int gold = 20000;

    public land() {
        
    }
    public void setConSize(continent con, double s){
        c = con;
        size = s;
    }

    
    public String smallLevelAttack(){
        if (soldiers > 25){
            soldiers -= 2;
            gold += 5000;
            return "You have survived the attack. You lost 2 soldiers and earned 5000 gold";
        }
        else {
            soldiers -= 10;
            gold -= 5000;
            return "You did not survive the attack. You lost 10 soldiers and lost 5000 gold";
        }
    }

    public String highLevelAttack(){
        if (soldiers > 50){
            soldiers -= 20;
            gold -= 10000;
            size -= 500;
            return "You did not survive the attack. You lost 20 soldiers, 10000 gold, and 500 miles squared of land";
        }
        else {
            soldiers = soldiers - 4;
            gold += 10000;
            size += 500;
            return "You survived the attack. You lost two soldiers but gained 10000 gold and 500 miles square.";
        }
    }

    public String buyLand(String y){
        if (y.toLowerCase() == "yes"){
            gold -= 2000;
            size += 500;
            return "You have succesfully bought 500 miles squared of land";
        }
        else {
            return "You did not buy more land";
        }
    }

    public String recruit(){
        soldiers += 50;
        return "You have recruited 50 new soldiers";
    }

	public String inventory(){
        return "Gold: " + gold + " Soldiers: " + soldiers + " Size: " + size + " miles squared";
    } 

    
}
