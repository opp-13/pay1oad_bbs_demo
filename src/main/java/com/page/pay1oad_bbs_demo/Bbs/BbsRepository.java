package com.page.pay1oad_bbs_demo.Bbs;
import com.page.pay1oad_bbs_demo.Bbs.Bbs;
import org.springframework.data.jpa.repository.JpaRepository;
public interface BbsRepository extends JpaRepository<Bbs, Integer> {
    Bbs findBySubject(String subject);
    Bbs findBySubjectAndContent(String subject, String content);
}
