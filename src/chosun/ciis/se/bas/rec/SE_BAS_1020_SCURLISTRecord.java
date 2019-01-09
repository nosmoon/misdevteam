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


package chosun.ciis.se.bas.rec;

import java.sql.*;
import chosun.ciis.se.bas.dm.*;
import chosun.ciis.se.bas.ds.*;

/**
 * 
 */


public class SE_BAS_1020_SCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String supr_dept_cd;
	public String dept_cd;
	public String area_cd;
	public String area_nm;
	public String sido_cd;
	public String chrg_pers;
	public String flnm;
	public String acct_sido_cd;
	public String sell_sido_cd;
	public String sell_srt_col;
	public String use_yn;

	public SE_BAS_1020_SCURLISTRecord(){}

	public void setSupr_dept_cd(String supr_dept_cd){
		this.supr_dept_cd = supr_dept_cd;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setArea_cd(String area_cd){
		this.area_cd = area_cd;
	}

	public void setArea_nm(String area_nm){
		this.area_nm = area_nm;
	}

	public void setSido_cd(String sido_cd){
		this.sido_cd = sido_cd;
	}

	public void setChrg_pers(String chrg_pers){
		this.chrg_pers = chrg_pers;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setAcct_sido_cd(String acct_sido_cd){
		this.acct_sido_cd = acct_sido_cd;
	}

	public void setSell_sido_cd(String sell_sido_cd){
		this.sell_sido_cd = sell_sido_cd;
	}

	public void setSell_srt_col(String sell_srt_col){
		this.sell_srt_col = sell_srt_col;
	}

	public void setUse_yn(String use_yn){
		this.use_yn = use_yn;
	}

	public String getSupr_dept_cd(){
		return this.supr_dept_cd;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getArea_cd(){
		return this.area_cd;
	}

	public String getArea_nm(){
		return this.area_nm;
	}

	public String getSido_cd(){
		return this.sido_cd;
	}

	public String getChrg_pers(){
		return this.chrg_pers;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getAcct_sido_cd(){
		return this.acct_sido_cd;
	}

	public String getSell_sido_cd(){
		return this.sell_sido_cd;
	}

	public String getSell_srt_col(){
		return this.sell_srt_col;
	}

	public String getUse_yn(){
		return this.use_yn;
	}
}

/* 작성시간 : Sat Jul 11 10:57:06 KST 2009 */