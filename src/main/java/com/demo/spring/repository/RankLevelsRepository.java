package com.demo.spring.repository;

import com.demo.spring.entities.RankLevels;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RankLevelsRepository extends JpaRepository<RankLevels, Integer> {
}
