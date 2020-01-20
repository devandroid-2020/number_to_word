package com.converter.numbertoword

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.converter.numbertoword.contract.ConverterContract

class MainActivity : AppCompatActivity(), ConverterContract.View {
    override fun displayWord(convertedWord: String?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
