package world.xuewei.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import world.xuewei.demo.service.ExampleService;
import world.xuewei.fast.crud.annotation.FastController;

/**
 * (Example)控制器
 *
 * @author XUEW
 * @since 2023-11-09 09:27:12
 */
@RestController
@FastController
@RequestMapping("/Fast")
public class ExampleFastController {

    @Autowired
    private ExampleService service;

    // Write Your Code Here ...
}

