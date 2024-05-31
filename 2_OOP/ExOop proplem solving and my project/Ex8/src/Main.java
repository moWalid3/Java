import model.Post;
import service.FaceBookService;
import service.LinkedInService;
import service.PostService;

public class Main {
    public static void main(String[] args) {
        Post fb=new Post();
        fb.setId(1);
        fb.setTxt("txt222");
        fb.setImg("set img in facebook");
        PostService face=new FaceBookService();
        face.show(fb);

        Post li=new Post();
        li.setId(2);
        li.setTxt("txt333");
        li.setImg("set img in linkedin");
        PostService linked=new LinkedInService();
        linked.show(li);
    }
}