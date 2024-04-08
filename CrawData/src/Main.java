//import org.jsoup.Jsoup;
//import org.jsoup.nodes.Document;
//import org.jsoup.nodes.Element;
//import org.jsoup.select.Elements;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.PrintStream;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//
//public class Main {
//    public void main(String[] args) throws IOException {
//        String url = "https://cotich.net/";
//        try {
//            Document document = Jsoup.connect(url).get();
//
//            // Trích xuất tất cả các thể loại truyện cổ tích
//            Elements storyCategories = document.select("div.category-list li a");
//
//            // Duyệt qua từng thể loại truyện và lấy danh sách các truyện trong mỗi thể loại
//            for (Element category : storyCategories) {
//                String categoryUrl = category.absUrl("href");
//                System.out.println("### " + category.text() + " ###");
//                Document categoryDocument = Jsoup.connect(categoryUrl).get();
//                Elements stories = categoryDocument.select("div.story-list li a");
//
//                for (Element story : stories) {
//                    System.out.println(story.text()); // In ra tên của từng truyện cổ tích
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