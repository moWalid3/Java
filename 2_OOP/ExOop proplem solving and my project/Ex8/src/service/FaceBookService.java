package service;

import model.Post;

public class FaceBookService implements PostService {

    @Override
    public void show(Post post) {
        System.out.println("your in FaceBook pro");
        System.out.println(post.getId()+"  .  "+post.getTxt()+"  .  "+post.getImg());
    }
}
