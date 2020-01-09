package com.zking.ssm.controller;

import com.zking.ssm.model.Logininfo;
import com.zking.ssm.util.DataProtocol;
import com.zking.ssm.util.FileUtil;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.UUID;

/**
 * 文件上传的controller
 */
@RestController
public class UploadController {

//    @RequestMapping("/upload")
//    public Object fileupload(Logininfo logininfo, @RequestParam(value = "file",required = false) MultipartFile file ,HttpServletRequest request) throws Exception {
//
//        DataProtocol dataProtocol = new DataProtocol();
//
////        String targetPath = "/upload" + File.separator + file.getOriginalFilename();
////        System.out.println("上传的文件：" + targetPath);
////        String realPath = request.getServletContext().getRealPath(targetPath);
////
////        File myfile = new File(realPath);
////
////        try {
////            file.transferTo(myfile);
////        } catch (IOException e) {
////            e.printStackTrace();
////        } catch (IllegalStateException e) {
////            e.printStackTrace();
////        }
//
//        //动态获取上传文件夹的路径
//        ServletContext context = request.getServletContext();
//        String realPath = context.getRealPath("/upload");//获取本地存储位置的绝对路径
//
//        String filename = file.getOriginalFilename();//获取上传时的文件名称
////        /7filename = UUID.randomUUID().toString()+"."+ FilenameUtils.getExtension(filename);//创建一个新的文件名称    getExtension(name):获取文件后缀名
//
//        File f= new File(realPath, filename);
//        file.transferTo(f);//将上传的文件存储到指定位置
//
//        dataProtocol.setCode(0);
//
//        dataProtocol.setData(realPath);
//
//        return dataProtocol;
//    }

    @RequestMapping(value="/upload",method= RequestMethod.POST)
    @ResponseBody //不写会默认返回当前路径！！
    public Object upload(String username,MultipartFile file,HttpServletRequest req) throws Exception, IOException{

        DataProtocol dataProtocol = new DataProtocol();

        String realPath = "d:/images/" + username;

        FileUtil.ifFile(realPath);

        //获取到上传的文件数据
        String contentType = file.getContentType();
        //判断上传文件是否为图片
        if (contentType==null||!contentType.startsWith("image/")) {
            System.out.println("===不属于图片类型...===");
            return null;
        }
        //动态获取上传文件夹的路径
//        ServletContext context = req.getServletContext();
//        String realPath = context.getRealPath("/upload");//获取本地存储位置的绝对路径

        String filename = file.getOriginalFilename();//获取上传时的文件名称
        filename = UUID.randomUUID().toString()+"."+FilenameUtils.getExtension(filename);//创建一个新的文件名称    getExtension(name):获取文件后缀名

        System.out.println(realPath + filename);

        File f= new File(realPath, filename);
        file.transferTo(f);//将上传的文件存储到指定位置



        dataProtocol.setData(realPath +"/"+filename);



        return dataProtocol;
    }

    /**
     * 文件读取
     * @param response
     */
    @RequestMapping(value =  "/outLoadFile")
    public void outloadFile(HttpServletResponse response, String path,String username){
        File file=new File(path);
        ServletOutputStream out=null;
        try {
            FileInputStream instream=new FileInputStream(file);
            byte[] b=new byte[1024];
            int length=0;
            BufferedInputStream buf=new BufferedInputStream(instream);
            out=response.getOutputStream();
            BufferedOutputStream bot=new BufferedOutputStream(out);
            while((length=buf.read(b))!=-1) {
                bot.write(b,0, b.length);
            }
        } catch (Exception  e) {
            e.printStackTrace();
        }
    }




}
