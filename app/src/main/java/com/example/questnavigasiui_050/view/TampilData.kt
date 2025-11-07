package com.example.questnavigasiui_050.view

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import com.example.questnavigasiui_050.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TampilData(
    onBackBtnClick:()-> Unit
){
    val items = listOf(
        Pair(first = stringResource(id = R.string.nama_lengkap), second = "Refky Muhammad Syahrin"),
        Pair(first = stringResource(id = R.string.jenis_kelamin), second = "Laki-laki"),
        Pair(first = stringResource(id = R.string.alamat), second = "Tasikmalaya"),
    )
    Scaffold (modifier = Modifier,
        topBar = {
            TopAppBar(
                title = { Text(text = stringResource(id = R.string.tampil), color = Color.White)},
                colors = TopAppBarDefaults.mediumTopAppBarColors(containerColor = colorResource(id = R.color.black))
            )
        }){  isiruang->

    }
}