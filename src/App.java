import processing.core.*;

public class App extends PApplet {
    public static void main(String[] args)  {
        PApplet.main("App");
        
    } 
    
    public void settings(){
        size(400, 400);
}
public void setup(){
    background(255);

    fill(0);
    ellipse(200, 100, 50, 50);

    fill(255);
    rect(20, 50, 80, 90);
    stroke(0, 255, 0); 
    strokeWeight(3);     
    line(200, 100, 20, 50);
}
}