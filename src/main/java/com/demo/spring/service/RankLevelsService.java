package com.demo.spring.service;

import com.demo.spring.entities.RankLevels;
import com.demo.spring.repository.RankLevelsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RankLevelsService {

    @Autowired
    private RankLevelsRepository repo;

    public List<RankLevels> selectAll() {
        List<RankLevels> list = repo.findAll();
        return list;
    }

    public void save(RankLevels rankLevels) {
        repo.save(rankLevels);
    }

    public RankLevels get(Integer id) {
        RankLevels rankLevels = repo.findById(id).get();
        return rankLevels;
    }

    public void delete(Integer id){
        repo.deleteById(id);
    }
}
