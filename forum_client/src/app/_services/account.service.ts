import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { User } from '../_models/user';
import { environment } from 'src/environments/environment.development';
import { BehaviorSubject, map } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AccountService {
  
  baseUrl = environment.apiUrl;
  private currentUserSource = new BehaviorSubject<User | null>(null);

  constructor(private http: HttpClient) { }

  login(model: any) {
    return this.http.post<User>(this.baseUrl + 'account/login', model).pipe(
      map((response: User) => {
        const user = response;
        if(user) {
          this.setCurrentUser(user);
        }
      })
    )
  }

  setCurrentUser(user: User) {
    //TODO add ability to save roles

    localStorage.setItem('user', JSON.stringify(user));
    this.currentUserSource.next(user);
  }
}