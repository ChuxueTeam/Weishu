package com.sevensoft.weishu.ui.context

import androidx.compose.runtime.compositionLocalOf
import com.sevensoft.weishu.ui.hooks.CustomTtsState

val LocalTTSState = compositionLocalOf<CustomTtsState> { error("Not provided yet") }
