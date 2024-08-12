package com.martinezdputra.botcrandomizer.ui.model.characters.blue.outsider

import com.martinezdputra.botcrandomizer.R
import com.martinezdputra.botcrandomizer.ui.model.OutsiderCharacter
import com.martinezdputra.botcrandomizer.ui.model.TownsfolkCharacter
import com.martinezdputra.botcrandomizer.ui.model.constants.Characters

class Recluse : OutsiderCharacter() {
    override val character: Characters
        get() = Characters.RECLUSE

    override val nameResId: Int
        get() = R.string.character_recluse_name

    override val descriptionResId: Int
        get() = R.string.character_recluse_description

    override val imageResId: Int
        get() = R.drawable.ic_recluse
}