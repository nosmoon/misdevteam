/***************************************************************************************************
* 파일명 : SS_L_RDR_EXTN_CYBCOSTCURCOMMLISTRecord.java
* 기능 : 확장현황-사이버확장-비용관리-목록
* 작성일자 : 2004-04-09
* 작성자 : 고윤홍
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
 * 확장현황-사이버확장-비용관리-목록
 *
 */

public class SS_L_RDR_EXTN_CYBCOSTCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String deptcd;
	public String deptcdnm;
	public String areacd;
	public String areacdnm;
	public String bocd;
	public String bocdnm;
	public String basidt;
	public int costamt;
	public String busnchrgclamtyn;
	public String busnchrgclamtdt;
	public String splychrgclamtyn;
	public String splychrgclamtdt;
	public String costburdyn;

	public SS_L_RDR_EXTN_CYBCOSTCURCOMMLISTRecord(){}

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

	public void setCostamt(int costamt){
		this.costamt = costamt;
	}

	public void setBusnchrgclamtyn(String busnchrgclamtyn){
		this.busnchrgclamtyn = busnchrgclamtyn;
	}

	public void setBusnchrgclamtdt(String busnchrgclamtdt){
		this.busnchrgclamtdt = busnchrgclamtdt;
	}

	public void setSplychrgclamtyn(String splychrgclamtyn){
		this.splychrgclamtyn = splychrgclamtyn;
	}

	public void setSplychrgclamtdt(String splychrgclamtdt){
		this.splychrgclamtdt = splychrgclamtdt;
	}

	public void setCostburdyn(String costburdyn){
		this.costburdyn = costburdyn;
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

	public int getCostamt(){
		return this.costamt;
	}

	public String getBusnchrgclamtyn(){
		return this.busnchrgclamtyn;
	}

	public String getBusnchrgclamtdt(){
		return this.busnchrgclamtdt;
	}

	public String getSplychrgclamtyn(){
		return this.splychrgclamtyn;
	}

	public String getSplychrgclamtdt(){
		return this.splychrgclamtdt;
	}

	public String getCostburdyn(){
		return this.costburdyn;
	}
}

/* 작성시간 : Fri Apr 09 16:10:52 KST 2004 */