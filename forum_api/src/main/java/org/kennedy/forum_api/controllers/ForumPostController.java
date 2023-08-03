package org.kennedy.forum_api.controllers;

import org.kennedy.forum_api.models.ForumPost;
import org.kennedy.forum_api.services.ForumPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/posts")
@CrossOrigin("*")
public class ForumPostController {

    @Autowired
    private ForumPostService forumPostService;

    @GetMapping("/all")
    public List<ForumPost> getAllPosts() {

    }
}
