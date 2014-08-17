package oauth.provider.repository;

import java.util.ArrayList;
import java.util.List;

import oauth.provider.model.Role;
import oauth.provider.model.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Repository;
 
@Repository
public class UserDao {
 
    public User loadUserByUsername(final String username) {
        User user = new User();
        user.setFirstName("firstName");
        user.setLastName("lastName");
        user.setUsername("user");
        user.setPassword("1111");
        Role r = new Role();
        r.setName("ROLE_USER");
        List<GrantedAuthority> roles = new ArrayList<GrantedAuthority>();
        roles.add(r);
        user.setAuthorities(roles);
        return user;
    }
}