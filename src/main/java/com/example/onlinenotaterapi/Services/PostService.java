package com.example.onlinenotaterapi.Services;

import com.example.onlinenotaterapi.Models.Note;
import com.example.onlinenotaterapi.Repo.NoteRepository;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    private NoteRepository noteRepository;

    public PostService(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    public void addNote(Note note){

        noteRepository.save(note);

    }

}
