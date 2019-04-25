package command;

public abstract class Receiver {
    private int xPos;
    private int yPos;

    public int getXPos() {
        return xPos;
    }

    public void setXPos(int xPos) {
        this.xPos = xPos;
    }

    public int getYPos() {
        return yPos;
    }

    public void setYPos(int yPos) {
        this.yPos = yPos;
    }

    public void printStatus() {
        System.out.println("xPos: " + getXPos() + " | " + "yPos: " + getYPos());
    }
}
