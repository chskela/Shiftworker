package ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val ColorPalette = lightColors(
    primary = Primary,
    onPrimary = White,
    secondary = Secondary,
    background = Background,
    surface = Background,
    onSurface = Black,
   )

@Composable
fun ShiftWorkerTheme(
    content: @Composable () -> Unit,
) {

    MaterialTheme(
        colors = ColorPalette,
        content = content
    )
}