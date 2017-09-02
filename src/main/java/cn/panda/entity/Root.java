package cn.panda.entity;

import java.util.List;

public class Root {
    private CardlistInfo cardlistInfo;

    private List<Cards> cards;

    private int ok;

    private int showAppTips;

    private String scheme;

    public CardlistInfo getCardlistInfo() {
        return this.cardlistInfo;
    }

    public void setCardlistInfo(CardlistInfo cardlistInfo) {
        this.cardlistInfo = cardlistInfo;
    }

    public List<Cards> getCards() {
        return this.cards;
    }

    public void setCards(List<Cards> cards) {
        this.cards = cards;
    }

    public int getOk() {
        return this.ok;
    }

    public void setOk(int ok) {
        this.ok = ok;
    }

    public int getShowAppTips() {
        return this.showAppTips;
    }

    public void setShowAppTips(int showAppTips) {
        this.showAppTips = showAppTips;
    }

    public String getScheme() {
        return this.scheme;
    }

    public void setScheme(String scheme) {
        this.scheme = scheme;
    }

    @Override
    public String toString() {
        return "Root{" +
                "cardlistInfo=" + cardlistInfo +
                ", cards=" + cards +
                ", ok=" + ok +
                ", showAppTips=" + showAppTips +
                ", scheme='" + scheme + '\'' +
                '}';
    }
}
