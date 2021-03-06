package com.intrantes.dao;


import com.instrantes.photoshoot.entity.PsRole;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PsRoleDao{

    PsRole selectUserRoleById(Integer id);


    long getPsRoleRowCount();
    List<PsRole> selectPsRole();
    PsRole selectPsRoleById(Integer id);
    int insertPsRole(PsRole value);
    int insertNonEmptyPsRole(PsRole value);
    int deletePsRoleById(Integer id);
    int updatePsRoleById(PsRole enti);
    int updateNonEmptyPsRoleById(PsRole enti);
}