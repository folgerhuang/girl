package com.imooc.service;

import com.imooc.repository.GirlRepository;
import com.imooc.domain.Girl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by root on 2017/4/5.
 */
@Service
public class GirlService {
    @Autowired
    private GirlRepository girlRepository;
    @Transactional
    public void insertTwo() {
        Girl girlA = new Girl();
        girlA.setCupSize("G");
        girlA.setAge(34);
        girlRepository.save(girlA);

        Girl girlB = new Girl();
        girlB.setCupSize("GGGGG");
        girlB.setAge(66);
        girlRepository.save(girlB);
    }
}
