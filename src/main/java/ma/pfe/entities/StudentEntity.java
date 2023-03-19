package ma.pfe.entities;

import javax.persistence.*;

// @Embeddable @EmbeddedId
@Entity
@Table(name = "T_STUDENTS")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
//@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "Type")
public class StudentEntity {

//    @EmbeddedId
    @Id
    @Column(name = "Student_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

//     @EmbeddedId
//     private StudentId studentId;

    @Column(name = "Student_name")
    private String name;
    private Address address;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

//    public StudentId getStudentId() {
//        return studentId;
//    }
//    public void setStudentId(StudentId studentId) {
//        this.studentId = studentId;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name="rue",column = @Column(name = "rue_student")),
            @AttributeOverride(name="avenue",column = @Column(name = "avenue_student"))
    })

    @Override
    public String toString() {
        return "StudentEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}