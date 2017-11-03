package cn.longicorn.dzzs.manager;

import cn.longicorn.dzzs.dao.SysMenuDao;
import cn.longicorn.dzzs.entity.SysMenu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ywj on 2017/11/3.
 */
@Service
public class SysMenuManager {

    @Autowired
    private SysMenuDao sysMenuDao;

    public List<SysMenu> getAllMenu(){
        return sysMenuDao.getAllMenu();
    }
}
