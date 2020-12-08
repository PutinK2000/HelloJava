package ru.mirea.praktika3;

public class MovableRectangle implements Movable{
    private MoviblePointRectangle topLeft;
    private MoviblePointRectangle bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){
        topLeft = new MoviblePointRectangle(x1,y1,x2,y2,xSpeed,ySpeed);
        bottomRight = new MoviblePointRectangle(x1,y1,x2,y2,xSpeed,ySpeed);
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }

    @Override
    public void moveUp() {
        if(Proverka()) {
            topLeft.y1++;
            topLeft.y2++;
        }
    }

    @Override
    public void moveDown() {
        if(Proverka()) {
            topLeft.y1--;
            topLeft.y2--;
        }
    }

    @Override
    public void moveRight() {
        if(Proverka()) {
            topLeft.x1++;
            topLeft.x2++;
        }
    }

    @Override
    public void moveLeft() {
        if(Proverka()) {
            topLeft.x1--;
            topLeft.x2--;
        }
    }

    public boolean Proverka(){
        if(topLeft.xSpeed==bottomRight.xSpeed&&topLeft.ySpeed==bottomRight.ySpeed){
            return true;
        }
        return false;
    }
}