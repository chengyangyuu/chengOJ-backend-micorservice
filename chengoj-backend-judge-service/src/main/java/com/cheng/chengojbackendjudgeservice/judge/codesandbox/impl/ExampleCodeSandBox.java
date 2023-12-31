package com.cheng.chengojbackendjudgeservice.judge.codesandbox.impl;


import com.cheng.chengojbackendjudgeservice.judge.codesandbox.CodeSandBox;
import com.cheng.chengojbackendmodel.codesandbox.ExecuteCodeRequest;
import com.cheng.chengojbackendmodel.codesandbox.ExecuteCodeResponse;
import com.cheng.chengojbackendmodel.codesandbox.JudgeInfo;
import com.cheng.chengojbackendmodel.enums.JudgeInfoMessageEnum;
import com.cheng.chengojbackendmodel.enums.QuestionSubmitStatusEnum;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * 示例代码沙箱(仅为了跑业务的)
 */
@Slf4j
public class ExampleCodeSandBox implements CodeSandBox {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        List<String> inputList = executeCodeRequest.getInputList();
        ExecuteCodeResponse executeCodeResponse = new ExecuteCodeResponse();
        executeCodeResponse.setOutputList(inputList);
        executeCodeResponse.setMessage("测试执行成功");
        executeCodeResponse.setStatus(QuestionSubmitStatusEnum.SUCCEED.getValue());
        JudgeInfo judgeInfo = new JudgeInfo();
        judgeInfo.setMessage(JudgeInfoMessageEnum.Accepted.getText());
        judgeInfo.setMemory(100L);
        judgeInfo.setTime(100L);
        executeCodeResponse.setJudgeInfo(judgeInfo);
        return executeCodeResponse;
    }
}
