package com.cheng.chengojbackendjudgeservice.controller.inner;

import com.cheng.chengojbackendjudgeservice.judge.JudgeService;
import com.cheng.chengojbackendmodel.entity.Question;
import com.cheng.chengojbackendmodel.entity.QuestionSubmit;
import com.cheng.chengojbackendserviceclient.service.JudgeFeignClient;
import com.cheng.chengojbackendserviceclient.service.QuestionFeignClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 题目 接口
 */
@RestController
@RequestMapping("/inner")
@Slf4j
public class JudgeInnerController implements JudgeFeignClient {

    @Resource
    private JudgeService judgeService;
    /**
     * 判题
     * @param questionSubmitId
     * @return
     */
    @Override
    @PostMapping("/do")
    public QuestionSubmit doJudge(@RequestParam("questionSubmitId") long questionSubmitId) {
        return judgeService.doJudge(questionSubmitId);
    }
}
