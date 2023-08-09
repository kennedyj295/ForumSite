import { Component, Input, OnInit } from '@angular/core';
import { ForumPostService } from '../_services/forum-post.service';
import { ForumPost } from '../_models/forumpost';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-forum-post',
  templateUrl: './forum-post.component.html',
  styleUrls: ['./forum-post.component.css']
})
export class ForumPostComponent {
  @Input() post: ForumPost | undefined;

  constructor(private route: Router) {
    
  }

  goToUser(username?: string): void {
    this.route.navigate(['/users', this.post?.ownerUserId]);
  }
  
}
