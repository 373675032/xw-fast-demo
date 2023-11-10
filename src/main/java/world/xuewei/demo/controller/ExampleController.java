package world.xuewei.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import world.xuewei.demo.entity.Example;
import world.xuewei.demo.service.ExampleService;
import world.xuewei.fast.crud.controller.BaseController;
import world.xuewei.fast.web.component.EmailClient;
import world.xuewei.fast.web.dto.response.RespResult;

import javax.mail.MessagingException;

/**
 * (Example)控制器
 *
 * @author XUEW
 * @since 2023-11-09 09:27:12
 */
@RestController
@RequestMapping("/Example")
public class ExampleController extends BaseController<Example> {

    public ExampleController(ExampleService service) {
        super(service);
    }

    @Autowired
    private EmailClient emailClient;

    // Write Your Code Here ...

    @RequestMapping("/hello")
    public RespResult hello() throws MessagingException {
        emailClient.sendCode("isxuewei@qq.com", "123456");
        return RespResult.success();
    }
}