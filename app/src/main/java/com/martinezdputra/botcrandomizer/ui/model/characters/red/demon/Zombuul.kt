package com.martinezdputra.botcrandomizer.ui.model.characters.red.demon

import com.martinezdputra.botcrandomizer.R
import com.martinezdputra.botcrandomizer.ui.model.DemonCharacter
import com.martinezdputra.botcrandomizer.ui.model.MinionCharacter
import com.martinezdputra.botcrandomizer.ui.model.TownsfolkCharacter
import com.martinezdputra.botcrandomizer.ui.model.constants.Characters

class Zombuul : DemonCharacter() {
    override val character: Characters
        get() = Characters.ZOMBUUL

    override val nameResId: Int
        get() = R.string.character_zombuul_name

    override val descriptionResId: Int
        get() = R.string.character_zombuul_description

    override val imageResId: Int
        get() = R.drawable.ic_zombuul
}