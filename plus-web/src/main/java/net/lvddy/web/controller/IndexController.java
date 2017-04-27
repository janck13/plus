package net.lvddy.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kcz-020 on 2017/4/27.
 */
@RestController
public class IndexController {

    @RequestMapping(path = "/index")
    public String index(){
        return "index";
    }

}
