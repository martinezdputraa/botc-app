package com.martinezdputra.botcrandomizer.ui.model.characters.blue.townsfolk

import com.martinezdputra.botcrandomizer.R
import com.martinezdputra.botcrandomizer.ui.model.TownsfolkCharacter
import com.martinezdputra.botcrandomizer.ui.model.constants.Characters

class TeaLady : TownsfolkCharacter() {
    override val character: Characters
        get() = Characters.TEA_LADY

    override val nameResId: Int
        get() = R.string.character_tea_lady_name

    override val descriptionResId: Int
        get() = R.string.character_tea_lady_description

    override val imageResId: Int
        get() = R.drawable.ic_tea_lady
}