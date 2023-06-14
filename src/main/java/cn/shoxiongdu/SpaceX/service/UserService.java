package cn.shoxiongdu.SpaceX.service;

import cn.dev33.satoken.stp.SaTokenInfo;
import cn.shoxiongdu.SpaceX.entity.User;
import cn.shoxiongdu.SpaceX.request.user.EnrollRequest;
import cn.shoxiongdu.SpaceX.request.user.LoginRequest;
import cn.shoxiongdu.SpaceX.response.base.Resp;
import com.baomidou.mybatisplus.extension.service.IService;
import jakarta.servlet.http.HttpServletRequest;

public interface UserService extends IService<User> {
    Resp<SaTokenInfo> login(LoginRequest requestBody, HttpServletRequest request);

    Resp<Boolean> enroll(EnrollRequest request);
}
