package com.cheng.chengojbackendjudgeservice.judge.codesandbox;


import com.cheng.chengojbackendmodel.codesandbox.ExecuteCodeRequest;
import com.cheng.chengojbackendmodel.codesandbox.ExecuteCodeResponse;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor
public class CodeSandboxProxy implements CodeSandBox {

    private final CodeSandBox codeSandBox;
    //带参构造注解

    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        //请求前的日志
        log.info(executeCodeRequest.toString());
        ExecuteCodeResponse executeCodeResponse = codeSandBox.executeCode(executeCodeRequest);
        //响应后的日志
        log.info(executeCodeResponse.toString());
        return executeCodeResponse;
    }
}
