package domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="client")
public class Client {
    @Id
    private Integer id;

    @Column(name="nom", length=255, nullable = false)
    private String nom;

    @Column (name="prenom", length=255, nullable = false)
    private String prenom;

    @OneToMany(mappedBy = "client")
    private Set<Emprunt> emprunts;

    public Client() {
    }

    public Client(Integer id) {
        this.id = id;
    }

    public Client(Integer id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
}
