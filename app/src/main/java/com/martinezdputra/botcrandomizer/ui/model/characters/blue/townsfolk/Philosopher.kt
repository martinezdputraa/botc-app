package com.martinezdputra.botcrandomizer.ui.model.characters.blue.townsfolk

import com.martinezdputra.botcrandomizer.R
import com.martinezdputra.botcrandomizer.ui.model.TownsfolkCharacter
import com.martinezdputra.botcrandomizer.ui.model.constants.Characters

class Philosopher : TownsfolkCharacter() {
    override val character: Characters
        get() = Characters.PHILOSOPHER

    override val nameResId: Int
        get() = R.string.character_philosopher_name

    override val descriptionResId: Int
        get() = R.string.character_philosopher_description

    override val imageResId: Int
        get() = R.drawable.ic_philosopher
}