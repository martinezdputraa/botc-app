package com.martinezdputra.botcrandomizer.ui.model.characters.blue.outsider

import com.martinezdputra.botcrandomizer.R
import com.martinezdputra.botcrandomizer.ui.model.Character
import com.martinezdputra.botcrandomizer.ui.model.OutsiderCharacter
import com.martinezdputra.botcrandomizer.ui.model.TownsfolkCharacter
import com.martinezdputra.botcrandomizer.ui.model.constants.Characters

class Mutant : OutsiderCharacter() {
    override val character: Characters
        get() = Characters.MUTANT

    override val nameResId: Int
        get() = R.string.character_mutant_name

    override val descriptionResId: Int
        get() = R.string.character_mutant_description

    override val imageResId: Int
        get() = R.drawable.ic_mutant
}