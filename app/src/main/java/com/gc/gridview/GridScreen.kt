package com.gc.gridview

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


//
// Created by Code For Android on 18/07/22.
// Copyright (c) 2022 CFA. All rights reserved.
//

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ShowGrid() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp)
    ) {


        val imageList = Constants.imageList
        LazyVerticalGrid(cells = GridCells.Fixed(3), contentPadding = PaddingValues()) {

            items(imageList.size) { image ->
                val imageUrl = imageList[image]

                GridItemImage(image = imageUrl)

            }

        }
    }


}