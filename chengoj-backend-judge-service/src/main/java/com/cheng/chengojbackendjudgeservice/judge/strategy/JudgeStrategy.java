package com.cheng.chengojbackendjudgeservice.judge.strategy;


import com.cheng.chengojbackendmodel.codesandbox.JudgeInfo;

/**
 * 判题策略
 */
public interface JudgeStrategy {

    JudgeInfo doJudge(JudgeContext judgeContext);
}

