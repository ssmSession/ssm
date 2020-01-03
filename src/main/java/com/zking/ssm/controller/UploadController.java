package com.zking.ssm.controller;

import com.zking.ssm.model.Logininfo;
import com.zking.ssm.util.DataProtocol;
import com.zking.ssm.util.FileUtil;
import org.apache.commons.lang.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;

/**
 * 文件上传的controller
 */
@RestController
public class UploadController {

    @RequestMapping("/upload")
    public Object fileupload(Logininfo logininfo, String filename,@RequestParam(value = "file",required = false) MultipartFile file) throws Exception {

        DataProtocol dataProtocol = new DataProtocol();

        //获取到服务器根目录
        String str = "" + this.getClass().getResource("/");
        //进行截取
        String substring = str.substring(6);

        String taget = substring +  "upload" + File.separator + logininfo.getUsername();

        taget = taget.replace('/','\\');

        /**
         * 调用工具类 判断服务器有没有这个用户的文件
         */
        FileUtil.ifFile(taget);

        /**
         * 上面只是创建一个文件夹
         * 下面这次拼接才是把文件的全部路径弄好
         */
        taget +=  File.separator + file.getOriginalFilename();

        File myfile = new File(taget);

        String originalFilename = file.getOriginalFilename();

        file.transferTo(myfile);
        System.out.println("上传的文件：" + originalFilename);

        dataProtocol.setCode(0);

        dataProtocol.setData(taget);

        return dataProtocol;
    }


}
