package live.trilord.navigationsample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
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
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import live.trilord.navigationsample.ui.theme.NavigationSampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NavigationSampleTheme {
                MyApp()

            }
        }
    }
}


@Composable
fun MyApp(){
    val navController= rememberNavController()

    NavHost(navController=navController ,startDestination="firstScreen"){
        composable("firstScreen"){
            FirstScreen {
                name,age->
                navController.navigate("secondScreen/$name/$age")
            }
        }
        composable("secondScreen/{name}/{age}"){
            val name=it.arguments?.getString("name") ?: "No name"
            val age=it.arguments?.getString("age") ?: "No age"
        SecondScreen(

            navigationToFirstScreen = {navController.navigate("firstScreen")},

            navigationToThirdScreen = {navController.navigate("thirdScreen")},
            name=name,
            age=age
            )

        }

        composable("thirdScreen"){
            ThirdScreen {
                navController.navigate("firstScreen")
            }
        }

    }

}

