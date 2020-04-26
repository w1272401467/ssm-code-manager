package com.wjj.controller;


import com.wjj.model.Message;
import org.apache.commons.io.FileUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

//这是一个测试的testController 类
@Controller
@RequestMapping("/test")
public class TestController {
     /*
    @Autowired
    private MessageService messageService;

    @RequestMapping(value = "/show",method = RequestMethod.GET)
    @ResponseBody
    public List<Message> helloMvc(HttpServletRequest request, Model model){
        List<Message> mes = messageService.listMessage();
        return mes;
    }
    */

    @RequestMapping(value = "/home",method = RequestMethod.GET)
    @ResponseBody
    public Message home(){
        Message message = new Message();
        message.setCommand("home");
        message.setContent("home");
        message.setDescription("home");
        return message;
    }

    //进入文件上传页面
    @RequestMapping(value = "/uploadPage")
    public String good(){
    /*    Message message = new Message();
        message.setCommand("good");
        message.setContent("good");
        message.setDescription("good");
        return message;*/
    return "upload";
    }

//    文件上传的动作
    @RequestMapping(value = "/upload")
    public String upload(MultipartFile file,HttpServletRequest request) throws IOException {
        String name = file.getOriginalFilename();
        File uploadFile = new File("/"+name);
        file.transferTo(uploadFile);
        return "upload";
    }

    //    文件下载
    @RequestMapping(value = "/download")
    public ResponseEntity<byte[]> download() throws IOException {
        String path = "D:/photo/headImg.png";
        File file = new File(path);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentDispositionFormData("attachment",path);
        headers.setContentType(MediaType.IMAGE_PNG);
        return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),headers, HttpStatus.CREATED);
    }


}
