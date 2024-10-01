package shivani.springboot_2.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import shivani.springboot_2.Entity.Entity;
import shivani.springboot_2.Service.Service;

import java.util.List;

@RestController
public class controller {


    @Autowired
    private Service service;

    @PostMapping("/departments")
    public Entity save_department(@RequestBody Entity my_entity){
        return service.save_department(my_entity);
    }

    @GetMapping("/departments")
    public List<Entity> get_departments(){
        return service.fetchDepartmentList();
    }

    @GetMapping("/departments/{id}")
    public Entity get_department(@PathVariable Long id){
        return service.fetchDepartmentListById(id);
    }

    @DeleteMapping("/departments/{id}")
    public String delete_department(@PathVariable Long id){
        service.deleteDepartmentListByID(id);
        return "Department deleted";
    }

    @PutMapping("/departments/{id}")
    public Entity update_department(@PathVariable Long id, @RequestBody Entity my_entity){
       return service.updateDepartment(id, my_entity);
    }
}
