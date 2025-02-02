package com.axiagroups.daggerhilt.presentation.viewModel

import androidx.lifecycle.ViewModel
import com.axiagroups.daggerhilt.domain.repository.MyRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


/**
 * Created by Ahsan Habib on 5/19/2024.
 * shehanuk.ahsan@gmail.com
 */
@HiltViewModel
class MyViewModel @Inject constructor(
    private val repository: MyRepository
) : ViewModel() {
}