import {Component} from '@angular/core';
import {HttpClient} from '@angular/common/http';

@Component({
    selector: 'app-root',
    templateUrl: './app.component.html',
    styleUrls: ['./app.component.css']
})
export class AppComponent {
    title = 'Spring Security Example';
    data = {
        id: undefined,
        content: undefined
    };

    constructor(private http: HttpClient) {
        http.get('resource').subscribe(data => {
            this.data.id = data['id']
            this.data.content = data['content']
        });
    }

    logout() {
        this.http.post('perform_logout', '').subscribe();
        window.location.href = "http://localhost:8080";
    }
}
