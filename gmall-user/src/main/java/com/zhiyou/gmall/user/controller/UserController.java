package com.zhiyou.gmall.user.controller;

import com.zhiyou.gmall.user.bean.UmsMember;
import com.zhiyou.gmall.user.bean.UmsMemberReceiveAddress;
import com.zhiyou.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("getReceiveAddressByMemberId")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId) {
        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses=userService.getReceiveAddressByMemberId(memberId);
        return umsMemberReceiveAddresses;
    }

    @RequestMapping("getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser() {
       List<UmsMember> umsMembers=userService.getAllUser();
        return umsMembers;
    }

    @RequestMapping("index")
    @ResponseBody
    public String index() {
        return "hello user";
    }
}
