package com.cheng.chengojbackenduserservice.controller.inner;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cheng.chengojbackendcommon.annotation.AuthCheck;
import com.cheng.chengojbackendcommon.common.BaseResponse;
import com.cheng.chengojbackendcommon.common.DeleteRequest;
import com.cheng.chengojbackendcommon.common.ErrorCode;
import com.cheng.chengojbackendcommon.common.ResultUtils;
import com.cheng.chengojbackendcommon.constant.UserConstant;
import com.cheng.chengojbackendcommon.exception.BusinessException;
import com.cheng.chengojbackendcommon.exception.ThrowUtils;
import com.cheng.chengojbackendmodel.dto.user.*;
import com.cheng.chengojbackendmodel.entity.User;
import com.cheng.chengojbackendmodel.vo.LoginUserVO;
import com.cheng.chengojbackendmodel.vo.UserVO;
import com.cheng.chengojbackendserviceclient.service.UserFeignClient;
import com.cheng.chengojbackenduserservice.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Collection;
import java.util.List;

/**
 * 用户内部调用接口
 *
 */
@RestController
@RequestMapping("/inner")
@Slf4j
public class UserInnerController implements UserFeignClient {
    @Resource
    private UserService userService;

    @Override
    @GetMapping("/get/id")
    public User getById(@RequestParam("userId") long userId) {
        return userService.getById(userId);
    }

    @Override
    @GetMapping("/get/ids")
    public List<User> listByIds(@RequestParam("idList") Collection<Long> idList) {
        return userService.listByIds(idList);
    }
}
