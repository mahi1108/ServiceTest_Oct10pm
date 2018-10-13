package cubex.mahesh.servicetest

import android.app.IntentService
import android.content.Intent
import android.media.MediaPlayer

class MyIntentService : IntentService("myservice")
{
    override fun onHandleIntent(p0: Intent?) {
         var mPlayer = MediaPlayer.create(
                 this@MyIntentService, R.raw.dj)
        mPlayer.start()
    }
}