package com.drzk.controller;

import com.drzk.i18n.I18nManager;
import com.drzk.mapper.IDrzkDAO;
import com.drzk.utils.StringUtils;
import com.drzk.vo.Bean;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 控制器demo
 * @since 2018-03-31
 * @author  huanglanfa
 */
@RestController
public class HelloController {
    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);
    @Resource
    IDrzkDAO drzkDAO;

    @Resource
    I18nManager i18n;


    /**
     * 测试案例
     * @param id
     * @return
     */
    @ApiOperation(value="获取用户名字", notes="根据url的id来获取用户详细信息")
    @RequestMapping(value = "/hello/{id}",method = RequestMethod.GET)
    public String sayHi(@PathVariable(value = "id") Integer id){
        Bean bean = new Bean();
        bean.setId(id);
        String name = drzkDAO.findFirstParam(bean);
        //引入utils工程的工具类
        if(!StringUtils.isNullOrEempty(name)) {
            //调用日志
            logger.info("value not null");
            return name;
        }
        logger.info("value is null");
        return "nothing";
    }
    /**
     * 测试i18n
     * @param id
     * @return
     */
    @ApiOperation(value="获取国际化资源", notes="国际化资源")
    @RequestMapping(value = "/geti18n",method = RequestMethod.GET)
    public String testI18n(){

        return i18n.getMessage("welcome");

    }




}
