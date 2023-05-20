package ma.pfe.entities;

import javax.persistence.*;
import java.util.List;

// @Embeddable @EmbeddedId
@Entity
@Table(name = "T_STUDENTS")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
//@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "Type")
public class StudentEntity {

//    @EmbeddedId
    // @Id
    // @Column(name = "Student_id")
    // @GeneratedValue(strategy = GenerationType.AUTO)
    // private long id;

    @EmbeddedId
    private StudentIdEntity studentId;
    @Column(name = "Student_name")
    private String name;
    private Address address;
    @ManyToMany(cascade = {CascadeType.MERGE}, fetch = FetchType.EAGER)
    @JoinTable(name = "list_courses_students")
    private List<CourseEntity> courses;


    public StudentIdEntity getStudentId() {
        return studentId;
    }

    public void setStudentId(StudentIdEntity studentId) {
        this.studentId = studentId;
    }


    // public long getId() {
    //     return id;
    // }
    // public void setId(long id) {
    //     this.id = id;
    // }


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

    public List<CourseEntity> getCourses() {
        return courses;
    }

    public void setCourses(List<CourseEntity> courses) {
        this.courses = courses;
    }

    // @Override
    // public String toString() {
    //     return "StudentEntity{" +
    //             "id=" + id +
    //             ", name='" + name + '\'' +
    //             ", address=" + address +
    //             '}';

    @Override
    public String toString() {
        return "StudentEntity{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", address=" + address +
                ", courses=" + courses +
                '}';
    }
}