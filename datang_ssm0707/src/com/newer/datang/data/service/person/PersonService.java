package com.newer.datang.data.service.person;

import java.util.List;

import com.newer.datang.data.entity.TEmployee;
import com.newer.datang.data.entity.TPlan;
import com.newer.datang.data.entity.TRole;
import com.newer.datang.data.entity.TTask;

public interface PersonService {

		//查询用户一条记录
		public abstract TRole roleSelect(int id);
		
		//查询员工一条记录
		public abstract TEmployee personSelect(int id);

		//查询任务表一条记录
		public abstract TTask taskSelectById(int id);

		//根据员工的编号查询全部任务
		public abstract List<TTask> taskSelect(int implementorId,int pageNo, int pageSize);

		//根据员工任务的编号查询其下计划
		public abstract List<TPlan> planSelect(int taskId);

		//新建计划
		public abstract int PlanInsert(TPlan plan);

		//删除计划
		public abstract int PlanDelete(int id);

		//修改计划
		public abstract int planUpdate(TPlan plan);
		
		//根据任务编号查询计划数量
		public abstract int jihuaCount(int rnwuId);
		
		//修改任务状态
		public abstract int StatusUpdate(String statu,int renwuId);
		
		//查询计划表一条记录
		public abstract TPlan planSelectById(int id);
		
		//计划组合查询
		public abstract List<TPlan> query(PlanDTO dto,int pageNo,int pageSize,int id);
			
		//获取总条数
		public abstract int Count(PlanDTO dto,int id);
		
		//登录查询
		public abstract TEmployee checkLogin(String employeeName, String password);
		
		//获取总条数
		public abstract int SelectZongShu(int id);
}
