package cn.panda.entity;

public class Page_pic {
    private String url;

    public void setUrl(String url){
        this.url = url;
    }
    public String getUrl(){
        return this.url;
    }

    @Override
    public String toString() {
        return "Page_pic{" +
                "url='" + url + '\'' +
                '}';
    }
}
