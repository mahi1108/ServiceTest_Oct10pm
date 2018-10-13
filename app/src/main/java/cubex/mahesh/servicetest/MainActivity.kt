package cubex.mahesh.servicetest

import android.content.Intent
import android.media.MediaPlayer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*    var mPlayer = MediaPlayer.create(this,
                    R.raw.dj)
        start.setOnClickListener {
            mPlayer.start()
        }
        stop.setOnClickListener {
            mPlayer.pause( )
        }*/

    /*    var i = Intent(this@MainActivity,MyService::class.java) */
            var i = Intent(this@MainActivity,
                                                MyIntentService::class.java)
        start.setOnClickListener {
            startService(i)
        }

        stop.setOnClickListener {
            stopService(i)
        }

    }
}
