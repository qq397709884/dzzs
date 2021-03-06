package cn.longicorn.dzzs.manager;

import cn.longicorn.dzzs.dao.SysUserDao;
import cn.longicorn.dzzs.entity.SysUser;
import cn.longicorn.modules.data.Page;
import cn.longicorn.modules.web.crud.StandardManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ywj on 2017/11/3.
 */
@Service
public class SysUserManager extends StandardManager<SysUser, Long> {

    @Autowired
    private SysUserDao sysUserDao;

    @Override
    public Page<SysUser> searchPage(Page<SysUser> page) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void create(SysUser sysUser) {

    }

    @Override
    public void update(SysUser sysUser) {

    }

    @Override
    public SysUser get(Long id) {
        return sysUserDao.get(id);
    }

    public SysUser getUserByUsername(String username){
        return sysUserDao.getUserByName(username);
    }

    public List<String> queryAllPerms(Long userId) {
        return sysUserDao.queryAllPerms(userId);
    }
}
