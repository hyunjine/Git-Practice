package com.example.myapplication

import android.util.Log
import java.text.SimpleDateFormat
import java.util.*

class SimpleDataFormatExample {

    fun generateCurrentDay() {
        // 1. 시스템 현재 시간 생성
        val currentTimeMillis = System.currentTimeMillis()

        // 2. Date 클래스 생성 - 시스템 시간 주입
        val date = Date(currentTimeMillis)
        
        // 3. 원하는 데이터 포맷 설정
        val simpleDataFormat = SimpleDateFormat("yyyy-MM-dd hh:MM:ss")

        // 4. 날짜 얻기
        val currentDay = simpleDataFormat.format(date)

        Log.d("myTag", "generateCurrentDay: $currentDay")
    }
}