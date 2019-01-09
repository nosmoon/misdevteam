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


package chosun.ciis.hd.affr.rec;

import java.sql.*;
import chosun.ciis.hd.affr.dm.*;
import chosun.ciis.hd.affr.ds.*;

/**
 * 
 */


public class HD_AFFR_2212_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_lcls_cd;
	public String congr_condl_cd;
	public String aply_basi_dt;
	public String congr_condl_fee;
	public String art_flower;
	public String ofcr_congr_condl_fee;
	public String ofcr_art_flower;

	public HD_AFFR_2212_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_lcls_cd(String emp_lcls_cd){
		this.emp_lcls_cd = emp_lcls_cd;
	}

	public void setCongr_condl_cd(String congr_condl_cd){
		this.congr_condl_cd = congr_condl_cd;
	}

	public void setAply_basi_dt(String aply_basi_dt){
		this.aply_basi_dt = aply_basi_dt;
	}

	public void setCongr_condl_fee(String congr_condl_fee){
		this.congr_condl_fee = congr_condl_fee;
	}

	public void setArt_flower(String art_flower){
		this.art_flower = art_flower;
	}

	public void setOfcr_congr_condl_fee(String ofcr_congr_condl_fee){
		this.ofcr_congr_condl_fee = ofcr_congr_condl_fee;
	}

	public void setOfcr_art_flower(String ofcr_art_flower){
		this.ofcr_art_flower = ofcr_art_flower;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_lcls_cd(){
		return this.emp_lcls_cd;
	}

	public String getCongr_condl_cd(){
		return this.congr_condl_cd;
	}

	public String getAply_basi_dt(){
		return this.aply_basi_dt;
	}

	public String getCongr_condl_fee(){
		return this.congr_condl_fee;
	}

	public String getArt_flower(){
		return this.art_flower;
	}

	public String getOfcr_congr_condl_fee(){
		return this.ofcr_congr_condl_fee;
	}

	public String getOfcr_art_flower(){
		return this.ofcr_art_flower;
	}
}

/* 작성시간 : Sat Jul 18 12:11:53 KST 2009 */