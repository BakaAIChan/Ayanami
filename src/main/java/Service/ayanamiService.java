package Service;

import Domain.ayanami;
import Mapper.ayanamiMapper;
import Util.SqlSessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class ayanamiService {
    private final SqlSessionFactory sqlSessionFactory= SqlSessionFactoryUtil.getSqlSessionFactory();
    public int count(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        ayanamiMapper mapper = sqlSession.getMapper(ayanamiMapper.class);
        int count = mapper.count();
        sqlSession.close();
        return count;
    }

    public ayanami selectById(int id){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        ayanamiMapper mapper = sqlSession.getMapper(ayanamiMapper.class);
        ayanami ayanami = mapper.selectById(id);
        sqlSession.close();
        return ayanami;
    }

    public List<ayanami> selectAll(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        ayanamiMapper mapper = sqlSession.getMapper(ayanamiMapper.class);
        List<ayanami> ayanamis = mapper.selectAll();
        sqlSession.close();
        return ayanamis;
    }
}
