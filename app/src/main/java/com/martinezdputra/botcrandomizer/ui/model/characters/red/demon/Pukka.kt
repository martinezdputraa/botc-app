package com.martinezdputra.botcrandomizer.ui.model.characters.red.demon

import com.martinezdputra.botcrandomizer.R
import com.martinezdputra.botcrandomizer.ui.model.DemonCharacter
import com.martinezdputra.botcrandomizer.ui.model.MinionCharacter
import com.martinezdputra.botcrandomizer.ui.model.TownsfolkCharacter
import com.martinezdputra.botcrandomizer.ui.model.constants.Characters

class Pukka : DemonCharacter() {
    override val character: Characters
        get() = Characters.PUKKA

    override val nameResId: Int
        get() = R.string.character_pukka_name

    override val descriptionResId: Int
        get() = R.string.character_pukka_description

    override val imageResId: Int
        get() = R.drawable.ic_pukka
}