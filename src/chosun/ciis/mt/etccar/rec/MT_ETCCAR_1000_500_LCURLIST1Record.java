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


package chosun.ciis.mt.etccar.rec;

import java.sql.*;
import chosun.ciis.mt.etccar.dm.*;
import chosun.ciis.mt.etccar.ds.*;

/**
 * 
 */


public class MT_ETCCAR_1000_500_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String drvr_nm;
	public String buyoil_dt;
	public String buyoil_tm;
	public String oil_kind;
	public String buyoil_qunt;
	public String buyoil_gag;
	public String outsd_oil_dt;
	public String outsd_oil_tm;
	public String outsd_oil_qunt;
	public String seq;
	public String occr_dt;
	public String remk;
	public String cmpy_cd;

	public MT_ETCCAR_1000_500_LCURLIST1Record(){}

	public void setDrvr_nm(String drvr_nm){
		this.drvr_nm = drvr_nm;
	}

	public void setBuyoil_dt(String buyoil_dt){
		this.buyoil_dt = buyoil_dt;
	}

	public void setBuyoil_tm(String buyoil_tm){
		this.buyoil_tm = buyoil_tm;
	}

	public void setOil_kind(String oil_kind){
		this.oil_kind = oil_kind;
	}

	public void setBuyoil_qunt(String buyoil_qunt){
		this.buyoil_qunt = buyoil_qunt;
	}

	public void setBuyoil_gag(String buyoil_gag){
		this.buyoil_gag = buyoil_gag;
	}

	public void setOutsd_oil_dt(String outsd_oil_dt){
		this.outsd_oil_dt = outsd_oil_dt;
	}

	public void setOutsd_oil_tm(String outsd_oil_tm){
		this.outsd_oil_tm = outsd_oil_tm;
	}

	public void setOutsd_oil_qunt(String outsd_oil_qunt){
		this.outsd_oil_qunt = outsd_oil_qunt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}
	
	public String getDrvr_nm(){
		return this.drvr_nm;
	}

	public String getBuyoil_dt(){
		return this.buyoil_dt;
	}

	public String getBuyoil_tm(){
		return this.buyoil_tm;
	}

	public String getOil_kind(){
		return this.oil_kind;
	}

	public String getBuyoil_qunt(){
		return this.buyoil_qunt;
	}

	public String getBuyoil_gag(){
		return this.buyoil_gag;
	}

	public String getOutsd_oil_dt(){
		return this.outsd_oil_dt;
	}

	public String getOutsd_oil_tm(){
		return this.outsd_oil_tm;
	}

	public String getOutsd_oil_qunt(){
		return this.outsd_oil_qunt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getRemk(){
		return this.remk;
	}
	
}

/* 작성시간 : Tue Sep 18 14:37:10 KST 2012 */