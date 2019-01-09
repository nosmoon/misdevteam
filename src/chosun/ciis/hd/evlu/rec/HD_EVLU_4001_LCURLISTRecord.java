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


package chosun.ciis.hd.evlu.rec;

import java.sql.*;
import chosun.ciis.hd.evlu.dm.*;
import chosun.ciis.hd.evlu.ds.*;

/**
 * 
 */


public class HD_EVLU_4001_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String use_chk;
	public String frdt;
	public String todt;
	public String evlu_obj_bgn_dd;
	public String evlu_obj_end_dd;

	public HD_EVLU_4001_LCURLISTRecord(){}

	public void setUse_chk(String use_chk){
		this.use_chk = use_chk;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public void setEvlu_obj_bgn_dd(String evlu_obj_bgn_dd){
		this.evlu_obj_bgn_dd = evlu_obj_bgn_dd;
	}

	public void setEvlu_obj_end_dd(String evlu_obj_end_dd){
		this.evlu_obj_end_dd = evlu_obj_end_dd;
	}

	public String getUse_chk(){
		return this.use_chk;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getEvlu_obj_bgn_dd(){
		return this.evlu_obj_bgn_dd;
	}

	public String getEvlu_obj_end_dd(){
		return this.evlu_obj_end_dd;
	}
}

/* 작성시간 : Fri Mar 28 10:29:18 KST 2014 */