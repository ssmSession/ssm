package com.zking.ssm.util;

import java.util.HashMap;
import java.util.Map;

public class DataProtocol extends HashMap {

    public static int SUCCESS = 1;

    public static int FAIL = -1;

    private long ts = System.currentTimeMillis();

    public DataProtocol() {
        this.put("code", SUCCESS);
        this.put("ts", ts);
    }


    public void setCode(int code) {
        this.put("code", code);
    }

    public void setData(Object data) {
        this.put("data", data);
    }

    public void setError(Map<String, String> errors) {

        this.put("error", errors);
    }

    public void setMessage(String message) {
        this.put("message", message);
    }


}
