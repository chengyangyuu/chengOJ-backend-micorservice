package com.cheng.chengojbackendjudgeservice.judge.codesandbox.impl;

import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONUtil;
import com.alibaba.excel.util.StringUtils;
import com.cheng.chengojbackendcommon.common.ErrorCode;
import com.cheng.chengojbackendcommon.exception.BusinessException;
import com.cheng.chengojbackendjudgeservice.judge.codesandbox.CodeSandBox;
import com.cheng.chengojbackendmodel.codesandbox.ExecuteCodeRequest;
import com.cheng.chengojbackendmodel.codesandbox.ExecuteCodeResponse;


/**
 * 远程代码沙箱(实际调用接口的沙箱)
 */
public class RemoteCodeSandBox implements CodeSandBox {


    //定义鉴权请求头和密钥
    private static final String AUTH_REQUEST_HEADER = "auth";
    private static final String AUTH_REQUEST_SECRET = "secretKet";

    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        String url = "http://localhost:8090/executeCode";
        String jsonStr = JSONUtil.toJsonStr(executeCodeRequest);
        String responseStr = HttpUtil.createPost(url)
                .header(AUTH_REQUEST_HEADER,AUTH_REQUEST_HEADER)
                .body(jsonStr)
                .execute()
                .body();
        if (StringUtils.isBlank(responseStr)) {
            throw new BusinessException(ErrorCode.API_REQUEST_ERROR, "executeCode remoteSandbox error,message = " + responseStr);
        }
        System.out.println(responseStr);
        return JSONUtil.toBean(responseStr, ExecuteCodeResponse.class);
    }
}
