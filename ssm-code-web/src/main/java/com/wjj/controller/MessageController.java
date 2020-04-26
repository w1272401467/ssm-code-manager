package com.wjj.controller;

import com.wjj.model.Message;
import com.wjj.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/message")
public class MessageController {


    @Autowired
    private MessageService messageService;

    @RequestMapping(value = "/home")
    public String home(){
        return "message";
    }

    @RequestMapping(value = "/show",method = RequestMethod.GET)
    @ResponseBody
    public List<Message> show(){
        List<Message> mes = messageService.listMessage();
        return mes;
    }


}
