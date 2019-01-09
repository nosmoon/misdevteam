/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 이태식
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


public class HD_AFFR_9110_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String otn_mgng_cd;
	public String outside_clsf_cd;
	public String outside_clsf_nm;
	public String outside_flnm;
	public String outside_tel_no;
	public String zipcode;
	public String addr;
	public String use_yn;

	public HD_AFFR_9110_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOtn_mgng_cd(String otn_mgng_cd){
		this.otn_mgng_cd = otn_mgng_cd;
	}

	public void setOutside_clsf_cd(String outside_clsf_cd){
		this.outside_clsf_cd = outside_clsf_cd;
	}

	public void setOutside_clsf_nm(String outside_clsf_nm){
		this.outside_clsf_nm = outside_clsf_nm;
	}

	public void setOutside_flnm(String outside_flnm){
		this.outside_flnm = outside_flnm;
	}

	public void setOutside_tel_no(String outside_tel_no){
		this.outside_tel_no = outside_tel_no;
	}

	public void setZipcode(String zipcode){
		this.zipcode = zipcode;
	}

	public void setAddr(String addr){
		this.addr = addr;
	}

	public void setUse_yn(String use_yn){
		this.use_yn = use_yn;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getOtn_mgng_cd(){
		return this.otn_mgng_cd;
	}

	public String getOutside_clsf_cd(){
		return this.outside_clsf_cd;
	}

	public String getOutside_clsf_nm(){
		return this.outside_clsf_nm;
	}

	public String getOutside_flnm(){
		return this.outside_flnm;
	}

	public String getOutside_tel_no(){
		return this.outside_tel_no;
	}

	public String getZipcode(){
		return this.zipcode;
	}

	public String getAddr(){
		return this.addr;
	}

	public String getUse_yn(){
		return this.use_yn;
	}
}

/* 작성시간 : Fri Aug 12 16:09:02 KST 2016 */