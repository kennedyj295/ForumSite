import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { ForumPost } from '../_models/forumpost';
import { environment } from 'src/environments/environment.development';

@Injectable({
  providedIn: 'root'
})
export class ForumPostService {
  baseUrl = environment.apiUrl;

  constructor(private http: HttpClient) { }

  getAllForumPosts() {
    return this.http.get<ForumPost[]>(this.baseUrl + 'posts/all');
  }
}
