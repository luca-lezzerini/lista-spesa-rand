package it.corso.listaspesa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Prodotto {

    @Id
    @GeneratedValue
    private Long id;
    @Column
    private String nome;

    public Prodotto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Prodotto{" + "id=" + id + ", nome=" + nome + '}';
    }

}
