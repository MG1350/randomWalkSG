public class randomWalk {
    public randomWalk()
    {
        Rectangle box = new Rectangle(0, 0, 300, 300);
        box.draw();
        Ellipse border = new Ellipse(50, 50, 200, 200);
        border.draw();
        Ellipse circle = new Ellipse(150, 150, 10, 10);
        circle.setColor(Color.RED);
        circle.fill();
        try {Thread.sleep(1000);}
        catch(Exception ex) {};
    }
    public static void main(String args[])
    {
        randomWalk Test = new randomWalk();
    }
}
