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
    if (this.prodotto.nome) {
      let ox: Observable<Prodotto[]> =
        this.http.post<Prodotto[]>("http://localhost:8080/aggiungi", this.prodotto);
      ox.subscribe(u => this.prodotti = u);
      this.prodotto.nome = "";
    }
  }

  rimuovi(p: Prodotto) {
    console.log('Siamo in rimuovi', p);
    let ox: Observable<Prodotto[]> =
      this.http.post<Prodotto[]>("http://localhost:8080/rimuovi", p);
    ox.subscribe(u => this.prodotti = u);
  }
}
