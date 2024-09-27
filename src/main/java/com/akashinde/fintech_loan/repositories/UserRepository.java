package com.akashinde.fintech_loan.repositories;

// custom
import com.akashinde.fintech_loan.entities.UserEntity;
// spring framework
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
// other
import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long> {
    UserEntity findById(long id);
    List<UserEntity> findByName(String name);
}
