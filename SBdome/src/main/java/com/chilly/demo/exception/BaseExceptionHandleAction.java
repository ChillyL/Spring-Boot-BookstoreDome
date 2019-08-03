package com.chilly.demo.exception;



import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 自定义全局捕捉异常
 * Controller类继承这个类即可在产生异常时返回数据获取失败信息
 */
public class BaseExceptionHandleAction {


    /** 基于@ExceptionHandler异常处理 */
    /*@ExceptionHandler
    public ModelAndView  handleAndReturnPage(HttpServletRequest request, HttpServletResponse response, Exception ex) {

        ModelAndView  mv = new ModelAndView("Exception") ;
        mv.addObject("ex", ex);

        // 根据不同错误转向不同页面
        if (ex instanceof BusinessException) {
            return mv;
        } else {
            return mv; //返回Exception.jsp页面
        }
    }*/

    /** 基于@ExceptionHandler异常处理 */
    @ExceptionHandler
    @ResponseBody
    public void handleAndReturnData(Exception ex) {
        System.out.println("************handleAndReturnData********************************************");
        System.out.println("Surprise！！");
        System.out.println("你怎么又在写bug？？");
        System.out.println("你看看你写的bug");
        System.out.println(ex.getMessage());   //这个是查看Exception详情的
        ex.printStackTrace();
        System.out.println(ex.getClass());
    }

}
