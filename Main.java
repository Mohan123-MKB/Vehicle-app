public class Main {
    public static void main(String args[]){
        Honda h1=new Honda("honda25h",false);
        Honda h2=new Honda("honda25th",false);
        h1.move(40,0);
        h1.accelerate(20);
        h1.accelerate(-60);
        System.out.println(h1.getCur_gear());
        System.out.println(h1.getCur_speed()); //use car class to get curent gear and current speed using getter and setter method
        
    }

}
