package com.cheng.chengojbackendjudgeservice.judge;


import com.cheng.chengojbackendmodel.entity.QuestionSubmit;

public interface JudgeService {
    /**
     * 判题服务
     * @param questionSubmitId
     * @return
     */
    QuestionSubmit doJudge(long questionSubmitId);

}
