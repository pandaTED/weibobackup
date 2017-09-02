package cn.panda.entity;

public class Pics {
    private String pid;

    private String url;

    private String size;

    private Geo geo;

    private Large large;

    public String getPid() {
        return this.pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getSize() {
        return this.size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Geo getGeo() {
        return this.geo;
    }

    public void setGeo(Geo geo) {
        this.geo = geo;
    }

    public Large getLarge() {
        return this.large;
    }

    public void setLarge(Large large) {
        this.large = large;
    }

    @Override
    public String toString() {
        return "Pics{" +
                "pid='" + pid + '\'' +
                ", url='" + url + '\'' +
                ", size='" + size + '\'' +
                ", geo=" + geo +
                ", large=" + large +
                '}';
    }
}
