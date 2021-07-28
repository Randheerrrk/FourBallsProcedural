import processing.core.PApplet;

public class FourBallsProcedural extends PApplet{

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int C = 10;
    public static final int OFFSET = HEIGHT / 5;
    static int frame = 0;
    
    public static void main(String[] args) {
        PApplet.main("FourBallsProcedural", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        for(int i=1; i<=4; i++) ellipse(getX(i), getY(i), C, C);
        frame++;
    }
    
    private int getX(int position) {
        return position * frame;
    }
    
    private int getY(int position) {
        return position * OFFSET;
    }
    
}
