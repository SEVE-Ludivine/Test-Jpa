package domain;

import javax.persistence.*;

public class Emprunt {

    @Id
    private Integer id;

    @Column(name="date_debut", nullable = false)
    private String date_debut;

    @Column (name="delai", nullable = true)
    private String delai;

    @Column(name="date_fin", nullable = true)
    private String date_fin;

    @ManyToOne
    @JoinColumn (name="id_client", nullable = false)
    private Client client;

    public Emprunt() {
    }

    public Emprunt(Integer id) {
        this.id = id;
    }

    public Emprunt(Integer id, String date_debut, String delai, String date_fin, Client client) {
        this.id = id;
        this.date_debut = date_debut;
        this.delai = delai;
        this.date_fin = date_fin;
        this.client = client;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDate_debut() {
        return date_debut;
    }

    public void setDate_debut(String date_debut) {
        this.date_debut = date_debut;
    }

    public String getDelai() {
        return delai;
    }

    public void setDelai(String delai) {
        this.delai = delai;
    }

    public String getDate_fin() {
        return date_fin;
    }

    public void setDate_fin(String date_fin) {
        this.date_fin = date_fin;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
