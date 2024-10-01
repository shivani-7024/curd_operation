package shivani.springboot_2.Service;

import shivani.springboot_2.Entity.Entity;

import java.util.List;

public interface Service {
    Entity save_department(Entity myEntity);

    List<Entity> fetchDepartmentList();

    Entity fetchDepartmentListById(Long id);

    void deleteDepartmentListByID(Long id);

    Entity updateDepartment(Long id, Entity myEntity);
}
