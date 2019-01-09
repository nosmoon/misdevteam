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


package chosun.ciis.hd.lvcmpy.rec;

import java.sql.*;
import chosun.ciis.hd.lvcmpy.dm.*;
import chosun.ciis.hd.lvcmpy.ds.*;

/**
 * 
 */


public class HD_LVCMPY_2002_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String flnm;
	public String etc_saly_nm;
	public String etc_saly_cd;
	public String dr_amt;
	public String crdt_amt_1;
	public String crdt_amt_2;
	public String cal_pay_amt;
	public String emp_amt;
	public String np_amt;
	public String hlth_amt;

	public HD_LVCMPY_2002_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setEtc_saly_nm(String etc_saly_nm){
		this.etc_saly_nm = etc_saly_nm;
	}

	public void setEtc_saly_cd(String etc_saly_cd){
		this.etc_saly_cd = etc_saly_cd;
	}

	public void setDr_amt(String dr_amt){
		this.dr_amt = dr_amt;
	}

	public void setCrdt_amt_1(String crdt_amt_1){
		this.crdt_amt_1 = crdt_amt_1;
	}

	public void setCrdt_amt_2(String crdt_amt_2){
		this.crdt_amt_2 = crdt_amt_2;
	}

	public void setCal_pay_amt(String cal_pay_amt){
		this.cal_pay_amt = cal_pay_amt;
	}

	public void setEmp_amt(String emp_amt){
		this.emp_amt = emp_amt;
	}

	public void setNp_amt(String np_amt){
		this.np_amt = np_amt;
	}

	public void setHlth_amt(String hlth_amt){
		this.hlth_amt = hlth_amt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getEtc_saly_nm(){
		return this.etc_saly_nm;
	}

	public String getEtc_saly_cd(){
		return this.etc_saly_cd;
	}

	public String getDr_amt(){
		return this.dr_amt;
	}

	public String getCrdt_amt_1(){
		return this.crdt_amt_1;
	}

	public String getCrdt_amt_2(){
		return this.crdt_amt_2;
	}

	public String getCal_pay_amt(){
		return this.cal_pay_amt;
	}

	public String getEmp_amt(){
		return this.emp_amt;
	}

	public String getNp_amt(){
		return this.np_amt;
	}

	public String getHlth_amt(){
		return this.hlth_amt;
	}
}

/* 작성시간 : Mon Aug 10 15:16:13 KST 2009 */