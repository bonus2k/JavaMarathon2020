package game.model;

public class Ship {
    private final String name;
    private Integer positionX;
    private Integer positionY;
    private boolean isLive;
    private boolean isVertically;
    private final Integer length;

    public Ship(String name, Integer length) {
        this.name = name;
        this.length = length;
        this.isLive = false;
    }

    public Integer getLength() {
        return length;
    }

    public String getName() {
        return name;
    }

    public Integer getPositionX() {
        return positionX;
    }

    public void setPositionX(Integer positionX) {
        this.positionX = positionX;
    }

    public Integer getPositionY() {
        return positionY;
    }

    public void setPositionY(Integer positionY) {
        this.positionY = positionY;
    }

    public boolean isLive() {
        return isLive;
    }

    public void setLive(boolean live) {
        isLive = live;
    }

    public boolean isVertically() {
        return isVertically;
    }

    public void setVertically(boolean vertically) {
        isVertically = vertically;
    }
}
