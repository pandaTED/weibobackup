package cn.panda.entity;

public class Visible {
    private int type;

    private int list_id;

    public int getType() {
        return this.type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getList_id() {
        return this.list_id;
    }

    public void setList_id(int list_id) {
        this.list_id = list_id;
    }

    @Override
    public String toString() {
        return "Visible{" +
                "type=" + type +
                ", list_id=" + list_id +
                '}';
    }
}
