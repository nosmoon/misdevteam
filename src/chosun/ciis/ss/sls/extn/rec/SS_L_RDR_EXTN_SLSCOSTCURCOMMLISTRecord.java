/***************************************************************************************************
* 파일명 : SS_L_RDR_EXTN_SLSCOSTCURCOMMLISTRecord.java
* 기능 : 확장지원비용 목록을 위한 Record
* 작성일자 : 2003-12-15
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.rec;

import java.sql.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.ds.*;

/**
 * class definition
 *
 */


public class SS_L_RDR_EXTN_SLSCOSTCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String deptcd;
	public String deptcdnm;
	public String areacd;
	public String areacdnm;
	public String bocd;
	public String bocdnm;
	public String basidt;
	public int realrdrcnt;
	public int boqty;
	public int movmqty;
	public int empqty;
	public int exgqty;
	public int sumqty;
	public int apt;
	public int villa;
	public int hous;
	public int offi_room;
	public int shop;
	public int etc;
	public int rsltqty;
	public int payqty;
	public int uprc;
	public int splyamt;

	public SS_L_RDR_EXTN_SLSCOSTCURCOMMLISTRecord(){}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setDeptcdnm(String deptcdnm){
		this.deptcdnm = deptcdnm;
	}

	public void setAreacd(String areacd){
		this.areacd = areacd;
	}

	public void setAreacdnm(String areacdnm){
		this.areacdnm = areacdnm;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBocdnm(String bocdnm){
		this.bocdnm = bocdnm;
	}

	public void setBasidt(String basidt){
		this.basidt = basidt;
	}

	public void setRealrdrcnt(int realrdrcnt){
		this.realrdrcnt = realrdrcnt;
	}

	public void setBoqty(int boqty){
		this.boqty = boqty;
	}

	public void setMovmqty(int movmqty){
		this.movmqty = movmqty;
	}

	public void setEmpqty(int empqty){
		this.empqty = empqty;
	}

	public void setExgqty(int exgqty){
		this.exgqty = exgqty;
	}

	public void setSumqty(int sumqty){
		this.sumqty = sumqty;
	}

	public void setApt(int apt){
		this.apt = apt;
	}

	public void setVilla(int villa){
		this.villa = villa;
	}

	public void setHous(int hous){
		this.hous = hous;
	}

	public void setOffi_room(int offi_room){
		this.offi_room = offi_room;
	}

	public void setShop(int shop){
		this.shop = shop;
	}

	public void setEtc(int etc){
		this.etc = etc;
	}

	public void setRsltqty(int rsltqty){
		this.rsltqty = rsltqty;
	}

	public void setPayqty(int payqty){
		this.payqty = payqty;
	}

	public void setUprc(int uprc){
		this.uprc = uprc;
	}

	public void setSplyamt(int splyamt){
		this.splyamt = splyamt;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getDeptcdnm(){
		return this.deptcdnm;
	}

	public String getAreacd(){
		return this.areacd;
	}

	public String getAreacdnm(){
		return this.areacdnm;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getBocdnm(){
		return this.bocdnm;
	}

	public String getBasidt(){
		return this.basidt;
	}

	public int getRealrdrcnt(){
		return this.realrdrcnt;
	}

	public int getBoqty(){
		return this.boqty;
	}

	public int getMovmqty(){
		return this.movmqty;
	}

	public int getEmpqty(){
		return this.empqty;
	}

	public int getExgqty(){
		return this.exgqty;
	}

	public int getSumqty(){
		return this.sumqty;
	}

	public int getApt(){
		return this.apt;
	}

	public int getVilla(){
		return this.villa;
	}

	public int getHous(){
		return this.hous;
	}

	public int getOffi_room(){
		return this.offi_room;
	}

	public int getShop(){
		return this.shop;
	}

	public int getEtc(){
		return this.etc;
	}

	public int getRsltqty(){
		return this.rsltqty;
	}

	public int getPayqty(){
		return this.payqty;
	}

	public int getUprc(){
		return this.uprc;
	}

	public int getSplyamt(){
		return this.splyamt;
	}
}

/* 작성시간 : Thu Dec 18 17:15:06 KST 2003 */