package com.intrantes.service;

import com.instrantes.photoshoot.entity.PsRole;
import com.instrantes.photoshoot.entity.PsUser;
import com.intrantes.dao.PsRoleDao;
import com.intrantes.dao.PsUserDao;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("userDetailsServiceImpl")
public class UserDetailsServiceImpl implements UserDetailsService {
    private static Logger logger = LogManager.getLogger();

    @Autowired
    private PsUserDao psUserDao;
    @Autowired
    private PsRoleDao psRoleDao;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {

        PsUser psUser = psUserDao.selectPsUserByName(userName);
        if (psUser == null) {
            logger.info("User not found");
            throw new UsernameNotFoundException("Username not found");
        }
        PsRole psRole = psRoleDao.selectUserRoleById(psUser.getUserId());
        List<GrantedAuthority> authorities = new ArrayList<>();
        System.out.println(psRole.getRoleName());
        authorities.add(new SimpleGrantedAuthority(psRole.getRoleName()));
        System.out.println("authorities:" + authorities);

        return new User(psUser.getUserName(), psUser.getUserPassword(), authorities);
    }

    private List<PsRole> getGrantedAuthorities(PsRole psRole) {
        List<PsRole> authorities = new ArrayList<PsRole>();

//        for (UserProfile userProfile : psRole.getRoleName()) {
//            System.out.println("UserProfile : " + userProfile);
//            authorities.add(new SimpleGrantedAuthority("ROLE_" + userProfile.getType()));
//        }
        System.out.print("authorities :" + authorities);
        return authorities;
    }

}
