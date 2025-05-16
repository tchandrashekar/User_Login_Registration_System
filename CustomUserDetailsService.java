
package com.example.User_Login_System.Service;

//import com.example.User_Login_System.Dto.UserDto;
//import com.example.User_Login_System.Model.Role;
import com.example.User_Login_System.Model.User;
//import com.example.User_Login_System.Repository.RoleRepository;
import com.example.User_Login_System.Repository.UserRepository;
//import java.util.Set;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService{
    
  
    @Autowired private UserRepository userrepo;
   
    
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
    User user = userrepo.findByEmail(email)
        .orElseThrow(() -> new UsernameNotFoundException("User not found with email: " + email));

    return new org.springframework.security.core.userdetails.User(
        user.getEmail(),
        user.getPassword(),
        user.getRoles().stream()
            .map(role -> new SimpleGrantedAuthority(role.getName()))
            .collect(Collectors.toList())
    );
}

    

    
}
