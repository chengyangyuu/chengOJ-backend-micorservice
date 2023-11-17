package com.cheng.chengojbackendquestionservice.controller.inner;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cheng.chengojbackendcommon.annotation.AuthCheck;
import com.cheng.chengojbackendcommon.common.BaseResponse;
import com.cheng.chengojbackendcommon.common.DeleteRequest;
import com.cheng.chengojbackendcommon.common.ErrorCode;
import com.cheng.chengojbackendcommon.common.ResultUtils;
import com.cheng.chengojbackendcommon.constant.UserConstant;
import com.cheng.chengojbackendcommon.exception.BusinessException;
import com.cheng.chengojbackendcommon.exception.ThrowUtils;
import com.cheng.chengojbackendmodel.dto.question.*;
import com.cheng.chengojbackendmodel.dto.questionSubmit.QuestionSubmitAddRequest;
import com.cheng.chengojbackendmodel.dto.questionSubmit.QuestionSubmitQueryRequest;
import com.cheng.chengojbackendmodel.entity.Question;
import com.cheng.chengojbackendmodel.entity.QuestionSubmit;
import com.cheng.chengojbackendmodel.entity.User;
import com.cheng.chengojbackendmodel.vo.QuestionSubmitVO;
import com.cheng.chengojbackendmodel.vo.QuestionVO;
import com.cheng.chengojbackendquestionservice.service.QuestionService;
import com.cheng.chengojbackendquestionservice.service.QuestionSubmitService;
import com.cheng.chengojbackendserviceclient.service.QuestionFeignClient;
import com.cheng.chengojbackendserviceclient.service.UserFeignClient;
import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 题目 接口
 */
@RestController
@RequestMapping("/inner")
@Slf4j
public class QuestionInnerController implements QuestionFeignClient {

    @Resource
    private QuestionService questionService;

    @Resource
    private QuestionSubmitService questionSubmitService;

    @Override
    @GetMapping("/get/id")
    public Question getQuestionById(@RequestParam("questionId") long questionId) {
        return questionService.getById(questionId);
    }

    @Override
    @GetMapping("/question_submit/get/id")
    public QuestionSubmit getQuestionSubmitById(@RequestParam("questionSubmitId") long questionSubmitId) {
        return getQuestionSubmitById(questionSubmitId);
    }

    @Override
    @PostMapping("/question_submit/update")
    public Boolean updateQuestionSubmitById(@RequestBody QuestionSubmit questionSubmit) {
        return questionSubmitService.updateById(questionSubmit);
    }
}
