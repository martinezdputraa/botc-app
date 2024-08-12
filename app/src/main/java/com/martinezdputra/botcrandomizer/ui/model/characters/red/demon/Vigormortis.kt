package com.martinezdputra.botcrandomizer.ui.model.characters.red.demon

import com.martinezdputra.botcrandomizer.R
import com.martinezdputra.botcrandomizer.ui.model.DemonCharacter
import com.martinezdputra.botcrandomizer.ui.model.constants.Characters

class Vigormortis : DemonCharacter() {
    override val character: Characters
        get() = Characters.VIGORMORTIS

    override val nameResId: Int
        get() = R.string.character_vigormortis_name

    override val descriptionResId: Int
        get() = R.string.character_vigormortis_description

    override val imageResId: Int
        get() = R.drawable.ic_vigormortis
}