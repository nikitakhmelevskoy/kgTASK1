import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DrawPanel extends JPanel implements ActionListener {

    private final int PANEL_WIDTH;
    private final int PANEL_HEIGHT;
    private final int TIMER_DELAY;
    private Timer timer;
    private int ticksFromStart = 0;

    private Car car;
    private final Background background;


    public DrawPanel(final int width, final int height, final int timerDelay) {
        this.PANEL_WIDTH = width;
        this.PANEL_HEIGHT = height;
        this.TIMER_DELAY = timerDelay;
        timer = new Timer(timerDelay, this);
        timer.start();

        this.car = new Car(ticksFromStart, 200, 200, 260, Color.ORANGE);
        this.background = new Background(0, 0, width, height, new Color(148, 187, 192), new Color(128, 128, 0));
    }

    @Override
    public void paint(final Graphics gr) {
        super.paint(gr);

        background.setWidth(getWidth());
        background.setHeight(getHeight());
        background.drawBackground(gr);

        car.setX(ticksFromStart);
        car.draw(gr);
    }

    @Override
    public void actionPerformed(final ActionEvent e) {
        if (e.getSource() == timer) {
            repaint();
            ++ticksFromStart;
        }
    }
}