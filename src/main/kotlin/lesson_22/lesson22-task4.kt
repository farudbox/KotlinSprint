package org.example.lesson_22

data class MainScreenState(val data: String = "", val isLoading: Boolean = false)

class MainScreenViewModel {

    var mainScreenState = MainScreenState()
        private set

    fun loadData(onStateChanged: (MainScreenState) -> Unit) {
        mainScreenState = MainScreenState(isLoading = true)
        onStateChanged(mainScreenState)

        Thread {
            Thread.sleep(2000)

            mainScreenState = MainScreenState().copy(
                data = "Loaded data from server",
                isLoading = false
            )
            onStateChanged(mainScreenState)
        }.start()
    }
}

fun main() {
    val viewModel = MainScreenViewModel()

    val handleStateChange: (MainScreenState) -> Unit = { state ->
        if (state.isLoading) {
            println("Loading data...")
        } else println("Data loaded: ${state.data}")
    }

    println("Initial state: ${viewModel.mainScreenState}")
    viewModel.loadData(handleStateChange)
}