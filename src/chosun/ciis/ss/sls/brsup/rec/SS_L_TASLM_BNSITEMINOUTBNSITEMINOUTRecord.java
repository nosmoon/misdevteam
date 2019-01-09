/***************************************************************************************************
* 파일명 : .java
* 기능 : 통합정보지원시스템-판촉물재고현황-조회화면
* 작성일자 : 2009-05-06
* 작성자 : 김용욱
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.ds.*;

/**
 * 통합정보지원시스템-판촉물재고현황-조회화면
 */

public class SS_L_TASLM_BNSITEMINOUTBNSITEMINOUTRecord extends java.lang.Object implements java.io.Serializable{

	public String itemclsf;
	public String itemcd;
	public String itemnm;
	public String unit;
	public String mainware;
	public String pyungware;
	public String sungware;
	public String remk;
	public Timestamp incmgdt;
	public String bns_itemcd;
	public int stokqunt;
	public String whcd;
	public String cdnm;

	public SS_L_TASLM_BNSITEMINOUTBNSITEMINOUTRecord(){}

	public void setItemclsf(String itemclsf){
		this.itemclsf = itemclsf;
	}

	public void setItemcd(String itemcd){
		this.itemcd = itemcd;
	}

	public void setItemnm(String itemnm){
		this.itemnm = itemnm;
	}

	public void setUnit(String unit){
		this.unit = unit;
	}

	public void setMainware(String mainware){
		this.mainware = mainware;
	}

	public void setPyungware(String pyungware){
		this.pyungware = pyungware;
	}

	public void setSungware(String sungware){
		this.sungware = sungware;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setIncmgdt(Timestamp incmgdt){
		this.incmgdt = incmgdt;
	}

	public void setBns_itemcd(String bns_itemcd){
		this.bns_itemcd = bns_itemcd;
	}

	public void setStokqunt(int stokqunt){
		this.stokqunt = stokqunt;
	}

	public void setWhcd(String whcd){
		this.whcd = whcd;
	}

	public void setCdnm(String cdnm){
		this.cdnm = cdnm;
	}

	public String getItemclsf(){
		return this.itemclsf;
	}

	public String getItemcd(){
		return this.itemcd;
	}

	public String getItemnm(){
		return this.itemnm;
	}

	public String getUnit(){
		return this.unit;
	}

	public String getMainware(){
		return this.mainware;
	}

	public String getPyungware(){
		return this.pyungware;
	}

	public String getSungware(){
		return this.sungware;
	}

	public String getRemk(){
		return this.remk;
	}

	public Timestamp getIncmgdt(){
		return this.incmgdt;
	}

	public String getBns_itemcd(){
		return this.bns_itemcd;
	}

	public int getStokqunt(){
		return this.stokqunt;
	}

	public String getWhcd(){
		return this.whcd;
	}

	public String getCdnm(){
		return this.cdnm;
	}
}

/* 작성시간 : Wed May 06 16:46:30 PDT 2009 */