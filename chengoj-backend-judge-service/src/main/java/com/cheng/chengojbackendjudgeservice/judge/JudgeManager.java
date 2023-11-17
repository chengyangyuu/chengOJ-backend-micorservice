package com.cheng.chengojbackendjudgeservice.judge;


import com.cheng.chengojbackendjudgeservice.judge.strategy.DefaultJudgeStrategy;
import com.cheng.chengojbackendjudgeservice.judge.strategy.JavaLanguageJudgeStrategy;
import com.cheng.chengojbackendjudgeservice.judge.strategy.JudgeContext;
import com.cheng.chengojbackendjudgeservice.judge.strategy.JudgeStrategy;
import com.cheng.chengojbackendmodel.codesandbox.JudgeInfo;
import com.cheng.chengojbackendmodel.entity.QuestionSubmit;
import org.springframework.stereotype.Service;

/**
 * 判题管理 简化调用
 */
@Service
public class JudgeManager {
    /**
     * 执行判题判断(策略选择)
     */
    JudgeInfo doJudge(JudgeContext judgeContext){
        QuestionSubmit questionSubmit = judgeContext.getQuestionSubmit();
        String language = questionSubmit.getLanguage();
        JudgeStrategy judgeStrategy = new DefaultJudgeStrategy();
        if ("Java".equals(language)){
            judgeStrategy = new JavaLanguageJudgeStrategy();
        }
        return judgeStrategy.doJudge(judgeContext);
    }
}
