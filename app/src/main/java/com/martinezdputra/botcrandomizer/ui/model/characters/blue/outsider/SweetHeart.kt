package com.martinezdputra.botcrandomizer.ui.model.characters.blue.outsider

import com.martinezdputra.botcrandomizer.R
import com.martinezdputra.botcrandomizer.ui.model.Character
import com.martinezdputra.botcrandomizer.ui.model.OutsiderCharacter
import com.martinezdputra.botcrandomizer.ui.model.TownsfolkCharacter
import com.martinezdputra.botcrandomizer.ui.model.constants.Characters

class SweetHeart : OutsiderCharacter() {
    override val character: Characters
        get() = Characters.SWEETHEART

    override val nameResId: Int
        get() = R.string.character_sweetheart_name

    override val descriptionResId: Int
        get() = R.string.character_sweetheart_description

    override val imageResId: Int
        get() = R.drawable.ic_sweetheart
}