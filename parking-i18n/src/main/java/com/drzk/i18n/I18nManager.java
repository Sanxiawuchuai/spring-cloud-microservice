package com.drzk.i18n;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Locale;

@Component
public class I18nManager {
    @Resource
     MessageSource messageSource;

 public   String getMessage(String key){
     Locale locale = LocaleContextHolder.getLocale();

     return messageSource.getMessage(key,null,locale);


 }


}

