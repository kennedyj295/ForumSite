import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { RegisterUserComponent } from './register-user/register-user.component';
import { ForumPostListComponent } from './forum-post-list/forum-post-list.component';
import { UserDetailsComponent } from './user-details/user-details.component';

const routes: Routes = [
  {path: '', component: ForumPostListComponent},
  {path: 'login-page', component: LoginComponent},
  {path: 'register', component: RegisterUserComponent},
  {path: 'forums', component: ForumPostListComponent},
  {path: 'users/:username', component: UserDetailsComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
