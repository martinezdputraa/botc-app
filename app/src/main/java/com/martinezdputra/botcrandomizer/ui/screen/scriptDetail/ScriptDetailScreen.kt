package com.martinezdputra.botcrandomizer.ui.screen.scriptDetail

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.martinezdputra.botcrandomizer.R
import com.martinezdputra.botcrandomizer.ui.model.Character
import com.martinezdputra.botcrandomizer.ui.model.Script
import com.martinezdputra.botcrandomizer.ui.model.constants.CharacterAlignment

@Composable
fun ScriptDetailScreen(
    viewModel: ScriptDetailViewModel,
    script: Script,
    characterStates: Map<String, Boolean>,
    onCharacterSelected: (Character) -> Unit = {},
    onGameStart: () -> Unit,
) {
    val buttonEnabled by viewModel.atLeastOneCharacterSelected.collectAsState()
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 8.dp)
        ) {
            Image(
                modifier = Modifier.size(48.dp),
                painter = painterResource(id = script.scriptIconResId),
                contentDescription = null,
            )
            Spacer(modifier = Modifier.width(8.dp))
            Column {
                Text(
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Medium,
                    text = stringResource(script.scriptNameResId)
                )
                Text(
                    fontWeight = FontWeight.Light,
                    fontSize = 10.sp,
                    text = "*Except the first night"
                )
            }
        }

        Divider(
            modifier = Modifier.fillMaxWidth()
        )
        LazyColumn(
            modifier = Modifier
                .weight(1.0f)
                .padding(horizontal = 16.dp, vertical = 8.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            item {
                Text(
                    modifier = Modifier.padding(bottom = 4.dp),
                    text = stringResource(id = R.string.text_townsfolk),
                )
            }
            items(script.townsfolkCharacters) { character ->
                CharacterCard(
                    character = character,
                    isSelected = characterStates.getOrDefault(character.character.name, false),
                    onCharacterSelected = onCharacterSelected,
                )
            }
            item {
                Text(
                    modifier = Modifier.padding(bottom = 4.dp),
                    text = stringResource(id = R.string.text_outsider),
                )
            }
            items(script.outsiderCharacters) { character ->
                CharacterCard(
                    character = character,
                    isSelected = characterStates.getOrDefault(character.character.name, false),
                    onCharacterSelected = onCharacterSelected,
                )
            }
            item {
                Text(
                    modifier = Modifier.padding(bottom = 4.dp),
                    text = stringResource(id = R.string.text_minion),
                )
            }
            items(script.minionCharacters) { character ->
                CharacterCard(
                    character = character,
                    isSelected = characterStates.getOrDefault(character.character.name, false),
                    onCharacterSelected = onCharacterSelected,
                )
            }
            item {
                Text(
                    modifier = Modifier.padding(bottom = 4.dp),
                    text = stringResource(id = R.string.text_demon),
                )
            }
            items(script.demonCharacters) { character ->
                CharacterCard(
                    character = character,
                    isSelected = characterStates.getOrDefault(character.character.name, false),
                    onCharacterSelected = onCharacterSelected,
                )
            }
        }
        Divider(
            modifier = Modifier.fillMaxWidth()
        )
        Column(
            modifier = Modifier
                .padding(horizontal = 16.dp, vertical = 8.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            if(!buttonEnabled) {
                Text(
                    text = stringResource(id = R.string.text_select_at_least_one),
                    fontSize = 10.sp,
                )
            }
            Button(
                modifier = Modifier.fillMaxWidth(),
                onClick = onGameStart,
                enabled = buttonEnabled,
            ) {
                Text(text = stringResource(id = R.string.text_start_a_session))
            }
        }
    }
}

@Composable
fun CharacterCard(
    character: Character,
    playerOrder: Int? = null,
    isSelected: Boolean = false,
    onCharacterSelected: (Character) -> Unit = {},
) {
    val characterColor = when (character.characterAlignment) {
        CharacterAlignment.RED -> colorResource(R.color.red_team_color)
        CharacterAlignment.BLUE -> colorResource(R.color.blue_team_color)
    }
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable {
                onCharacterSelected(character)
            },
        shape = RoundedCornerShape(8.dp),
        border = if (isSelected) BorderStroke(
            width = 2.dp,
            color = characterColor,
        ) else null
    ) {
        Row(
            modifier = Modifier
                .padding(8.dp)
                .height(IntrinsicSize.Min),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                modifier = Modifier.size(32.dp),
                painter = painterResource(id = character.imageResId),
                contentDescription = null,
            )
            Divider(
                modifier = Modifier
                    .fillMaxHeight()
                    .padding(horizontal = 8.dp)
                    .width(1.dp),
                color = Color.Gray
            )
            Column {
                val characterTitle = if (playerOrder != null) {
                    stringResource(
                        id = R.string.text_character_with_player_number,
                        stringResource(id = character.nameResId),
                        playerOrder.toString()
                    )
                } else {
                    stringResource(id = character.nameResId)
                }
                Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = characterTitle,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Bold,
                )
                Spacer(modifier = Modifier.height(2.dp))
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(IntrinsicSize.Min),
                    lineHeight = 12.sp,
                    text = stringResource(id = character.descriptionResId),
                    fontSize = 10.sp
                )
            }
        }
    }
}