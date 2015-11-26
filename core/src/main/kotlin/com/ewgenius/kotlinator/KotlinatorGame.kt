package com.ewgenius.kotlinator

import com.badlogic.gdx.Game
import com.ewgenius.kotlinator.screens.MenuScreen

class KotlinatorGame : Game() {
    override fun create() {
        val menuScreen: MenuScreen = MenuScreen(this)
        setScreen(menuScreen)
    }
}