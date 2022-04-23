package tw.edu.pu.csim.tcyang.twod

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Rect

class Bird(context: Context) {
    val res = context.resources  //讀取資源
    var BirdX:Int = res.displayMetrics.widthPixels  //讀取螢幕寬度
    var BirdY:Int = 300
    var w:Int
    var h:Int
    var image: Bitmap
    var SrcRect: Rect
    lateinit var DestRect: Rect

    init {
        image = BitmapFactory.decodeResource(res, R.drawable.bird1)
        w = image.width/8
        h = image.height/8
        BirdX -= w  //螢幕左邊飛出
        SrcRect = Rect(0, 0, image.width, image.height) //裁切
    }

    fun draw(canvas: Canvas) {
        DestRect = Rect(BirdX, BirdY, BirdX + w, BirdY + h)
        canvas.drawBitmap(image, SrcRect, DestRect, null)
    }


}