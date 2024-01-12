/* Assignment 1 Demo Example
*
* Name: Abhram Medina
* OSU - CS 492
*
* */


package com.example.buisnesscard


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.buisnesscard.ui.theme.BuisnessCardTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BuisnessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    NameText(getString(R.string.Default_name), otherstring = getString(R.string.Default_title))
                }
            }
        }
    }
}

@Composable
fun NameText(message: String, otherstring: String) {
    // Create a column so that texts don't overlap
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .background(color = Color.DarkGray)
    ) {
        val image = painterResource(id = R.drawable.android2)
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                .height(120.dp)
                .width(190.dp)
        )
        Text(
            text = message,
            fontSize = 30.sp,
            lineHeight = 116.sp,
            color = Color.White

        )

        Text(
            text = otherstring,
            fontSize = 20.sp,
            color = Color(0xFF759784)

        )
    }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 550.dp)
            .padding(bottom = 70.dp)
    ){
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 40.dp)
        ){
            val icon = painterResource(id = R.drawable.icons8_phone_30)
            Icon(
                painter = icon,
                contentDescription = null,
                modifier = Modifier
                    .padding(start = 60.dp)
                    .height(70.dp)
                    .width(30.dp),
                Color(0xFF759784)
            )
            Text(
                text = stringResource(R.string.default_phone_num),
                fontSize = 15.sp,
                color = Color.White,
                modifier = Modifier
                    .padding(start = 25.dp, top = 24.dp)

            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 40.dp)
        ){
            val icon = painterResource(id = R.drawable.icons8_email_30)
            Icon(
                painter = icon,
                contentDescription = null,
                modifier = Modifier
                    .padding(start = 60.dp)
                    .height(70.dp)
                    .width(30.dp),
                Color(0xFF759784)
            )
            Text(
                text = stringResource(R.string.default_email),
                fontSize = 15.sp,
                color = Color.White,
                modifier = Modifier
                    .padding(start = 25.dp, top = 21.dp),

            )

        }


    }


}



@Preview(showBackground = true)
@Composable
fun BuisnessCardPreview() {
    BuisnessCardTheme {
        NameText("Abraham Medina", otherstring = "CS 492 Student Extraordinaire")
    }
}