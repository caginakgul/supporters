package com.example.mobile.supporters.welcome

import android.databinding.DataBindingUtil
import android.os.Bundle
import com.example.mobile.supporters.BaseActivity
import com.example.mobile.supporters.R
import com.example.mobile.supporters.databinding.ActivityWelcomeBinding


/**
 * Created by mobile on 9.05.2018.
 */
class WelcomeActivity : BaseActivity() {

    //private lateinit var binding: ActivityWelcomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initBinding()
        setContentView(R.layout.activity_welcome)
    }

    fun initBinding(){
        var binding : ActivityWelcomeBinding = DataBindingUtil.setContentView(this,R.layout.activity_welcome)
        binding.tvSelectTeam.setOnClickListener {

        }
    }
}