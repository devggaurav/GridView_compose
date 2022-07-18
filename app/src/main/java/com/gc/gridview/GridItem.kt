package com.gc.gridview

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImagePainter
import coil.compose.SubcomposeAsyncImage
import coil.compose.SubcomposeAsyncImageContent


//
// Created by Code For Android on 18/07/22.
// Copyright (c) 2022 CFA. All rights reserved.
//

@Composable
fun GridItemImage(image: String) {

    SubcomposeAsyncImage(
        model = image,
        contentDescription = "image",
        modifier = Modifier.size(200.dp),
        contentScale = ContentScale.FillBounds
    ) {
        val state = painter.state
        if (state is AsyncImagePainter.State.Loading || state is AsyncImagePainter.State.Error) {
            CircularProgressIndicator(
                color = Color.Yellow,
                modifier = Modifier.padding(45.dp),
                strokeWidth = 5.dp
            )

        } else {
            SubcomposeAsyncImageContent()
        }

    }


}