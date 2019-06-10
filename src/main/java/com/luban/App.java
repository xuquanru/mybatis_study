package com.luban;

import com.luban.model.Country;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    private static SqlSessionFactory sqlSessionFactory;
    @BeforeClass
    public static void init() throws IOException {
        Reader reader= Resources.getResourceAsReader("mybatis-config.xml");
        sqlSessionFactory =new SqlSessionFactoryBuilder().build(reader);
        reader.close();
    }

    @Test
    public  void test(){
        SqlSession sqlSession=sqlSessionFactory.openSession();
        try {
            List<Country> countryList = sqlSession.selectList("selectAll");
            Myprint(countryList);
        } finally {
            sqlSession.close();
        }
    }

    private void Myprint(List<Country> countryList){
        for (Country country:countryList) {
            System.out.printf("%s %s %s\n",country.getId(),country.getCountrycode(),country.getCountryname());
        }

    }

}
