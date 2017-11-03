package cn.longicorn.dzzs.dao;

import cn.longicorn.dzzs.entity.SysUser;
import cn.longicorn.modules.data.mybatis.StandardDao;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by ywj on 2017/11/2.
 */
@Component
public interface SysUserDao extends StandardDao<SysUser, Long> {
    SysUser getUserByName(String username);

    List<String> queryAllPerms(Long userId);
}
