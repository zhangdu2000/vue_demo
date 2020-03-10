package veu_demo.entiy;/**
 * Created with IntelliJ IDEA.
 * User: 张渡
 * Date: 2019/12/25
 * Time: 17:48
 * Description: No Description
 */

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @version 1.0
 * @author： 张渡
 * @date 2019/12/25 17:48
 * Modified By： 修改人姓名(如果有其他人修改时增加这三项)
 * Modified Date: 修改日期
 * Why & What is modified  修改原因描述
 */

@Data
public class Student {


    private  Integer studentNO;

    private  String loginPwd;

    private  String studentName;

    private  char sex;

    private  Integer gradeId;

    private  String phone;

    private  String address;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private  Date bornDate;

    private  String email;

    private  String identityCarc;


}
