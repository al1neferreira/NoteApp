package br.com.aline.noteapp.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import br.com.aline.noteapp.model.Note
import br.com.aline.noteapp.repository.NoteRepository
import kotlinx.coroutines.launch

class NoteViewModel(app: Application, private val noteRepository: NoteRepository): AndroidViewModel(app) {

    fun addNote(note: Note) =
        viewModelScope.launch {
            noteRepository.insertNote(note)

        }
    fun deleteNote(note: Note) =
        viewModelScope.launch {
            noteRepository.deleteNote(note)

        }
    fun updateNote(note: Note) =
        viewModelScope.launch {
            noteRepository.updateNote(note)

        }

    fun getAllNotes() = noteRepository.getAllNotes()

    fun searchNotes(query: String?) =
        noteRepository.searchNote(query)

}