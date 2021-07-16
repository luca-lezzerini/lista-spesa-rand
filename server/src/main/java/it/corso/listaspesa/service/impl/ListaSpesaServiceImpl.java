package it.corso.listaspesa.service.impl;

import it.corso.listaspesa.model.Prodotto;
import it.corso.listaspesa.repository.ProdottoRepository;
import it.corso.listaspesa.service.ListaSpesaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ListaSpesaServiceImpl implements ListaSpesaService {

    @Autowired
    ProdottoRepository prodottoRepository;

    @Override
    public List<Prodotto> aggiungi(Prodotto p) {
        if (p != null) {
            prodottoRepository.save(p);
        }
        return mostraTutti();
    }

    @Override
    public List<Prodotto> rimuovi(Prodotto p) {
        if (p.getId() != null) {
            prodottoRepository.deleteById(p.getId());
        }
        return mostraTutti();
    }

    @Override
    public List<Prodotto> mostraTutti() {
        return prodottoRepository.findAll();
    }

}
