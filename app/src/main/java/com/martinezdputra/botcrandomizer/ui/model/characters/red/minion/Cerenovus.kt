package com.martinezdputra.botcrandomizer.ui.model.characters.red.minion

import com.martinezdputra.botcrandomizer.R
import com.martinezdputra.botcrandomizer.ui.model.MinionCharacter
import com.martinezdputra.botcrandomizer.ui.model.TownsfolkCharacter
import com.martinezdputra.botcrandomizer.ui.model.constants.Characters

class Cerenovus : MinionCharacter() {
    override val character: Characters
        get() = Characters.CERENOVUS

    override val nameResId: Int
        get() = R.string.character_cerenovus_name

    override val descriptionResId: Int
        get() = R.string.character_cerenovus_description

    override val imageResId: Int
        get() = R.drawable.ic_cerenovus
}