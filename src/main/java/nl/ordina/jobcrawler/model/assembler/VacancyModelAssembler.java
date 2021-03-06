package nl.ordina.jobcrawler.model.assembler;

import nl.ordina.jobcrawler.controller.VacancyController;
import nl.ordina.jobcrawler.model.Vacancy;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@Component
public class VacancyModelAssembler implements RepresentationModelAssembler<Vacancy, EntityModel<Vacancy>> {
    /**
     * Takes a vacancy and adds RESTful links to it and returns it as an EntityModel
     * @param vacancy vacancy to be converted 
     * @return EntityModel of the vacancy containing links
     */
    @Override
    public EntityModel<Vacancy> toModel(Vacancy vacancy) {
        return EntityModel.of(vacancy,
                linkTo(methodOn(VacancyController.class).getVacancy(vacancy.getId())).withSelfRel(),
                linkTo(methodOn(VacancyController.class).getVacancies()).withRel("vacancies")
        );
    }

}
