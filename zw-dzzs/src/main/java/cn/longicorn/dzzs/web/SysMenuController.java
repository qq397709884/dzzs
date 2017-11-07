package cn.longicorn.dzzs.web;

import cn.longicorn.dzzs.manager.SysMenuManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by asus on 2017/11/3.
 */
@Controller
@RequestMapping(value = "/sys/menu")
public class SysMenuController {

    @Autowired
    private SysMenuManager sysMenuManager;

    @RequestMapping(value = "/nav")
    public ResponseEntity<?> getNav(){
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

}
