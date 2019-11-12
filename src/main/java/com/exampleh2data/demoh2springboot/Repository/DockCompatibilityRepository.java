package com.exampleh2data.demoh2springboot.Repository;

import com.exampleh2data.demoh2springboot.entity.DockCompatibilityEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DockCompatibilityRepository extends JpaRepository<DockCompatibilityEntity, Integer> {

    @Query(value = "select * from dockompatibility where DOCK_PN = :dockpn and COMPATIBILITY_PN like %:compn% ",nativeQuery = true)
    List<DockCompatibilityEntity> findDock(String dockpn,String compn);

//    @Query(value = "select * from girl  where name like %:name%",nativeQuery = true)
//    List<Girl> findByName(String name);

    DockCompatibilityEntity deleteById(int id);

}
