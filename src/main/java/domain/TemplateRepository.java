package domain;

import api.factories.TemplateFactory;
import exceptions.NoSuchTemplateExists;

import java.util.List;

public interface TemplateRepository {
    List<Template> findAll();
    Template findById(int id) throws NoSuchTemplateExists;
    Template create(TemplateFactory factory);
}
