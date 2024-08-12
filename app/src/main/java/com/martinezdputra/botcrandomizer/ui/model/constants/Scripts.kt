package com.martinezdputra.botcrandomizer.ui.model.constants

import com.martinezdputra.botcrandomizer.ui.model.Script
import com.martinezdputra.botcrandomizer.ui.model.scripts.BadMoonRising
import com.martinezdputra.botcrandomizer.ui.model.scripts.SectsAndViolets
import com.martinezdputra.botcrandomizer.ui.model.scripts.TroubleBrewing

enum class Scripts {
    TROUBLE_BREWING,
    BAD_MOON_RISING,
    SECTS_AND_VIOLETS;

    companion object {
        fun getScriptObjectFromString(text: String) : Script {
            return when(Scripts.valueOf(text)) {
                TROUBLE_BREWING -> TroubleBrewing()
                BAD_MOON_RISING -> BadMoonRising()
                SECTS_AND_VIOLETS -> SectsAndViolets()
            }
        }
    }
}