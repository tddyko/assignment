package com.assignment.ui.product

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun ProductScreen(viewModel: ProductViewModel = hiltViewModel(), product: () -> Unit = {}) {

}

@Preview
@Composable
private fun Preview() {
    ProductScreen()
}