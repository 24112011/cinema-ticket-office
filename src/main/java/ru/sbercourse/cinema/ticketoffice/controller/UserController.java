package ru.sbercourse.cinema.ticketoffice.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.sbercourse.cinema.ticketoffice.dto.UserDto;
import ru.sbercourse.cinema.ticketoffice.model.User;
import ru.sbercourse.cinema.ticketoffice.service.UserService;

@RestController
@RequestMapping("/users")
@Tag(name = "Пользователи", description = "Контроллер для работы с пользователями сервиса")
public class UserController extends GenericController<User, UserDto> {

    public UserController(UserService userService) {
        setService(userService);
    }
}
