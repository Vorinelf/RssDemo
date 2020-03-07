package com.voronov.rssdemo;

import com.rometools.rome.feed.synd.SyndEntry;
import com.rometools.rome.feed.synd.SyndFeed;
import com.rometools.rome.io.FeedException;
import com.rometools.rome.io.SyndFeedInput;
import com.rometools.rome.io.XmlReader;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class RssReader {

    List<List<News>> arrayNewsFromAllSites = new ArrayList<List<News>>();


    public RssReader() throws IOException {
    }

    public List<List<News>> reader(List<String> listUrlAddress) throws IOException, FeedException {
        for (String urlAddress : listUrlAddress) {
            List<News> arrayNewsFromOneSite = new ArrayList<News>();
            URL feedSource = new URL(urlAddress);
            SyndFeedInput input = new SyndFeedInput();
            SyndFeed feed = input.build(new XmlReader(feedSource));
            String source = feed.getTitle();
            for (Object o : feed.getEntries()) {
                SyndEntry syndEntry = (SyndEntry) o;
                String title = syndEntry.getTitle();
                String link = syndEntry.getLink();
                String date = String.valueOf(syndEntry.getPublishedDate());

                News news = new News(title, link, date,source);
                arrayNewsFromOneSite.add(news);
            }
            arrayNewsFromAllSites.add(arrayNewsFromOneSite);
        }

        return arrayNewsFromAllSites;
    }
}
