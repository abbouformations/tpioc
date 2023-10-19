package ma.formations.ioc.service;

import ma.formations.ioc.dao.IDao;
import ma.formations.ioc.service.model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceImpl implements IService {
    @Autowired
    @Qualifier("dao1")
    private IDao dao;
/*
    // Injection par modificateur
    @Autowired
    @Qualifier("dao2")
    public void setDao(IDao dao) {
        this.dao = dao;
    }
*/
    /*
    // Injection par constructeur
    @Autowired
    public ServiceImpl(@Qualifier("dao2") IDao dao) {
        super();
        this.dao = dao;
    }
*/

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
