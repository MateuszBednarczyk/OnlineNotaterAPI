package com.example.onlinenotaterapi.Services;

import com.example.onlinenotaterapi.Models.Note;
import com.example.onlinenotaterapi.Repo.NoteRepository;
import org.springframework.stereotype.Service;

@Service
public class PutService {

    private NoteRepository noteRepository;
    private DeleteService deleteService;
    private FindService findService;
    private PostService postService;

    public PutService(NoteRepository noteRepository, DeleteService deleteService, FindService findService, PostService postService) {
        this.noteRepository = noteRepository;
        this.deleteService = deleteService;
        this.findService = findService;
        this.postService = postService;
    }

    public Note updateNote(Long id, Note note){

        deleteService.deleteNoteById(id);
        postService.addNote(note);
        return note;

    }

}
