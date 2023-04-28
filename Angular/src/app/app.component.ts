import { Component } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { AppService } from './app.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
})
export class AppComponent {
  title = 'Notification';
  notificationForm: FormGroup;
  supervisors;

  constructor(private fb: FormBuilder, private appService: AppService) {
    this.notificationForm = fb.group({
      firstName: ['', Validators.required],
      lastName: ['', Validators.required],
      preferredNotification: this.fb.group({
        email: false,
        phone: false,
      }),
      email: ['', [Validators.email, Validators.required]],
      phone_Number: [
        '',
        [Validators.pattern(/^\+?\d{10,}$/), Validators.required],
      ],
      supervisor: ['', Validators.required],
    });
  }

  ngOnInit(): void {
    this.appService.fetchSupervisor().subscribe((res) => {
      this.supervisors = res;
    });
  }

  onSubmit() {
    if (this.notificationForm.valid) {
      const formData = {
        firstName: this.notificationForm.get('firstName').value,
        lastName: this.notificationForm.get('lastName').value,
        email: this.notificationForm.get('email').value,
        phone_Number: this.notificationForm.get('phone_Number').value,
        supervisor: this.notificationForm.get('supervisor').value,
      };

      this.appService.postData(formData).subscribe(
        (res: any) => {
          alert(res.message);
          this.notificationForm.reset();
        },
        (err) => {
          alert(JSON.stringify(err.error));
        }
      );
    } else {
      this.notificationForm.markAllAsTouched();
    }
  }
}
