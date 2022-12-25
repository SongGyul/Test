package com.example.test

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button


class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("TAG", ": ");
        findViewById<Button>(R.id.btn).setOnClickListener {
            Log.d("TAG", ": ");
            Log.d("TAG", "mytest: ");
        }
        Log.d("TAG", "fkfkfk: ");
        Log.d("TAG", "메리: ")
        Log.d("TAG", "크리스마스~~~: ")
        Log.d("TAG", "dkdkck: ");
        Log.d("TAG", "cmcmcm: ");
        Log.d("TAG", "djdjjd: ")
    }
}