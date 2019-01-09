/***************************************************************************************************
* 파일명 : SS_BRSUP_2710_LSTAFLISTRecord.java
* 기능 : 센터지원-판촉현황-요원관리-요원별실적관리
* 작성일자 : 2016-05-02
* 작성자 : 장선희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.ds.*;

/**
**  센터지원-판촉현황-요원관리-요원별실적관리
**/


public class SS_SLS_BRSUP_2910_LSTAFLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String stafno;
	public String stafnm;
	public String stafclsfcd;
	public String cntrstatcd;
	public String prn;
	public String ernno;
	public String delyn;
	public String deptcd;
	public String deptnm;
	public String partcd;
	public String partnm;
	public String areacd;
	public String areanm;
	public String bocd;
	public String bonm;
	public String closmm;
	public String extn_qty;
	public String avg_svc;
	public String bs_qty;
	public String bs_rate;
	public String susp_qty;
	public String susp_rate;
	public String misu_qty;
	public String misu_rate;

	public SS_SLS_BRSUP_2910_LSTAFLISTRecord(){}

	public void setStafno(String stafno){
		this.stafno = stafno;
	}

	public void setStafnm(String stafnm){
		this.stafnm = stafnm;
	}

	public void setStafclsfcd(String stafclsfcd){
		this.stafclsfcd = stafclsfcd;
	}

	public void setCntrstatcd(String cntrstatcd){
		this.cntrstatcd = cntrstatcd;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setErnno(String ernno){
		this.ernno = ernno;
	}

	public void setDelyn(String delyn){
		this.delyn = delyn;
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

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setClosmm(String closmm){
		this.closmm = closmm;
	}

	public void setExtn_qty(String extn_qty){
		this.extn_qty = extn_qty;
	}

	public void setAvg_svc(String avg_svc){
		this.avg_svc = avg_svc;
	}

	public void setBs_qty(String bs_qty){
		this.bs_qty = bs_qty;
	}

	public void setBs_rate(String bs_rate){
		this.bs_rate = bs_rate;
	}

	public void setSusp_qty(String susp_qty){
		this.susp_qty = susp_qty;
	}

	public void setSusp_rate(String susp_rate){
		this.susp_rate = susp_rate;
	}

	public void setMisu_qty(String misu_qty){
		this.misu_qty = misu_qty;
	}

	public void setMisu_rate(String misu_rate){
		this.misu_rate = misu_rate;
	}

	public String getStafno(){
		return this.stafno;
	}

	public String getStafnm(){
		return this.stafnm;
	}

	public String getStafclsfcd(){
		return this.stafclsfcd;
	}

	public String getCntrstatcd(){
		return this.cntrstatcd;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getErnno(){
		return this.ernno;
	}

	public String getDelyn(){
		return this.delyn;
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

	public String getBocd(){
		return this.bocd;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getClosmm(){
		return this.closmm;
	}

	public String getExtn_qty(){
		return this.extn_qty;
	}

	public String getAvg_svc(){
		return this.avg_svc;
	}

	public String getBs_qty(){
		return this.bs_qty;
	}

	public String getBs_rate(){
		return this.bs_rate;
	}

	public String getSusp_qty(){
		return this.susp_qty;
	}

	public String getSusp_rate(){
		return this.susp_rate;
	}

	public String getMisu_qty(){
		return this.misu_qty;
	}

	public String getMisu_rate(){
		return this.misu_rate;
	}
}

/* 작성시간 : Tue May 03 18:09:37 KST 2016 */