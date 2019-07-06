package edu.gdkm.weixin.menu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.gdkm.weixin.menu.domain.SelfMenu;

// DAO，用于操作数据库表里面的数据，Menu对象不单独操作，而是通过SelfMenu来完成操作。
@Repository
public interface SelfMenuRepository extends JpaRepository<SelfMenu, String> {

}
