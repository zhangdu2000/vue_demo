package veu_demo.service.imp;/**
 * Created with IntelliJ IDEA.
 * User: 张渡
 * Date: 2019/12/25
 * Time: 18:04
 * Description: No Description
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import veu_demo.dao.StudentMapper;
import veu_demo.entiy.Student;
import veu_demo.service.StudentServacer;

import java.util.List;

/**
 * @version 1.0
 * @author： 张渡
 * @date 2019/12/25 18:04
 * Modified By： 修改人姓名(如果有其他人修改时增加这三项)
 * Modified Date: 修改日期
 * Why & What is modified  修改原因描述
 */
@Service("studentServacer")
public class StudentServacerImpl implements StudentServacer {

    @Autowired
    private StudentMapper studentMapper;

    /**
    * @author         张渡
    * @version        1.0
    * @date           2019/12/25 18:43
    * Modified By    修改人姓名(如果有其他人修改时增加这三项)
    * Modified Date: 修改日期
    * Why & What is modified  登录
    */

    @Override
    public List<Student> stuent(Student student) {
        return studentMapper.stuent(student);
    }

    /**
    * @author         张渡
    * @version        1.0
    * @date           2019/12/25 18:42
    * Modified By    修改人姓名(如果有其他人修改时增加这三项)
    * Modified Date: 修改日期
    * Why & What is modified  依赖分页、条件查询
    */

    @Override
    public List<Student> studentshow(Student student) {
        return studentMapper.studentshow(student);
    }

    /**
    * @author         张渡
    * @version        1.0
    * @date           2019/12/28 13:59
    * Modified By    修改人姓名(如果有其他人修改时增加这三项)
    * Modified Date: 修改日期
    * Why & What is modified  添加用户
    */

    @Override
    public Integer addStudent(Student student) {
        return studentMapper.addStudent(student);
    }

    /**
    * @author         张渡
    * @version        1.0
    * @date           2019/12/30 9:33
    * Modified By    修改人姓名(如果有其他人修改时增加这三项)
    * Modified Date: 修改日期
    * Why & What is modified  根据id查询
    */

    @Override
    public List<Student> studentid(Integer studentNO) {
        return studentMapper.studentid(studentNO);
    }

    /**
    * @author         张渡
    * @version        1.0
    * @date           2019/12/31 9:39
    * Modified By    修改人姓名(如果有其他人修改时增加这三项)
    * Modified Date: 修改日期
    * Why & What is modified  根据id进行修改
    */

    @Override
    public Integer updatestudent(Student student) {
        return studentMapper.updatestudent(student);
    }

    /**
    * @author         张渡
    * @version        1.0
    * @date           2019/12/31 9:40
    * Modified By    修改人姓名(如果有其他人修改时增加这三项)
    * Modified Date: 修改日期
    * Why & What is modified  根据id进行删除
    */

    @Override
    public Integer delstudent(Integer studentNO) {
        return studentMapper.delstudent(studentNO);
    }
}
