package com.martinezdputra.botcrandomizer.ui.model

import com.martinezdputra.botcrandomizer.ui.model.constants.Scripts

interface Script {
    val scriptNameResId: Int
    val scriptIconResId: Int
    val scriptEnum: Scripts

    val townsfolkCharacters: List<Character>
    val outsiderCharacters: List<Character>
    val minionCharacters: List<Character>
    val demonCharacters: List<Character>
}