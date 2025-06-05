package TankGame;

public class Hero extends Tank{
    private int speed = 2;
    public Hero(int x, int y) {
        super(x, y);
    }
    public void moveUp() {
        y -= speed;
    }
    public void moveDown() {
        y += speed;
    }
    public void moveLeft() {
        x -= speed;
    }
    public void moveRight() {
        x += speed;
    }

}
