import { Component, OnInit } from '@angular/core';
import { AbstractControl, FormBuilder, FormControl, FormGroup, ValidationErrors, ValidatorFn, Validators } from '@angular/forms';
import { AccountService } from '../_services/account.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-register-user',
  templateUrl: './register-user.component.html',
  styleUrls: ['./register-user.component.css']
})
export class RegisterUserComponent implements OnInit {

  model: any = {};
  registerForm: FormGroup = new FormGroup({ });
  

  constructor(private fb: FormBuilder, private accountService: AccountService, private router: Router) { 
    
  }

  ngOnInit(): void {
    this.registerForm = this.fb.group({
      username: ['', Validators.required],
      password: ['', [Validators.required, Validators.minLength(4), Validators.maxLength(15)]],
      confirmPassword: ['', [Validators.required]]
    }, { validator: this.pwdsMustMatch('password', 'confirmPassword')});
  }

  pwdsMustMatch(controlName: string, matchingControlName: string): ValidatorFn {
    return (abstractControl: AbstractControl) => {
      const control = abstractControl.get(controlName);
      const matchingControl = abstractControl.get(matchingControlName);

      if (matchingControl?.errors && !matchingControl.errors['mustMatch']) {
        return null;
      }

      if (control?.value !== matchingControl?.value) {
        matchingControl?.setErrors({ mustMatch: true});
        return { mustMatch: true}
      } else {
        matchingControl?.setErrors(null);
        return null;
      }
    }
  }  

  getValidationErrors(): string[] {
    let errors: string[] = [];

    Object.keys(this.registerForm.controls).forEach(key => {
      const control = this.registerForm.get(key);

      if (control && control.errors && (control.dirty || control.touched)) {
        switch (key) {
          case 'username':
            errors.push('Username entry is invalid');
            break;
          case 'password':
            errors.push('Password entry is invalid');
            break;
          case 'confirmPassword':
            errors.push('Password entries must match');
            break;
        }
      }
    });
    return errors;
  }

  register() {
    const userValues = {...this.registerForm.value};

    this.accountService.registerUser(userValues).subscribe({
      next: () => {
        this.router.navigateByUrl('/');
      }
    })
  }
}
