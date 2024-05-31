package service;

import model.Post;

public class LinkedInService implements PostService{
    @Override
    public void show(Post post) {
        System.out.println("your in LinkedIn pro");
        System.out.println(post.getId()+"  .  "+post.getTxt()+"  .  "+post.getImg());
    }
}
