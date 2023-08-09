package org.kennedy.forum_api.dtos;

import org.kennedy.forum_api.models.ForumPost;

public class ForumPostDTO {

    public ForumPostDTO(ForumPost fp) {
        id = fp.getId();
        ownerUserId = fp.getOwnerUserId().getUsername();
        postTitle = fp.getPostTitle();
        postBody = fp.getPostBody();
        postImage = fp.getPostImage();
    }
    private Integer id;
    private String ownerUserId; // Assuming user's ID is an integer
    private String postTitle;
    private String postBody;
    private byte[] postImage;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOwnerUserId() {
        return ownerUserId;
    }

    public void setOwnerUserId(String ownerUserId) {
        this.ownerUserId = ownerUserId;
    }

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    public String getPostBody() {
        return postBody;
    }

    public void setPostBody(String postBody) {
        this.postBody = postBody;
    }

    public byte[] getPostImage() {
        return postImage;
    }

    public void setPostImage(byte[] postImage) {
        this.postImage = postImage;
    }
}
