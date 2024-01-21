package OCP;

public class Sedan extends Vehicle {

    public Sedan(int maxSpeed, String type) {
        super(maxSpeed, type);   
    }

    @Override
    public double allowedSpeed(){
        return maxSpeed *0.8;
    }
    
}
