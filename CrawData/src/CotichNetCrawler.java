//import org.jsoup.Jsoup;
//import org.jsoup.nodes.Document;
//import org.jsoup.nodes.Element;
//import org.jsoup.select.Elements;
//
//import java.io.IOException;
//
//public class CotichNetCrawler {
//    public static void main(String[] args) {
//            String url = "https://cotich.net/";
//            try {
//                Document document = Jsoup.connect(url).get();
//
//                // Trích xuất tất cả các thể loại truyện cổ tích
//                Elements storyCategories = document.select("div li a");
//
//                // Duyệt qua từng thể loại truyện và lấy danh sách các truyện trong mỗi thể loại
//                for (Element category : storyCategories) {
//                    String categoryUrl = category.select("a").attr("href");
//                    System.out.println(category.text());
//                    System.out.println("URL: " + categoryUrl);
//
//                    Elements link = category.select("div[main-content] [class=\"news-item\"] ");
//                    Elements linkk = category.select("div[class=\"title\"]");
//                    String danhMuc = linkk.select("a").text();
//                    for (Element link1 : link) {
//
//                        String tenTruyen = link1.select("a").attr("title");
//                        String dateView = link1.select("p[class=\"info-post\"]").text();
//                        String content = link1.select("p[class=\"sapo\"]").text();
//
//                        Elements link2 = link1.select("div[class=\"img\"]");
//                        for (Element link3 : link2) {
//                            String urll = link3.select("a").attr("href");
//                            String imgUrl = link3.select("img").attr("src");
//
//                            System.out.println("Danh Mục: " + danhMuc);
//                            System.out.println("Image: " + imgUrl);
//                            System.out.println("Tên Truyện: " + tenTruyen);
//                            System.out.println("URL: " + urll);
//                            System.out.println(dateView);
//                            System.out.println("Mô tả:  " + content);
//
//
//                            System.out.println("--------------------------------------------------------");
//
//                        }
//                    }
//                }
//
//
//
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//    }
//}
