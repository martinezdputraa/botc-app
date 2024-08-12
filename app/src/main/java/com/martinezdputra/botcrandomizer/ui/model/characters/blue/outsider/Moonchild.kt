package com.martinezdputra.botcrandomizer.ui.model.characters.blue.outsider

import com.martinezdputra.botcrandomizer.R
import com.martinezdputra.botcrandomizer.ui.model.OutsiderCharacter
import com.martinezdputra.botcrandomizer.ui.model.constants.Characters

class Moonchild : OutsiderCharacter() {
    override val character: Characters
        get() = Characters.MOON_CHILD

    override val nameResId: Int
        get() = R.string.character_moon_child_name

    override val descriptionResId: Int
        get() = R.string.character_moon_child_description

    override val imageResId: Int
        get() = R.drawable.ic_moonchild
}