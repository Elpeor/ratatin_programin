package com.example.achowa.ui.theme.screens

import android.app.Activity
import androidx.activity.compose.LocalActivity
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass
import androidx.compose.runtime.Composable
import com.example.achowa.ui.theme.screens.compact.HomeScreenCompact
import com.example.achowa.ui.theme.screens.expanded.HomeScreenExpanded
import com.example.achowa.ui.theme.screens.medium.HomeScreenMedium


@OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
@Composable
fun MainScreen() {
    val activity = LocalActivity.current as Activity
    val windowSizeClass = calculateWindowSizeClass(activity)

    when(windowSizeClass.widthSizeClass) {
        WindowWidthSizeClass.Compact -> HomeScreenCompact()
        WindowWidthSizeClass.Medium -> HomeScreenMedium()
        WindowWidthSizeClass.Expanded -> HomeScreenExpanded()
        else -> HomeScreenCompact()

    }
}