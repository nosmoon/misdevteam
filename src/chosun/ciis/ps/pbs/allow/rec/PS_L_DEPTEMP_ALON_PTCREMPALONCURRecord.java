/***************************************************************************************************
 * 파일명   : PS_L_DEPTEMP_ALON_PTCR.java
 * 기능     : 수당-수당월마감 조회
 * 작성일자 : 2004-03-08
 * 작성자   : 김상옥
 **************************************************************************************************/
 /**************************************************************************************************
 * 수정내역 :
 * 수정자   :
 * 수정일자 :
 * 백업     :
 **************************************************************************************************/


package chosun.ciis.ps.pbs.allow.rec;

import java.sql.*;
import chosun.ciis.ps.pbs.allow.dm.*;
import chosun.ciis.ps.pbs.allow.ds.*;

/**
 * 수당-수당월마감 검색
 */

public class PS_L_DEPTEMP_ALON_PTCREMPALONCURRecord extends java.lang.Object implements java.io.Serializable{

	public String deptnm;
	public String deptcd;
	public String boemp_no;
	public String flnm;
	public int paytot_amt;
	public int dductot_amt;
	public int sellpaytot_amt;
	public int selldductot_amt;
	public int paynewnoit;
	public int paylinknoit;
	public int dducnewnoit;
	public int dduclinknoit;
	public int deptrsltnoit;
	public int dcl_amtnoit;
	public int dcl_amtamt;
	public int dcl_amtalontot_amt;
	public int rsltalontot_amt;
	public int spcalontot_amt;
	public int posialontot_amt;
	public int etcalontot_amt;
	public int prsntalontot_amt;
	public int campalontot_amt;
	public int cashalon_amt;
	public int advnalon_amt;
	public int etc_amt;
	public int busnshow_amt;
	public int telfee_amt;
	public int retnalonamt;
	public int gdsdducalonamt;

	public PS_L_DEPTEMP_ALON_PTCREMPALONCURRecord(){}

	public void setDeptnm(String deptnm){
		this.deptnm = deptnm;
	}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setBoemp_no(String boemp_no){
		this.boemp_no = boemp_no;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setPaytot_amt(int paytot_amt){
		this.paytot_amt = paytot_amt;
	}

	public void setDductot_amt(int dductot_amt){
		this.dductot_amt = dductot_amt;
	}

	public void setSellpaytot_amt(int sellpaytot_amt){
		this.sellpaytot_amt = sellpaytot_amt;
	}

	public void setSelldductot_amt(int selldductot_amt){
		this.selldductot_amt = selldductot_amt;
	}

	public void setPaynewnoit(int paynewnoit){
		this.paynewnoit = paynewnoit;
	}

	public void setPaylinknoit(int paylinknoit){
		this.paylinknoit = paylinknoit;
	}

	public void setDducnewnoit(int dducnewnoit){
		this.dducnewnoit = dducnewnoit;
	}

	public void setDduclinknoit(int dduclinknoit){
		this.dduclinknoit = dduclinknoit;
	}

	public void setDeptrsltnoit(int deptrsltnoit){
		this.deptrsltnoit = deptrsltnoit;
	}

	public void setDcl_amtnoit(int dcl_amtnoit){
		this.dcl_amtnoit = dcl_amtnoit;
	}

	public void setDcl_amtamt(int dcl_amtamt){
		this.dcl_amtamt = dcl_amtamt;
	}

	public void setDcl_amtalontot_amt(int dcl_amtalontot_amt){
		this.dcl_amtalontot_amt = dcl_amtalontot_amt;
	}

	public void setRsltalontot_amt(int rsltalontot_amt){
		this.rsltalontot_amt = rsltalontot_amt;
	}

	public void setSpcalontot_amt(int spcalontot_amt){
		this.spcalontot_amt = spcalontot_amt;
	}

	public void setPosialontot_amt(int posialontot_amt){
		this.posialontot_amt = posialontot_amt;
	}

	public void setEtcalontot_amt(int etcalontot_amt){
		this.etcalontot_amt = etcalontot_amt;
	}

	public void setPrsntalontot_amt(int prsntalontot_amt){
		this.prsntalontot_amt = prsntalontot_amt;
	}

	public void setCampalontot_amt(int campalontot_amt){
		this.campalontot_amt = campalontot_amt;
	}

	public void setCashalon_amt(int cashalon_amt){
		this.cashalon_amt = cashalon_amt;
	}

	public void setAdvnalon_amt(int advnalon_amt){
		this.advnalon_amt = advnalon_amt;
	}

	public void setEtc_amt(int etc_amt){
		this.etc_amt = etc_amt;
	}

	public void setBusnshow_amt(int busnshow_amt){
		this.busnshow_amt = busnshow_amt;
	}

	public void setTelfee_amt(int telfee_amt){
		this.telfee_amt = telfee_amt;
	}

	public void setRetnalonamt(int retnalonamt){
		this.retnalonamt = retnalonamt;
	}

	public void setGdsdducalonamt(int gdsdducalonamt){
		this.gdsdducalonamt = gdsdducalonamt;
	}

	public String getDeptnm(){
		return this.deptnm;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getBoemp_no(){
		return this.boemp_no;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public int getPaytot_amt(){
		return this.paytot_amt;
	}

	public int getDductot_amt(){
		return this.dductot_amt;
	}

	public int getSellpaytot_amt(){
		return this.sellpaytot_amt;
	}

	public int getSelldductot_amt(){
		return this.selldductot_amt;
	}

	public int getPaynewnoit(){
		return this.paynewnoit;
	}

	public int getPaylinknoit(){
		return this.paylinknoit;
	}

	public int getDducnewnoit(){
		return this.dducnewnoit;
	}

	public int getDduclinknoit(){
		return this.dduclinknoit;
	}

	public int getDeptrsltnoit(){
		return this.deptrsltnoit;
	}

	public int getDcl_amtnoit(){
		return this.dcl_amtnoit;
	}

	public int getDcl_amtamt(){
		return this.dcl_amtamt;
	}

	public int getDcl_amtalontot_amt(){
		return this.dcl_amtalontot_amt;
	}

	public int getRsltalontot_amt(){
		return this.rsltalontot_amt;
	}

	public int getSpcalontot_amt(){
		return this.spcalontot_amt;
	}

	public int getPosialontot_amt(){
		return this.posialontot_amt;
	}

	public int getEtcalontot_amt(){
		return this.etcalontot_amt;
	}

	public int getPrsntalontot_amt(){
		return this.prsntalontot_amt;
	}

	public int getCampalontot_amt(){
		return this.campalontot_amt;
	}

	public int getCashalon_amt(){
		return this.cashalon_amt;
	}

	public int getAdvnalon_amt(){
		return this.advnalon_amt;
	}

	public int getEtc_amt(){
		return this.etc_amt;
	}

	public int getBusnshow_amt(){
		return this.busnshow_amt;
	}

	public int getTelfee_amt(){
		return this.telfee_amt;
	}

	public int getRetnalonamt(){
		return this.retnalonamt;
	}

	public int getGdsdducalonamt(){
		return this.gdsdducalonamt;
	}
}

/* 작성시간 : Wed Mar 21 17:43:19 KST 2007 */