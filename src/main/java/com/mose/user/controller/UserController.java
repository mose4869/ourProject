package com.mose.user.controller;

import com.mose.user.pojo.Userinfo;
import com.mose.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    /**
     * 登录得到 user完整信息
     * @param userinfo
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "loginCheck",method = RequestMethod.POST,produces ="text/html;charset=UTF-8")
    public  String  loginCheck(@RequestBody Userinfo userinfo, HttpSession httpSession){
        Userinfo userinfos = userService.LoginGetUser(userinfo);
        if (userinfos!=null){
            httpSession.setAttribute("userInfo",userinfos);
            return true+"";
        }
        return false+"";
    }

    @ResponseBody
    @RequestMapping(value = "UserInfoName",method = RequestMethod.POST,produces ="text/html;charset=UTF-8")
    public String UserInfoName(HttpSession httpSession){
        Userinfo userInfo = (Userinfo) httpSession.getAttribute("userInfo");
        if(userInfo!=null){
            return userInfo.getName();
        }
        return "null";
    }

}

