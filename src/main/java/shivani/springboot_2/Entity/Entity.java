package shivani.springboot_2.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@jakarta.persistence.Entity
public class Entity {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)

    private Long id;
    private String dept_name;
    private String dept_code;
    private String dept_Address;


    public Entity(Long id, String dept_name, String dept_code, String dept_Address) {
        this.id = id;
        this.dept_name = dept_name;
        this.dept_code = dept_code;
        this.dept_Address = dept_Address;
    }

    public Entity() {
    }

    public String getDept_name() {
        return dept_name;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }

    public String getDept_code() {
        return dept_code;
    }

    public void setDept_code(String dept_code) {
        this.dept_code = dept_code;
    }

    public String getDept_Address() {
        return dept_Address;
    }

    public void setDept_Address(String dept_Address) {
        this.dept_Address = dept_Address;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Entity{" +
                "id=" + id +
                ", dept_name='" + dept_name + '\'' +
                ", dept_code='" + dept_code + '\'' +
                ", dept_Address='" + dept_Address + '\'' +
                '}';
    }
}
