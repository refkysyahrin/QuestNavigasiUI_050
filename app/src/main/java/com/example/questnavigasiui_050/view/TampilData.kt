package com.example.questnavigasiui_050.view

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
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
}