package com.page.pay1oad_bbs_demo.Bbs;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.page.pay1oad_bbs_demo.Bbs.Bbs;
import com.page.pay1oad_bbs_demo.Bbs.BbsService;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class BbsController {

    @Autowired
    private BbsService bbsService;

    @GetMapping("/board")
    public List<Bbs> getAllBoards() {
        return bbsService.getAllBoard();
    }

    @PostMapping("/board")
    public Bbs createBoard(@RequestBody Bbs bbs) {
        return bbsService.createBoard(bbs);
    }

    @DeleteMapping("/board/{no}")
    public ResponseEntity<Map<String, Boolean>> deleteBoardByNo(
            @PathVariable Integer no) {

        return bbsService.deleteBoard(no);
    }
}
