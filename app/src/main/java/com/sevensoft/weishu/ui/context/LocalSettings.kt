package com.sevensoft.weishu.ui.context

import androidx.compose.runtime.staticCompositionLocalOf
import com.sevensoft.weishu.data.datastore.Settings

val LocalSettings = staticCompositionLocalOf<Settings> {
    error("No SettingsStore provided")
}
