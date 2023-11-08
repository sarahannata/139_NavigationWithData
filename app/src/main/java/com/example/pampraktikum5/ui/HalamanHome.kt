package com.example.pampraktikum5.ui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pampraktikum5.R
import com.example.pampraktikum5.ui.theme.PAMPraktikum5Theme

@Composable
fun HalamanHome(onNextButtonClicked: () -> Unit) {
    val image = painterResource(id = R.drawable.icedtea)
    Column (modifier = Modifier,
        verticalArrangement = Arrangement.SpaceBetween){
        OutlinedCard (
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.surface
            ),
            border = BorderStroke(1.dp, Color.Green), modifier = Modifier
                .fillMaxWidth(0.95f)
                .padding(vertical = 50.dp)
                .align(Alignment.CenterHorizontally)
        ){
            Column (horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier
                .align(Alignment.CenterHorizontally)){
                Image(painter = image, contentDescription = null,
                    contentScale = ContentScale.Crop)
                Text(
                    text = "Es Teh",
                    color = Color.DarkGray,
                    fontSize = 35.sp,
                    modifier = Modifier.align(Alignment.CenterHorizontally)
                )
                Text(
                    text = "Gembrunggung",
                    color = Color.DarkGray,
                    fontStyle = FontStyle.Italic,
                    fontWeight = FontWeight.Bold,
                    fontSize = 40.sp,
                    )
            }
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(dimensionResource(id = R.dimen.padding_medium))
                    .weight(1f, false),
                horizontalArrangement = Arrangement.spacedBy(dimensionResource(id = R.dimen.padding_medium)),
                verticalAlignment = Alignment.Bottom
            ){
                Button(
                    modifier = Modifier.weight(1f),
                    onClick = onNextButtonClicked
                ){
                    Text(stringResource(id = R.string.next))
                }
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun PreviewHalaman() {
    PAMPraktikum5Theme {
        HalamanHome(onNextButtonClicked = {})
    }
}