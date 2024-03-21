package com.page.pay1oad_bbs_demo;

import java.time.LocalDateTime;

import com.page.pay1oad_bbs_demo.Bbs.Bbs;
import com.page.pay1oad_bbs_demo.Bbs.BbsRepository;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Pay1oadBbsDemoApplicationTests {

    private BbsRepository bbsRepository;

    @Test
    void testJpa() {
        Bbs q1 = new Bbs();
        q1.setSubject("test1");
        q1.setContent("게시글이 들어가는지.");
        q1.setCreateDate(LocalDateTime.now());
        this.bbsRepository.save(q1);

        Bbs q2 = new Bbs();
        q2.setSubject("test2");
        q2.setContent("test for bbs.");
        q2.setCreateDate(LocalDateTime.now());
        this.bbsRepository.save(q2);  // 첫번째 질문 저장

    }

}
