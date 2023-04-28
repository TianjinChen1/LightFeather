import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { map } from 'rxjs/operators';
@Injectable({
  providedIn: 'root',
})
export class AppService {
  constructor(private http: HttpClient) {}

  fetchSupervisor() {
    return this.http.get('http://localhost:8080/api/supervisors');
  }

  postData(formData) {
    return this.http.post('http://localhost:8080/api/submit', formData);
  }
}
