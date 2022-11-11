public class Pong {
    Ball b = new Ball();
    Paddle p1 = new Paddle();
    Paddle p2 = new Paddle();
    private int width = 100;
    private int height = 100;
    public Pong(int width, int height ){
        this.width = width;
        this.height = height;
    }
    public void update(){
        b.move();
        checkCollision();
    }
    private void checkCollision(){
        if(b.getX()==p1.getX() || b.getX()==p2.getX()){
            b.bounceP();
        }
        else if(b.getY()==height || b.getY()==0){
            b.bounce();
        }
        else if(b.getX()==width){
            System.out.println("+1 Point to Player 2");
        }
        else if(b.getX()==0){
            System.out.println("+1 Point to Player 1");
        }
    }
}
