package com.example.mangerapi.services;

import com.example.mangerapi.models.User;
import com.example.mangerapi.repository.UserRepo;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * Servicio encargado de gestionar las operaciones de usuarios.
 *
 * <p>Actúa como capa intermedia entre el controlador y el repositorio,
 * proporcionando la lógica de negocio para la gestión de usuarios.</p>
 *
 * @author Hakim
 * @version 1.0
 * @since 1.0
 */
@Service
public final class UserService {

    /** Repositorio para acceder a los datos de usuario. */
    private final UserRepo userRepository;

    /**
     * Construye un nuevo {@code UserService}.
     *
     * @param repository repositorio de usuarios
     */
    public UserService(final UserRepo repository) {
        this.userRepository = repository;
    }

    /**
     * Obtiene todos los usuarios registrados.
     *
     * @return lista de usuarios
     */
    public List<User> getUsers() {
        return userRepository.findAll();
    }
}
