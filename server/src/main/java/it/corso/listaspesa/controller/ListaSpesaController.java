package it.corso.listaspesa.controller;

import it.corso.listaspesa.model.Prodotto;
import it.corso.listaspesa.service.ListaSpesaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
public class ListaSpesaController {

    @Autowired
    ListaSpesaService listaSpesaService;

    /**
     * Aggiunge un prodotto alla lista e ritorna la lista aggiornata
     *
     * @param p prodotto da aggiungere
     * @return la lista della spesa aggiornata
     */
    @RequestMapping("/aggiungi")
    @ResponseBody
    List<Prodotto> aggiungi(@RequestBody Prodotto p) {
        return listaSpesaService.aggiungi(p);
    }

    /**
     * Rimuove un prodotto dalla lista e ritorna la lista aggiornata
     *
     * @param p prodotto da rimuovere
     * @return la lista della spesa aggiornata
     */
    @RequestMapping("/rimuovi")
    @ResponseBody
    List<Prodotto> rimuovi(@RequestBody Prodotto p) {
        return listaSpesaService.rimuovi(p);
    }

    /**
     * Ritorna la lista della spesa corrente
     *
     * @return la lista della spesa
     */
    @RequestMapping("/mostra-tutti")
    @ResponseBody
    List<Prodotto> mostraTutti() {
        return listaSpesaService.mostraTutti();
    }
}
