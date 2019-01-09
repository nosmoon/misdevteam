/***************************************************************************************************
* 파일명 : SS_L_QTYAPLC_VEXCCURCOMMLISTRecord.java
* 기능 : 지국경영-부수증감신청대행-목록을 위한 Record
* 작성일자 : 2004-04-24
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/

package chosun.ciis.ss.sls.brmgr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.ds.*;

/**
 * 지국경영-부수증감신청대행-목록을 위한 Record
 */

public class SS_L_QTYAPLC_VEXCCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String deptcd;
	public String areacd;
	public String bocd;
	public String aplcdt;
	public String aplcno;
	public String medicd;
	public String medinm;
	public String basidt;
	public String issudt;
	public int basiqty;
	public int boaplcicdcqty;
	public String sendqty;
	public String chrgcnfmyn;

	public SS_L_QTYAPLC_VEXCCURCOMMLISTRecord(){}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setAreacd(String areacd){
		this.areacd = areacd;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setAplcdt(String aplcdt){
		this.aplcdt = aplcdt;
	}

	public void setAplcno(String aplcno){
		this.aplcno = aplcno;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setMedinm(String medinm){
		this.medinm = medinm;
	}

	public void setBasidt(String basidt){
		this.basidt = basidt;
	}

	public void setIssudt(String issudt){
		this.issudt = issudt;
	}

	public void setBasiqty(int basiqty){
		this.basiqty = basiqty;
	}

	public void setBoaplcicdcqty(int boaplcicdcqty){
		this.boaplcicdcqty = boaplcicdcqty;
	}

	public void setSendqty(String sendqty){
		this.sendqty = sendqty;
	}

	public void setChrgcnfmyn(String chrgcnfmyn){
		this.chrgcnfmyn = chrgcnfmyn;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getAreacd(){
		return this.areacd;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getAplcdt(){
		return this.aplcdt;
	}

	public String getAplcno(){
		return this.aplcno;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getMedinm(){
		return this.medinm;
	}

	public String getBasidt(){
		return this.basidt;
	}

	public String getIssudt(){
		return this.issudt;
	}

	public int getBasiqty(){
		return this.basiqty;
	}

	public int getBoaplcicdcqty(){
		return this.boaplcicdcqty;
	}

	public String getSendqty(){
		return this.sendqty;
	}

	public String getChrgcnfmyn(){
		return this.chrgcnfmyn;
	}
}

/* 작성시간 : Fri May 28 10:59:25 KST 2004 */