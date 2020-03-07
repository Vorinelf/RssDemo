package com.voronov.rssdemo;

import com.rometools.rome.io.FeedException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class TotalNews {
    List<String> listNewsUrls = new ArrayList<String>();
    RssReader rssReader;

    public void getTotalNews() throws IOException, FeedException {
        listNewsUrls.add("https://news.tut.by/rss/all.rss");
        listNewsUrls.add("http://rss.cnn.com/rss/edition.rss");
        listNewsUrls.add("http://lenta.ru/rss/photo/russia/");
        rssReader = new RssReader();
//        System.out.println(rssReader.reader(listNewsUrls));
        for (List<News> list : rssReader.reader(listNewsUrls)) {
            System.out.print(list + "\n");
        }
    }

}
