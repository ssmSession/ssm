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
    public Object fileupload(Logininfo logininfo, String filename,@RequestParam(value = "file",required = false) MultipartFile file ,HttpServletRequest request) throws Exception {

        DataProtocol dataProtocol = new DataProtocol();

        String targetPath = "/upload" + File.separator + file.getOriginalFilename();
        String realPath = request.getServletContext().getRealPath(targetPath);

        File myfile = new File(realPath);

        String originalFilename = file.getOriginalFilename();

        file.transferTo(myfile);
        System.out.println("上传的文件：" + originalFilename);

        dataProtocol.setCode(0);

        dataProtocol.setData(realPath);

        return dataProtocol;
    }


}
