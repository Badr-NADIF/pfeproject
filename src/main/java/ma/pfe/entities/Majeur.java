package ma.pfe.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Majeur")
public class Majeur extends StudentEntity{

    private String cin;

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    @Override
    public String toString() {
        return "Majeur{" +
                "cin='" + cin + '\'' +
                '}';
    }
}
