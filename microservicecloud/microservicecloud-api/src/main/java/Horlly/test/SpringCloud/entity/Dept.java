package Horlly.test.SpringCloud.entity;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain = true)
public class Dept implements Serializable {

    private Long deptId;
    private String deptName;
    private String db_source;//微服务可以连接多个数据库 这个属性表明了来自哪个数据库


    @Override
    public String toString() {
        return "Dept{" +
                "deptId=" + deptId +
                ", deptName='" + deptName + '\'' +
                ", db_source='" + db_source + '\'' +
                '}';
    }
}
