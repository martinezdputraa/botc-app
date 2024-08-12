package com.martinezdputra.botcrandomizer.ui.model

import com.martinezdputra.botcrandomizer.ui.model.constants.Team

abstract class TownsfolkCharacter : BlueCharacter() {
    override val team: Team
        get() = Team.TOWNSFOLK
}