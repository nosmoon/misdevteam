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


public class HD_EVLU_5003_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String rnum;
	public String evlu_yy;
	public String tms_clsf;
	public String evlu_step_clsf;
	public String frdt;
	public String todt;
	public String remk;
	public String db_status;

	public HD_EVLU_5003_LCURLISTRecord(){}

	public void setRnum(String rnum){
		this.rnum = rnum;
	}

	public void setEvlu_yy(String evlu_yy){
		this.evlu_yy = evlu_yy;
	}

	public void setTms_clsf(String tms_clsf){
		this.tms_clsf = tms_clsf;
	}

	public void setEvlu_step_clsf(String evlu_step_clsf){
		this.evlu_step_clsf = evlu_step_clsf;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
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

	public String getEvlu_step_clsf(){
		return this.evlu_step_clsf;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getDb_status(){
		return this.db_status;
	}
}

/* 작성시간 : Thu May 21 14:17:48 KST 2009 */