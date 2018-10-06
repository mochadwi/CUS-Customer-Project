package company.com.cus.Activity

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import company.com.cus.Fragment.LoginRegister.LoginFragment
import company.com.cus.MainActivity
import company.com.cus.R

class LoginRegisterActivity : AppCompatActivity() {

    private var onPickFragment: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_register)
        goToLoginFragment()
    }

    private fun goToLoginFragment() {
        onPickFragment = false
        supportFragmentManager.beginTransaction()
                .replace(R.id.frame_container,
                        LoginFragment(),
                        LoginFragment::class.java.simpleName)
                .commit()
    }

//    fun goToRegisterFragment() {
//        onPickFragment = false
//        supportFragmentManager.beginTransaction()
//                .replace(R.id.frame_container,
//                        RegisterFragment(),
//                        RegisterFragment::class.java!!.getSimpleName())
//                .commit()
//    }

    override fun onBackPressed() {
        if (!onPickFragment) {
//            goToPickFragment()
        } else {
            super.onBackPressed()
        }
    }

    fun goToMain() {
        startActivity(Intent(applicationContext, MainActivity::class.java))
        finish()
    }
}