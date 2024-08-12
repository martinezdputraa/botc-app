package com.martinezdputra.botcrandomizer.ui.screen.scriptDetail

import androidx.compose.runtime.snapshots.SnapshotStateMap
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class ScriptDetailViewModel : ViewModel() {
    private val _atLeastOneCharacterSelected = MutableStateFlow(false)
    val atLeastOneCharacterSelected = _atLeastOneCharacterSelected.asStateFlow()

    fun onMapUpdated(charactersMap: SnapshotStateMap<String, Boolean>) {
        _atLeastOneCharacterSelected.value = charactersMap.containsValue(true)
    }
}