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


package chosun.ciis.hd.info.rec;

import java.sql.*;
import chosun.ciis.hd.info.dm.*;
import chosun.ciis.hd.info.ds.*;

/**
 * 
 */


public class HD_INFO_2602_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String aply_yymm;
	public String emp_cnt;
	public String cmpy_nm;
	public String mm_servcost;
	public String one_pers_servcost;
	public String spc_matt;
	public String remk;

	public HD_INFO_2602_LCURLIST2Record(){}

	public void setAply_yymm(String aply_yymm){
		this.aply_yymm = aply_yymm;
	}

	public void setEmp_cnt(String emp_cnt){
		this.emp_cnt = emp_cnt;
	}

	public void setCmpy_nm(String cmpy_nm){
		this.cmpy_nm = cmpy_nm;
	}

	public void setMm_servcost(String mm_servcost){
		this.mm_servcost = mm_servcost;
	}

	public void setOne_pers_servcost(String one_pers_servcost){
		this.one_pers_servcost = one_pers_servcost;
	}

	public void setSpc_matt(String spc_matt){
		this.spc_matt = spc_matt;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getAply_yymm(){
		return this.aply_yymm;
	}

	public String getEmp_cnt(){
		return this.emp_cnt;
	}

	public String getCmpy_nm(){
		return this.cmpy_nm;
	}

	public String getMm_servcost(){
		return this.mm_servcost;
	}

	public String getOne_pers_servcost(){
		return this.one_pers_servcost;
	}

	public String getSpc_matt(){
		return this.spc_matt;
	}

	public String getRemk(){
		return this.remk;
	}
}

/* 작성시간 : Tue Aug 25 15:34:37 KST 2009 */