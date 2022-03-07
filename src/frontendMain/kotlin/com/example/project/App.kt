package com.example.project

import io.kvision.*
import io.kvision.core.AlignContent
import io.kvision.core.Display
import io.kvision.core.FontWeight
import io.kvision.core.TextAlign
import io.kvision.html.Span
import io.kvision.html.label
import io.kvision.panel.root
import io.kvision.state.bind
import io.kvision.utils.auto
import io.kvision.utils.perc
import io.kvision.utils.pt
import io.kvision.utils.px
import kotlinx.browser.window
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.asCoroutineDispatcher
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

val AppScope = CoroutineScope(window.asCoroutineDispatcher())

class App : Application() {

    override fun start(state: Map<String, Any>) {

        val displayText = MutableStateFlow("")
        val root = root("kvapp") {
            width = 100.perc
            height = 100.perc
            alignContent = AlignContent.CENTER
            label {
                display = Display.BLOCK
                margin = auto
                paddingTop = 100.px
                alignContent = AlignContent.CENTER
                textAlign = TextAlign.CENTER
                fontSize = 20.pt
                fontWeight = FontWeight.BOLD
            }.bind(displayText) {
                content = it
            }

        }
        AppScope.launch {
            val pingResult = Model.ping("Hello world from client!")
            displayText.value = pingResult
        }
    }
}

fun main() {
    startApplication(
        ::App,
        module.hot,
        BootstrapIconsModule,
        FontAwesomeModule,
        RichTextModule,
        ChartModule,
        TabulatorModule,
        ToastModule,
        OnsenUIModule,
        CoreModule
    )
}
