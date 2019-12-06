package Horlly.test.SpringCloud.controller;


import Horlly.test.SpringCloud.entity.Dept;
import Horlly.test.SpringCloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class DeptController {

    @Autowired
    private DeptService service;


//    @RequestMapping(value="/dept/add",method=RequestMethod.POST)
//    public boolean add(@RequestBody Dept dept)
//    {
//        return service.add(dept);
//    }
//   之前报错：Request method 'GET' not supported
//    后来改成下面这种方式才行：GET+去掉@RequestBody   对于这个 我只能理解成 @RestController里不欢迎 post+@RequestBody 感觉这就和英文里的介词用法一样。。还需要很多经验 踩很多坑啊。。


    //    这个可以在网页链接里直接传参数过去 如：http://localhost:8001/dept/add?deptName=bigfish  或者先定义一个dept对象再传
    @RequestMapping(value="/dept/add",method=RequestMethod.GET)
    public boolean add(Dept dept)
    {
        return service.add(dept);
    }

    @RequestMapping(value="/dept/get/{id}",method=RequestMethod.GET)
    public Dept get(@PathVariable("id") Long id)
    {
        return service.get(id);
    }

//    @RequestMapping(value="/dept/list",method=RequestMethod.GET)
    @GetMapping("/dept/list")
    public List<Dept> list()
    {
        System.out.println(service.list());
        return service.list();
    }
}
