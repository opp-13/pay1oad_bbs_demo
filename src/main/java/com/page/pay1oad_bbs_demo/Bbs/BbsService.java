package com.page.pay1oad_bbs_demo.Bbs;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.page.pay1oad_bbs_demo.Bbs.Bbs;
import com.page.pay1oad_bbs_demo.Bbs.BbsRepository;

@Service
public class BbsService {

    @Autowired
    private BbsRepository bbsRepository;
    public List<Bbs> getAllBoard() {
        return bbsRepository.findAll();
    }

    public Bbs createBoard(Bbs bbs) {
        return bbsRepository.save(bbs);
    }

    public ResponseEntity<Map<String, Boolean>> deleteBoard(Integer no) {
        Optional<Bbs> optionalBbs = bbsRepository.findById(no);

        if (optionalBbs.isPresent()) {
            Bbs bbs = optionalBbs.get();
            bbsRepository.delete(bbs);
            Map<String, Boolean> response = new HashMap<>();
            response.put("Deleted Board Data by id : [" + no + "]", Boolean.TRUE);
            return ResponseEntity.ok(response);
        } else {
            Map<String, Boolean> response = new HashMap<>();
            response.put("No such board with id : [" + no + "]", Boolean.FALSE);
            return ResponseEntity.ok(response);
        }
    }
}
