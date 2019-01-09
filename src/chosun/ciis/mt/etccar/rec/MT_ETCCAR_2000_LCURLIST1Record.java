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


public class MT_ETCCAR_2000_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String driv_dt;
	public String car_no;
	public String cmpy_mang_nm;
	public String runt;
	public String gag;
	public String drvr_nm;
	public String rid_pers;
	public String rid_deptcd;
	public String driv_purp;
	public String buyoil_tm;
	public String buyoil_qunt;
	public String buyoil_gag;
	public String outsd_oil_qunt;

	public MT_ETCCAR_2000_LCURLIST1Record(){}

	public void setDriv_dt(String driv_dt){
		this.driv_dt = driv_dt;
	}

	public void setCar_no(String car_no){
		this.car_no = car_no;
	}

	public void setCmpy_mang_nm(String cmpy_mang_nm){
		this.cmpy_mang_nm = cmpy_mang_nm;
	}

	public void setRunt(String runt){
		this.runt = runt;
	}

	public void setGag(String gag){
		this.gag = gag;
	}

	public void setDrvr_nm(String drvr_nm){
		this.drvr_nm = drvr_nm;
	}

	public void setRid_pers(String rid_pers){
		this.rid_pers = rid_pers;
	}

	public void setRid_deptcd(String rid_deptcd){
		this.rid_deptcd = rid_deptcd;
	}

	public void setDriv_purp(String driv_purp){
		this.driv_purp = driv_purp;
	}

	public void setBuyoil_tm(String buyoil_tm){
		this.buyoil_tm = buyoil_tm;
	}

	public void setBuyoil_qunt(String buyoil_qunt){
		this.buyoil_qunt = buyoil_qunt;
	}

	public void setBuyoil_gag(String buyoil_gag){
		this.buyoil_gag = buyoil_gag;
	}

	public void setOutsd_oil_qunt(String outsd_oil_qunt){
		this.outsd_oil_qunt = outsd_oil_qunt;
	}

	public String getDriv_dt(){
		return this.driv_dt;
	}

	public String getCar_no(){
		return this.car_no;
	}

	public String getCmpy_mang_nm(){
		return this.cmpy_mang_nm;
	}

	public String getRunt(){
		return this.runt;
	}

	public String getGag(){
		return this.gag;
	}

	public String getDrvr_nm(){
		return this.drvr_nm;
	}

	public String getRid_pers(){
		return this.rid_pers;
	}

	public String getRid_deptcd(){
		return this.rid_deptcd;
	}

	public String getDriv_purp(){
		return this.driv_purp;
	}

	public String getBuyoil_tm(){
		return this.buyoil_tm;
	}

	public String getBuyoil_qunt(){
		return this.buyoil_qunt;
	}

	public String getBuyoil_gag(){
		return this.buyoil_gag;
	}

	public String getOutsd_oil_qunt(){
		return this.outsd_oil_qunt;
	}
}

/* 작성시간 : Tue Apr 14 15:06:38 KST 2009 */