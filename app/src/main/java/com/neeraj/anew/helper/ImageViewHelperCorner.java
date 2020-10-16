package com.neeraj.anew.helper;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;

import androidx.annotation.RequiresApi;

public class ImageViewHelperCorner {

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public static Bitmap imageFromDrawable(Context context, int drawable){
        Bitmap bitmap=((BitmapDrawable)context.getDrawable(drawable)).getBitmap();
        return roundBitmap(bitmap);
    }

    private static Bitmap roundBitmap(Bitmap bitmap) {
        Bitmap  roundBitmap=Bitmap.createBitmap(bitmap.getWidth(),bitmap.getHeight(),bitmap.getConfig());
        Canvas canvas=new Canvas(roundBitmap);
        Paint paint=new Paint();
        paint.setAntiAlias(true);
        paint.setShader(new BitmapShader(bitmap, Shader.TileMode.CLAMP,Shader.TileMode.CLAMP));
        RectF rectF=new RectF(0,0,bitmap.getWidth(),bitmap.getHeight());
        canvas.drawRoundRect(rectF,50,50,paint);
        return  roundBitmap;
    }
}
