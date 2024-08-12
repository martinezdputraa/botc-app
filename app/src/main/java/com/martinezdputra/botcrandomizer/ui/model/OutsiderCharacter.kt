package com.martinezdputra.botcrandomizer.ui.model

import com.martinezdputra.botcrandomizer.ui.model.constants.Team

abstract class OutsiderCharacter : BlueCharacter() {
    override val team: Team
        get() = Team.OUTSIDER
}