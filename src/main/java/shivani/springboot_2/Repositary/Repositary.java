package shivani.springboot_2.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import shivani.springboot_2.Entity.Entity;

@Repository
public interface Repositary extends JpaRepository<Entity, Long> {
}
