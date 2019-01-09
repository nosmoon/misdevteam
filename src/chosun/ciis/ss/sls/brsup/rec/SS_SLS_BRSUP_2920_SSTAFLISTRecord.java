/***************************************************************************************************
* 파일명 : SS_SLS_BRSUP_2920_SSTAFLISTRecord.java
* 기능 : 센터지원-판촉현황-요원관리-요원별실적관리-상세(팝업)
* 작성일자 : 2016-08-11
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
**  센터지원-판촉현황-요원관리-요원별실적관리-상세(팝업)
**/


public class SS_SLS_BRSUP_2920_SSTAFLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String stafno;
	public String stafnm;
	public String stafclsfnm;
	public String cntrstatnm;
	public String prn;
	public String ernno;
	public String delyn;
	public String closmm;
	public String extn_qty;
	public String avg_svc;
	public String bs_qty;
	public String bs_rate;
	public String susp_qty;
	public String susp_rate;
	public String misu_qty;
	public String misu_rate;
	public String clsfdtls;

	public SS_SLS_BRSUP_2920_SSTAFLISTRecord(){}

	public void setStafno(String stafno){
		this.stafno = stafno;
	}

	public void setStafnm(String stafnm){
		this.stafnm = stafnm;
	}

	public void setStafclsfnm(String stafclsfnm){
		this.stafclsfnm = stafclsfnm;
	}

	public void setCntrstatnm(String cntrstatnm){
		this.cntrstatnm = cntrstatnm;
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

	public void setClsfdtls(String clsfdtls){
		this.clsfdtls = clsfdtls;
	}

	public String getStafno(){
		return this.stafno;
	}

	public String getStafnm(){
		return this.stafnm;
	}

	public String getStafclsfnm(){
		return this.stafclsfnm;
	}

	public String getCntrstatnm(){
		return this.cntrstatnm;
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

	public String getClsfdtls(){
		return this.clsfdtls;
	}
}

/* 작성시간 : Thu Aug 11 10:44:09 KST 2016 */