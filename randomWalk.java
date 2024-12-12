public class randomWalk {
    private int xCord;
    private int yCord;
    public randomWalk()
    {
        xCord = 150;
        yCord = 150;
        Rectangle box = new Rectangle(0, 0, 300, 300);
        box.draw();
        Ellipse border = new Ellipse(100, 100, 100, 100);
        border.setColor(Color.RED);
        border.fill(); 
        Ellipse circle = new Ellipse(150, 150, 10, 10);
        circle.setColor(Color.GREEN);
        circle.fill();
        try {Thread.sleep(1000);}
        catch(Exception ex) {};
    }
    public static void main(String args[])
    {
        randomWalk Test = new randomWalk();
    }
}
