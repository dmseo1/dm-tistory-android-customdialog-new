package me.dongmin.customdialog_new

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import me.dongmin.customdialog_new.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener(this)

    }

    override fun onClick(view: View?) {
        when(view?.id) {
            binding.button.id -> {
                val dlg = MyDialog(this)
                dlg.setOnOKClickedListener{ content ->
                    binding.text.text = content
                }
                dlg.show("메인의 내용을 변경할까요?")
            }
        }
    }
}