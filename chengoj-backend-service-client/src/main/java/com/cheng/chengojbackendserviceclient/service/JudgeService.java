package com.cheng.chengojbackendserviceclient.service;

import com.cheng.chengoj.model.entity.QuestionSubmit;


public interface JudgeService {
    /**
     * 判题服务
     * @param questionSubmitId
     * @return
     */
    QuestionSubmit doJudge(long questionSubmitId);

}