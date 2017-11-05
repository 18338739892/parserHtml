package com.pkk.test.test1;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


/**
 * @author peikunkun
 * @version V1.0
 * @Title: lov
 * @Package com.pkk.test.test1
 * @Description: <>
 * @date 11/3 0003 13:29
 */
@SuppressWarnings("all")
public class Test1_3 {


    public static void main(String[] args) {


        String url = "http://www.xiuqq.com/index.html";
        Document document = getUrl(url);

        Elements elements = document.getElementsByClass("bignews");

        Elements lis = elements.select(".d1 li");

        for (int i = 0; i < lis.size(); i++) {
            Element element = lis.get(i);
            Elements dateEle = element.getElementsByClass("writer");
            Element aele = element.getElementsByTag("a").first();
            Element aeles = element.getElementsByTag("a").last();
            String title = aele.text();
            String titleHref = "http://www.xiuqq.com" + aeles.attr("href");
            String date = dateEle.text();
            String add = aeles.text();


            System.out.println(title + "____" + date + "______" + titleHref + "---------" + add);


            Document info = getUrl(titleHref);
            System.out.println(titleHref);
            Elements infoeles = info.select("div.pleft div.viewbox");
            System.out.println(infoeles.size());

            for (int j = 0; j < infoeles.size(); j++) {

                Element ztitle = infoeles.get(j);
                Elements zinfos = ztitle.select("div.info");
                Elements zwenzhangs = ztitle.select("div#zt p");
                String zti = ztitle.select(".title h2").text();
                String zwenzhang = zwenzhangs.text();
                String zinfo = zinfos.text();

                System.out.println(zti + "----" + zinfo + "----" + zwenzhang);


            }


        }


    }


    public static Document getUrl(String url) {

        Document document = null;
        try {
            /*document = Jsoup.connect(url).timeout(3000)//超时时间
                    .data("query", "Java")
                    .userAgent("Mozilla")
                    .cookie("auth", "token")
                    .get();*/
            //获取请求连接
            Connection con = Jsoup.connect(url);
            //获取cookie名称为__bsi的值
            //请求头设置，特别是cookie设置
            con.header("Accept", "text/html, application/xhtml+xml, */*");
            con.header("Content-Type", "application/x-www-form-urlencoded");
            con.header("User-Agent", "Mozilla/5.0 (compatible; MSIE 9.0; Windows NT 6.1; WOW64; Trident/5.0))");
            //解析请求结果
            document = con.get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return document;
    }


}
