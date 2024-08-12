package com.martinezdputra.botcrandomizer.ui.model.characters.red.demon

import com.martinezdputra.botcrandomizer.R
import com.martinezdputra.botcrandomizer.ui.model.DemonCharacter
import com.martinezdputra.botcrandomizer.ui.model.MinionCharacter
import com.martinezdputra.botcrandomizer.ui.model.TownsfolkCharacter
import com.martinezdputra.botcrandomizer.ui.model.constants.Characters

class FangGu : DemonCharacter() {
    override val character: Characters
        get() = Characters.FANG_GU

    override val nameResId: Int
        get() = R.string.character_fang_gu_name

    override val descriptionResId: Int
        get() = R.string.character_fang_gu_description

    override val imageResId: Int
        get() = R.drawable.ic_fang_gu
}