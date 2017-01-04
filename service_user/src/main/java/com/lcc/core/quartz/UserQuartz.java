package com.lcc.core.quartz;

import com.lcc.core.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * Created by lcc on 2017/1/3.
 */
@Component
public class UserQuartz {
    private final Logger LOG = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserDao userDao;

    /**
     * 用户自动加积分
     * 每天9点到17点每过1分钟所有用户加一次积分
     * （这里要注意集群环境 可能出现重复触发的情况 ）
     */
    @Scheduled(cron = "0 0/1 9-17 * * ? ")
    public void addUserScore() {
        LOG.info("@Scheduled--------addUserScore()");
        userDao.addScore(10);
    }
}
