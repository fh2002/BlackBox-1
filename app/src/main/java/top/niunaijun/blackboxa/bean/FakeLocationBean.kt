package top.niunaijun.blackboxa.bean

import android.graphics.drawable.Drawable
import top.niunaijun.blackbox.entity.BLocation

data class FakeLocationBean(
    val userID: Int,
    val name: String,
    val icon: Drawable,
    val packageName: String,
    val isInstall: Boolean,
    var fakeLocationPattern: Int,
    var fakeLocation: BLocation
)

data class FakeLocationBeanInstallBean(val userID: Int, val success: Boolean, val msg: String)