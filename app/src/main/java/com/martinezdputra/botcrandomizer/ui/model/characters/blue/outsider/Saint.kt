package com.martinezdputra.botcrandomizer.ui.model.characters.blue.outsider

import com.martinezdputra.botcrandomizer.R
import com.martinezdputra.botcrandomizer.ui.model.OutsiderCharacter
import com.martinezdputra.botcrandomizer.ui.model.TownsfolkCharacter
import com.martinezdputra.botcrandomizer.ui.model.constants.Characters

class Saint : OutsiderCharacter() {
    override val character: Characters
        get() = Characters.SAINT

    override val nameResId: Int
        get() = R.string.character_saint_name

    override val descriptionResId: Int
        get() = R.string.character_saint_description

    override val imageResId: Int
        get() = R.drawable.ic_saint
}