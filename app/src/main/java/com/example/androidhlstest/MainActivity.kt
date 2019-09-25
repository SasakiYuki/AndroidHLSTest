package com.example.androidhlstest

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.videoView

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    videoView.setVideoPath(VIDEO_URL)
    videoView.start()
  }

  companion object {
    const val VIDEO_URL = "http://devimages.apple.com/iphone/samples/bipbop/gear1/prog_index.m3u8"
  }
}
