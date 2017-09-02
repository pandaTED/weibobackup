package cn.panda.entity;

public class Cards {
    private int card_type;

    private String itemid;

    private String scheme;

    private Mblog mblog;

    private int show_type;

    public int getCard_type() {
        return this.card_type;
    }

    public void setCard_type(int card_type) {
        this.card_type = card_type;
    }

    public String getItemid() {
        return this.itemid;
    }

    public void setItemid(String itemid) {
        this.itemid = itemid;
    }

    public String getScheme() {
        return this.scheme;
    }

    public void setScheme(String scheme) {
        this.scheme = scheme;
    }

    public Mblog getMblog() {
        return this.mblog;
    }

    public void setMblog(Mblog mblog) {
        this.mblog = mblog;
    }

    public int getShow_type() {
        return this.show_type;
    }

    public void setShow_type(int show_type) {
        this.show_type = show_type;
    }

    @Override
    public String toString() {
        return "Cards{" +
                "card_type=" + card_type +
                ", itemid='" + itemid + '\'' +
                ", scheme='" + scheme + '\'' +
                ", mblog=" + mblog +
                ", show_type=" + show_type +
                '}';
    }
}
