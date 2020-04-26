package com.wjj.service.impl;

import com.wjj.mapper.MessageMapper;
import com.wjj.model.Message;
import com.wjj.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageServiceImpl implements MessageService {
    @Autowired
    MessageMapper messageMapper;

    @Override
    public List<Message> listMessage() {
        return messageMapper.listMessage();
    }
}
