package company.com.cus.Services;

import company.com.cus.Services.ApiHelper.LoginService;
import company.com.cus.Services.ApiHelper.RegisterService;
import company.com.cus.Utils.RetrofitClientUtils;

/**
 * Created by User on 24/01/2018.
 */

public class RetrofitServices {

    public static LoginService sendLoginRequest() {
        return RetrofitClientUtils.client().create(LoginService.class);
    }

    public static RegisterService sendRegisterRequest() {
        return RetrofitClientUtils.client().create(RegisterService.class);
    }
}
