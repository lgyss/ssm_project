package com.newer.datang.data.util;

import com.newer.datang.data.entity.TEmployee;
import com.newer.datang.data.entity.TRole;


public class EmployeeForm {
	TEmployee emp;//��Ա��
	TRole role;//����ɫ
	String confirmPassword;//�ڶ���ȷ������
	
	public EmployeeForm() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TEmployee getEmp() {
		return emp;
	}
	public void setEmp(TEmployee emp) {
		this.emp = emp;
	}
	public TRole getRole() {
		return role;
	}
	public void setRole(TRole role) {
		this.role = role;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	@Override
	public String toString() {
		return "EmployeeForm [emp=" + emp + ", role=" + role
				+ ", confirmPassword=" + confirmPassword + "]";
	}

	
}
