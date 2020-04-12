package com.lagou.edu.mvcframework.annotations;

import java.lang.annotation.*;

/**
 * 安全注解 标示哪些用户可被访问
 * 可标示在类以及方法上 若是两者都存在 以method为主
 * @author fangyuan
 */
@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface LagouSecurity {

    //设置哪些用户访问
    String[] value();
}
