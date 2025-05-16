
package com.example.User_Login_System.Repository;

import com.example.User_Login_System.Model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Long>{
    Role findByName(String name);
    
}
