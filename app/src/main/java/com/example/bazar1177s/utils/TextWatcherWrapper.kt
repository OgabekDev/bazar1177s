package com.example.bazar1177s.utils

import android.text.Editable
import android.text.TextWatcher

open class TextWatcherWrapper : TextWatcher {
    override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
    override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
    override fun afterTextChanged(s: Editable) {}
}