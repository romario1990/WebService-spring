package com.ecomerce.webservice.resource;

import com.ecomerce.webservice.document.Usuario;
import com.ecomerce.webservice.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/rest/users")
public class UsersResource {

    @Autowired
    private UsersRepository usersRepository;

    @GetMapping("/all")
    public List<Usuario> getAll(){
        return usersRepository.findAll();
    }

    @GetMapping(value = "/{name}")
    public Usuario findByName(@PathVariable final String name){
        return usersRepository.findByName(name);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void modifyUsersById(@PathVariable Integer id, @Valid
    @RequestBody Usuario users) {
        users.setId(id);
        usersRepository.save(users);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Usuario createUsers(@Valid @RequestBody Usuario users) {
        users.setId((int) (usersRepository.count()+1));
        usersRepository.save(users);
        return users;
    }

    @RequestMapping(value = "/{name}", method = RequestMethod.DELETE)
    public void deleteUsers(@PathVariable String name) {
        usersRepository.delete(usersRepository.findByName(name));
    }



}
