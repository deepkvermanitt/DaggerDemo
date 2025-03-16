package me.deepkverma.daggerdemo.ui.main

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import me.deepkverma.daggerdemo.MyApplication
import me.deepkverma.daggerdemo.R
import me.deepkverma.daggerdemo.di.component.ActivityComponent
import me.deepkverma.daggerdemo.di.component.DaggerActivityComponent
import me.deepkverma.daggerdemo.di.module.ActivityModule
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    lateinit var activityComponent: ActivityComponent

    @Inject
    lateinit var mainViewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        getDependencies()

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val tv = findViewById(R.id.main_text) as TextView
        tv.text = mainViewModel.getSomeDate()
    }

    private fun getDependencies() {
        DaggerActivityComponent
            .builder()
            .applicationComponent((application as MyApplication).applicationComponent)
            .activityModule(ActivityModule(this))
            .build()
            .inject(this)
    }

}