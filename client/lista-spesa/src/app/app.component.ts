import { Prodotto } from './prodotto';
import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  prodotto: Prodotto = new Prodotto();
  prodotti: Prodotto[] = [];

  constructor(private http: HttpClient) {
    // recuperare da server la lista della spesa
    let ox: Observable<Prodotto[]> =
      http.get<Prodotto[]>("http://localhost:8080/mostra-tutti");
    ox.subscribe(u => this.prodotti = u);
  }

  aggiungi() {
    console.log('Siamo di aggiungi');

  }

  rimuovi(p: Prodotto) {
    console.log('Siamo in rimuovi', p);
  }
}
