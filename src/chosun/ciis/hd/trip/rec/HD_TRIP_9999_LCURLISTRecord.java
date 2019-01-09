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


package chosun.ciis.hd.trip.rec;

import java.sql.*;
import chosun.ciis.hd.trip.dm.*;
import chosun.ciis.hd.trip.ds.*;

/**
 * 
 */


public class HD_TRIP_9999_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String occr_dt;
	public String seq;
	public String aply_basi_dt;
	public String area_clsf;
	public String cost_clsf;
	public String posi_clsf;
	public String busi_trip_cost;
	public String remk;

	public HD_TRIP_9999_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setAply_basi_dt(String aply_basi_dt){
		this.aply_basi_dt = aply_basi_dt;
	}

	public void setArea_clsf(String area_clsf){
		this.area_clsf = area_clsf;
	}

	public void setCost_clsf(String cost_clsf){
		this.cost_clsf = cost_clsf;
	}

	public void setPosi_clsf(String posi_clsf){
		this.posi_clsf = posi_clsf;
	}

	public void setBusi_trip_cost(String busi_trip_cost){
		this.busi_trip_cost = busi_trip_cost;
	}

	public void setRemk(String remk){
		this.remk = remk;
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

	public String getAply_basi_dt(){
		return this.aply_basi_dt;
	}

	public String getArea_clsf(){
		return this.area_clsf;
	}

	public String getCost_clsf(){
		return this.cost_clsf;
	}

	public String getPosi_clsf(){
		return this.posi_clsf;
	}

	public String getBusi_trip_cost(){
		return this.busi_trip_cost;
	}

	public String getRemk(){
		return this.remk;
	}
}

/* 작성시간 : Mon Aug 31 19:56:09 KST 2009 */