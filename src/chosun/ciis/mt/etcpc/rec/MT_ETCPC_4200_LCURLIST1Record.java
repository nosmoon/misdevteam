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


public class MT_ETCPC_4200_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String use_dept_nm;
	public String mchn_mang_no;
	public String use_nm;
	public String use_usag;
	public String modl_mang_nonm;
	public String use_usag_sw;
	public String swnm;

	public MT_ETCPC_4200_LCURLIST1Record(){}

	public void setUse_dept_nm(String use_dept_nm){
		this.use_dept_nm = use_dept_nm;
	}

	public void setMchn_mang_no(String mchn_mang_no){
		this.mchn_mang_no = mchn_mang_no;
	}

	public void setUse_nm(String use_nm){
		this.use_nm = use_nm;
	}

	public void setUse_usag(String use_usag){
		this.use_usag = use_usag;
	}

	public void setModl_mang_nonm(String modl_mang_nonm){
		this.modl_mang_nonm = modl_mang_nonm;
	}

	public void setUse_usag_sw(String use_usag_sw){
		this.use_usag_sw = use_usag_sw;
	}

	public void setSwnm(String swnm){
		this.swnm = swnm;
	}

	public String getUse_dept_nm(){
		return this.use_dept_nm;
	}

	public String getMchn_mang_no(){
		return this.mchn_mang_no;
	}

	public String getUse_nm(){
		return this.use_nm;
	}

	public String getUse_usag(){
		return this.use_usag;
	}

	public String getModl_mang_nonm(){
		return this.modl_mang_nonm;
	}

	public String getUse_usag_sw(){
		return this.use_usag_sw;
	}

	public String getSwnm(){
		return this.swnm;
	}
}

/* 작성시간 : Fri Apr 03 18:00:57 KST 2009 */