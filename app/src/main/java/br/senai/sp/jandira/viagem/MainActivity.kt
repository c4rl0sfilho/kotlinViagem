package br.senai.sp.jandira.viagem

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.ModifierLocalReadScope
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.senai.sp.jandira.viagem.repository.ViagemRepository
import br.senai.sp.jandira.viagem.ui.theme.ViagemTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ViagemTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {

    val viagens = ViagemRepository().listarTodasAsViagens(LocalContext.current)




    Column(
        modifier = Modifier.padding(16.dp)
    ) {
        TextField(
            value = "",
            onValueChange ={},
            modifier = Modifier.fillMaxWidth(),
            label = {
                Text(text = "Buscar Viagens")
            }
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Minhas Viajens")
        Spacer(modifier = Modifier.height(16.dp))
        LazyColumn(
            modifier = Modifier.fillMaxSize()
        ){
            items(viagens){
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 4.dp)
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize()
                    ) {
                        Surface {
                            Image( if (it.imagem == null) painterResource(id = R.drawable.no_image)else it.imagem!! ,
                                contentDescription = "",
                                modifier = Modifier.fillMaxSize()
                                )
                        }
                        Text(text = it.destino)
                        Text(text = it.descricao)
                        Text(text = SimplificarData(it.dataChegada))
                    }
                }
            }

        }
    }



}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    ViagemTheme {
        Greeting()
    }
}