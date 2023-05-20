package ma.pfe.entities;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class StudentIdEntity implements Serializable{
    private Long id;
    private String code;

    public StudentIdEntity(Long id, String code) {
        this.id = id;
        this.code = code;
    }

    public StudentIdEntity() {
    }

    @Override
    public String toString() {
        return "StudentIdEntity{" +
                "id=" + id +
                ", code='" + code + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentIdEntity studentId = (StudentIdEntity) o;
        return Objects.equals(id, studentId.id) && Objects.equals(code, studentId.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, code);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }


}
