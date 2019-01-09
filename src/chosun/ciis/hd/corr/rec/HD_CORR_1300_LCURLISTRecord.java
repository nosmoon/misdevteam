/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.hd.corr.rec;

import java.sql.*;
import chosun.ciis.hd.corr.dm.*;
import chosun.ciis.hd.corr.ds.*;

/**
 * 
 */


public class HD_CORR_1300_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String pay_yymm;
	public String seq;
	public String emp_no;
	public String flnm;
	public String dept_cd;
	public String dept_nm;
	public String dty_cd;
	public String dty_nm;
	public String posi_cd;
	public String posi_nm;
	public String natn_cd;
	public String natn_nm;
	public String duty_area;
	public String duty_area_nm;
	public String cd_48;
	public String cd_50;
	public String cd_52;
	public String cd_54;
	public String total_sum;

	public HD_CORR_1300_LCURLISTRecord(){}

	public void setPay_yymm(String pay_yymm){
		this.pay_yymm = pay_yymm;
	}
	
	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setDty_cd(String dty_cd){
		this.dty_cd = dty_cd;
	}

	public void setDty_nm(String dty_nm){
		this.dty_nm = dty_nm;
	}

	public void setPosi_cd(String posi_cd){
		this.posi_cd = posi_cd;
	}

	public void setPosi_nm(String posi_nm){
		this.posi_nm = posi_nm;
	}

	public void setNatn_cd(String natn_cd){
		this.natn_cd = natn_cd;
	}

	public void setNatn_nm(String natn_nm){
		this.natn_nm = natn_nm;
	}

	public void setDuty_area(String duty_area){
		this.duty_area = duty_area;
	}

	public void setDuty_area_nm(String duty_area_nm){
		this.duty_area_nm = duty_area_nm;
	}

	public void setCd_48(String cd_48){
		this.cd_48 = cd_48;
	}

	public void setCd_50(String cd_50){
		this.cd_50 = cd_50;
	}

	public void setCd_52(String cd_52){
		this.cd_52 = cd_52;
	}

	public void setCd_54(String cd_54){
		this.cd_54 = cd_54;
	}

	public void setTotal_sum(String total_sum){
		this.total_sum = total_sum;
	}

	public String getPay_yymm(){
		return this.pay_yymm;
	}
	
	public String getSeq(){
		return this.seq;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getDty_cd(){
		return this.dty_cd;
	}

	public String getDty_nm(){
		return this.dty_nm;
	}

	public String getPosi_cd(){
		return this.posi_cd;
	}

	public String getPosi_nm(){
		return this.posi_nm;
	}

	public String getNatn_cd(){
		return this.natn_cd;
	}

	public String getNatn_nm(){
		return this.natn_nm;
	}

	public String getDuty_area(){
		return this.duty_area;
	}

	public String getDuty_area_nm(){
		return this.duty_area_nm;
	}

	public String getCd_48(){
		return this.cd_48;
	}

	public String getCd_50(){
		return this.cd_50;
	}

	public String getCd_52(){
		return this.cd_52;
	}

	public String getCd_54(){
		return this.cd_54;
	}

	public String getTotal_sum(){
		return this.total_sum;
	}
}

/* 작성시간 : Mon Apr 13 10:25:39 KST 2009 */