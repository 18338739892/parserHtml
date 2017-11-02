package com.pkk.test.test1;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * Created by peikunkun on 2017/11/1 0001.
 */
public class Test1_2 {

    public static void main(String[] args) {
//        String url = "http://www.xiuqq.com/index.html";
        String url = "https://user.qzone.qq.com/656678879/infocenter";
        Document document = getUrl(url);

        Elements elements = document.getElementsByClass("d1");

        /*for (int i = 0; i < elements.size(); i++) {
            Element element = elements.get(i);

            Elements zelements=element.getElementsByClass("writer");
            Elements aelements=element.getElementsByTag("a");
            String title=aelements.text();
            String add=zelements.text();
            
            System.out.println(add+"____"+title);
        }*/


    }


    public static Document getUrl(String url) {

        Document document = null;
        try {
            document = Jsoup.connect(url).timeout(3000)//超时时间
                    .get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return document;
    }


}
