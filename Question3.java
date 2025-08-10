//Write a Java program to create class called "TrafficLight" with attributes for color and duration, and methods to change the color and check for red or green.

class TraficLight{
    String color;
    int duration;
    
    public TraficLight(String color , int duration){
        this.color = color;
        this.duration = duration;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    public void changeColor(String color){
        this.color = color;
    }
    public void countdown() {
    for (int remaining = this.duration; remaining >= 0; remaining--) {
        System.out.printf("%s: %02d s%n", this.color, remaining);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return;
        }
    }
}
    
    public void checkColor(){
        if (this.color == "Red"){
            System.out.println("Stop for "+this.duration+"sec the color is Red");
        }
        else if (this.color == "Green"){
            System.out.println("Go the color is Green");
        }
        else{
            System.out.println("Can you stop messing with tarffic light colors");
        }
    }
}

public class Main{                                //main class for running the code
    public static void main(String[] args){
        TraficLight t = new TraficLight("Red",20);
        
        t.checkColor();
        t.countdown();
        t.setColor("Green");
        t.checkColor();
        t.changeColor("Yellow");
        t.checkColor();
    }
}





















