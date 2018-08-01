package com.intrantes.service;

import com.intrantes.dao.PsRoleDao;
import com.intrantes.dao.PsUserDao;
import com.intrantes.entity.PsRole;
import com.intrantes.entity.PsUser;
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
    //    private PsUserService psUserService;
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
//                psUser.getUserIsDelete().equals("N"), true, true, true, authorities);

//

//        org.springframework.security.core.userdetails.User authUser = new
//                org.springframework.security.core.userdetails.User(psUser.getUserName(),psUser.getUserPassword(),psUser.getUserRole());
//        return authUser;
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
