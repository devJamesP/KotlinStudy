package com.devjamesp.countdownex

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {

    val tv_count: TextView by lazy {
        findViewById(R.id.tv_count)
    }

    val btn_start: AppCompatButton by lazy {
        findViewById(R.id.btn_start)
    }

    val btn_stop: AppCompatButton by lazy {
        findViewById(R.id.btn_stop)
    }


    @DelicateCoroutinesApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        countTask(tv_count, btn_start, btn_stop) // 1. 리소스 접근
    }

    @SuppressLint("SetTextI18n")
    @DelicateCoroutinesApi
    fun countTask(count: TextView, start: AppCompatButton, stop: AppCompatButton) {
        // 2. Dispatchers.Main -> UI 문맥에서 코루틴 실행, 3. 늦은 실행을 위한 LAZY 지정
        val job = GlobalScope.launch(Dispatchers.Main, start = CoroutineStart.LAZY) {
            for (i in 10 downTo 1) { // 카운트 다운
                count.text = "Countdown $i ..." // 4. UI 업데이트
                delay(1000)
            }
            count.text = "Done!"
        }

        start.setOnClickListener { job.start() }
        stop.setOnClickListener { job.cancel() }
    }
}
