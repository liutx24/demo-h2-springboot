package com.exampleh2data.demoh2springboot.service.serviceimpl;

import com.exampleh2data.demoh2springboot.dao.DockCompatibilityDao;
import com.exampleh2data.demoh2springboot.entity.DockCompatibilityEntity;
import com.exampleh2data.demoh2springboot.service.DockCompatibilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class DockCompatibilityServiceImpl implements DockCompatibilityService {

    @Autowired
    private DockCompatibilityDao dockCompatibilityDao;

    @Override
    public List<DockCompatibilityEntity> findDock(String dockpn, String compn) {
        return dockCompatibilityDao.findDock(dockpn,compn);
    }

    @Override
    public void deleteById(int id) {
        dockCompatibilityDao.deleteById(id);
    }

    @Override
    public void updateNameById(String dpn, String cpn, String fnid, int id) {
        dockCompatibilityDao.updateNameById(dpn,  cpn,  fnid,  id);
    }

    @Override
    public Object save(DockCompatibilityEntity dockCompatibilityEntity) {
        return dockCompatibilityDao.save(dockCompatibilityEntity);
    }
}
