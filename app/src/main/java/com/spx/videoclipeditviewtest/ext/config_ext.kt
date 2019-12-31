package com.spx.videoclipeditviewtest.ext

import android.content.Context
import com.spx.egl.GLImageComplexionBeautyFilter
import com.daasuu.epf.custfilter.*
import com.daasuu.epf.filter.GlFilter
import com.spx.videoclipeditviewtest.R
import com.spx.videoclipeditviewtest.view.BottomDialogFragment

fun createFilterOptions(): List<BottomDialogFragment.Option> {
    return arrayListOf(
            BottomDialogFragment.Option(R.drawable.ic_beauty_no, "No"),
            BottomDialogFragment.Option(R.drawable.ic_beauty_white, "Beauty"),
            BottomDialogFragment.Option(R.drawable.ic_beauty_white, "Whitening"),
            BottomDialogFragment.Option(R.drawable.ic_filter_langman, "romantic"),
            BottomDialogFragment.Option(R.drawable.ic_filter_qinxin, "Fresh"),
            BottomDialogFragment.Option(R.drawable.ic_filter_weimei, "Beautiful"),
            BottomDialogFragment.Option(R.drawable.ic_filter_fennen, "Pink"),
            BottomDialogFragment.Option(R.drawable.ic_filter_huaijiu, "Nostalgia"),
            BottomDialogFragment.Option(R.drawable.ic_filter_landiao, "Blues"),
            BottomDialogFragment.Option(R.drawable.ic_filter_qingliang, "Cool"),
            BottomDialogFragment.Option(R.drawable.ic_filter_rixi, "Japanese")
    )
}

fun getFilterByName(name: String, context: Context): GlFilter {
    return when {
        name.equals("No") -> GlFilter()
        name.equals("Beauty") -> GLImageComplexionBeautyFilter(context)
        else -> GlPngFliter(context, getFilterPngByType(name))
    }
}

fun getFilterPngByType(type: String): String {
    return when (type) {
        "Whitening" -> "filter_white"
        "romantic" -> "filter_langman"
        "Fresh" -> "filter_qingxin"
        "Beautiful" -> "filter_weimei"
        "Pink" -> "filter_fennen"
        "Nostalgia" -> "filter_huaijiu"
        "Blues" -> "filter_landiao"
        "Cool" -> "filter_qingliang"
        "Japanese" -> "filter_rixi"
        else -> "filter_white"
    }
}

//-------------------------------------    #####特效 #######-----------------------
fun createEffectOptions(): List<BottomDialogFragment.Option> {
    return arrayListOf(
            BottomDialogFragment.Option(R.drawable.ic_beauty_no, "No special effects"),
            BottomDialogFragment.Option(R.drawable.ic_filter_langman, "Soul out"),
            BottomDialogFragment.Option(R.drawable.ic_filter_rixi, "Hallucinations"),
            BottomDialogFragment.Option(R.drawable.ic_filter_qingliang, "lightning"),
            BottomDialogFragment.Option(R.drawable.ic_filter_langman, "glitch"),
            BottomDialogFragment.Option(R.drawable.ic_filter_langman, "Zoom"),
            BottomDialogFragment.Option(R.drawable.ic_filter_langman, "Shake"),
            BottomDialogFragment.Option(R.drawable.ic_filter_langman, "Quarter mirror")
//            BottomDialogFragment.Option(R.drawable.ic_beauty_white, "动感光波"),
//            BottomDialogFragment.Option(R.drawable.ic_beauty_white, "暗黑幻境"),
//            BottomDialogFragment.Option(R.drawable.ic_filter_qinxin, "画面分裂"),
//            BottomDialogFragment.Option(R.drawable.ic_filter_weimei, "百叶窗"),
//            BottomDialogFragment.Option(R.drawable.ic_filter_fennen, "鬼影"),
//            BottomDialogFragment.Option(R.drawable.ic_filter_huaijiu, "幻影"),
//            BottomDialogFragment.Option(R.drawable.ic_filter_landiao, "幽灵"),
//            BottomDialogFragment.Option(R.drawable.ic_filter_rixi, "镜像")

    )
}

fun getEffectFilterByName(name: String, context: Context): GlFilter {
    return when {
        name.equals("No special effects") -> GlFilter()
        name.equals("Zoom") -> GlScaleFilter(context)
        name.equals("Shake") -> GlShakeFilter(context)
        name.equals("Quarter mirror") -> Gl4SplitFilter(context)
        name.equals("Soul out") -> GlSoulOutFilter(context)
        name.equals("Hallucinations") -> GlHuanJueFliter(context)
        name.equals("lightning") -> GlFlashFliter(context)
        name.equals("glitch") -> GlItchFilter(context)
        else -> {
            GLImageComplexionBeautyFilter(context)
        }
    }
}