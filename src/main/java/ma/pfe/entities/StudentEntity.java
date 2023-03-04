package ma.pfe.entities;

import javax.persistence.*;

@Entity
@Table(name = "T_STUDENTS")
public class StudentEntity {

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "StudentEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Id
    @Column(name = "Student_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "Student_name")
    private String name;
}