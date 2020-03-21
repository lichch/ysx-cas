package com.ysx.cas.web.controller.test;

import com.ysx.cas.innerservice.TestInnerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

/**
 * 主讲老师管理
 *
 * @author dongli
 * Date 2019-12-26
 */
@Slf4j
@RestController
@RequestMapping("api/log")
public class TestLogController {
     @Autowired
     private TestInnerService testInnerService;
    @GetMapping(value = "test")
    public String testLoggerTag() {
        log.debug("测试logger标签");
        log.info("测试logger标签");
        log.warn("测试logger标签");
        log.error("测试logger标签");
        return "this is crm-live projects.";
    }

    @GetMapping(value = "/cookie")
    public String testCreateCookie(HttpServletResponse response) {
        Cookie cookie=new Cookie("sso_sessionid","CookieTestInfo");
        response.addCookie(cookie);
        return "添加cookies信息成功";
    }
    @GetMapping(value = "/testdb")
    public String testDb(HttpServletResponse response) {
        testInnerService.test();
        return "查询成功";
    }
}
