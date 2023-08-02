import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule, ReactiveFormsModule }   from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './navbar/navbar.component';
import { LoginComponent } from './login/login.component';
import { HomeComponent } from './home/home.component';
import { RegisterUserComponent } from './register-user/register-user.component';
import { HttpClientModule } from '@angular/common/http';
import { ForumPostComponent } from './forum-post/forum-post.component';
import { AddForumPostComponent } from './add-forum-post/add-forum-post.component';
import { EditForumPostComponent } from './edit-forum-post/edit-forum-post.component';
import { ForumCommentComponent } from './forum-comment/forum-comment.component';
import { ForumPostListComponent } from './forum-post-list/forum-post-list.component';

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    LoginComponent,
    HomeComponent,
    RegisterUserComponent,
    ForumPostComponent,
    AddForumPostComponent,
    EditForumPostComponent,
    ForumCommentComponent,
    ForumPostListComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

// TODO: implement route guards