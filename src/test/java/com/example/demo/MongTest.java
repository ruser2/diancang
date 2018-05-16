package com.example.demo;

import com.mongodb.DB;
import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.core.query.Query;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: zhouyh
 * @Date: 2018-03-22 16:50
 * @Description:
 */
public class MongTest {
    private static  Mongo mongo;
    private static  DB db;
    private static  MongoTemplate mongoTemplate;
    static {

        MongoClient client=new MongoClient();
        MongoDbFactory dbFactory=new SimpleMongoDbFactory(client,"test");
        mongoTemplate=new MongoTemplate(dbFactory);
//        Mongo mongo = new Mongo("127.0.0.1", 27017);
//        //根据mongodb数据库的名称获取mongodb对象 ,
//        DB db = mongo.getDB("test");
    }
    public static void main(String[] args) {
//
//        Set<String> collectionNames = db.getCollectionNames();
//        // 打印出test中的集合
//        for (String name : collectionNames) {
//            System.out.println("collectionName==="+name);
//        }

        fun1();

    }

    public static void fun2(){
        int i=0;
        Fuck fuck=new Fuck();
        Fuck innerFuck=new Fuck();
        innerFuck.setZ(Arrays.asList(i++,i++,i++));

        List<Fuck> innerFucks=new ArrayList<Fuck>();

        for(int j=0;j<5;j++){
            Fuck innerItem=new Fuck();
            innerItem.setZ(Arrays.asList(i++,i++,i++,i++));
            innerItem.setA(innerFuck);
            innerItem.setX(i++);
            innerItem.setY(String.valueOf(i++));
            innerFucks.add(innerItem);
        }

        fuck.setA(innerFuck);
        fuck.setB(innerFucks);
        fuck.setX(100);
        fuck.setY("yyyy");
        fuck.setZ(Arrays.asList(i++,i++));
        System.out.println(fuck);
        mongoTemplate.insert(fuck, "fuck");
//        Query query=new Query();
//
//        List<Fuck> fucks=mongoTemplate.find(query,Fuck.class);
//
//        for (Fuck item:
//                fucks) {
//            System.out.println(item);
//        }
    }

    public static void fun1(){
        Query query=new Query();

        List<Fuck> fucks=mongoTemplate.find(query,Fuck.class);

        for (Fuck item:
                fucks) {
            System.out.println(item);
        }
    }
}
