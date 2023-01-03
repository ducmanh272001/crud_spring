package com.demo.spring.controller;

import com.demo.spring.entities.RankLevels;
import com.demo.spring.service.RankLevelsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
public class RankLevelsController {

    @Autowired
    private RankLevelsService service;

    @GetMapping(value = "/rank-levels")
    public List<RankLevels> list() {
        return service.selectAll();
    }

    @GetMapping(value = "/rank-levels/{id}")
    public ResponseEntity<RankLevels> get(@PathVariable(value = "id") Integer id) {
        try {
            RankLevels rankLevels = service.get(id);
            return new ResponseEntity<RankLevels>(rankLevels, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<RankLevels>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping(value = "/rank-levels")
    public void add(@RequestBody RankLevels rankLevels) {
        service.save(rankLevels);
    }

    //Hàm sửa
    @PutMapping(value = "/rank-levels/{id}")
    public ResponseEntity<RankLevels> update(@RequestBody RankLevels rankLevels, @PathVariable(value = "id") Integer id) {
        try {
            RankLevels rankLevels1 = service.get(id);
            rankLevels1.setId(id);
            rankLevels1.setName(rankLevels.getName());
            rankLevels1.setDescription(rankLevels.getDescription());
            rankLevels1.setIs_active(rankLevels.getIs_active());
            rankLevels1.setCreate_at(rankLevels.getCreate_at());
            rankLevels1.setUpdate_at(rankLevels.getUpdate_at());
            rankLevels1.setCreate_by(rankLevels.getCreate_by());
            rankLevels1.setUpdate_by(rankLevels.getUpdate_by());
            rankLevels1.setDelete_by(rankLevels.getDelete_by());
            rankLevels1.setDeleted_at(rankLevels.getDeleted_at());
            service.save(rankLevels1);
            return new ResponseEntity<RankLevels>(rankLevels1, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<RankLevels>(HttpStatus.NOT_FOUND);
        }
    }
}
