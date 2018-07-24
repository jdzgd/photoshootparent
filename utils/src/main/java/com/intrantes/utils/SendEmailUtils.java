package com.intrantes.utils;


import com.sun.mail.util.MailSSLSocketFactory;
//import com.sun.xml.internal.messaging.saaj.packaging.mime.MessagingException;
import javax.mail.MessagingException;
import javax.mail.Address;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

public class SendEmailUtils {
    /**
     * 发送邮箱反馈
     * @param userEmail 用户邮箱
     * @throws UnsupportedEncodingException
     * @throws MessagingException
     * @throws GeneralSecurityException
     * @throws javax.mail.MessagingException
     */

    private String SENDEMAIL_USER = "627756022@qq.com";
    private String SENDEMAIL_PASSWORD = "tmvkqwamvmfobchg";
    private String EMIAL_HOST = "smtp.qq.com";
    private String EMIAL_CHARSET = "UTF-8";

    public void sendEmail(String userEmail,String emailTheme, String emailText) throws UnsupportedEncodingException, MessagingException, GeneralSecurityException, javax.mail.MessagingException {

        //用于连接邮件服务器的参数配置（发送邮件时才需要用到）
        Properties properties = new Properties();

        //开启bug调试
        properties.setProperty("mail.debug","true");
        //发送服务器需要身份证
        properties.setProperty("mail.smtp.auth","true");
        //设置邮件服务器主机名
        properties.setProperty("mail.host","smtp.qq.com");
        //发送邮件协议
        properties.setProperty("mail.transport.protocol","smtp");

        //开启邮箱SSL加密否则有报错
        //javax.mail.AuthenticationFailedException: 530 Error: A secure connection is requiered(such as ssl).
        MailSSLSocketFactory sf = new MailSSLSocketFactory();
        sf.setTrustAllHosts(true);
        properties.put("mail.smtp.ssl.enable", "true");
        properties.put("mail.smtp.ssl.socketFactory", sf);

        //根据参数配置，创建会话对象（为了发送邮件准备）
        Session session = Session.getInstance(properties);
        //创建邮件对象
        MimeMessage message = new MimeMessage(session);

        //    From: 发件人
        //    其中 InternetAddress 的三个参数分别为: 邮箱, 显示的昵称(只用于显示, 没有特别的要求), 昵称的字符集编码
        //    真正要发送时, 邮箱必须是真实有效的邮箱。
        message.setFrom(new InternetAddress(SENDEMAIL_USER, "影约", EMIAL_CHARSET));

        //      To：收件人
        //  1261976051@qq.com y627756022@163.com
        message.setRecipient(MimeMessage.RecipientType.TO,new InternetAddress(userEmail));
        //    To: 增加收件人（可选）
        //message.addRecipient(MimeMessage.RecipientType.TO, new InternetAddress("dd@receive.com", "USER_DD", "UTF-8"));
        //    Cc: 抄送（可选）
        //message.setRecipient(MimeMessage.RecipientType.CC, new InternetAddress("ee@receive.com", "USER_EE", "UTF-8"));
        //    Bcc: 密送（可选）
        //message.setRecipient(MimeMessage.RecipientType.BCC, new InternetAddress("ff@receive.com", "USER_FF", "UTF-8"));

        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");//可以方便地修改日期格式
        String date = dateFormat.format( now );

        //设置邮箱主题
        message.setSubject(emailTheme);

        //邮箱正文,可以嵌套HTML代码
        message.setContent(emailText,"text/html;charset=UTF-8");
//
        //设置显示时间
        message.setSentDate(now);

        //保存当前设置
        message.saveChanges();

        Transport transport = session.getTransport();
        transport.connect(EMIAL_HOST, SENDEMAIL_USER, SENDEMAIL_PASSWORD);

        transport.sendMessage(message, new Address[] { new InternetAddress(userEmail) });
        transport.close();

    }

}
