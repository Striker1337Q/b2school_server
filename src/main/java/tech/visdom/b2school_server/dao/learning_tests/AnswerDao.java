package tech.visdom.b2school_server.dao.learning_tests;

import org.springframework.data.repository.CrudRepository;
import tech.visdom.b2school_server.model.learning_tests.Answer;

public interface AnswerDao extends CrudRepository<Answer, Long> {
}
