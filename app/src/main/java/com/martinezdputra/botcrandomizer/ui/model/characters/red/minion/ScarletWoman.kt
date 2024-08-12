package com.martinezdputra.botcrandomizer.ui.model.characters.red.minion

import com.martinezdputra.botcrandomizer.R
import com.martinezdputra.botcrandomizer.ui.model.MinionCharacter
import com.martinezdputra.botcrandomizer.ui.model.constants.Characters

class ScarletWoman : MinionCharacter() {
    override val character: Characters
        get() = Characters.SCARLET_WOMAN

    override val nameResId: Int
        get() = R.string.character_scarlet_woman_name

    override val descriptionResId: Int
        get() = R.string.character_scarlet_woman_description

    override val imageResId: Int
        get() = R.drawable.ic_scarlet_woman
}