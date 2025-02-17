public class Vehicle {
private String name;
private int cur_speed;
private int cur_direction;

public Vehicle(String name) {
    this.name = name;
    this.cur_speed = 0;
    this.cur_direction = 0;
}
public void steer(int direction){
    this.cur_direction +=direction;
    System.out.println("Steering at " + cur_direction+ "degrees");
}
public void move(int speed, int direction){
    cur_speed = speed;
    cur_direction = direction;
    System.out.println("Moving at " + cur_speed + " in direction "+ cur_direction);
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public int getCur_speed() {
    return cur_speed;
}
public void setCur_speed(int cur_speed) {
    this.cur_speed = cur_speed;
}
public int getCur_direction() {
    return cur_direction;
}
public void setCur_direction(int cur_direction) {
    this.cur_direction = cur_direction;
}

public void stop(){
    this.cur_speed=0;
    System.out.println("Vehicle is stoped.....");
}

}
