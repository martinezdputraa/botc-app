package com.martinezdputra.botcrandomizer.ui.model.characters.blue.townsfolk

import com.martinezdputra.botcrandomizer.R
import com.martinezdputra.botcrandomizer.ui.model.TownsfolkCharacter
import com.martinezdputra.botcrandomizer.ui.model.constants.Characters

class Sailor : TownsfolkCharacter() {
    override val character: Characters
        get() = Characters.SAILOR

    override val nameResId: Int
        get() = R.string.character_sailor_name

    override val descriptionResId: Int
        get() = R.string.character_sailor_description

    override val imageResId: Int
        get() = R.drawable.ic_sailor
}