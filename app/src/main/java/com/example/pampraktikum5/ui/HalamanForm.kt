package com.example.activity5

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pampraktikum5.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HalamanForm(
    onSubmitButtonClicked: (MutableList<String>) -> Unit,
    onBackButtonCLicked: () -> Unit
){

    var namaText by remember {
        mutableStateOf("")
    }
    var alamatText by remember {
        mutableStateOf("")
    }
    var nomortlpText by remember {
        mutableStateOf("")
    }
    var listData: MutableList<String> = mutableListOf(namaText, alamatText, nomortlpText)

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Masukan data diri", fontWeight = FontWeight.Bold, fontSize = 25.sp)
        Column(
            modifier = Modifier.padding(20.dp)
        ) {
            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                value = namaText,
                shape = MaterialTheme.shapes.large,
                label = { Text(text = stringResource(id = R.string.nameUser)) },
                onValueChange = {namaText = it}
            )
            Spacer(modifier = Modifier.padding(10.dp))

            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                value = alamatText,
                shape = MaterialTheme.shapes.large,
                label = { Text(text = stringResource(id = R.string.addressUser)) },
                onValueChange = {alamatText = it}
            )
            Spacer(modifier = Modifier.padding(10.dp))

            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                value = nomortlpText,
                shape = MaterialTheme.shapes.large,
                label = { Text(text = stringResource(id = R.string.phoneUser)) },
                onValueChange = {nomortlpText = it}
            )


            Spacer(modifier = Modifier.padding(10.dp))
        }
        Row (modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ){
            Button(onClick = {onBackButtonCLicked}) {
                Text(text = stringResource(id = R.string.back_button))
            }
            Button(onClick = {onSubmitButtonClicked(listData)}) {
                Text(text = stringResource(id = R.string.submit_button))
            }
        }
    }
}