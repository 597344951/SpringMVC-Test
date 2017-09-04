package com.springmvc.test.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * 普通页面跳转 <br/>
 * date: 2017年9月4日 下午2:24:43 <br/>
 * 
 * @author Wangch
 */
@Controller
public class PageRedirect {

    @RequestMapping("/index")
    public String index() {
        return "index";
    }
}
