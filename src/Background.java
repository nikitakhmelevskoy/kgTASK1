import java.awt.*;

public class Background {

    private int x;
    private int y;
    private int width;
    private int height;
    private Color colorSky;
    private Color colorSea;

    public Background( int x, int y, int width, int height, Color colorSky, Color colorSea) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.colorSky = colorSky;
        this.colorSea = colorSea;
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

    public void setColorSky(Color colorSky) {
        this.colorSky = colorSky;
    }

    public void setColorSea(Color colorSea) {
        this.colorSea = colorSea;
    }

    public void drawBackground(final Graphics gr) {
        Graphics2D g = (Graphics2D) gr;
        g.setColor(this.colorSky);
        g.fillRect(this.x, this.y, this.width, this.height/3);
        g.setColor(this.colorSea);
        g.fillRect(this.x, this.height/3, this.width, 2*this.height/3);
    }
}