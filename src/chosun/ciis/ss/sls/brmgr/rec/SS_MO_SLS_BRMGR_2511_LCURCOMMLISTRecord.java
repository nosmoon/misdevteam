/***************************************************************************************************
* 파일명 : SS_MO_SLS_BRMGR_2511_LCURCOMMLISTRecord.java
* 기능 : 센터종합관리-센터관리-센터건전도-부수현황_모바일용
* 작성일자 : 2016-12-19
* 작성자 : 장 선 희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 센터정렬순으로 정렬, 팀,파트,지역으로 조건 넣을 수 있도록 추가.
* 수정자 : 장 선 희
* 수정일자 : 2017-03-15
* 백업 :
***************************************************************************************************/


package chosun.ciis.ss.sls.brmgr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.ds.*;

/**
 *
 */


public class SS_MO_SLS_BRMGR_2511_LCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String yymm;
	public String deptcd;
	public String deptnm;
	public String partcd;
	public String partnm;
	public String areacd;
	public String areanm;
	public String srtseq;
	public String bocd;
	public String bonm;
	public String boclsf;
	public String curmm_issu_qty;
	public String rdr_qty;
	public String gap_qty;
	public String val_qty;
	public String val_rate;
	public String pre_val_qty;
	public String pre_val_rate;

	public SS_MO_SLS_BRMGR_2511_LCURCOMMLISTRecord(){}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setDeptnm(String deptnm){
		this.deptnm = deptnm;
	}

	public void setPartcd(String partcd){
		this.partcd = partcd;
	}

	public void setPartnm(String partnm){
		this.partnm = partnm;
	}

	public void setAreacd(String areacd){
		this.areacd = areacd;
	}

	public void setAreanm(String areanm){
		this.areanm = areanm;
	}

	public void setSrtseq(String srtseq){
		this.srtseq = srtseq;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setBoclsf(String boclsf){
		this.boclsf = boclsf;
	}

	public void setCurmm_issu_qty(String curmm_issu_qty){
		this.curmm_issu_qty = curmm_issu_qty;
	}

	public void setRdr_qty(String rdr_qty){
		this.rdr_qty = rdr_qty;
	}

	public void setGap_qty(String gap_qty){
		this.gap_qty = gap_qty;
	}

	public void setVal_qty(String val_qty){
		this.val_qty = val_qty;
	}

	public void setVal_rate(String val_rate){
		this.val_rate = val_rate;
	}

	public void setPre_val_qty(String pre_val_qty){
		this.pre_val_qty = pre_val_qty;
	}

	public void setPre_val_rate(String pre_val_rate){
		this.pre_val_rate = pre_val_rate;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getDeptnm(){
		return this.deptnm;
	}

	public String getPartcd(){
		return this.partcd;
	}

	public String getPartnm(){
		return this.partnm;
	}

	public String getAreacd(){
		return this.areacd;
	}

	public String getAreanm(){
		return this.areanm;
	}

	public String getSrtseq(){
		return this.srtseq;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getBoclsf(){
		return this.boclsf;
	}

	public String getCurmm_issu_qty(){
		return this.curmm_issu_qty;
	}

	public String getRdr_qty(){
		return this.rdr_qty;
	}

	public String getGap_qty(){
		return this.gap_qty;
	}

	public String getVal_qty(){
		return this.val_qty;
	}

	public String getVal_rate(){
		return this.val_rate;
	}

	public String getPre_val_qty(){
		return this.pre_val_qty;
	}

	public String getPre_val_rate(){
		return this.pre_val_rate;
	}
}

/* 작성시간 : Wed Mar 15 16:52:44 KST 2017 */