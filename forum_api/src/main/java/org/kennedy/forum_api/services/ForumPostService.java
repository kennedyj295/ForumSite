package org.kennedy.forum_api.services;

import org.kennedy.forum_api.dtos.ForumPostDTO;
import org.kennedy.forum_api.models.ForumPost;
import org.kennedy.forum_api.repository.ForumPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.flyway.FlywayDataSource;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ForumPostService {

    @Autowired
    private ForumPostRepository forumPostRepository;

    public Optional<ForumPost> loadForumPostById(Integer id) {
        return forumPostRepository.findById(id);
    }

    public List<ForumPost> loadAllForumPosts() {
        return forumPostRepository.findAll();
    }
}
