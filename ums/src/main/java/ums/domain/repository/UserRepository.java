package ums.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ums.domain.model.User;

public interface UserRepository extends JpaRepository<User, String>{
	//findOne, findAll, save, deleteはJpaに定義済み
}
