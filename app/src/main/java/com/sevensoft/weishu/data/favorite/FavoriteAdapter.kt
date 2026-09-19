package com.sevensoft.weishu.data.favorite

import com.sevensoft.weishu.data.db.entity.FavoriteEntity
import com.sevensoft.weishu.data.model.FavoriteType

interface FavoriteAdapter<T> {
    val type: FavoriteType

    fun buildRefKey(target: T): String

    fun buildFavoriteEntity(
        target: T,
        existing: FavoriteEntity? = null,
        now: Long = System.currentTimeMillis()
    ): FavoriteEntity
}
