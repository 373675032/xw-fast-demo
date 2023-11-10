package world.xuewei.demo.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import world.xuewei.demo.entity.Example;

import java.util.List;

/**
 * 数据库服务测试
 *
 * @author XUEW
 * @since 2023/11/9 9:35
 */
@SpringBootTest
public class ExampleServiceTest {

    @Autowired
    ExampleService exampleService;

    /**
     * 测试查询全部
     */
    @Test
    public void getAllTest() {
        List<Example> exampleList = exampleService.getAll();
        System.out.println(exampleList);
    }
}
