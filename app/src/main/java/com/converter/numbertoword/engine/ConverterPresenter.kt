package com.converter.numbertoword.engine

import com.converter.numbertoword.contract.ConverterContract

class ConverterPresenter(var view: ConverterContract.View?) : ConverterContract.Presenter {
    override fun convertNumberToWord(numberEntered: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getConvertedValue(): String? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun isValidNumber(): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}