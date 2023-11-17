package com.cheng.chengojbackendserviceclient.service;


import com.cheng.chengojbackendmodel.entity.QuestionSubmit;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "chengoj-backend-judge-service",path = "/api/judge/inner")
public interface JudgeFeignClient {
    /**
     * 判题服务
     * @param questionSubmitId
     * @return
     */
    @PostMapping("/do")
    QuestionSubmit doJudge(@RequestParam("questionSubmitId") long questionSubmitId);
}
