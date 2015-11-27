package com.ewgenius.kotlinator.components

import com.badlogic.ashley.core.Component
import com.badlogic.gdx.math.Vector2

class SpriteComponent : Component {
    var position: Vector2 = Vector2()
    var scale: Vector2 = Vector2(1f, 1f)
    var rotation: Float = 0f
}