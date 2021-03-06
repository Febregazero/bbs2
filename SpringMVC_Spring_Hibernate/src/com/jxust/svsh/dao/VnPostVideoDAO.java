package com.jxust.svsh.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.jxust.svsh.entity.Person;
import com.jxust.svsh.entity.Vn_Post_Video;

@Repository
public class VnPostVideoDAO {
	
    @Resource
    private SessionFactory sessionFactory;

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }
    
    @SuppressWarnings("unchecked")
	public List<Vn_Post_Video> getAllVideo(int connect_id){
    	System.out.println("检查id的值3："+connect_id);
    	return this.getSession().createQuery("from Vn_Post_Video where v_connect_id=?").setParameter(0, connect_id).list();
    }
	
	/*添加vn video*/
    public void addVideo(Vn_Post_Video vnpostvideo) {
        this.getSession().save(vnpostvideo);
    }
    
}
