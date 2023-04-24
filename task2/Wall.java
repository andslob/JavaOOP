package JavaOOP.task2;

public class Wall implements Obstacle {

    private int height;
    private int length = 0;


    public Wall(int height) {
        this.height = height;
    }

    @Override
    public int getLength() {
        return length;
    }

    @Override
    public int getHeight() {
        return height;
    }
}
