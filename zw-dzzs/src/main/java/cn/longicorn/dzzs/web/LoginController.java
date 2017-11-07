package cn.longicorn.dzzs.web;

import cn.longicorn.dzzs.shiro.ShiroUtils;
import cn.longicorn.dzzs.util.RspData;
import org.apache.shiro.authc.*;
import org.apache.shiro.subject.Subject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by ywj on 2017/11/3.
 */
@Controller
@RequestMapping(value = "/login")
public class LoginController {

    @RequestMapping(method = RequestMethod.GET)
    public String login() {
        return "login";
    }


    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> login(@RequestParam(value = "username") String username, @RequestParam(value = "password") String password) {
        try {
            Subject subject = ShiroUtils.getSubject();
            UsernamePasswordToken token = new UsernamePasswordToken(username, password);
            subject.login(token);
        } catch (UnknownAccountException e) {
            return new ResponseEntity<>(new RspData("01"), HttpStatus.OK);
        } catch (IncorrectCredentialsException e) {
            return new ResponseEntity<>(new RspData("01", "账号或密码不正确"), HttpStatus.OK);
        } catch (LockedAccountException e) {
            return new ResponseEntity<>(new RspData("01", "账号已被锁定,请联系管理员"), HttpStatus.OK);
        } catch (AuthenticationException e) {
            return new ResponseEntity<>(new RspData("01", "账户验证失败"), HttpStatus.OK);
        }
        return new ResponseEntity<>(new RspData("00", "登陆成功"), HttpStatus.OK);
    }
}
