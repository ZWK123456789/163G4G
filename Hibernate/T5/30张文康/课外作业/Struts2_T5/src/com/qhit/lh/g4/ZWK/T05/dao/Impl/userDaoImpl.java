package com.qhit.lh.g4.ZWK.T05.dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.qhit.lh.g4.ZWK.T05.bean.TbUser;
import com.qhit.lh.g4.ZWK.T05.dao.userDao;
import com.qhit.lh.g4.ZWK.T05.utils.DBManager;

public class userDaoImpl implements userDao {

	private Connection con = null ;
	private PreparedStatement ps = null ;
	private ResultSet rs = null;
	
	@Override
	public List getAlls(TbUser user) {
		// TODO Auto-generated method stub
		List <TbUser> userList = new ArrayList<TbUser>();
		TbUser u = null;
		con = DBManager.getConnection();
		String sql = "select count(*)  cou  from tb_users where uname = ?  "
				+ "  and  upwd =  ? ";
				//System.out.println(sql);
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, user.getUname());
			ps.setString(2, user.getUpwd());
			rs = ps.executeQuery();
			if(rs != null && rs.next()){
					String sql0 = "select  *  from tb_users";
					ps = con.prepareStatement(sql0);
					rs = ps.executeQuery();
					while(rs.next()){
						u = new TbUser();
						u.setUid(rs.getInt("uid"));
						u.setActive(rs.getInt("active"));
						u.setBirthday(rs.getString("birthday"));
						u.setSex(rs.getString("sex"));
						u.setUname(rs.getString("uname"));
						u.setUpwd(rs.getString("upwd"));
						userList.add(u);
					}
					return userList;
			}else{
				return null;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBManager.close(ps, rs, con);
		}
		return null;
	}

	@Override
	public int delete(int uid) {
		// TODO Auto-generated method stub
		con = DBManager.getConnection();
		String sql ="delete from tb_users where uid  = ?";
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, uid);
			return ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				ps.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
			
		return 0;
	}

	@Override
	public int addUser(TbUser user) {
		// TODO Auto-generated method stub
		con = DBManager.getConnection();
		String sql = "insert into tb_users values(?,?,?,?,?)";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, user.getUname());
			ps.setString(2, user.getUpwd());
			ps.setString(3, user.getBirthday());
			ps.setString(4, user.getSex());
			ps.setInt(5, user.getActive());
			return ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				ps.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		return 0;
	}

	@Override
	public TbUser getUser(int uid) {
		// TODO Auto-generated method stub
		con = DBManager.getConnection();
		String sql = "select * from tb_users where uid = ?";
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, uid);
			rs = ps.executeQuery();
			if(rs != null&& rs.next()){
				TbUser user = new TbUser(
						rs.getInt("uid"), 
						rs.getString("uname"), 
						rs.getString("upwd"), 
						rs.getString("birthday"), 
						rs.getString("sex"), 
						rs.getInt("active"));
				return user;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBManager.close(ps, rs, con);
		}
		
		return null;
	}

	@Override
	public int update(TbUser user) {
		// TODO Auto-generated method stub
		con = DBManager.getConnection();
		String sql = "update tb_users set uname = ?,upwd =?,birthday = ?,sex = ?,active = ?  where uid = ?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, user.getUname());
			ps.setString(2, user.getUpwd());
			ps.setString(3, user.getBirthday());
			ps.setString(4, user.getSex());
			ps.setInt(5, user.getActive());
			ps.setInt(6, user.getUid());
			return ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return 0;
	}

	@Override
	public List All() {
		// TODO Auto-generated method stub
		con = DBManager.getConnection();
		List <TbUser> userList = new ArrayList<TbUser>();
		TbUser user = null;
		String sql = "select  *  from tb_users";
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()){
				user = new TbUser();
				user.setUid(rs.getInt("uid"));
				user.setActive(rs.getInt("active"));
				user.setBirthday(rs.getString("birthday"));
				user.setSex(rs.getString("sex"));
				user.setUname(rs.getString("uname"));
				user.setUpwd(rs.getString("upwd"));
				userList.add(user);
			}
			return userList;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBManager.close(ps, rs, con);
		}
	
	
		return null;
	}

}
