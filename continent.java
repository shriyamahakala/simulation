public class continent {
    String continent;
    double space;
    public continent(String name, double size){
        continent = name;
        space = size;
    }

    public double space(){
        return space;
    }

    public void changeSpace(double take){
        space = space - take;
    }
}
