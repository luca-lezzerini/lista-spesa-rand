import { Prodotto } from './prodotto';
import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  prodotto: Prodotto = new Prodotto();
  prodotti: Prodotto[] = [{ nome: "mela" }, { nome: "pane" }];

  aggiungi() {
    console.log('Siamo di aggiungi');

  }

  rimuovi(p: Prodotto) {
    console.log('Siamo in rimuovi', p);
  }
}
