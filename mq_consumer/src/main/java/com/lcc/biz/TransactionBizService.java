package com.lcc.biz;

import com.lcc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 事务业务逻辑
 */
@Service
public class TransactionBizService {

    @Autowired
    private UserService userService;

    public void addScoreBySyn(int score) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        userService.addScoreBySyn(score);
    }
}
