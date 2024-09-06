package org.example.lesson_22


class MainScreenViewModel {

    data class MainScreenState(val data: String = "", val isLoading: Boolean = false)

    var mainScreenState = MainScreenState()
        private set

    fun loadData() {
        mainScreenState = mainScreenState.copy(isLoading = true)
        println(mainScreenState.isLoading)

        Thread {
            Thread.sleep(2000)

            mainScreenState = mainScreenState.copy(
                data = "Loaded data from server",
                isLoading = false
            )
            println(mainScreenState.data)
        }.start()
    }
}

fun main() {
    val viewModel = MainScreenViewModel()

    val handleStateChange: () -> Unit = {
        val state = viewModel.mainScreenState
        if (state.isLoading) {
            println("Loading data...")
        } else {
            println("Data loaded: ${state.data}")
        }
    }

    println("Initial state: ${viewModel.mainScreenState}")
    viewModel.loadData()
    handleStateChange()
}