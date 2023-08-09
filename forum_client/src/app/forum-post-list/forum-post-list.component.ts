import { Component, OnInit } from '@angular/core';
import { ForumPost } from '../_models/forumpost';
import { ForumPostService } from '../_services/forum-post.service';

@Component({
  selector: 'app-forum-post-list',
  templateUrl: './forum-post-list.component.html',
  styleUrls: ['./forum-post-list.component.css']
})
export class ForumPostListComponent implements OnInit {
  posts: ForumPost[] = [];

  constructor(private fpService: ForumPostService) {

  }

  ngOnInit(): void {
    this.loadAllForumPosts();
  }

  loadAllForumPosts() { 
    this.fpService.getAllForumPosts().subscribe({
      next: response => {
        if (response) {
          this.posts = response;
        }
      }
    })
  }
}
