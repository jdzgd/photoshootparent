package com.intrantes.controller;


import com.instrantes.photoshoot.entity.PsUser;
import com.instrantes.photoshoot.entity.PsWatch;
import com.intrantes.service.PsUserService;
import com.intrantes.service.PsWatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;
import java.util.LinkedHashMap;


@Controller
@RequestMapping("/PsUserController")
public class PsUserContoller {
    @Autowired
    private PsWatchService psWatchService;
    @Autowired
    private PsUserService psUserService;
    /**
     * 此处是用户注册后登录的关键点
     */
    @Autowired
    protected AuthenticationManager authenticationManager;

    @GetMapping(value = "/testuser")
    public String setForm() {
        return "testuser";
    }

    //    根据id查询PsUser
    @GetMapping(value = "/findUser")
    @ResponseBody
    public PsUser selectPsUserById(Integer id) {
        PsUser psUser = psUserService.selectPsUserById(id);
        return psUser;
    }

    /**
     * 用户登录功能，显示用户信息，此处实际属于登陆状态的一个判断，如果没找到，则提醒需要登录
     */
    @GetMapping(value = "/show")
    @ResponseBody
    public PsUser selectPsUserByName() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        PsUser psUser = psUserService.selectPsUserByName(authentication.getName());
        return psUser;
    }

    /**
     * 登录后,显示用户粉丝数量
     */
    @GetMapping(value = "/showFansCount")
    @ResponseBody
//    @FastJsonView(
//            include = {@FastJsonFilter(clazz = PsWatch.class, props = {"id", "name"})})
    public PsWatch getPsWatchFansCountByPsUserId(int id) {
        PsWatch psWatch = psWatchService.getPsWatchFansCountByPsUserId(id);
        return psWatch;
    }

    /**登录后,显示用户关注数量*/
    @GetMapping(value = "/showWatchUserCount")
    @ResponseBody
    public PsWatch getPsWatchUserCountByPsUserId(int id) {
        PsWatch psWatch = psWatchService.getPsWatchUserCountByPsUserId(id);
        return psWatch;
    }

    //get方式，通过id来查询watch以及fan用户部分信息
    @GetMapping(value = "/psUser/{id}")
    @ResponseBody
    public PsUser getPsWatchDetail(@PathVariable("id") Integer id) {
        PsUser psUser = psUserService.selectPsUserById(id);
        System.out.println(psUser.getUserName());
        return psUser;
    }

    /**插入PsUser*/
    @PostMapping(value = "/register")
    @ResponseBody
    public int insertPsUser(String userName, String userPassword) {
        PsUser psUser = new PsUser();
        psUser.setUserName(userName);
        psUser.setUserPassword(userPassword);
//        判断插入是否成功
        int flag = psUserService.insertPsUser(psUser);
        return flag;
    }

    //新插入PsUser
    @PostMapping(value = "/newuser")
    @ResponseBody
    public int newPsUser(@RequestBody PsUser psUser, HttpServletRequest request) {
        //返回插入是否成功1/0
        return psUserService.insertPsUser(psUser, request);
    }

    /**
     * 验证用户是否存在
     *
     * @param username
     * @return
     */
    @PostMapping(value = "/resetuserpw")
    @ResponseBody
    public String resetUserPw(@RequestParam("username") String username) {
        PsUser psUser = psUserService.selectPsByUserNameEmail(username);
        if (psUser.getUserEmail() != null) {
            return "success";
        } else {
            return "该用户未绑定邮箱";
        }
    }

    /**
     * 验证邮箱是否属于用户
     * 通过验证后发送验证码到用户邮箱
     * 邮箱通过用户绑定的邮箱发送，不从页面获取的邮箱发送邮件
     *
     * @param email
     * @param username
     * @return
     */
    @PostMapping(value = "/sendEmailCode")
    @ResponseBody
    public String sendEmailCode(@RequestParam("email") String email, @RequestParam("username") String username) {
        //判断从页面传来的邮箱是否和数据库的匹配
        PsUser psUser = psUserService.selectPsByUserNameEmail(username);
        if (psUser.getUserEmail().equals(email)) {
            psUserService.sendCode(email); //发送邮箱
            return "success";
        } else {
            return "error";
        }
    }

    /**
     * 修改密码
     */
    @PostMapping(value = "/EmailCodeResetPw")
    @ResponseBody
    public String EmailCodeResetPw(@RequestBody LinkedHashMap<String, String> psUserJson) {
        return psUserService.isEmptyCode(Integer.parseInt(psUserJson.get("emailcode")), psUserJson.get("userName"), psUserJson.get("userPassword"));
    }


    /**
     * 测试全局异常
     *
     * @return java.lang.String
     * @author Lime
     * @date 2018/7/4
     */
    @GetMapping(value = "/testE")
    @ResponseBody
    public String testException() throws SQLException {
        System.out.println("come testE");
        throw new SQLException();
    }


//    //根据用户id查询作品的详情
//    @RequestMapping(value = "/userCollections", method = RequestMethod.POST)
//    @ResponseBody
//    public PsUser selectPsCollectionByUserid(Integer userId) {
//        PsUser psUser=psUserService.selectPsCollectionByUserid(1);
//        System.out.println(psUser);
//        return psUser;
//    }

    //根据用户id查询关注id
//    @RequestMapping(value = "/userCollections", method = RequestMethod.POST)
//    @ResponseBody
//    public PsUser selectPsWatchIdByUserId(Integer userId) {
//        PsUser psUser=psUserService.selectPsCollectionByUserid(1);
//        System.out.println(psUser);
//        return psUser;
//    }
    //根据用户id查询粉丝id


}
