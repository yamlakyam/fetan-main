package com.gebeya.fetan

import android.content.Intent
import android.os.Bundle
import com.gebeya.fetan.framework.base.BaseActivity
import kotlinx.android.synthetic.main.activity_welcome.*

class WelcomeActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        welcomeContinueButton.setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
        }
    }
}