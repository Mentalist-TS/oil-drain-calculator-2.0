package com.example.oildrain.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorScheme = darkColorScheme(
    primary = Color(0xFF4CAF50),
    primaryContainer = Color(0xFF1B5E20)
)

private val LightColorScheme = lightColorScheme(
    primary = Color(0xFF2E7D32),
    primaryContainer = Color(0xFFE8F5E9)
)

@Composable
fun OilDrainTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme,
        typography = Typography(),
        content = content
    )
}
