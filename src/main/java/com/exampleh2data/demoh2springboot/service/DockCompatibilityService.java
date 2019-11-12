package com.exampleh2data.demoh2springboot.service;

import com.exampleh2data.demoh2springboot.entity.DockCompatibilityEntity;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface DockCompatibilityService {

    List<DockCompatibilityEntity> findDock(String dockpn, String compn);

    void deleteById(int id);

    void updateNameById(String dpn, String cpn,String fnid,int id);

    Object save(DockCompatibilityEntity dockCompatibilityEntity);
}
