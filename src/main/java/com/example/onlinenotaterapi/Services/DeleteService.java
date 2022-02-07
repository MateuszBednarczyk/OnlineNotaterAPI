package com.example.onlinenotaterapi.Services;

import com.example.onlinenotaterapi.Models.Note;
import com.example.onlinenotaterapi.Repo.NoteRepository;
import org.springframework.stereotype.Service;

@Service
public class DeleteService {

    private NoteRepository noteRepository;

    public DeleteService(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    public void deleteNoteByBody(Note note){

        noteRepository.delete(note);

    }

    public void deleteNoteById(Long noteId){

        noteRepository.deleteById(noteId);

    }

}
