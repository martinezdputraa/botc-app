package com.martinezdputra.botcrandomizer.ui.model.characters.red.minion

import com.martinezdputra.botcrandomizer.R
import com.martinezdputra.botcrandomizer.ui.model.MinionCharacter
import com.martinezdputra.botcrandomizer.ui.model.constants.Characters

class Spy : MinionCharacter() {
    override val character: Characters
        get() = Characters.SPY

    override val nameResId: Int
        get() = R.string.character_spy_name

    override val descriptionResId: Int
        get() = R.string.character_spy_description

    override val imageResId: Int
        get() = R.drawable.ic_spy
}