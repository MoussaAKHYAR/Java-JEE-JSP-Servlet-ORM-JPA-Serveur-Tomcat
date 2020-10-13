package sn.senforage.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Village {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nomVillage;
    @OneToMany(mappedBy = "village")
    private List<Client> clients = new ArrayList<Client>();

    public Village() {
    }

    public Village(int id, String nomVillage) {
        this.id = id;
        this.nomVillage = nomVillage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomVillage() {
        return nomVillage;
    }

    public void setNomVillage(String nomVillage) {
        this.nomVillage = nomVillage;
    }
}
