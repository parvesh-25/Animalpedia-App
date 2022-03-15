package com.example.animalpedia.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Animalpedia(
    var name: String?,
    var live: String?,
    var food: String?,
    var description: String?,
    var imageHome: Int?,
    var imageDetail: Int?
): Parcelable
