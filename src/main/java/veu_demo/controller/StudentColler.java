package veu_demo.controller;/**
 * Created with IntelliJ IDEA.
 * User: 张渡
 * Date: 2019/12/25
 * Time: 18:08
 * Description: No Description
 */

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import veu_demo.entiy.Meat;
import veu_demo.entiy.Student;
import veu_demo.service.StudentServacer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @version 1.0
 * @author： 张渡
 * @date 2019/12/25 18:08
 * Modified By： 修改人姓名(如果有其他人修改时增加这三项)
 * Modified Date: 修改日期
 * Why & What is modified  修改原因描述
 */

@Controller
@RequestMapping("/student")
@CrossOrigin     //跨域的
public class StudentColler {
    @Autowired
    private StudentServacer studentServacer;

    @RequestMapping("/show")
    @ResponseBody
    public String getshow(Model model,Student student,Integer pageSize, @RequestParam(defaultValue = "1", value = "pageNum") Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
       /* System.out.println(pageNum+">>>>");*/
        List<Student> list = studentServacer.studentshow(student);

        PageInfo<Student> pageInfo = new PageInfo<Student>(list);
        model.addAttribute("pageInfo", pageInfo);

        Map<Object,Object> map=new HashMap<Object,Object>();
        map.put("data",pageInfo);

        return JSON.toJSONString(map);

    }

    @RequestMapping("/log")
    @ResponseBody
    public String log(Student student) {
        Meat meat=new Meat();
        List<Student>  list= studentServacer.stuent(student);

        Map<Object,Object> map=new HashMap<Object,Object>();
        map.put("data",list);

        if (list.size()>0){
            meat.setMsg("登录成功！");
            meat.setStatus(200);
        }else{
            meat.setMsg("登录失败！");
            meat.setStatus(400);
        }

        map.put("meta",meat);
        return JSON.toJSONString(map);

    }
    @RequestMapping("/addstudent")
    @ResponseBody
    public String addstudent(Student student) {

        Map<Object,Object> map=new HashMap<Object,Object>();
        map.put("data",studentServacer.addStudent(student));
        return JSON.toJSONString(map);

    }
    @RequestMapping("/studentid")
    @ResponseBody
    public String studentid(@RequestParam(value = "studentNO") Integer studentNO) {

        System.out.println(studentNO+">");
        Map<Object,Object> map=new HashMap<Object,Object>();
        map.put("data",studentServacer.studentid(studentNO));
        return JSON.toJSONString(map);

    }
    @RequestMapping("/updatestu")
    @ResponseBody
    public String updatestu(Student student) {
        Map<Object,Object> map=new HashMap<Object,Object>();
        map.put("data",studentServacer.updatestudent(student));
        return JSON.toJSONString(map);

    }
    @RequestMapping("/delstudent")
    @ResponseBody
    public String delstudent(@RequestParam("studentNO") Integer studentNO) {
        Map<Object,Object> map=new HashMap<Object,Object>();
        map.put("data",studentServacer.delstudent(studentNO));
        return JSON.toJSONString(map);

    }


}
