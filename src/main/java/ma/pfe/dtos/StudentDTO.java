package ma.pfe.dtos;


import java.util.List;

public class StudentDTO {
//    private long id;
    private StudentIdDTO studentId;
    private String name;
    private AddressDTO address;
    private List<CourseDTO> courses;

    private ClassDTO studentClass;

    public ClassDTO getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(ClassDTO studentClass) {
        this.studentClass = studentClass;
    }
//    @Override
//    public String toString() {
//        return "StudentDTO{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", courses=" + courses +
//                ", address=" + address +
//                ", studentClass=" + studentClass +
//            '}';
//}

//    @Override
//    public String toString() {
//        return "StudentDTO{" +
//                "studentId=" + studentId +
//                ", name='" + name + '\'' +
//                ", courses=" + courses +
//                ", address=" + address +
//                '}';
//    }

    @Override
    public String toString() {
        return "StudentDTO{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", address=" + address +
                ", courses=" + courses +
                ", studentClass=" + studentClass +
                '}';
    }

    public List<CourseDTO> getCourses() {
        return courses;
    }

    public AddressDTO getAddress() {
        return address;
    }

    public void setAddress(AddressDTO address) {
        this.address = address;
    }

    public void setCourses(List<CourseDTO> courses) {
        this.courses = courses;
    }

//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }

    public StudentIdDTO getStudentId() {
        return studentId;
    }

    public void setStudentId(StudentIdDTO studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
