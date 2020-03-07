package com.voronov.rssdemo;

public class News {
    String tittle, link, date,source;

    public News(String tittle, String link, String date, String source) {
        this.tittle = tittle;
        this.link = link;
        this.date = date;
        this.source = source;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @Override
    public String toString() {
        return "News{" +
                "tittle='" + tittle + '\'' +
                ", link='" + link + '\'' +
                ", date='" + date + '\'' +
                ", source='" + source + '\'' +
                '}';
    }
}
