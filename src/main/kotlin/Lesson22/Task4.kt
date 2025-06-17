package org.example.Lesson22

fun main() {
    val viewModel = MainScreenViewModel()
    viewModel.loadData()
}

class MainScreenViewModel {

    private var mainScreenState = MainScreenState(data = null)

    fun loadData() {
        printState("Initial")

        mainScreenState = mainScreenState.copy(isLoading = true)
        printState("Loading")

        mainScreenState = mainScreenState.copy(data = "Loaded data from server", isLoading = false)
        printState("Success")
    }

    private fun printState(stage: String) {
        println("[$stage] -> data: '${mainScreenState.data}', isLoading: ${mainScreenState.isLoading}")
    }
}

data class MainScreenState(
    val data: String?, // now nullable
    val isLoading: Boolean = false
)
