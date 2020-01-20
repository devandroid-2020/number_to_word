package com.converter.numbertoword.converter

import com.converter.numbertoword.contract.ConverterContract
import com.converter.numbertoword.engine.ConverterPresenter
import com.nhaarman.mockitokotlin2.mock
import junit.framework.Assert.*
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.junit.MockitoJUnitRunner


@RunWith(MockitoJUnitRunner::class)
class ConverterPresenterTest {

    private lateinit var contractPresenter: ConverterPresenter
    private val view: ConverterContract.View = mock()
    private val word: String = "One Lakh Fifty  Thousands Nine Hundred Ninety Nine"
    private val number: String = "150999"
    private val emptyNumber: String = ""

    @Before
    fun setUp() {
        this.contractPresenter = ConverterPresenter(view)
        this.contractPresenter.convertNumberToWord(number)
    }

    @Test
    fun testConvertNumberToWordSuccess() {
        contractPresenter.convertNumberToWord(number)
        assertTrue(contractPresenter.isValidNumber())
        assertEquals(contractPresenter.getConvertedValue(), word)
    }

    @Test
    fun testConvertNumberToWordFail() {
        contractPresenter.convertNumberToWord(emptyNumber)
        assertFalse(contractPresenter.isValidNumber())
    }
}
