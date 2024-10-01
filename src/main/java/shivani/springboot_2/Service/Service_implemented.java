package shivani.springboot_2.Service;

import org.springframework.beans.factory.annotation.Autowired;
import shivani.springboot_2.Entity.Entity;
import shivani.springboot_2.Repositary.Repositary;

import java.util.List;
import java.util.Objects;

@org.springframework.stereotype.Service
public class Service_implemented implements Service {

    @Autowired
    private Repositary repo;

    @Override
    public Entity save_department(Entity myEntity) {
        return repo.save(myEntity);
    }

    @Override
    public List<Entity> fetchDepartmentList() {
        return repo.findAll();
    }

    @Override
    public Entity fetchDepartmentListById(Long id) {
        return repo.findById(id).get();
    }

    @Override
    public void deleteDepartmentListByID(Long id) {
        repo.deleteById(id);
    }

    @Override
    public Entity updateDepartment(Long id, Entity myEntity) {
        Entity entity = repo.findById(id).get();

        if(Objects.nonNull(entity.getDept_name()) && !entity.getDept_name().equals("")) {
            entity.setDept_name(myEntity.getDept_name());
        }
        if(Objects.nonNull(entity.getDept_Address()) && !entity.getDept_Address().equals("")) {
            entity.setDept_Address(myEntity.getDept_Address());
        }
        if (Objects.nonNull(entity.getDept_code()) && !entity.getDept_code().equals("")) {
            entity.setDept_code(myEntity.getDept_code());
        }
        repo.save(entity);
        return entity;
    }
}
