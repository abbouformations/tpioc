package ma.formations.ioc.service;

import ma.formations.ioc.dao.IDao;
import ma.formations.ioc.service.model.Article;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

//In this example, we are using the injection by constructor.
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)

@Service
public class ServiceImpl implements IService {
    private final IDao dao;

    public ServiceImpl(@Qualifier("dao1") IDao dao) {
        this.dao = dao;
    }

    @Override
    public List<Article> getAll() {
        return dao.getAll();
    }

    @Override
    public void save(Article article) {
        dao.save(article);
    }

    @Override
    public void deleteById(Long id) {
        dao.deleteById(id);
    }

    @Override
    public Article findById(Long id) {
        return dao.findById(id);
    }
}
