package com.example.kakaduser

import android.app.Application
import com.kakao.sdk.common.KakaoSdk

class GlobalApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        KakaoSdk.init(this, "da4611c7c1e98cfec4ecdc1bc9ff2af2")
    }
}