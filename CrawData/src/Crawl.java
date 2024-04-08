//import org.jsoup.Jsoup;
//import org.jsoup.nodes.Document;
//import org.jsoup.nodes.Element;
//import org.jsoup.select.Elements;
//
//import java.io.IOException;
//
//public class Crawl {
//    public static void main(String[] args) {
//        String url = "https://cotich.net/";
//        try {
//            Document document = Jsoup.connect(url).get();
//
//            // Trích xuất tất cả các thể loại truyện cổ tích
//            Elements storyCategories = document.select("div li a");
//
//            // Duyệt qua từng thể loại truyện và lấy danh sách các truyện trong mỗi thể loại
//            for (Element category : storyCategories) {
//                String categoryUrl = category.select("a").attr("href");
//                System.out.println("### " + category.text() + " ###");
//
//                Document categoryDocument = Jsoup.connect(categoryUrl).get();
//                Elements stories = categoryDocument.select("div li a");
//
//                // Duyệt qua từng truyện trong từng thể loại
//                for (Element story : stories) {
//                    String storyUrl = story.select("a").attr("href");
//                    Document storyDocument = Jsoup.connect(storyUrl).get();
//
//
//                    // Tiến hành trích xuất thông tin của truyện
//                    String title = storyDocument.select("a").attr("title");
//                    String imageUrl = storyDocument.select("div img").attr("src");
//                    String dateView = storyDocument.select("p[class=\"info-post\"]").text();
//                    String content = storyDocument.select("div.content").text();
//
//                    // Hiển thị thông tin của từng truyện theo định dạng Markdown
//
//                    System.out.println("- Title: " + title);
//                    System.out.println("  ![Image](" + imageUrl + ")");
//                    System.out.println(dateView);
//                    System.out.println("  - Content: " + content);
//                    System.out.println();
//                }
//
//                System.out.println(); // Phân tách giữa các thể loại
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}
