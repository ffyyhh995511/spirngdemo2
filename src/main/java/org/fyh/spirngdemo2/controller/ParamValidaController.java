package org.fyh.spirngdemo2.controller;

import java.util.List;

import org.fyh.spirngdemo2.vo.ParamValida;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/valida")
public class ParamValidaController {
	@RequestMapping(value = "/test", method = RequestMethod.POST)
    public String login(@Validated ParamValida paramValida, BindingResult bindingResult) {
        log.info("用户 {} 登录", paramValida.getTel());
        List<ObjectError> allErrors = bindingResult.getAllErrors();
        System.out.println(allErrors.size());
        try {
            return "1";
        } catch (Exception e) {
            log.error("用户 {} 登录异常：{}", paramValida.getTel(), e);
            return "b";
        }
    }
}
