package live.trilord.navigationsample

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun FirstScreen(navigationToSecondScreen: (String,String) ->Unit){
    var name by remember{ mutableStateOf(" ") }
    var age by remember { mutableStateOf("") }


    Column(modifier= Modifier
        .fillMaxSize()
        .padding(16.dp), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center  ){
        Text(text="This is the first Screen", fontSize=24.sp)
        Spacer(modifier = Modifier.padding(vertical=16.dp))
        Text("Ingresa tu nombre mano para que porfa")
        Spacer(modifier = Modifier.padding(vertical=6.dp))
        TextField(value = name, onValueChange ={name=it} )
        Spacer(modifier = Modifier.padding(vertical=6.dp))
        OutlinedTextField(value =age , onValueChange ={age=it} )

        Button(onClick = {
            val finalName=  if (name.isBlank()) "No name" else name
            navigationToSecondScreen(finalName,age) }) {
            Text("Siguiente pantalla")

        }




    }

}


