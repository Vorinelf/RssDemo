package com.voronov.rssdemo;

import com.rometools.rome.io.FeedException;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, FeedException {
        TotalNews totalNews = new TotalNews();
        totalNews.getTotalNews();
    }
}
