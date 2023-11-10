package world.xuewei.demo.service;

import org.springframework.stereotype.Service;
import world.xuewei.fast.crud.service.BaseDBService;
import world.xuewei.demo.entity.Example;
import world.xuewei.demo.mapper.ExampleMapper;


/**
 * (Example)服务
 *
 * @author XUEW
 * @since 2023-11-09 09:27:11
 */
@Service
public class ExampleService extends BaseDBService<Example> {

    public ExampleService(ExampleMapper mapper) {
        super(mapper);
    }
    
    // Write Your Code Here ...
    
}
