package com.spx.videoclipeditviewtest

class Config{
    companion object {
        const val SPEED_RANGE = 30

        val DEFAULT_TEMP_VIDEO_LOCATION = "/storage/emulated/0/movies/${System.currentTimeMillis()}.mp4"

        var MSG_UPDATE = 1
        val USE_EXOPLAYER = false

        // For long videos, take a thumbnail every 3s
        val MAX_FRAME_INTERVAL_MS = 3 * 1000

        //Display 10 thumbnails by default
        val DEFAULT_FRAME_COUNT = 10

        //Minimum crop time is 3s
        val minSelection = 3000 // 最短3s

        // The maximum cutting time is 5min
        val maxSelection: Long = 5 * 60000 // up to 5 min
    }
}