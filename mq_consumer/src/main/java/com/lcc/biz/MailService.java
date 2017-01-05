package com.lcc.biz;

import com.lcc.common.model.MailParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;


/**
 * 邮件发送业务逻辑
 */
@Service
public class MailService {

    @Autowired
    private JavaMailSender mailSender;

    @Autowired
    private SimpleMailMessage simpleMailMessage;

    public void mailSend(final MailParam mail) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 发送人,从配置文件中取得
        simpleMailMessage.setFrom(simpleMailMessage.getFrom());
        simpleMailMessage.setTo(mail.getTo()); // 接收人
        simpleMailMessage.setSubject(mail.getSubject());
        simpleMailMessage.setText(mail.getContent());
        mailSender.send(simpleMailMessage);
    }

}