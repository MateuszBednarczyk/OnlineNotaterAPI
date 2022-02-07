package com.example.onlinenotaterapi.RestControllers;

import com.example.onlinenotaterapi.Models.Note;
import com.example.onlinenotaterapi.Services.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class NoteRestController {

    private DeleteService deleteService;
    private FindService findService;
    private PostService postService;
    private PutService putService;
    private PatchService patchService;

    public NoteRestController(DeleteService deleteService, FindService findService, PostService postService, PutService putService, PatchService patchService) {
        this.deleteService = deleteService;
        this.findService = findService;
        this.postService = postService;
        this.putService = putService;
        this.patchService = patchService;
    }

    @GetMapping("/all")
    public List<Note> findAllNotes(){

        return findService.findAllNotes();

    }

    @GetMapping("/byid/{id}")
    public Optional<Note> findNoteById(@PathVariable Long id){

        return findService.findNoteById(id);

    }

    @PostMapping("/add")
    public void addNote(@RequestBody Note note){

        postService.addNote(note);

    }

    @DeleteMapping("/bybody")
    public void deleteNoteByBody(@RequestBody Note note){

        deleteService.deleteNoteByBody(note);

    }

    @DeleteMapping("/byid/{id}")
    public void deleteById(@PathVariable Long id){

        deleteService.deleteNoteById(id);

    }

    @PutMapping("update/{id}")
    public Note updateNote(@PathVariable Long id, @RequestBody Note note){

        putService.updateNote(id,note);
        return note;

    }

    @PatchMapping("/patch/{id}")
    public void patchNote(@PathVariable Long id, @RequestBody Note note){

        patchService.patchNote(id,note);

    }

}
