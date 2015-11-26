package com.ewgenius.kotlinator.systems

import com.badlogic.ashley.core.ComponentMapper
import com.badlogic.ashley.core.Entity
import com.badlogic.ashley.core.Family
import com.badlogic.ashley.systems.IteratingSystem
import com.ewgenius.kotlinator.components.TransformComponent
import com.badlogic.gdx.utils.Array

class RenderingSystem : IteratingSystem(Family.all(TransformComponent::class.java).get()) {
    private val transformMapper: ComponentMapper<TransformComponent> = ComponentMapper.getFor(TransformComponent::class.java)
    private val renderQueue: Array<Entity> = Array<Entity>()

    override fun update(delta: Float) {
        super.update(delta)

        renderQueue.forEach { entity ->
            val transform = transformMapper.get(entity)
            System.out.println(transform.toString());
        }

        renderQueue.clear()
    }

    override fun processEntity(entity: Entity, deltaTime: Float) {
        renderQueue.add(entity)
    }
}