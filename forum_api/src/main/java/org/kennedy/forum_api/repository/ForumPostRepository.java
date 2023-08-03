package org.kennedy.forum_api.repository;

import org.kennedy.forum_api.models.ForumPost;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ForumPostRepository extends JpaRepository<ForumPost, Integer> {
}
