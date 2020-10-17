package com.gebeya.fetan

import android.os.Bundle
import com.gebeya.fetan.framework.base.BaseActivity
import kotlinx.android.synthetic.main.activity_add_run.*

class AddRunActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_run)

        addRunSaveButton.setOnClickListener {
            finish()
        }
    }
}