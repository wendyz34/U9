import java.util.Scanner;
public class Test {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        /*System.out.println("|Testing|");
        PhotoPost post = new PhotoPost("Sophia","cloud.jpg","hello");
        post.getCaption();
        post.getTimeStamp();
        post.display();
        MessagePost message = new MessagePost("Kathy","A preview!");
        message.like();
        message.addComment("Look forward");
        message.display();
        NewsFeed news = new NewsFeed();
        news.show();
        news.addMessagePost(message);*/
        System.out.print("Message 1?");
        String mes = scan.nextLine();
        PhotoPost2 post = new PhotoPost2("Sophia","cloud.jpg","hello");
        post.getCaption();
        post.getCaption();
        post.getTimeStamp();
        post.display();
        MessagePost2 message = new MessagePost2("Kathy",mes);
        message.like();
        message.addComment("Look forward");
        message.display();
        NewsFeed2 news = new NewsFeed2();
        news.show();
    }
}
