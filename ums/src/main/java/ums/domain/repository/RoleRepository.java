package ums.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ums.domain.model.Role;

public interface RoleRepository extends JpaRepository<Role, String> {

}
