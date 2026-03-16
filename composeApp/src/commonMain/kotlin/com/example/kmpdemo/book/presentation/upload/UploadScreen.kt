package com.example.kmpdemo.book.presentation.upload

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.unit.dp
import androidx.activity.compose.rememberLauncherForActivityResult

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun UploadScreen(
    onBackClick: () -> Unit,
    onSeeListClick: () -> Unit
) {
    var selectedImage by remember { mutableStateOf<ImageBitmap?>(null) }
    val launcher =
        rememberLauncherForActivityResult(ActivityResultContracts.PickVisualMedia()) { uri ->
            //When the user has selected a photo, its URI is returned here
            photoUri = uri


        }


    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Upload Image") },
                navigationIcon = {
                    IconButton(onClick = onBackClick) {
                        Icon(Icons.Default.ArrowBack, contentDescription = "Back")
                    }
                }
            )
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            if (selectedImage != null) {
                Image(
                    bitmap = selectedImage!!,
                    contentDescription = "Selected Image",
                    modifier = Modifier.size(200.dp).padding(bottom = 16.dp)
                )
            } else {
                Text("No image selected", modifier = Modifier.padding(bottom = 16.dp))
            }

            Button(
                onClick = {
                    launcher.launch(
                        PickVisualMediaRequest(
                            //Here we request only photos. Change this to .ImageAndVideo if you want videos too.
                            //Or use .VideoOnly if you only want videos.
                            mediaType = ActivityResultContracts.PickVisualMedia.ImageOnly
                        )
                    )
                     },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Upload Image")
            }

            Spacer(modifier = Modifier.height(16.dp))

            Button(
                onClick = onSeeListClick,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("See List of Images")
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ImageListScreen(
    onBackClick: () -> Unit
) {
    // Mock list of images
    val images = remember { listOf("Image 1", "Image 2", "Image 3") }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Image List") },
                navigationIcon = {
                    IconButton(onClick = onBackClick) {
                        Icon(Icons.Default.ArrowBack, contentDescription = "Back")
                    }
                }
            )
        }
    ) { padding ->
        LazyColumn(
            modifier = Modifier.fillMaxSize().padding(padding)
        ) {
            items(images) { image ->
                ListItem(
                    headlineContent = { Text(image) }
                )
            }
        }
    }
}
