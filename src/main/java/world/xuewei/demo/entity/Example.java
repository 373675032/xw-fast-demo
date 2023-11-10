package world.xuewei.demo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;
import world.xuewei.fast.crud.entity.BaseEntity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Example)实体
 * 
 * @author XUEW
 * @since 2023-11-09 09:27:07
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("example")
@EqualsAndHashCode(callSuper = true)
public class Example extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 541179640568881082L;
    
    /**
     * 编码
     */     
    private String code;

    /**
     * 名称
     */     
    private String name;

    /**
     * 备注
     */     
    private String remark;

}
