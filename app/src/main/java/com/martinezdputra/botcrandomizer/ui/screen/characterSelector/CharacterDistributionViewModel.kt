package com.martinezdputra.botcrandomizer.ui.screen.characterSelector

import androidx.lifecycle.ViewModel
import com.martinezdputra.botcrandomizer.ui.model.Character
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class CharacterDistributionViewModel : ViewModel() {
    private val _screenState = MutableStateFlow(CharacterDistributionState.PREVIEW)
    val screenState = _screenState.asStateFlow()

    private val _currentPlayersCharacter = MutableStateFlow(Character.emptyCharacter())
    val currentPlayersCharacter = _currentPlayersCharacter.asStateFlow()

    private val _currentPlayerOrderNumber = MutableStateFlow(0)
    val currentPlayerOrderNumber = _currentPlayerOrderNumber.asStateFlow()

    private val _summaryRevealed = MutableStateFlow(false)
    val summaryRevealed = _summaryRevealed.asStateFlow()

    val allSelectedCharacters = mutableListOf<Character>()
    val assignedCharacters = mutableListOf<Character>()

    fun revealSummary() {
        _summaryRevealed.value = true
    }

    fun setSelectedCharacters(chars: List<Character>) {
        with(allSelectedCharacters) {
            clear()
            addAll(chars)
        }
    }

    fun onBeginRoleDistributionButtonClicked() {
        allSelectedCharacters.shuffle()
        prepareCurrentPlayersCharacter()
    }

    fun prepareCurrentPlayersCharacter() {
        if(allSelectedCharacters.isNotEmpty()) {
            _screenState.value = CharacterDistributionState.SELECTION_HIDDEN

            val selectedCharacterForThisPlayer = allSelectedCharacters.removeLast()
            _currentPlayersCharacter.value = selectedCharacterForThisPlayer
            _currentPlayerOrderNumber.value = (_currentPlayerOrderNumber.value + 1)
        } else {
            _screenState.value = CharacterDistributionState.SUMMARY
        }
    }

    fun showCurrentPlayersCharacter() {
        _screenState.value = CharacterDistributionState.SELECTION_REVEALED
        assignedCharacters += currentPlayersCharacter.value
    }
}