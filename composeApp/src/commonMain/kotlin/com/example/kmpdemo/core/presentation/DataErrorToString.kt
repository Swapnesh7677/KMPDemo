package com.example.kmpdemo.core.presentation

import com.example.kmpdemo.core.domain.DataError
import kmpdemo.composeapp.generated.resources.Res
import kmpdemo.composeapp.generated.resources.*
import org.jetbrains.compose.resources.StringResource

fun DataError.toUiText():UiText{
    val stringres = when(this) {
        DataError.Local.UNKNOWN -> Res.string.error_unknown
        DataError.Local.EMPTY_RESPONSE -> Res.string.error_unknown
        DataError.Remote.SERVER_ERROR -> Res.string.error_unknown
        DataError.Remote.NO_INTERNET -> Res.string.error_no_internet
        DataError.Remote.REQUEST_TIMEOUT -> Res.string.error_request_timeout
        DataError.Remote.SERIALIZATION -> Res.string.error_serialization

        else -> {}
    }
    return UiText.StringResourceId(stringres as StringResource)
}

