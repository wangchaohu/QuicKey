package top.quickey.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import top.quickey.entity.Quickey;
import top.quickey.services.QuickeyService;

@RestController
public class QuickeyController {
    @Autowired
    private QuickeyService quickeyService;

    @GetMapping(value = "/findQuickey/{id}")
    public Quickey selectQuickeyById(@PathVariable("id") Integer id){
        Quickey stu = null;
        try {
            stu = quickeyService.findQuickeyById(id);
        }catch (Exception e){
            e.printStackTrace();
        }
        return stu;
    }
}
