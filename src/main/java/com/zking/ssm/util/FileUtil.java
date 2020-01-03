package com.zking.ssm.util;

import org.apache.commons.lang.StringUtils;

import java.io.File;

/**
 * 文件夹创建的类
 */
public class FileUtil {

    /**
     * 判断文件夹是否存在
     *  如果没有就会去创建文件夹
     */
    public static void ifFile(String path){
        File filecreate = new File(path);
        if (filecreate.exists()) {
            if (filecreate.isDirectory()) {
                System.out.println("dir exists");
            } else {
                System.out.println("the same name file exists, can not create dir");
            }
        } else {
            System.out.println("dir not exists, create it ...");
            if (StringUtils.isNotEmpty(path+"/test.txt")) {
                File file1 = new File(path+"/test.txt");
                if (!file1.getParentFile().exists()) {
                    file1.getParentFile().mkdirs();
                }
                try {
                    file1.createNewFile();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }


}
