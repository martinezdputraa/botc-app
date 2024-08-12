package com.martinezdputra.botcrandomizer.ui.model.characters.blue.townsfolk

import com.martinezdputra.botcrandomizer.R
import com.martinezdputra.botcrandomizer.ui.model.TownsfolkCharacter
import com.martinezdputra.botcrandomizer.ui.model.constants.Characters

class Minstrel : TownsfolkCharacter() {
    override val character: Characters
        get() = Characters.MINSTREL

    override val nameResId: Int
        get() = R.string.character_minstrel_name

    override val descriptionResId: Int
        get() = R.string.character_minstrel_description

    override val imageResId: Int
        get() = R.drawable.ic_minstrel
}