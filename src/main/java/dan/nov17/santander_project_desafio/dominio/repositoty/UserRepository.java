package dan.nov17.santander_project_desafio.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import me.dio.domain.model.User;

@Repository
public interface UserRepository extends jpaRepository<User, Long>{
    boolean existsByAccountNumber(String number);

    boolean existsByCardNumber(String number);
}
