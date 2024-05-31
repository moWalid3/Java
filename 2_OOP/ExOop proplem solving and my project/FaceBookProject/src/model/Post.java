package model;


import java.util.ArrayList;
import java.util.List;

public class Post extends BasePostComment {
    public List<Comment> getCommentList() {
        return commentList;
    }

    public void setCommentList(List<Comment> commentList) {
        this.commentList = commentList;
    }

    public List<Like> getLikeList() {
        return likeList;
    }

    public void setLikeList(List<Like> likeList) {
        this.likeList = likeList;
    }

    private List<Comment> commentList = new ArrayList<>();
    private List<Like> likeList = new ArrayList<>();


}
