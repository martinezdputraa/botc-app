package com.martinezdputra.botcrandomizer.ui.model.characters.blue.townsfolk

import com.martinezdputra.botcrandomizer.R
import com.martinezdputra.botcrandomizer.ui.model.TownsfolkCharacter
import com.martinezdputra.botcrandomizer.ui.model.constants.Characters

class Mayor : TownsfolkCharacter() {
    override val character: Characters
        get() = Characters.MAYOR

    override val nameResId: Int
        get() = R.string.character_mayor_name

    override val descriptionResId: Int
        get() = R.string.character_mayor_description

    override val imageResId: Int
        get() = R.drawable.ic_mayor
}