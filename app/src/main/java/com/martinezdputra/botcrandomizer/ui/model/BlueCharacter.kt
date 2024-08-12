package com.martinezdputra.botcrandomizer.ui.model

import com.martinezdputra.botcrandomizer.ui.model.constants.CharacterAlignment

abstract class BlueCharacter : Character() {
    override val characterAlignment: CharacterAlignment
        get() = CharacterAlignment.BLUE
}