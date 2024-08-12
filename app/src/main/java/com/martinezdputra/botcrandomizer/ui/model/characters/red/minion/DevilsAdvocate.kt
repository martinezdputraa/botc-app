package com.martinezdputra.botcrandomizer.ui.model.characters.red.minion

import com.martinezdputra.botcrandomizer.R
import com.martinezdputra.botcrandomizer.ui.model.MinionCharacter
import com.martinezdputra.botcrandomizer.ui.model.TownsfolkCharacter
import com.martinezdputra.botcrandomizer.ui.model.constants.Characters

class DevilsAdvocate : MinionCharacter() {
    override val character: Characters
        get() = Characters.DEVILS_ADVOCATE

    override val nameResId: Int
        get() = R.string.character_devils_advocate_name

    override val descriptionResId: Int
        get() = R.string.character_devils_advocate_description

    override val imageResId: Int
        get() = R.drawable.ic_devils_advocate
}