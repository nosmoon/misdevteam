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


public class HD_EVLU_5001_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String rnum;
	public String evlu_yy;
	public String tms_clsf;
	public String evlu_obj_frdt;
	public String evlu_obj_todt;
	public String remk;
	public String db_status;

	public HD_EVLU_5001_LCURLISTRecord(){}

	public void setRnum(String rnum){
		this.rnum = rnum;
	}

	public void setEvlu_yy(String evlu_yy){
		this.evlu_yy = evlu_yy;
	}

	public void setTms_clsf(String tms_clsf){
		this.tms_clsf = tms_clsf;
	}

	public void setEvlu_obj_frdt(String evlu_obj_frdt){
		this.evlu_obj_frdt = evlu_obj_frdt;
	}

	public void setEvlu_obj_todt(String evlu_obj_todt){
		this.evlu_obj_todt = evlu_obj_todt;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setDb_status(String db_status){
		this.db_status = db_status;
	}

	public String getRnum(){
		return this.rnum;
	}

	public String getEvlu_yy(){
		return this.evlu_yy;
	}

	public String getTms_clsf(){
		return this.tms_clsf;
	}

	public String getEvlu_obj_frdt(){
		return this.evlu_obj_frdt;
	}

	public String getEvlu_obj_todt(){
		return this.evlu_obj_todt;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getDb_status(){
		return this.db_status;
	}
}

/* 작성시간 : Wed May 20 20:01:38 KST 2009 */