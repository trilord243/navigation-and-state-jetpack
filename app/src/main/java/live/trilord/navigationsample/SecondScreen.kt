package live.trilord.navigationsample

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
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
fun SecondScreen(navigationToFirstScreen:(String)-> Unit,navigationToThirdScreen:()-> Unit,name:String,age:String   ){



    Column(modifier= Modifier
        .fillMaxSize()
        .padding(16.dp), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center  ){
        Text(text="This is the second Screen", fontSize=24.sp)
        Spacer(modifier = Modifier.padding(vertical=16.dp))
        Text("Ingresa tu nombre mano para que porfa")
        Spacer(modifier = Modifier.padding(vertical=6.dp))
        Text("HOLAAAAAAAAAAAAAAAAAAAAAAA  ${name} y edad ${age}")
        Button(onClick = { navigationToFirstScreen(name) }) {
            Text("Otra pantalla")

        }
        Spacer(modifier=Modifier.padding(vertical = 8.dp))

        Button(onClick = { navigationToThirdScreen()}){
            Text(text = "Navegar a la tercera pantalla")
        }




    }

}


