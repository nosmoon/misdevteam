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


package chosun.ciis.hd.insr.rec;

import java.sql.*;
import chosun.ciis.hd.insr.dm.*;
import chosun.ciis.hd.insr.ds.*;

/**
 * 
 */


public class HD_INSR_1200_LCURLIST4Record extends java.lang.Object implements java.io.Serializable{

	public String hlth_entr_no;
	public String hlth_insr_entr_dt;
	public String slf_hlth_insr_fee;
	public String cmpy_hlth_insr_fee;
	public String self_insr_med_care_insr_fee;
	public String cmpy_insr_med_care_insr_fee;

	public HD_INSR_1200_LCURLIST4Record(){}

	public void setHlth_entr_no(String hlth_entr_no){
		this.hlth_entr_no = hlth_entr_no;
	}

	public void setHlth_insr_entr_dt(String hlth_insr_entr_dt){
		this.hlth_insr_entr_dt = hlth_insr_entr_dt;
	}

	public void setSlf_hlth_insr_fee(String slf_hlth_insr_fee){
		this.slf_hlth_insr_fee = slf_hlth_insr_fee;
	}

	public void setCmpy_hlth_insr_fee(String cmpy_hlth_insr_fee){
		this.cmpy_hlth_insr_fee = cmpy_hlth_insr_fee;
	}

	public void setSelf_insr_med_care_insr_fee(String self_insr_med_care_insr_fee){
		this.self_insr_med_care_insr_fee = self_insr_med_care_insr_fee;
	}

	public void setCmpy_insr_med_care_insr_fee(String cmpy_insr_med_care_insr_fee){
		this.cmpy_insr_med_care_insr_fee = cmpy_insr_med_care_insr_fee;
	}

	public String getHlth_entr_no(){
		return this.hlth_entr_no;
	}

	public String getHlth_insr_entr_dt(){
		return this.hlth_insr_entr_dt;
	}

	public String getSlf_hlth_insr_fee(){
		return this.slf_hlth_insr_fee;
	}

	public String getCmpy_hlth_insr_fee(){
		return this.cmpy_hlth_insr_fee;
	}

	public String getSelf_insr_med_care_insr_fee(){
		return this.self_insr_med_care_insr_fee;
	}

	public String getCmpy_insr_med_care_insr_fee(){
		return this.cmpy_insr_med_care_insr_fee;
	}
}

/* 작성시간 : Thu Aug 20 17:48:31 KST 2009 */