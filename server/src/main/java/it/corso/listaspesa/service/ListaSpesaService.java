package it.corso.listaspesa.service;

import it.corso.listaspesa.model.Prodotto;
import java.util.List;

public interface ListaSpesaService {

    List<Prodotto> aggiungi(Prodotto p);

    List<Prodotto> rimuovi(Prodotto p);

    List<Prodotto> mostraTutti();
}
