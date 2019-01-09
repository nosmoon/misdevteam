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


package chosun.ciis.sp.sup.rec;

import java.sql.*;
import chosun.ciis.sp.sup.dm.*;
import chosun.ciis.sp.sup.ds.*;

/**
 * 
 */


public class SP_SUP_1010_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dt;
	public String seq;
	public String dlco_no;
	public String dlco_nm;
	public String vist_tm;
	public String vist_obj_clsf_nm;
	public String vist_clsf_nm;
	public String callcoms;
	public String chrg_pers;

	public SP_SUP_1010_LCURLISTRecord(){}

	public void setDt(String dt){
		this.dt = dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setVist_tm(String vist_tm){
		this.vist_tm = vist_tm;
	}

	public void setVist_obj_clsf_nm(String vist_obj_clsf_nm){
		this.vist_obj_clsf_nm = vist_obj_clsf_nm;
	}

	public void setVist_clsf_nm(String vist_clsf_nm){
		this.vist_clsf_nm = vist_clsf_nm;
	}

	public void setCallcoms(String callcoms){
		this.callcoms = callcoms;
	}

	public void setChrg_pers(String chrg_pers){
		this.chrg_pers = chrg_pers;
	}

	public String getDt(){
		return this.dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getVist_tm(){
		return this.vist_tm;
	}

	public String getVist_obj_clsf_nm(){
		return this.vist_obj_clsf_nm;
	}

	public String getVist_clsf_nm(){
		return this.vist_clsf_nm;
	}

	public String getCallcoms(){
		return this.callcoms;
	}

	public String getChrg_pers(){
		return this.chrg_pers;
	}
}

/* 작성시간 : Thu Aug 23 16:58:10 KST 2012 */