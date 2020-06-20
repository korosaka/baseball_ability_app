package com.websarva.wings.android.abiityofbaseball

import android.os.Bundle
import android.util.DisplayMetrics
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdSize
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds

abstract class BaseBannerActivity : AppCompatActivity() {

    private lateinit var adView: AdView
    private lateinit var adViewContainer: FrameLayout
    companion object {
        const val AD_UNIT_ID: String = "ca-app-pub-3940256099942544/6300978111"
    }

    protected fun setAdViewContainer(container: FrameLayout) {
        adViewContainer = container
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        indicateAd()
    }

    private fun indicateAd() {
        MobileAds.initialize(this)
        adView = AdView(this)
        adViewContainer.addView(adView)
        loadBanner()
    }


    /**
     * reference
     * https://developers.google.com/admob/android/banner/adaptive
     */
    private val adSize: AdSize
        get() {
            val display = windowManager.defaultDisplay
            val outMetrics = DisplayMetrics()
            display.getMetrics(outMetrics)

            val density = outMetrics.density

            var adWidthPixels = adViewContainer.width.toFloat()
            if (adWidthPixels == 0f) {
                adWidthPixels = outMetrics.widthPixels.toFloat()
            }

            val adWidth = (adWidthPixels / density).toInt()
            return AdSize.getCurrentOrientationAnchoredAdaptiveBannerAdSize(this, adWidth)
        }

    private fun loadBanner() {
        adView.adUnitId = AD_UNIT_ID
        adView.adSize = adSize

        val adRequest = AdRequest.Builder().build()
        adView.loadAd(adRequest)
    }

}