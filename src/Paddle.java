public class Paddle {
private int x;
private int y;
private int width;

public Paddle() {
    x = 10;
    y = 10;
    width =10;
}
public Paddle(int x, int y, int w){
    this.x = x;
    this.y = y;
    this.width = w;
}
public void moveUp(){
    y--;
}
public void moveDown(){
    y++;
}
public int getX(){
    return x;
}
public int getY(){
    return y;
}
public int getWidth(){
    return width;
}

}
