import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class craw1 {
    public void crawlStoriesByCategory(String categoryUrl) {
        try {
            // Kết nối đến trang web thể loại truyện
            Document doc = Jsoup.connect(categoryUrl).get();

            // Lấy tất cả các truyện trong thể loại
            Elements link = doc.select("div[class=\"main-content\"] [class=\"news-item\"] ");
            Elements linkk = doc.select("div[class=\"title\"]");
            String danhMuc = linkk.select("a").text();
            System.out.println("Danh Mục: " + danhMuc);
            for(Element link1 : link) {

                String tenTruyen = link1.select("a").attr("title");
                String dateView = link1.select("p[class=\"info-post\"]").text();
                String content = link1.select("p[class=\"sapo\"]").text();

                Elements link2 = link1.select("div[class=\"img\"]");
                for(Element link3 : link2){
                    String url = link3.select("a").attr("href");
                    String imgUrl = link3.select("img").attr("src");

       //           System.out.println("Danh Mục: " + danhMuc);
                    System.out.println("Image: " + imgUrl);
                    System.out.println("Tên Truyện: " + tenTruyen);
                    System.out.println("URL: " + url);
                    System.out.println(dateView);
                    System.out.println("Mô tả:  " + content );

                    System.out.println("--------------------------------------------------------");
                }
            }
        }catch (Exception e){
            e.getMessage();
        }
    }
    
    public static void main(String[] args) {
        craw1 crawler = new craw1();

//        try {
//            Document doc = Jsoup.connect("https://cotich.net/").get();
//            Elements categories = doc.select("div[class=\"menuTop \"] ul[id] li");
//            for (Element category : categories) {
//                String categoryName = category.select("a").attr("title");
//                String categoryUrl = category.select("a").attr("href");
//                System.out.println("Thể Loại: " + categoryName);
//                System.out.println("URL: " + categoryUrl);
//
//                 Gọi phương thức để lấy danh sách truyện từng thể loại
//                crawler.crawlStoriesByCategory(categoryUrl);
//                 URL của thể loại "Cổ Tích Thế Sự"
        String category1Url = "https://cotich.net/co-tich-viet-nam.html";
        crawler.crawlStoriesByCategory(category1Url);

        String category2Url = "https://cotich.net/co-tich-ve-loai-vat.html";
        crawler.crawlStoriesByCategory(category2Url);


//            }
//        }catch (Exception e){
//            e.getMessage();
//        }
    }
}
