package com.zhiyou.gmall.user.service;

import com.zhiyou.gmall.user.bean.UmsMember;
import com.zhiyou.gmall.user.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {
    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}
