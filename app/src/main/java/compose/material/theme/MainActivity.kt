package compose.material.theme


import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import compose.material.theme.ui.theme.Material3ComposeTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Material3ComposeTheme() {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainContent()
                }
            }
        }
    }
}



@Composable
fun MainContent() {
    val context  = LocalContext.current
    Box(
        contentAlignment = Alignment.Center
    ) {
        // * Toast Sample
        OutlinedButton(
            onClick = {

                // * Toast
                Toast.makeText(context,
                    "Hi i am toast",
                    Toast.LENGTH_LONG).show()

            },
            modifier = Modifier.align(Alignment.Center)
        ) {
            Text("Toast",
                style = MaterialTheme.typography.labelLarge,
                color = MaterialTheme.colorScheme.secondary)
        }
    }
}
