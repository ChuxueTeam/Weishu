package com.sevensoft.weishu.ui.context

import androidx.compose.runtime.compositionLocalOf
import com.sevensoft.weishu.ui.hooks.CustomAsrState

val LocalASRState = compositionLocalOf<CustomAsrState> { error("Not provided yet") }

