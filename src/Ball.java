public class Ball {
    private int x;
    private int y;
    private int vx;
    private int vy;

    public Ball() {
        x = 10;
        y = 10;
        vx = 2;
        vy = 1;
    }

    public Ball(int x, int y, int vx, int vy) {
        this.x = x;
        this.y = y;
        this.vx = vx;
        this.vy = vy;
    }
    public void move() {
        x+=vx;
        y+=vy;
    }
    public void bounceP(){
        vx*=-1;
    }
    public void bounce(){
        vy*=-1;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
}