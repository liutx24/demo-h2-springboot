package com.exampleh2data.demoh2springboot.dao;

import com.exampleh2data.demoh2springboot.entity.DockCompatibilityEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
public interface DockCompatibilityDao extends JpaRepository<DockCompatibilityEntity, Integer> {

    @Query(value = "select * from dockompatibility where DOCK_PN = :dockpn and COMPATIBILITY_PN like %:compn% ",nativeQuery = true)
    List<DockCompatibilityEntity> findDock(String dockpn, String compn);

    @Modifying
    void deleteById(int id);

    @Modifying
    @Query(value = "update dockompatibility set DOCK_PN =?1,COMPATIBILITY_PN =?2,FOOT_NOTE_ID =?3 where id = ?4",nativeQuery = true)
    void updateNameById(String dpn, String cpn,String fnid,int id);


//    Object save(DockCompatibilityEntity dockCompatibilityEntity);


}