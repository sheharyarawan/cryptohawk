package com.example.cryptohawk.ViewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.cryptohawk.Repository.cryptoRepository

class cryptoViewModel(app: Application, val repo: cryptoRepository): AndroidViewModel(app)
