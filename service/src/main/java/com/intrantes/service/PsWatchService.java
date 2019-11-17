package com.intrantes.service;

import com.instrantes.photoshoot.entity.PsWatch;

import java.util.List;

public interface PsWatchService{
     PsWatch getPsWatchFansCountByPsUserId(int id) ;
     PsWatch getPsWatchUserCountByPsUserId(int id);
     //通过当前用户id,获取所有粉丝头像姓名简略信息
     List<PsWatch> getPsWatchFans(Integer id);
     //通过当前用户id,获取所有关注头像姓名简略信息
     List<PsWatch> getPsWatchUser(Integer id);


}