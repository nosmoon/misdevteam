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


package chosun.ciis.mt.etcpc.rec;

import java.sql.*;
import chosun.ciis.mt.etcpc.dm.*;
import chosun.ciis.mt.etcpc.ds.*;

/**
 * 
 */


public class MT_ETCPC_2003_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String mchn_mang_no;
	public String modl_mang_no;
	public String modl_nm;
	public String serl_no;
	public String rsrt_dt;
	public String use_pers;
	public String use_pers_flnm;

	public MT_ETCPC_2003_LCURLIST1Record(){}

	public void setMchn_mang_no(String mchn_mang_no){
		this.mchn_mang_no = mchn_mang_no;
	}

	public void setModl_mang_no(String modl_mang_no){
		this.modl_mang_no = modl_mang_no;
	}

	public void setModl_nm(String modl_nm){
		this.modl_nm = modl_nm;
	}

	public void setSerl_no(String serl_no){
		this.serl_no = serl_no;
	}

	public void setRsrt_dt(String rsrt_dt){
		this.rsrt_dt = rsrt_dt;
	}

	public void setUse_pers(String use_pers){
		this.use_pers = use_pers;
	}

	public void setUse_pers_flnm(String use_pers_flnm){
		this.use_pers_flnm = use_pers_flnm;
	}

	public String getMchn_mang_no(){
		return this.mchn_mang_no;
	}

	public String getModl_mang_no(){
		return this.modl_mang_no;
	}

	public String getModl_nm(){
		return this.modl_nm;
	}

	public String getSerl_no(){
		return this.serl_no;
	}

	public String getRsrt_dt(){
		return this.rsrt_dt;
	}

	public String getUse_pers(){
		return this.use_pers;
	}

	public String getUse_pers_flnm(){
		return this.use_pers_flnm;
	}
}

/* 작성시간 : Mon Mar 23 20:41:00 KST 2009 */