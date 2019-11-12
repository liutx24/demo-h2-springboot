package com.exampleh2data.demoh2springboot.controller;


import com.exampleh2data.demoh2springboot.dao.DockCompatibilityDao;
import com.exampleh2data.demoh2springboot.entity.DockCompatibilityEntity;
import com.exampleh2data.demoh2springboot.service.DockCompatibilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@Controller
public class DockCompatibilityController {

    @Autowired
    DockCompatibilityService dockCompatibilityService;
    @Autowired
    DockCompatibilityDao dockCompatibilityDao;

    @ResponseBody
    @GetMapping(value = "/select",produces = "application/json;charset=UTF-8")
    public List<DockCompatibilityEntity> find(@RequestParam("dpn") String dpn, @RequestParam("cpn") String cpn){

        if(dpn == null && cpn == null){
            return null;
        }
        List<DockCompatibilityEntity> dockCompatibility = dockCompatibilityService.findDock(dpn, cpn);
        return dockCompatibility;
    }

    @ResponseBody
    @RequestMapping("/delete")
    public void deleteById(@RequestParam("idarr") String[] idarr){
        int[] ids = Arrays.asList(idarr).stream().mapToInt(Integer::parseInt).toArray();
        for (int id :ids) {
            dockCompatibilityService.deleteById(id);
        }
    }
    @ResponseBody
    @RequestMapping("/updateinsert")
    public void updateInsert(@RequestBody DockCompatibilityEntity compatibilityEntity){
        if (compatibilityEntity.getId() == 0){
            this.insert(compatibilityEntity);
        }else{
           this.update(compatibilityEntity);
        }
    }

    public void update(DockCompatibilityEntity compatibilityEntity){
        dockCompatibilityService.updateNameById(compatibilityEntity.getDockPn(),
                compatibilityEntity.getCompatibilityPn(),compatibilityEntity.getFootNoteId(),compatibilityEntity.getId());
    }

    public void insert(DockCompatibilityEntity compatibilityEntity){
        dockCompatibilityDao.save(compatibilityEntity);
    }

}
