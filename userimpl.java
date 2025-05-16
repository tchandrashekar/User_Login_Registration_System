
package com.example.User_Login_System.Service;

import com.example.User_Login_System.Dto.UserDto;
import com.example.User_Login_System.Model.Role;
import com.example.User_Login_System.Model.User;
import com.example.User_Login_System.Repository.RoleRepository;
import com.example.User_Login_System.Repository.UserRepository;
import java.util.Set;
//import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class userimpl implements userservice{
    
    @Autowired private UserRepository userrepo;
    @Autowired private RoleRepository rolerepo;
    @Autowired private PasswordEncoder passwordEncoder;
    
    public User register(UserDto dto){
        Role role = rolerepo.findByName("ROLE_USER");
    if (role == null) {
        System.out.println("ROLE_USER not found!");
        return null; // Or throw exception
    }
        User user=new User();
        user.setName(dto.getName());
        user.setEmail(dto.getEmail());
        user.setPassword(passwordEncoder.encode(dto.getPassword()));
        //Role role=rolerepo.findByName("ROLE_USER");
        user.setRoles(Set.of(role));
        User savedUser = userrepo.save(user);
        System.out.println("User registered: " + savedUser.getEmail());
       
        return userrepo.save(user);
    }
   

    
}
