package live.trilord.navigationsample

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ThirdScreen(navigateToFirstScreen :()->Unit){
    Column(modifier= Modifier
        .fillMaxSize()
        .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    , verticalArrangement = Arrangement.Center
    ){
        Text("Esta es la tercera pantalla mano ")
        Spacer(modifier=Modifier.padding(horizontal = 8.dp))
        Button(onClick = { navigateToFirstScreen() }) {
            Text("Navigate to firstScreen")

        }

    }


}

@Preview (showBackground = true)
@Composable
fun ThirdScreenPreview(){
    ThirdScreen({})
}