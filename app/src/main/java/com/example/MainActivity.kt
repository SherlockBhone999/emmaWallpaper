package com.example

import android.graphics.Color as AndroidColor
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import com.example.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    enableEdgeToEdge(
      statusBarStyle = SystemBarStyle.dark(AndroidColor.TRANSPARENT),
      navigationBarStyle = SystemBarStyle.dark(AndroidColor.TRANSPARENT),
    )
    setContent {
      MyApplicationTheme(darkTheme = true, dynamicColor = false) {
        FullScreenWallpaper()
      }
    }
  }
}

@Composable
fun FullScreenWallpaper() {
  Box(modifier = Modifier.fillMaxSize().background(Color.Black)) {
    Image(
      painter = painterResource(id = R.drawable.emma_wallpaper),
      contentDescription = stringResource(R.string.wallpaper_description),
      contentScale = ContentScale.Crop,
      modifier = Modifier.fillMaxSize().testTag("wallpaper_image"),
    )
  }
}
