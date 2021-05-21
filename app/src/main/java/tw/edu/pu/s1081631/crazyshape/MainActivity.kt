package tw.edu.pu.s1081631.crazyshape

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import com.bumptech.glide.annotation.GlideModule
import com.bumptech.glide.module.AppGlideModule
import kotlinx.android.synthetic.main.activity_game.*
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

@GlideModule
public final class MyAppGlideModule : AppGlideModule()



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        Toast.makeText(this, "作者： (吳曜宇)", Toast.LENGTH_SHORT).show()

        imagNext.setOnLongClickListener{
            var it = Intent(this, GameActivity::class.java);
            startActivity(it)
            true
        }


        val img: ImageView = findViewById(R.id.imgTitle)
        GlideApp.with(this)
            .load(R.drawable.cover)
            .override(800, 600)
            .into(img)

    }



}