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


package chosun.ciis.mt.prnpap.rec;

import java.sql.*;
import chosun.ciis.mt.prnpap.dm.*;
import chosun.ciis.mt.prnpap.ds.*;

/**
 * 
 */


public class MT_PRNPAP_3403_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cd;
	public String cdnm;
	public String mang_cd_1;
	public String mang_cd_2;
	public String occr_dt;
	public String seq;
	public String rem_qunt;
	public String cnt;
	public String wgt;

	public MT_PRNPAP_3403_LCURLISTRecord(){}

	public void setCd(String cd){
		this.cd = cd;
	}

	public void setCdnm(String cdnm){
		this.cdnm = cdnm;
	}

	public void setMang_cd_1(String mang_cd_1){
		this.mang_cd_1 = mang_cd_1;
	}

	public void setMang_cd_2(String mang_cd_2){
		this.mang_cd_2 = mang_cd_2;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setRem_qunt(String rem_qunt){
		this.rem_qunt = rem_qunt;
	}

	public void setCnt(String cnt){
		this.cnt = cnt;
	}

	public void setWgt(String wgt){
		this.wgt = wgt;
	}

	public String getCd(){
		return this.cd;
	}

	public String getCdnm(){
		return this.cdnm;
	}

	public String getMang_cd_1(){
		return this.mang_cd_1;
	}

	public String getMang_cd_2(){
		return this.mang_cd_2;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getRem_qunt(){
		return this.rem_qunt;
	}

	public String getCnt(){
		return this.cnt;
	}

	public String getWgt(){
		return this.wgt;
	}
}

/* 작성시간 : Thu May 14 10:06:25 KST 2009 */