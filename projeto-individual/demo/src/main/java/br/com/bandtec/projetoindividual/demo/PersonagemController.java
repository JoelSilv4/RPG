package br.com.bandtec.projetoindividual.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/personagens")
public class PersonagemController {

    private List<Personagem> personagens= new ArrayList<>();

    @GetMapping
    public ResponseEntity listarPersonagens() {
        if (personagens.isEmpty()) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(personagens);
        }
    }

    @PostMapping
    public void AdcionarElfo(@RequestBody Elfo e) {
        personagens.add(e);
    }

    @PostMapping
    public void AdcionarOrc(@RequestBody Orc o) {
        personagens.add(o);
    }

    @GetMapping("/{id}")
    public Personagem recuperarPersonagem(@PathVariable int id) {
        return personagens.get(id-1);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity excluirPersonagem(@PathVariable int id) {
        if (personagens.size() >= id) {
            personagens.remove(id - 1);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }


}
