package ie.wit.freshbean.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class BeanModel(
    var id: Long = 0,
    val orderType02: String = "N/A",
    val amount: Int = 0) : Parcelable

