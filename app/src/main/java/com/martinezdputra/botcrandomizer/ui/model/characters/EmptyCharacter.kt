package com.martinezdputra.botcrandomizer.ui.model.characters

import com.martinezdputra.botcrandomizer.R
import com.martinezdputra.botcrandomizer.ui.model.OutsiderCharacter
import com.martinezdputra.botcrandomizer.ui.model.constants.Characters


class EmptyCharacter : OutsiderCharacter() {
    override val character: Characters
        get() = Characters.BUTLER

    override val nameResId: Int
        get() = R.string.character_butler_name

    override val descriptionResId: Int
        get() = R.string.character_butler_description

    override val imageResId: Int
        get() = R.drawable.ic_butler
}