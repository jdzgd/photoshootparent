package com.intrantes.service.impl;
import com.intrantes.dao.PsRoleDao;
import com.intrantes.entity.PsRole;
import com.intrantes.service.PsRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PsRoleServiceImpl implements PsRoleService {
    @Autowired
    private PsRoleDao psRoleDao;

    @Override
    public PsRole selectUserRoleById(Integer id){
        return psRoleDao.selectPsRoleById(id);
    }

    @Override
    public long getPsRoleRowCount(){
        return psRoleDao.getPsRoleRowCount();
    }
    @Override
    public List<PsRole> selectPsRole(){
        return psRoleDao.selectPsRole();
    }
    @Override
    public PsRole selectPsRoleById(Integer id){
        return psRoleDao.selectPsRoleById(id);
    }
    @Override
    public int insertPsRole(PsRole value){
        return psRoleDao.insertPsRole(value);
    }
    @Override
    public int insertNonEmptyPsRole(PsRole value){
        return psRoleDao.insertNonEmptyPsRole(value);
    }
    @Override
    public int deletePsRoleById(Integer id){
        return psRoleDao.deletePsRoleById(id);
    }
    @Override
    public int updatePsRoleById(PsRole enti){
        return psRoleDao.updatePsRoleById(enti);
    }
    @Override
    public int updateNonEmptyPsRoleById(PsRole enti){
        return psRoleDao.updateNonEmptyPsRoleById(enti);
    }

    public PsRoleDao getPsRoleDao() {
        return this.psRoleDao;
    }

    public void setPsRoleDao(PsRoleDao psRoleDao) {
        this.psRoleDao = psRoleDao;
    }

}