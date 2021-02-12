import domain.Livre;

import javax.persistence.*;

public class App {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("demo-jpa");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        //recuperer avec id ?
        /*Livre livre = em.find(Livre.class, 1);
        System.out.println(livre);
        */

        //Modifier
        /*
        Livre lUpdate = em.find(Livre.class, 2);
        if (lUpdate != null){
            et.begin();
            lUpdate.setTitre("ModificationTitre");
            em.persist(l);
            et.commit();
        } */

        //Suppression       NE FONCTIONNE PAS
        /*
        Livre lDelete = em.find(Livre.class, 3);
        System.out.println(lDelete.getTitre());
        em.remove(lDelete);
        */



        //Requete JPQL par rapport a son TITRE
        /*
        String titre ="Apprendre à parler aux animaux";
        TypedQuery<Livre> query = em.createQuery("SELECT l FROM Livre l WHERE l.titre='" + titre + "'", Livre.class);
        Livre livre = query.getResultList().get(0);
        System.out.println(livre.getAuteur() + " " + livre.getTitre());*/



        //Requete JPQL par rapport a son AUTEUR
        /*
        String auteur ="Emile Zola";
        TypedQuery<Livre> query = em.createQuery("SELECT l FROM Livre l WHERE l.auteur='" + auteur + "'", Livre.class);
        Livre livre = query.getResultList().get(0);
        System.out.println(livre.getAuteur() + " " + livre.getTitre());*/



        em.close();
        emf.close();
    }
}