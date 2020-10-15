package com.gebeya.fetan

import android.os.Bundle
import com.gebeya.fetan.framework.base.BaseActivity

class WelcomeActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
    }
}