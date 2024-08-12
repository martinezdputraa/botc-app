package com.martinezdputra.botcrandomizer.ui.model.characters.red.minion

import com.martinezdputra.botcrandomizer.R
import com.martinezdputra.botcrandomizer.ui.model.MinionCharacter
import com.martinezdputra.botcrandomizer.ui.model.TownsfolkCharacter
import com.martinezdputra.botcrandomizer.ui.model.constants.Characters

class PitHag : MinionCharacter() {
    override val character: Characters
        get() = Characters.PIT_HAG

    override val nameResId: Int
        get() = R.string.character_pit_hag_name

    override val descriptionResId: Int
        get() = R.string.character_pit_hag_description

    override val imageResId: Int
        get() = R.drawable.ic_pithag
}