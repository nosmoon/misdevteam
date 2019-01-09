/***************************************************************************************************
* 파일명 : SS_MO_SLS_BRMGR_2510_LCURCOMMLISTRecord.java
* 기능 : 센터종합관리-센터관리-센터건전도-확장부수_모바일용
* 작성일자 : 2016-12-19
* 작성자 : 장 선 희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 센터정렬순으로 정렬, 팀,파트,지역으로 조건 넣을 수 있도록 추가.
* 수정자 : 장 선 희
* 수정일자 : 2017-03-16
* 백업 :
***************************************************************************************************/


package chosun.ciis.ss.sls.brmgr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.ds.*;

/**
 *
 */


public class SS_MO_SLS_BRMGR_2510_LCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

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
	public String rdr_qty;
	public String jm_qty;
	public String extn_qty;
	public String susp_qty;
	public String grow_qty;
	public String extn_rate;
	public String susp_rate;
	public String extn_qty2;
	public String susp_qty2;
	public String grow_qty2;
	public String extn_rate2;
	public String susp_rate2;

	public SS_MO_SLS_BRMGR_2510_LCURCOMMLISTRecord(){}

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

	public void setRdr_qty(String rdr_qty){
		this.rdr_qty = rdr_qty;
	}

	public void setJm_qty(String jm_qty){
		this.jm_qty = jm_qty;
	}

	public void setExtn_qty(String extn_qty){
		this.extn_qty = extn_qty;
	}

	public void setSusp_qty(String susp_qty){
		this.susp_qty = susp_qty;
	}

	public void setGrow_qty(String grow_qty){
		this.grow_qty = grow_qty;
	}

	public void setExtn_rate(String extn_rate){
		this.extn_rate = extn_rate;
	}

	public void setSusp_rate(String susp_rate){
		this.susp_rate = susp_rate;
	}

	public void setExtn_qty2(String extn_qty2){
		this.extn_qty2 = extn_qty2;
	}

	public void setSusp_qty2(String susp_qty2){
		this.susp_qty2 = susp_qty2;
	}

	public void setGrow_qty2(String grow_qty2){
		this.grow_qty2 = grow_qty2;
	}

	public void setExtn_rate2(String extn_rate2){
		this.extn_rate2 = extn_rate2;
	}

	public void setSusp_rate2(String susp_rate2){
		this.susp_rate2 = susp_rate2;
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

	public String getRdr_qty(){
		return this.rdr_qty;
	}

	public String getJm_qty(){
		return this.jm_qty;
	}

	public String getExtn_qty(){
		return this.extn_qty;
	}

	public String getSusp_qty(){
		return this.susp_qty;
	}

	public String getGrow_qty(){
		return this.grow_qty;
	}

	public String getExtn_rate(){
		return this.extn_rate;
	}

	public String getSusp_rate(){
		return this.susp_rate;
	}

	public String getExtn_qty2(){
		return this.extn_qty2;
	}

	public String getSusp_qty2(){
		return this.susp_qty2;
	}

	public String getGrow_qty2(){
		return this.grow_qty2;
	}

	public String getExtn_rate2(){
		return this.extn_rate2;
	}

	public String getSusp_rate2(){
		return this.susp_rate2;
	}
}

/* 작성시간 : Thu Mar 16 16:27:21 KST 2017 */