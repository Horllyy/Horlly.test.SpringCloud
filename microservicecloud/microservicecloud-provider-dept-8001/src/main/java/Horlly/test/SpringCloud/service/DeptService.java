package Horlly.test.SpringCloud.service;

import Horlly.test.SpringCloud.entity.Dept;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
    public interface DeptService
    {
        public boolean add(Dept dept);

        public Dept get(Long id);

        public List<Dept> list();
    }

