package fr.miage.mbds.lc_estia_26_27.repositories;

import fr.miage.mbds.lc_estia_26_27.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
