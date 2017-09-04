package com.springmvc.test.action;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springmvc.test.bean.TestBean;

/**
 * Reason: 接收form表单数据 <br/>
 * date: 2017年9月4日 下午2:39:06 <br/>
 * 
 * @author Wangch
 */
@Controller
public class FormData {

    /** 日志输出对象 **/
    public static final Log logout = LogFactory.getLog(FormData.class);

    /** http://localhost:8090/test/form1?un=wangch&ps=123456 */
    @RequestMapping(method = RequestMethod.GET, value = "/form1")
    @ResponseBody
    public Map<String, String> form1(String un, String ps) {
        logout.info("直接从方法中传递参数:");
        logout.info("\nun:" + un + "\nps:" + ps);
        Map<String, String> msg = new HashMap<>();
        msg.put(un, un);
        msg.put(ps, ps);
        return msg;
    }

    /** http://localhost:8090/test/formBean?un=wangch&ps=123456 **/
    @RequestMapping(method = RequestMethod.GET, value = "/formBean")
    @ResponseBody
    public TestBean formBean(TestBean tb) {
        logout.info("读取对象信息:");
        logout.info(tb);
        return tb;
    }

    /** http://localhost:8090/test/formRequest?un=wangch&ps=123456 **/
    @RequestMapping("/formRequest")
    @ResponseBody
    public String formRequest(HttpServletRequest request) {
        logout.info("直接从request获取数据");
        String un = request.getParameter("un");
        String ps = request.getParameter("ps");
        logout.info("\nun:" + un + "\nps:" + ps);
        return un+","+ps;
    }

}
