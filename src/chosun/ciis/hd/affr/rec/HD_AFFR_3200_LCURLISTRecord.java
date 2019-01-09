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


public class HD_AFFR_3200_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String occr_dt;
	public String seq;
	public String sply_clsf_cd;
	public String aply_basi_dt;
	public String hospz_med_exam_fee;

	public HD_AFFR_3200_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setSply_clsf_cd(String sply_clsf_cd){
		this.sply_clsf_cd = sply_clsf_cd;
	}

	public void setAply_basi_dt(String aply_basi_dt){
		this.aply_basi_dt = aply_basi_dt;
	}

	public void setHospz_med_exam_fee(String hospz_med_exam_fee){
		this.hospz_med_exam_fee = hospz_med_exam_fee;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getSply_clsf_cd(){
		return this.sply_clsf_cd;
	}

	public String getAply_basi_dt(){
		return this.aply_basi_dt;
	}

	public String getHospz_med_exam_fee(){
		return this.hospz_med_exam_fee;
	}
}

/* 작성시간 : Fri Jul 17 16:09:27 KST 2009 */