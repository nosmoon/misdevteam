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


package chosun.ciis.hd.ddemp.rec;

import java.sql.*;
import chosun.ciis.hd.ddemp.dm.*;
import chosun.ciis.hd.ddemp.ds.*;

/**
 * 
 */


public class HD_DDEMP_1011_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{
	
	public String chrg_posk_nm;
	public String tel_no;
	public String dept_cd;
	public String servcost;
	public String all_insr_dduc_yn;

	public HD_DDEMP_1011_LCURLISTRecord(){}
	
	public void setChrg_posk_nm(String chrg_posk_nm){
		this.chrg_posk_nm = chrg_posk_nm;
	}

	public void setTel_no(String tel_no){
		this.tel_no = tel_no;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setServcost(String servcost){
		this.servcost = servcost;
	}
	
	public void setAll_insr_dduc_yn(String all_insr_dduc_yn){
		this.all_insr_dduc_yn = all_insr_dduc_yn;
	}
	
	public String getChrg_posk_nm(){
		return this.chrg_posk_nm;
	}
	
	public String getTel_no(){
		return this.tel_no;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getServcost(){
		return this.servcost;
	}
	
	public String getAll_insr_dduc_yn(){
		return this.all_insr_dduc_yn;
	}
}

/* 작성시간 : Thu Jun 11 23:13:27 KST 2009 */