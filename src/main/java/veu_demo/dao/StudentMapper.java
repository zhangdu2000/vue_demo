package veu_demo.dao;/**
 * Created with IntelliJ IDEA.
 * User: 张渡
 * Date: 2019/12/25
 * Time: 17:59
 * Description: No Description
 */

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import veu_demo.entiy.Student;

import java.util.List;

/**
 * @version 1.0
 * @author： 张渡
 * @date 2019/12/25 17:59
 * Modified By： 修改人姓名(如果有其他人修改时增加这三项)
 * Modified Date: 修改日期
 * Why & What is modified  修改原因描述
 */
@Repository("studentMapper")
public interface StudentMapper {

    List<Student> stuent(Student student);//登录接口

    List<Student> studentshow(Student student);//查询接口分页、条件查询

    Integer addStudent(Student student);//添加用户

    List<Student> studentid(@Param("studentNO") Integer studentNO);//根据id查询

    Integer updatestudent(Student student);//修改用户

    Integer delstudent(@Param("studentNO")Integer studentNO);//删除用户

}
