package cn.panda.entity;

public class CardlistInfo {

    private String containerid;

    private int v_p;

    private int show_style;

    private int total;

    private int page;

    public String getContainerid() {
        return this.containerid;
    }

    public void setContainerid(String containerid) {
        this.containerid = containerid;
    }

    public int getV_p() {
        return this.v_p;
    }

    public void setV_p(int v_p) {
        this.v_p = v_p;
    }

    public int getShow_style() {
        return this.show_style;
    }

    public void setShow_style(int show_style) {
        this.show_style = show_style;
    }

    public int getTotal() {
        return this.total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getPage() {
        return this.page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    @Override
    public String toString() {
        return "CardlistInfo{" +
                "containerid='" + containerid + '\'' +
                ", v_p=" + v_p +
                ", show_style=" + show_style +
                ", total=" + total +
                ", page=" + page +
                '}';
    }
}
