import java.awt.*;
public class Car {

    private int x;
    private int y;
    private int width;
    private int height;
    private Color color;

    public Car(final int x, final int y, final int width, final int height, final Color color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    void draw(final Graphics gr) {
        Graphics2D g = (Graphics2D) gr;

        //body

        g.setColor(this.color);
        g.fillRect(this.x, this.y, this.width + 300, this.height - 100);

        g.setColor(Color.RED);
        g.fillRect(this.x + 400, this.y - 150, this.width, this.height + 50);

        g.setColor(Color.lightGray);
        g.fillRect(this.x + 300, this.y - 100, this.width - 100, this.height -160 );

        g.setColor(Color.darkGray);
        g.fillRect(this.x + 150, this.y - 60, this.width - 50, this.height -200 );

        //wheel 1

        g.setColor(Color.black);
        g.fillOval(this.x + 50, this.y + 100, this.width - 50, this.height - 150);

        g.setColor(Color.white);
        g.fillOval(this.x + 65, this.y + 105, this.width - 80, this.height - 160);

        //backLight

        g.setColor(Color.yellow);
        g.fillRect(this.x -10, this.y + 10, this.width -180, this.height - 170);

        g.setColor(Color.red);
        g.fillOval(this.x - 10, this.y + 10, this.width - 180, this.height - 230);


        //wheel 2

        g.setColor(Color.black);
        g.fillOval(this.x + 400, this.y + 100, this.width - 50, this.height - 150);

        g.setColor(Color.white);
        g.fillOval(this.x + 415, this.y + 105, this.width - 80, this.height - 160);


        //window

        g.setColor(Color.white);
        g.fillRect(this.x + 430, this.y - 110, this.width - 50, this.height - 150);

        //lights

        g.setColor(Color.yellow);
        g.fillRect(this.x + 550, this.y + 70, this.width - 150, this.height - 250);

        g.setColor(Color.black);
        g.drawLine(this.x + 400, this.y - 100, this.x, this.y);



    }
}