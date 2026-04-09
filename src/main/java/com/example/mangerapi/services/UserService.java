package com.example.mangerapi.services;
import java.util.List;
import org.springframework.stereotype.Service;
import com.example.mangerapi.models.User;
import com.example.mangerapi.repository.UserRepo;
/**
 * Servicio encargado de gestionar las operaciones relacionadas con usuarios.
 *
 * <p>Actúa como capa intermedia entre el controlador y el repositorio,
 * proporcionando la lógica de negocio para la gestión de usuarios.</p>
 *
 * @author Hakim
 * @version 1.0
 * @since 1.0
 */
@Service
public class UserService {
private final UserRepo userRepository;
    /**
     * Construye un nuevo {@code UserService} con el repositorio de usuarios.
     *
     * @param userRepository repositorio para acceder a los datos de usuario
     */
public UserService(UserRepo userRepository) {
this.userRepository = userRepository;
    }
    /**
     * Obtiene la lista completa de usuarios registrados en el sistema.
     *
     * @return lista de {@link User} con todos los usuarios; lista vacía si no hay ninguno
     */
public List<User> getUsers() {
return userRepository.findAll();
    }
}
