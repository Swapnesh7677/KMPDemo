package com.example.kmpdemo.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.material3.darkColorScheme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color

import com.example.kmpdemo.theme.backgroundDark
import com.example.kmpdemo.theme.backgroundDarkHighContrast
import com.example.kmpdemo.theme.backgroundDarkMediumContrast
import com.example.kmpdemo.theme.backgroundLight
import com.example.kmpdemo.theme.backgroundLightHighContrast
import com.example.kmpdemo.theme.backgroundLightMediumContrast
import com.example.kmpdemo.theme.errorContainerDark
import com.example.kmpdemo.theme.errorContainerDarkHighContrast
import com.example.kmpdemo.theme.errorContainerDarkMediumContrast
import com.example.kmpdemo.theme.errorContainerLight
import com.example.kmpdemo.theme.errorContainerLightHighContrast
import com.example.kmpdemo.theme.errorContainerLightMediumContrast
import com.example.kmpdemo.theme.errorDark
import com.example.kmpdemo.theme.errorDarkHighContrast
import com.example.kmpdemo.theme.errorDarkMediumContrast
import com.example.kmpdemo.theme.errorLight
import com.example.kmpdemo.theme.errorLightHighContrast
import com.example.kmpdemo.theme.errorLightMediumContrast
import com.example.kmpdemo.theme.inverseOnSurfaceDark
import com.example.kmpdemo.theme.inverseOnSurfaceDarkHighContrast
import com.example.kmpdemo.theme.inverseOnSurfaceDarkMediumContrast
import com.example.kmpdemo.theme.inverseOnSurfaceLight
import com.example.kmpdemo.theme.inverseOnSurfaceLightHighContrast
import com.example.kmpdemo.theme.inverseOnSurfaceLightMediumContrast
import com.example.kmpdemo.theme.inversePrimaryDark
import com.example.kmpdemo.theme.inversePrimaryDarkHighContrast
import com.example.kmpdemo.theme.inversePrimaryDarkMediumContrast
import com.example.kmpdemo.theme.inversePrimaryLight
import com.example.kmpdemo.theme.inversePrimaryLightHighContrast
import com.example.kmpdemo.theme.inversePrimaryLightMediumContrast
import com.example.kmpdemo.theme.inverseSurfaceDark
import com.example.kmpdemo.theme.inverseSurfaceDarkHighContrast
import com.example.kmpdemo.theme.inverseSurfaceDarkMediumContrast
import com.example.kmpdemo.theme.inverseSurfaceLight
import com.example.kmpdemo.theme.inverseSurfaceLightHighContrast
import com.example.kmpdemo.theme.inverseSurfaceLightMediumContrast
import com.example.kmpdemo.theme.onBackgroundDark
import com.example.kmpdemo.theme.onBackgroundDarkHighContrast
import com.example.kmpdemo.theme.onBackgroundDarkMediumContrast
import com.example.kmpdemo.theme.onBackgroundLight
import com.example.kmpdemo.theme.onBackgroundLightHighContrast
import com.example.kmpdemo.theme.onBackgroundLightMediumContrast
import com.example.kmpdemo.theme.onErrorContainerDark
import com.example.kmpdemo.theme.onErrorContainerDarkHighContrast
import com.example.kmpdemo.theme.onErrorContainerDarkMediumContrast
import com.example.kmpdemo.theme.onErrorContainerLight
import com.example.kmpdemo.theme.onErrorContainerLightHighContrast
import com.example.kmpdemo.theme.onErrorContainerLightMediumContrast
import com.example.kmpdemo.theme.onErrorDark
import com.example.kmpdemo.theme.onErrorDarkHighContrast
import com.example.kmpdemo.theme.onErrorDarkMediumContrast
import com.example.kmpdemo.theme.onErrorLight
import com.example.kmpdemo.theme.onErrorLightHighContrast
import com.example.kmpdemo.theme.onErrorLightMediumContrast
import com.example.kmpdemo.theme.onPrimaryContainerDark
import com.example.kmpdemo.theme.onPrimaryContainerDarkHighContrast
import com.example.kmpdemo.theme.onPrimaryContainerDarkMediumContrast
import com.example.kmpdemo.theme.onPrimaryContainerLight
import com.example.kmpdemo.theme.onPrimaryContainerLightHighContrast
import com.example.kmpdemo.theme.onPrimaryContainerLightMediumContrast
import com.example.kmpdemo.theme.onPrimaryDark
import com.example.kmpdemo.theme.onPrimaryDarkHighContrast
import com.example.kmpdemo.theme.onPrimaryDarkMediumContrast
import com.example.kmpdemo.theme.onPrimaryLight
import com.example.kmpdemo.theme.onPrimaryLightHighContrast
import com.example.kmpdemo.theme.onPrimaryLightMediumContrast
import com.example.kmpdemo.theme.onSecondaryContainerDark
import com.example.kmpdemo.theme.onSecondaryContainerDarkHighContrast
import com.example.kmpdemo.theme.onSecondaryContainerDarkMediumContrast
import com.example.kmpdemo.theme.onSecondaryContainerLight
import com.example.kmpdemo.theme.onSecondaryContainerLightHighContrast
import com.example.kmpdemo.theme.onSecondaryContainerLightMediumContrast
import com.example.kmpdemo.theme.onSecondaryDark
import com.example.kmpdemo.theme.onSecondaryDarkHighContrast
import com.example.kmpdemo.theme.onSecondaryDarkMediumContrast
import com.example.kmpdemo.theme.onSecondaryLight
import com.example.kmpdemo.theme.onSecondaryLightHighContrast
import com.example.kmpdemo.theme.onSecondaryLightMediumContrast
import com.example.kmpdemo.theme.onSurfaceDark
import com.example.kmpdemo.theme.onSurfaceDarkHighContrast
import com.example.kmpdemo.theme.onSurfaceDarkMediumContrast
import com.example.kmpdemo.theme.onSurfaceLight
import com.example.kmpdemo.theme.onSurfaceLightHighContrast
import com.example.kmpdemo.theme.onSurfaceLightMediumContrast
import com.example.kmpdemo.theme.onSurfaceVariantDark
import com.example.kmpdemo.theme.onSurfaceVariantDarkHighContrast
import com.example.kmpdemo.theme.onSurfaceVariantDarkMediumContrast
import com.example.kmpdemo.theme.onSurfaceVariantLight
import com.example.kmpdemo.theme.onSurfaceVariantLightHighContrast
import com.example.kmpdemo.theme.onSurfaceVariantLightMediumContrast
import com.example.kmpdemo.theme.onTertiaryContainerDark
import com.example.kmpdemo.theme.onTertiaryContainerDarkHighContrast
import com.example.kmpdemo.theme.onTertiaryContainerDarkMediumContrast
import com.example.kmpdemo.theme.onTertiaryContainerLight
import com.example.kmpdemo.theme.onTertiaryContainerLightHighContrast
import com.example.kmpdemo.theme.onTertiaryContainerLightMediumContrast
import com.example.kmpdemo.theme.onTertiaryDark
import com.example.kmpdemo.theme.onTertiaryDarkHighContrast
import com.example.kmpdemo.theme.onTertiaryDarkMediumContrast
import com.example.kmpdemo.theme.onTertiaryLight
import com.example.kmpdemo.theme.onTertiaryLightHighContrast
import com.example.kmpdemo.theme.onTertiaryLightMediumContrast
import com.example.kmpdemo.theme.outlineDark
import com.example.kmpdemo.theme.outlineDarkHighContrast
import com.example.kmpdemo.theme.outlineDarkMediumContrast
import com.example.kmpdemo.theme.outlineLight
import com.example.kmpdemo.theme.outlineLightHighContrast
import com.example.kmpdemo.theme.outlineLightMediumContrast
import com.example.kmpdemo.theme.outlineVariantDark
import com.example.kmpdemo.theme.outlineVariantDarkHighContrast
import com.example.kmpdemo.theme.outlineVariantDarkMediumContrast
import com.example.kmpdemo.theme.outlineVariantLight
import com.example.kmpdemo.theme.outlineVariantLightHighContrast
import com.example.kmpdemo.theme.outlineVariantLightMediumContrast
import com.example.kmpdemo.theme.primaryContainerDark
import com.example.kmpdemo.theme.primaryContainerDarkHighContrast
import com.example.kmpdemo.theme.primaryContainerDarkMediumContrast
import com.example.kmpdemo.theme.primaryContainerLight
import com.example.kmpdemo.theme.primaryContainerLightHighContrast
import com.example.kmpdemo.theme.primaryContainerLightMediumContrast
import com.example.kmpdemo.theme.primaryDark
import com.example.kmpdemo.theme.primaryDarkHighContrast
import com.example.kmpdemo.theme.primaryDarkMediumContrast
import com.example.kmpdemo.theme.primaryLight
import com.example.kmpdemo.theme.primaryLightHighContrast
import com.example.kmpdemo.theme.primaryLightMediumContrast
import com.example.kmpdemo.theme.scrimDark
import com.example.kmpdemo.theme.scrimDarkHighContrast
import com.example.kmpdemo.theme.scrimDarkMediumContrast
import com.example.kmpdemo.theme.scrimLight
import com.example.kmpdemo.theme.scrimLightHighContrast
import com.example.kmpdemo.theme.scrimLightMediumContrast
import com.example.kmpdemo.theme.secondaryContainerDark
import com.example.kmpdemo.theme.secondaryContainerDarkHighContrast
import com.example.kmpdemo.theme.secondaryContainerDarkMediumContrast
import com.example.kmpdemo.theme.secondaryContainerLight
import com.example.kmpdemo.theme.secondaryContainerLightHighContrast
import com.example.kmpdemo.theme.secondaryContainerLightMediumContrast
import com.example.kmpdemo.theme.secondaryDark
import com.example.kmpdemo.theme.secondaryDarkHighContrast
import com.example.kmpdemo.theme.secondaryDarkMediumContrast
import com.example.kmpdemo.theme.secondaryLight
import com.example.kmpdemo.theme.secondaryLightHighContrast
import com.example.kmpdemo.theme.secondaryLightMediumContrast
import com.example.kmpdemo.theme.surfaceBrightDark
import com.example.kmpdemo.theme.surfaceBrightDarkHighContrast
import com.example.kmpdemo.theme.surfaceBrightDarkMediumContrast
import com.example.kmpdemo.theme.surfaceBrightLight
import com.example.kmpdemo.theme.surfaceBrightLightHighContrast
import com.example.kmpdemo.theme.surfaceBrightLightMediumContrast
import com.example.kmpdemo.theme.surfaceContainerDark
import com.example.kmpdemo.theme.surfaceContainerDarkHighContrast
import com.example.kmpdemo.theme.surfaceContainerDarkMediumContrast
import com.example.kmpdemo.theme.surfaceContainerHighDark
import com.example.kmpdemo.theme.surfaceContainerHighDarkHighContrast
import com.example.kmpdemo.theme.surfaceContainerHighDarkMediumContrast
import com.example.kmpdemo.theme.surfaceContainerHighLight
import com.example.kmpdemo.theme.surfaceContainerHighLightHighContrast
import com.example.kmpdemo.theme.surfaceContainerHighLightMediumContrast
import com.example.kmpdemo.theme.surfaceContainerHighestDark
import com.example.kmpdemo.theme.surfaceContainerHighestDarkHighContrast
import com.example.kmpdemo.theme.surfaceContainerHighestDarkMediumContrast
import com.example.kmpdemo.theme.surfaceContainerHighestLight
import com.example.kmpdemo.theme.surfaceContainerHighestLightHighContrast
import com.example.kmpdemo.theme.surfaceContainerHighestLightMediumContrast
import com.example.kmpdemo.theme.surfaceContainerLight
import com.example.kmpdemo.theme.surfaceContainerLightHighContrast
import com.example.kmpdemo.theme.surfaceContainerLightMediumContrast
import com.example.kmpdemo.theme.surfaceContainerLowDark
import com.example.kmpdemo.theme.surfaceContainerLowDarkHighContrast
import com.example.kmpdemo.theme.surfaceContainerLowDarkMediumContrast
import com.example.kmpdemo.theme.surfaceContainerLowLight
import com.example.kmpdemo.theme.surfaceContainerLowLightHighContrast
import com.example.kmpdemo.theme.surfaceContainerLowLightMediumContrast
import com.example.kmpdemo.theme.surfaceContainerLowestDark
import com.example.kmpdemo.theme.surfaceContainerLowestDarkHighContrast
import com.example.kmpdemo.theme.surfaceContainerLowestDarkMediumContrast
import com.example.kmpdemo.theme.surfaceContainerLowestLight
import com.example.kmpdemo.theme.surfaceContainerLowestLightHighContrast
import com.example.kmpdemo.theme.surfaceContainerLowestLightMediumContrast
import com.example.kmpdemo.theme.surfaceDark
import com.example.kmpdemo.theme.surfaceDarkHighContrast
import com.example.kmpdemo.theme.surfaceDarkMediumContrast
import com.example.kmpdemo.theme.surfaceDimDark
import com.example.kmpdemo.theme.surfaceDimDarkHighContrast
import com.example.kmpdemo.theme.surfaceDimDarkMediumContrast
import com.example.kmpdemo.theme.surfaceDimLight
import com.example.kmpdemo.theme.surfaceDimLightHighContrast
import com.example.kmpdemo.theme.surfaceDimLightMediumContrast
import com.example.kmpdemo.theme.surfaceLight
import com.example.kmpdemo.theme.surfaceLightHighContrast
import com.example.kmpdemo.theme.surfaceLightMediumContrast
import com.example.kmpdemo.theme.surfaceVariantDark
import com.example.kmpdemo.theme.surfaceVariantDarkHighContrast
import com.example.kmpdemo.theme.surfaceVariantDarkMediumContrast
import com.example.kmpdemo.theme.surfaceVariantLight
import com.example.kmpdemo.theme.surfaceVariantLightHighContrast
import com.example.kmpdemo.theme.surfaceVariantLightMediumContrast
import com.example.kmpdemo.theme.tertiaryContainerDark
import com.example.kmpdemo.theme.tertiaryContainerDarkHighContrast
import com.example.kmpdemo.theme.tertiaryContainerDarkMediumContrast
import com.example.kmpdemo.theme.tertiaryContainerLight
import com.example.kmpdemo.theme.tertiaryContainerLightHighContrast
import com.example.kmpdemo.theme.tertiaryContainerLightMediumContrast
import com.example.kmpdemo.theme.tertiaryDark
import com.example.kmpdemo.theme.tertiaryDarkHighContrast
import com.example.kmpdemo.theme.tertiaryDarkMediumContrast
import com.example.kmpdemo.theme.tertiaryLight
import com.example.kmpdemo.theme.tertiaryLightHighContrast
import com.example.kmpdemo.theme.tertiaryLightMediumContrast

private val lightScheme = lightColorScheme(
    primary = primaryLight,
    onPrimary = onPrimaryLight,
    primaryContainer = primaryContainerLight,
    onPrimaryContainer = onPrimaryContainerLight,
    secondary = secondaryLight,
    onSecondary = onSecondaryLight,
    secondaryContainer = secondaryContainerLight,
    onSecondaryContainer = onSecondaryContainerLight,
    tertiary = tertiaryLight,
    onTertiary = onTertiaryLight,
    tertiaryContainer = tertiaryContainerLight,
    onTertiaryContainer = onTertiaryContainerLight,
    error = errorLight,
    onError = onErrorLight,
    errorContainer = errorContainerLight,
    onErrorContainer = onErrorContainerLight,
    background = backgroundLight,
    onBackground = onBackgroundLight,
    surface = surfaceLight,
    onSurface = onSurfaceLight,
    surfaceVariant = surfaceVariantLight,
    onSurfaceVariant = onSurfaceVariantLight,
    outline = outlineLight,
    outlineVariant = outlineVariantLight,
    scrim = scrimLight,
    inverseSurface = inverseSurfaceLight,
    inverseOnSurface = inverseOnSurfaceLight,
    inversePrimary = inversePrimaryLight,
    surfaceDim = surfaceDimLight,
    surfaceBright = surfaceBrightLight,
    surfaceContainerLowest = surfaceContainerLowestLight,
    surfaceContainerLow = surfaceContainerLowLight,
    surfaceContainer = surfaceContainerLight,
    surfaceContainerHigh = surfaceContainerHighLight,
    surfaceContainerHighest = surfaceContainerHighestLight,
)

private val darkScheme = darkColorScheme(
    primary = primaryDark,
    onPrimary = onPrimaryDark,
    primaryContainer = primaryContainerDark,
    onPrimaryContainer = onPrimaryContainerDark,
    secondary = secondaryDark,
    onSecondary = onSecondaryDark,
    secondaryContainer = secondaryContainerDark,
    onSecondaryContainer = onSecondaryContainerDark,
    tertiary = tertiaryDark,
    onTertiary = onTertiaryDark,
    tertiaryContainer = tertiaryContainerDark,
    onTertiaryContainer = onTertiaryContainerDark,
    error = errorDark,
    onError = onErrorDark,
    errorContainer = errorContainerDark,
    onErrorContainer = onErrorContainerDark,
    background = backgroundDark,
    onBackground = onBackgroundDark,
    surface = surfaceDark,
    onSurface = onSurfaceDark,
    surfaceVariant = surfaceVariantDark,
    onSurfaceVariant = onSurfaceVariantDark,
    outline = outlineDark,
    outlineVariant = outlineVariantDark,
    scrim = scrimDark,
    inverseSurface = inverseSurfaceDark,
    inverseOnSurface = inverseOnSurfaceDark,
    inversePrimary = inversePrimaryDark,
    surfaceDim = surfaceDimDark,
    surfaceBright = surfaceBrightDark,
    surfaceContainerLowest = surfaceContainerLowestDark,
    surfaceContainerLow = surfaceContainerLowDark,
    surfaceContainer = surfaceContainerDark,
    surfaceContainerHigh = surfaceContainerHighDark,
    surfaceContainerHighest = surfaceContainerHighestDark,
)

private val mediumContrastLightColorScheme = lightColorScheme(
    primary = primaryLightMediumContrast,
    onPrimary = onPrimaryLightMediumContrast,
    primaryContainer = primaryContainerLightMediumContrast,
    onPrimaryContainer = onPrimaryContainerLightMediumContrast,
    secondary = secondaryLightMediumContrast,
    onSecondary = onSecondaryLightMediumContrast,
    secondaryContainer = secondaryContainerLightMediumContrast,
    onSecondaryContainer = onSecondaryContainerLightMediumContrast,
    tertiary = tertiaryLightMediumContrast,
    onTertiary = onTertiaryLightMediumContrast,
    tertiaryContainer = tertiaryContainerLightMediumContrast,
    onTertiaryContainer = onTertiaryContainerLightMediumContrast,
    error = errorLightMediumContrast,
    onError = onErrorLightMediumContrast,
    errorContainer = errorContainerLightMediumContrast,
    onErrorContainer = onErrorContainerLightMediumContrast,
    background = backgroundLightMediumContrast,
    onBackground = onBackgroundLightMediumContrast,
    surface = surfaceLightMediumContrast,
    onSurface = onSurfaceLightMediumContrast,
    surfaceVariant = surfaceVariantLightMediumContrast,
    onSurfaceVariant = onSurfaceVariantLightMediumContrast,
    outline = outlineLightMediumContrast,
    outlineVariant = outlineVariantLightMediumContrast,
    scrim = scrimLightMediumContrast,
    inverseSurface = inverseSurfaceLightMediumContrast,
    inverseOnSurface = inverseOnSurfaceLightMediumContrast,
    inversePrimary = inversePrimaryLightMediumContrast,
    surfaceDim = surfaceDimLightMediumContrast,
    surfaceBright = surfaceBrightLightMediumContrast,
    surfaceContainerLowest = surfaceContainerLowestLightMediumContrast,
    surfaceContainerLow = surfaceContainerLowLightMediumContrast,
    surfaceContainer = surfaceContainerLightMediumContrast,
    surfaceContainerHigh = surfaceContainerHighLightMediumContrast,
    surfaceContainerHighest = surfaceContainerHighestLightMediumContrast,
)

private val highContrastLightColorScheme = lightColorScheme(
    primary = primaryLightHighContrast,
    onPrimary = onPrimaryLightHighContrast,
    primaryContainer = primaryContainerLightHighContrast,
    onPrimaryContainer = onPrimaryContainerLightHighContrast,
    secondary = secondaryLightHighContrast,
    onSecondary = onSecondaryLightHighContrast,
    secondaryContainer = secondaryContainerLightHighContrast,
    onSecondaryContainer = onSecondaryContainerLightHighContrast,
    tertiary = tertiaryLightHighContrast,
    onTertiary = onTertiaryLightHighContrast,
    tertiaryContainer = tertiaryContainerLightHighContrast,
    onTertiaryContainer = onTertiaryContainerLightHighContrast,
    error = errorLightHighContrast,
    onError = onErrorLightHighContrast,
    errorContainer = errorContainerLightHighContrast,
    onErrorContainer = onErrorContainerLightHighContrast,
    background = backgroundLightHighContrast,
    onBackground = onBackgroundLightHighContrast,
    surface = surfaceLightHighContrast,
    onSurface = onSurfaceLightHighContrast,
    surfaceVariant = surfaceVariantLightHighContrast,
    onSurfaceVariant = onSurfaceVariantLightHighContrast,
    outline = outlineLightHighContrast,
    outlineVariant = outlineVariantLightHighContrast,
    scrim = scrimLightHighContrast,
    inverseSurface = inverseSurfaceLightHighContrast,
    inverseOnSurface = inverseOnSurfaceLightHighContrast,
    inversePrimary = inversePrimaryLightHighContrast,
    surfaceDim = surfaceDimLightHighContrast,
    surfaceBright = surfaceBrightLightHighContrast,
    surfaceContainerLowest = surfaceContainerLowestLightHighContrast,
    surfaceContainerLow = surfaceContainerLowLightHighContrast,
    surfaceContainer = surfaceContainerLightHighContrast,
    surfaceContainerHigh = surfaceContainerHighLightHighContrast,
    surfaceContainerHighest = surfaceContainerHighestLightHighContrast,
)

private val mediumContrastDarkColorScheme = darkColorScheme(
    primary = primaryDarkMediumContrast,
    onPrimary = onPrimaryDarkMediumContrast,
    primaryContainer = primaryContainerDarkMediumContrast,
    onPrimaryContainer = onPrimaryContainerDarkMediumContrast,
    secondary = secondaryDarkMediumContrast,
    onSecondary = onSecondaryDarkMediumContrast,
    secondaryContainer = secondaryContainerDarkMediumContrast,
    onSecondaryContainer = onSecondaryContainerDarkMediumContrast,
    tertiary = tertiaryDarkMediumContrast,
    onTertiary = onTertiaryDarkMediumContrast,
    tertiaryContainer = tertiaryContainerDarkMediumContrast,
    onTertiaryContainer = onTertiaryContainerDarkMediumContrast,
    error = errorDarkMediumContrast,
    onError = onErrorDarkMediumContrast,
    errorContainer = errorContainerDarkMediumContrast,
    onErrorContainer = onErrorContainerDarkMediumContrast,
    background = backgroundDarkMediumContrast,
    onBackground = onBackgroundDarkMediumContrast,
    surface = surfaceDarkMediumContrast,
    onSurface = onSurfaceDarkMediumContrast,
    surfaceVariant = surfaceVariantDarkMediumContrast,
    onSurfaceVariant = onSurfaceVariantDarkMediumContrast,
    outline = outlineDarkMediumContrast,
    outlineVariant = outlineVariantDarkMediumContrast,
    scrim = scrimDarkMediumContrast,
    inverseSurface = inverseSurfaceDarkMediumContrast,
    inverseOnSurface = inverseOnSurfaceDarkMediumContrast,
    inversePrimary = inversePrimaryDarkMediumContrast,
    surfaceDim = surfaceDimDarkMediumContrast,
    surfaceBright = surfaceBrightDarkMediumContrast,
    surfaceContainerLowest = surfaceContainerLowestDarkMediumContrast,
    surfaceContainerLow = surfaceContainerLowDarkMediumContrast,
    surfaceContainer = surfaceContainerDarkMediumContrast,
    surfaceContainerHigh = surfaceContainerHighDarkMediumContrast,
    surfaceContainerHighest = surfaceContainerHighestDarkMediumContrast,
)

private val highContrastDarkColorScheme = darkColorScheme(
    primary = primaryDarkHighContrast,
    onPrimary = onPrimaryDarkHighContrast,
    primaryContainer = primaryContainerDarkHighContrast,
    onPrimaryContainer = onPrimaryContainerDarkHighContrast,
    secondary = secondaryDarkHighContrast,
    onSecondary = onSecondaryDarkHighContrast,
    secondaryContainer = secondaryContainerDarkHighContrast,
    onSecondaryContainer = onSecondaryContainerDarkHighContrast,
    tertiary = tertiaryDarkHighContrast,
    onTertiary = onTertiaryDarkHighContrast,
    tertiaryContainer = tertiaryContainerDarkHighContrast,
    onTertiaryContainer = onTertiaryContainerDarkHighContrast,
    error = errorDarkHighContrast,
    onError = onErrorDarkHighContrast,
    errorContainer = errorContainerDarkHighContrast,
    onErrorContainer = onErrorContainerDarkHighContrast,
    background = backgroundDarkHighContrast,
    onBackground = onBackgroundDarkHighContrast,
    surface = surfaceDarkHighContrast,
    onSurface = onSurfaceDarkHighContrast,
    surfaceVariant = surfaceVariantDarkHighContrast,
    onSurfaceVariant = onSurfaceVariantDarkHighContrast,
    outline = outlineDarkHighContrast,
    outlineVariant = outlineVariantDarkHighContrast,
    scrim = scrimDarkHighContrast,
    inverseSurface = inverseSurfaceDarkHighContrast,
    inverseOnSurface = inverseOnSurfaceDarkHighContrast,
    inversePrimary = inversePrimaryDarkHighContrast,
    surfaceDim = surfaceDimDarkHighContrast,
    surfaceBright = surfaceBrightDarkHighContrast,
    surfaceContainerLowest = surfaceContainerLowestDarkHighContrast,
    surfaceContainerLow = surfaceContainerLowDarkHighContrast,
    surfaceContainer = surfaceContainerDarkHighContrast,
    surfaceContainerHigh = surfaceContainerHighDarkHighContrast,
    surfaceContainerHighest = surfaceContainerHighestDarkHighContrast,
)

@Immutable
data class ColorFamily(
    val color: Color,
    val onColor: Color,
    val colorContainer: Color,
    val onColorContainer: Color
)

val unspecified_scheme = ColorFamily(
    Color.Unspecified, Color.Unspecified, Color.Unspecified, Color.Unspecified
)

@Composable
fun AppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable() () -> Unit
) {
  val colorScheme = if (darkTheme) {
          darkScheme
  }else{
      lightScheme
  }

  MaterialTheme(
    colorScheme = colorScheme,
    typography = AppTypography,
    content = content
  )
}

