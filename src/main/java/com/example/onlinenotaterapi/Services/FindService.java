package com.example.onlinenotaterapi.Services;

import com.example.onlinenotaterapi.Models.Note;
import com.example.onlinenotaterapi.Repo.NoteRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class FindService {

    private NoteRepository noteRepository;

    public FindService(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    public List<Note> findAllNotes(){

        return noteRepository.findAll();

    }

    public Optional<Note> findNoteById(Long noteId){

        return noteRepository.findById(noteId);

    }

}
