package com.patrykkosieradzki.theanimalapp.ui.utils

import androidx.annotation.DrawableRes
import androidx.core.content.ContextCompat.getDrawable
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.DividerItemDecoration.HORIZONTAL
import androidx.recyclerview.widget.DividerItemDecoration.VERTICAL
import androidx.recyclerview.widget.RecyclerView

fun RecyclerView.addVerticalSeparator(@DrawableRes separatorDrawable: Int) {
    getDrawable(context, separatorDrawable)?.let {
        addItemDecoration(
            DividerItemDecoration(context, VERTICAL).apply {
                setDrawable(it)
            }
        )
    }
}

fun RecyclerView.addHorizontalSeparator(@DrawableRes separatorDrawable: Int) {
    getDrawable(context, separatorDrawable)?.let {
        addItemDecoration(
            DividerItemDecoration(context, HORIZONTAL).apply {
                setDrawable(it)
            }
        )
    }
}

fun RecyclerView.addGridSeparator(spanCount: Int, spacingInDp: Int, includeEdge: Boolean = false) {
    addItemDecoration(GridSpacingItemDecoration(spanCount, spacingInDp.dpToPx, includeEdge))
}

fun RecyclerView.removeItemDecorations() {
    for (i in 0 until itemDecorationCount) {
        removeItemDecorationAt(i)
    }
}