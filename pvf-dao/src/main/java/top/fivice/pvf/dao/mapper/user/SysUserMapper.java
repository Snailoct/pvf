package top.fivice.pvf.dao.mapper.user;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import top.fivice.pvf.domain.userAndPermission.SysUser;

import java.util.List;

public interface SysUserMapper extends BaseMapper<SysUser> {

    SysUser selectUserByName(String userName);
}
