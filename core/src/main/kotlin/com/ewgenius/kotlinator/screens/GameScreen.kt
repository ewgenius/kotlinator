package com.ewgenius.kotlinator.screens

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.ScreenAdapter
import com.badlogic.gdx.graphics.GL20
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.ewgenius.kotlinator.KotlinatorGame

class GameScreen(game: KotlinatorGame): ScreenAdapter() {
    internal var batch: SpriteBatch? = null
    internal var img: Texture? = null

    override fun show() {
        batch = SpriteBatch()
        img = Texture("badlogic.jpg")
    }

    override fun render(deltatime: Float) {
        Gdx.gl.glClearColor(1f, 0f, 0f, 1f)
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT)
        batch?.begin()
        batch?.draw(img, 0f, 0f)
        batch?.end()
    }
}