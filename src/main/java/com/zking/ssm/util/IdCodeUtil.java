package com.zking.ssm.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * 判断身份证认证是否一致性
 */
public class IdCodeUtil {

    /**
     *  判断的方法
     * @param idCard 身份证
     * @param name 姓名
     * @return
     */
    public static boolean testIdCode (String idCard,String name){
        String host = "https://naidcard.market.alicloudapi.com";
        String path = "/nidCard";
        String method = "GET";
        String appcode = "3780879f323346ba8c26c0087d780510";
        Map<String, String> headers = new HashMap<String, String>();
        //最后在header中的格式(中间是英文空格)为Authorization:APPCODE 83359fd73fe94948385f570e3c139105
        headers.put("Authorization", "APPCODE " + appcode);
        Map<String, String> querys = new HashMap<String, String>();
        querys.put("idCard", idCard);
        querys.put("name", name);

        try {
            HttpResponse response = HttpUtils.doGet(host, path, method, headers, querys);
            //System.out.println(response.toString());如不输出json, 请打开这行代码，打印调试头部状态码。
            //状态码: 200 正常；400 URL无效；401 appCode错误； 403 次数用完； 500 API网管错误
            //获取response的body

            JSONObject jsonObject = JSON.parseObject(EntityUtils.toString(response.getEntity()));
            String status = jsonObject.getString("status");

            //判断不为空进行转化
            if(status != null){

                //判断状态
                Integer statusInt = Integer.valueOf(status);

                if(statusInt ==1){
                    return true;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

//    public static void main (String[] agrs){
//        System.out.println(testIdCode("431122200101166159","文俊逸"));
//    }

}
