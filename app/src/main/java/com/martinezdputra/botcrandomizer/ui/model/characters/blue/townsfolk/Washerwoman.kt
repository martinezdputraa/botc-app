package com.martinezdputra.botcrandomizer.ui.model.characters.blue.townsfolk

import com.martinezdputra.botcrandomizer.R
import com.martinezdputra.botcrandomizer.ui.model.TownsfolkCharacter
import com.martinezdputra.botcrandomizer.ui.model.constants.Characters

class Washerwoman : TownsfolkCharacter() {
    override val character: Characters
        get() = Characters.WASHERWOMAN

    override val nameResId: Int
        get() = R.string.character_washerwoman_name

    override val descriptionResId: Int
        get() = R.string.character_washerwoman_description

    override val imageResId: Int
        get() = R.drawable.ic_washerwoman
}