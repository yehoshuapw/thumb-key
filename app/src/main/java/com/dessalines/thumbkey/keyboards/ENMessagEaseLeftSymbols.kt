package com.dessalines.thumbkey.keyboards

import com.dessalines.thumbkey.utils.KeyboardDefinition
import com.dessalines.thumbkey.utils.KeyboardDefinitionModes
import com.dessalines.thumbkey.utils.KeyboardDefinitionSettings
import com.dessalines.thumbkey.utils.autoCapitalizeI
import com.dessalines.thumbkey.utils.autoCapitalizeIApostrophe
import com.dessalines.thumbkey.utils.lastColKeysToFirst

val KB_EN_MESSAGEASE_SYMBOLS_LEFT: KeyboardDefinition =
    KeyboardDefinition(
        title = "english symbols MessagEase left-handed",
        modes =
            KeyboardDefinitionModes(
                main = lastColKeysToFirst(KB_EN_MESSAGEASE_SYMBOLS_MAIN),
                shifted = lastColKeysToFirst(KB_EN_MESSAGEASE_SYMBOLS_SHIFTED),
                numeric = lastColKeysToFirst(KB_EN_MESSAGEASE_NUMERIC),
            ),
        settings =
            KeyboardDefinitionSettings(
                autoCapitalizers = arrayOf(::autoCapitalizeI, ::autoCapitalizeIApostrophe),
            ),
    )
