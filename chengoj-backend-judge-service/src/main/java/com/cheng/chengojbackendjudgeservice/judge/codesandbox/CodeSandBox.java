package com.cheng.chengojbackendjudgeservice.judge.codesandbox;


import com.cheng.chengojbackendmodel.codesandbox.ExecuteCodeRequest;
import com.cheng.chengojbackendmodel.codesandbox.ExecuteCodeResponse;

public interface CodeSandBox {

    /**
     * 执行代码
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);


}
