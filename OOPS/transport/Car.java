package oops.transport;

public class Car extends Vehicle{
    public int noOfDoors;
    public String transmissionType;

    Car(String name, String model, int noOfTyres, int noOfDoors, String transmissionType){

        // super should be first line of code for the constructor body
        super(name, model, noOfTyres);
        this.noOfDoors = noOfDoors;
        this.transmissionType = transmissionType;
    }

    public void startAC(){
        System.out.println("AC started of " + name + " " + model);
    }
}
