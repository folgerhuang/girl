package com.imooc.repository;

import com.imooc.domain.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by root on 2017/4/5.
 */
public interface GirlRepository extends JpaRepository<Girl, Integer> {
     List<Girl> findByAge(Integer age);
}
