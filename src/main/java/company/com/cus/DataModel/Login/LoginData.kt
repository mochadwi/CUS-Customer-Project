package company.com.cus.DataModel.Login

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

/**
 * Created by User on 25/01/2018.
 */

class LoginData(@field:SerializedName("email")
                @field:Expose
                var email: String?, @field:SerializedName("password")
                @field:Expose
                var password: String?, @field:SerializedName("name")
                @field:Expose
                var name: String?, @field:SerializedName("login_type")
                @field:Expose
                var loginType: String?)
