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


public class HD_TRIP_2021_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String aply_basi_dt;
	public String seq;
	public String pay_basi_clsf;
	public String dspch_clsf;
	public String base_alon;

	public HD_TRIP_2021_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAply_basi_dt(String aply_basi_dt){
		this.aply_basi_dt = aply_basi_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setPay_basi_clsf(String pay_basi_clsf){
		this.pay_basi_clsf = pay_basi_clsf;
	}

	public void setDspch_clsf(String dspch_clsf){
		this.dspch_clsf = dspch_clsf;
	}

	public void setBase_alon(String base_alon){
		this.base_alon = base_alon;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAply_basi_dt(){
		return this.aply_basi_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getPay_basi_clsf(){
		return this.pay_basi_clsf;
	}

	public String getDspch_clsf(){
		return this.dspch_clsf;
	}

	public String getBase_alon(){
		return this.base_alon;
	}
}

/* 작성시간 : Tue Jun 23 11:06:25 KST 2009 */