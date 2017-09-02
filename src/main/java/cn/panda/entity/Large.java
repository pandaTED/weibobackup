package cn.panda.entity;

public class Large {
    private String size;

    private String url;

    private Geo geo;

    public String getSize() {
        return this.size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Geo getGeo() {
        return this.geo;
    }

    public void setGeo(Geo geo) {
        this.geo = geo;
    }

    @Override
    public String toString() {
        return "Large{" +
                "size='" + size + '\'' +
                ", url='" + url + '\'' +
                ", geo=" + geo +
                '}';
    }
}
