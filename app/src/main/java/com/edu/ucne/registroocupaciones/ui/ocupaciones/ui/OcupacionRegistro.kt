package com.edu.ucne.registroocupaciones.ui.ocupaciones.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.magnifier
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.materialIcon
import androidx.compose.material.icons.rounded.ShoppingCart
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.edu.ucne.registroocupaciones.R


@Composable
fun OcupacionRegistro(){
    Box(
        Modifier
            .fillMaxSize()
            .padding(16.dp)){
        Registro(Modifier.align(Alignment.Center))
    }
}

@Composable
fun Registro(modifier: Modifier) {
    Column(modifier = Modifier) {
        HeaderText(Modifier.align(Alignment.CenterHorizontally))
        Spacer(modifier = Modifier.padding(16.dp))
        Descripcion()
        Spacer(modifier = Modifier.padding(8.dp))
        Salario()
        Spacer(modifier = Modifier.padding(8.dp))
        ButtonGuardar(Modifier.align(Alignment.CenterHorizontally))
        Spacer(modifier = Modifier.padding(8.dp))
    }
}

@Composable
fun ButtonGuardar(modifier: Modifier){
    OutlinedButton(
        onClick = {  },
        contentPadding = PaddingValues(
            start = 80.dp,
            top = 16.dp,
            end =  50.dp,
            bottom = 16.dp
        ),


        colors = ButtonDefaults.textButtonColors(
            backgroundColor = Color(0xFF9078B9)
        ), modifier = modifier)
    {
        Image(painter = painterResource(id = R.drawable.save),
            contentDescription = "Header")
        Text("Guardar", color = Color.White) }

}



@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Salario() {
    TextField(
        value = "Salario",
        onValueChange = {},
        placeholder = { Text(text = "Salario")},
        modifier = Modifier.fillMaxWidth(),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
        singleLine = true,
        maxLines = 1,
        colors = TextFieldDefaults.textFieldColors(
            textColor = Color(0xFF636262),
            backgroundColor = Color(0xFFDEDDDD),
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent
        )
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Descripcion() {
    TextField(
        value = "Descripcion",
        onValueChange = {},
        placeholder = { Text(text = "Descripcion")},
        modifier = Modifier.fillMaxWidth(),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
        singleLine = true,
        maxLines = 1,
        colors = TextFieldDefaults.textFieldColors(
            textColor = Color(0xFF636262),
            backgroundColor = Color(0xFFDEDDDD),
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent
        )
    )
}


@Composable
fun HeaderText(modifier: Modifier) {
    Text(text = "Registro De Ocupaciones",
        fontFamily = FontFamily.Serif,
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Center,
         modifier = modifier)


}
