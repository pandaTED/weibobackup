package cn.panda.entity;

public class Geo {
    private int width;

    private int height;

    private boolean croped;

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public boolean getCroped() {
        return this.croped;
    }

    public void setCroped(boolean croped) {
        this.croped = croped;
    }

    @Override
    public String toString() {
        return "Geo{" +
                "width=" + width +
                ", height=" + height +
                ", croped=" + croped +
                '}';
    }
}
