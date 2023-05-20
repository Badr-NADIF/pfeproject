package ma.pfe.dtos;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;


public class StudentIdDTO{
    private Long id;
    private String code;


    public StudentIdDTO() {
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

    @Override
    public String toString() {
        return "StudentIdDTO{" +
                "id=" + id +
                ", code='" + code + '\'' +
                '}';
    }

    public StudentIdDTO(Long id, String code) {
        this.id = id;
        this.code = code;
    }

    public void setCode(String code) {
        this.code = code;
    }


}
