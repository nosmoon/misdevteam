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


package chosun.ciis.fc.func.rec;

import java.sql.*;
import chosun.ciis.fc.func.dm.*;
import chosun.ciis.fc.func.ds.*;

/**
 * 
 */


public class FC_FUNC_2051_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String seci_clsf_cd;
	public String seci_no;
	public String comp_dt;
	public String mtry_dt;
	public String face_val_amt;
	public String pch_gwgbnm;

	public FC_FUNC_2051_LCURLISTRecord(){}

	public void setSeci_clsf_cd(String seci_clsf_cd){
		this.seci_clsf_cd = seci_clsf_cd;
	}

	public void setSeci_no(String seci_no){
		this.seci_no = seci_no;
	}

	public void setComp_dt(String comp_dt){
		this.comp_dt = comp_dt;
	}

	public void setMtry_dt(String mtry_dt){
		this.mtry_dt = mtry_dt;
	}

	public void setFace_val_amt(String face_val_amt){
		this.face_val_amt = face_val_amt;
	}

	public void setPch_gwgbnm(String pch_gwgbnm){
		this.pch_gwgbnm = pch_gwgbnm;
	}

	public String getSeci_clsf_cd(){
		return this.seci_clsf_cd;
	}

	public String getSeci_no(){
		return this.seci_no;
	}

	public String getComp_dt(){
		return this.comp_dt;
	}

	public String getMtry_dt(){
		return this.mtry_dt;
	}

	public String getFace_val_amt(){
		return this.face_val_amt;
	}

	public String getPch_gwgbnm(){
		return this.pch_gwgbnm;
	}
}

/* 작성시간 : Fri Mar 13 09:28:47 KST 2009 */