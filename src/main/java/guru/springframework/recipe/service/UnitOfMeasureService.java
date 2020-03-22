package guru.springframework.recipe.service;

import guru.springframework.recipe.command.UnitOfMeasureCommand;
import guru.springframework.recipe.repository.UnitOfMeasureRepository;

import java.util.Set;

public interface UnitOfMeasureService {
    Set<UnitOfMeasureCommand> listAllUoms();
}
