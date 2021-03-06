package com.ewgenius.kotlinator.screens

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.ScreenAdapter
import com.badlogic.gdx.graphics.GL20
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.scenes.scene2d.ui.Skin
import com.badlogic.gdx.scenes.scene2d.ui.TextButton
import com.ewgenius.kotlinator.KotlinatorGame

class MenuScreen(game: KotlinatorGame): ScreenAdapter() {
    internal var batch: SpriteBatch? = null
    internal var skin:Skin? = null
    internal var buttonStart: TextButton? = null
    internal var buttonAbout: TextButton? = null
    internal var buttonExit: TextButton? = null

    override fun show() {
        batch = SpriteBatch()


    }

    override fun render(deltatime: Float) {

    }
}