package com.cheng.chengojbackendjudgeservice.judge.codesandbox.impl;


import com.cheng.chengojbackendjudgeservice.judge.codesandbox.CodeSandBox;
import com.cheng.chengojbackendmodel.codesandbox.ExecuteCodeRequest;
import com.cheng.chengojbackendmodel.codesandbox.ExecuteCodeResponse;

/**
 * 第三方代码沙箱(调用网上别人现成的沙箱)
 */
public class ThirdPartyCodeSandBox implements CodeSandBox {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        System.out.println("3fang");
        return null;
    }

}
