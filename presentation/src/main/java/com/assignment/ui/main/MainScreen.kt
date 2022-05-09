package com.assignment.ui.main

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun MainScreen(
    /*viewModel: MainViewModel = hiltViewModel(),
    favorite: (favorite: Boolean) -> Unit = {},
    openProduct: (categoryKey: String) -> Unit = {}*/
) {
    val scaffoldState = rememberScaffoldState()
    Scaffold(
        scaffoldState = scaffoldState,
        content = {
            Column(Modifier.padding(vertical = 30.dp, horizontal = 20.dp)) {
                Text("BodyContent")
                Spacer(modifier = Modifier.padding(vertical = 10.dp))
                Text("BodyContent")
                Spacer(modifier = Modifier.padding(vertical = 10.dp))
                Text("BodyContent")
                Spacer(modifier = Modifier.padding(vertical = 10.dp))
                Text("BodyContent")
            }
      },
    )
}

@Composable
fun TabLayout() {
    TabLayout(

    )
}

@Preview(showBackground = true)
@Composable
private fun Preview() {
    MainScreen()
}