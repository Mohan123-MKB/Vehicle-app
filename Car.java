public class Car extends Vehicle {
    private int wheels;
    private String type;
    private int doors;
    private int gears;
    private boolean isManual;
    private int cur_gear;

    public Car(String name,int wheels, int doors, int gears, boolean isManual, String type){
        super(name);
        this.type=type;
        this.gears=gears;
        this.doors=doors;
        this.isManual=isManual;
        this.wheels=wheels;
        cur_gear=1;
         //when car obj created then car constructor called then cur_gear set to 1;
    }
    public void changeGear(int newGear){
        this.cur_gear=newGear;
        System.out.println("Change to "+ this.cur_gear + " gear");
    }
    public void changeSpeed(int newSpeed, int newDirection){
        // move method provide property to car class then car class inherit by vehicle class
        move(newSpeed,newDirection);
        System.out.println("Speed --> " + newSpeed + " && direction --> "+ newDirection);  
        }
    public int getWheels() {
        return wheels;
    }
    public void setWheels(int wheels) {
        this.wheels = wheels;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getDoors() {
        return doors;
    }
    public void setDoors(int doors) {
        this.doors = doors;
    }
    public int getGears() {
        return gears;
    }
    public void setGears(int gears) {
        this.gears = gears;
    }
    public boolean isManual() {
        return isManual;
    }
    public void setManual(boolean isManual) {
        this.isManual = isManual;
    }
    public int getCur_gear() {
        return cur_gear;
    }
    public void setCur_gear(int cur_gear) {
        this.cur_gear = cur_gear;
    }
        
    }
