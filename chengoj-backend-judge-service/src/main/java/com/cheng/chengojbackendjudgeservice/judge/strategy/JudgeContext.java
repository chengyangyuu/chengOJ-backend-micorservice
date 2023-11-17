package com.cheng.chengojbackendjudgeservice.judge.strategy;


import com.cheng.chengojbackendmodel.codesandbox.JudgeInfo;
import com.cheng.chengojbackendmodel.dto.question.JudgeCase;
import com.cheng.chengojbackendmodel.entity.Question;
import com.cheng.chengojbackendmodel.entity.QuestionSubmit;
import lombok.Data;

import java.util.List;

@Data
public class JudgeContext {

    private JudgeInfo judgeInfo;

    private List<String> inputList;

    private List<String> outputList;

    private List<JudgeCase> judgeCaseList;

    private Question question;

    private QuestionSubmit questionSubmit;

}
