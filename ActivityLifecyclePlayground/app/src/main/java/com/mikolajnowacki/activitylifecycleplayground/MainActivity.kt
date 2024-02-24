package com.mikolajnowacki.activitylifecycleplayground

import android.os.Bundle
import android.widget.Toast
import androidx.activity.addCallback
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.mikolajnowacki.activitylifecycleplayground.databinding.ActivityMainBinding
import java.io.File

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonExit.setOnClickListener { showDialog() }

        val callback = onBackPressedDispatcher.addCallback { showDialog() }

    }

    override fun onDestroy() {
        super.onDestroy()

    }

    private fun showDialog() {
        AlertDialog.Builder(this)
            .setTitle("Warning!")
            .setView(R.layout.dialog_warning)
            .setPositiveButton("Yes") { _, _ ->
                finish()
            }
            .setNegativeButton("No") { dialog, _ ->
                dialog.dismiss()
            }
            .setNeutralButton("What the hell?") { dialog, _ ->
                Toast.makeText(this, "What the hell?", Toast.LENGTH_SHORT).show()
                dialog.dismiss()
            }
            .show()
    }

}