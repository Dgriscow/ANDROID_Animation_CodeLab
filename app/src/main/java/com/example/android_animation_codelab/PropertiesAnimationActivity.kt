package com.example.android_animation_codelab

import android.animation.ObjectAnimator
import android.animation.ValueAnimator
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.GestureDetector
import android.view.MotionEvent
import android.view.View
import android.widget.ImageView
import androidx.core.view.GestureDetectorCompat
import kotlin.math.log

class PropertiesAnimationActivity : AppCompatActivity() {

    lateinit var topCard:ImageView

    lateinit var bottomCard:ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_properties_animation)


        topCard = findViewById(R.id.swipeCard1)

        bottomCard = findViewById(R.id.swipeCard2)

        //CODE LABS REFEREBCED FOR ANIMATION WORK through the way back machine
        //https://web.archive.org/web/20230320194023/https://developer.android.com/codelabs/advanced-android-kotlin-training-property-animation#4

        //Start the animation OF THE TOP CARD ON CARD APPEAR
        val animateTopCards = ObjectAnimator.ofFloat(topCard, View.TRANSLATION_Y, 1000f)
        animateTopCards.duration = 2000


                            //Have the animation repeat INFINITELY,
        animateTopCards.repeatCount = ObjectAnimator.INFINITE
        animateTopCards.repeatMode = ValueAnimator.REVERSE //Then reverse the animation

        animateTopCards.start()

        val animateBottomCards = ObjectAnimator.ofFloat(bottomCard, View.TRANSLATION_Y, -1000f)
        animateBottomCards.duration = 2000


        animateBottomCards.repeatCount = ObjectAnimator.INFINITE
        animateBottomCards.repeatMode = ValueAnimator.REVERSE

        animateBottomCards.start()


    }


}