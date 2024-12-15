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
        int steps = 0;
        while (true) {
            steps++;
            int ranX = (int) (Math.random() * 21) - 10;
            int ranY = (int) (Math.random() * 21) - 10;
            circle.translate(ranX, ranY);
            double x = circle.getX() + 5;
            double y = circle.getY() + 5;
            double distance = Math.sqrt(Math.pow(x - 150, 2) + Math.pow(y - 150, 2));
            if (distance > 100) {
                break;
            }
            try {
                Thread.sleep(100);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        System.out.println("Escaped in " + steps + " steps.");
    }
    public static void main(String args[])
    {
        randomWalk Test = new randomWalk();
    }
}
