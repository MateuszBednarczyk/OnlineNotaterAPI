package com.example.onlinenotaterapi.Services;

import com.example.onlinenotaterapi.Models.Note;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PatchService {

    private FindService findService;
    private DeleteService deleteService;

    public PatchService(FindService findService, DeleteService deleteService) {
        this.findService = findService;
        this.deleteService = deleteService;
    }

    public void patchNote(Long id, Note note){

        Optional<Note> found = findService.findAllNotes().stream().filter(Note -> Note.getNoteId() == id).findFirst();

        if(found.isPresent()){

            if(!String.valueOf(found.get().getNoteId()).equals("")){

                found.get().setNoteId(note.getNoteId());

            }


            if(!found.get().getNoteTitle().equals("")){

                found.get().setNoteTitle(note.getNoteTitle());

            }

            if(!found.get().getNoteContent().equals("")){

                found.get().setNoteContent(note.getNoteContent());

            }

            if(!found.get().getNoteAuthor().equals("")){

                found.get().setNoteAuthor(note.getNoteAuthor());

            }

        }
    }

}
