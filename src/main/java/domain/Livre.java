package domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table (name="livre")

public class Livre implements Serializable {
    @Id
    private Integer id;

    @Column (name="titre", length=255, nullable = false)
    private String titre;

    @Column (name="auteur", length=50, nullable = false)
    private String auteur;

    public Livre() {
    }

    public Livre(Integer id) {
        this.id = id;
    }

    public Livre(Integer id, String titre, String auteur) {
        this.id = id;
        this.titre = titre;
        this.auteur = auteur;
    }

    public Integer getId() {
        return id;
    }

    public String getTitre() {
        return titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }
}
