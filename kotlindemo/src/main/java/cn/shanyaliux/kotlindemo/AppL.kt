package cn.shanyaliux.kotlindemo

import android.app.Application

class AppL :Application() {
    var app :Application?=null
    override fun onCreate() {
        super.onCreate()
        app = this
        initApp(this)
    }

    companion object {
        private lateinit var app: Application

        @JvmStatic
        fun initApp(app: Application) {
            Companion.app = app
        }

        @JvmStatic
        fun getInstance(): Application {
            return app
        }
    }
}