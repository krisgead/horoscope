package com.example.horoscoapp.domain.model

import com.example.horoscoapp.R

sealed class HoroscopeInfo (val name:Int, val img:Int) {

    object Aries : HoroscopeInfo(R.string.aries, R.drawable.aries)
    object Taurus : HoroscopeInfo(R.string.taurus, R.drawable.tauro)
    object Gemini : HoroscopeInfo(R.string.gemini, R.drawable.geminis)
    object Cancer : HoroscopeInfo(R.string.cancer, R.drawable.cancer)
    object Leo : HoroscopeInfo(R.string.leo, R.drawable.leo)
    object Virgo : HoroscopeInfo(R.string.virgo, R.drawable.virgo)
    object Libra : HoroscopeInfo(R.string.libra, R.drawable.libra)
    object Scorpio : HoroscopeInfo(R.string.scorpio, R.drawable.escorpio)
    object Sagittarius : HoroscopeInfo(R.string.sagittarius, R.drawable.sagitario)
    object Capricorn : HoroscopeInfo(R.string.capricorn, R.drawable.capricornio)
    object Aquarius : HoroscopeInfo(R.string.aquarius, R.drawable.aquario)
    object Pisces : HoroscopeInfo(R.string.pisces, R.drawable.piscis)


}