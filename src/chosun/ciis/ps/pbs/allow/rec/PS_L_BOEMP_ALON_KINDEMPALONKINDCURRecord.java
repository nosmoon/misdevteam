/***************************************************************************************************
 * 파일명   : PS_L_BOEMP_ALON_KINDEMPALONKINDCURRecord.java
 * 기능     : 수당-사원별수당관리 초기
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
 *   수당-사원별수당관리 초기
 *
 **/

public class PS_L_BOEMP_ALON_KINDEMPALONKINDCURRecord extends java.lang.Object implements java.io.Serializable{

	public String bocd;
	public String boemp_no;
	public String flnm;
	public String deptcd;
	public String deptnm;
	public String busn_alon;
	public String rslt_alon;
	public String dcl_amt_alon;
	public String spc_alon;
	public String posi_alon;
	public String prsnt_alon;
	public String camp_alon;
	public String cash_alon;
	public String advn_alon;
	public String busnshow_alon;
	public String telfee_alon;

	public PS_L_BOEMP_ALON_KINDEMPALONKINDCURRecord(){}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBoemp_no(String boemp_no){
		this.boemp_no = boemp_no;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setDeptnm(String deptnm){
		this.deptnm = deptnm;
	}

	public void setBusn_alon(String busn_alon){
		this.busn_alon = busn_alon;
	}

	public void setRslt_alon(String rslt_alon){
		this.rslt_alon = rslt_alon;
	}

	public void setDcl_amt_alon(String dcl_amt_alon){
		this.dcl_amt_alon = dcl_amt_alon;
	}

	public void setSpc_alon(String spc_alon){
		this.spc_alon = spc_alon;
	}

	public void setPosi_alon(String posi_alon){
		this.posi_alon = posi_alon;
	}

	public void setPrsnt_alon(String prsnt_alon){
		this.prsnt_alon = prsnt_alon;
	}

	public void setCamp_alon(String camp_alon){
		this.camp_alon = camp_alon;
	}

	public void setCash_alon(String cash_alon){
		this.cash_alon = cash_alon;
	}

	public void setAdvn_alon(String advn_alon){
		this.advn_alon = advn_alon;
	}

	public void setBusnshow_alon(String busnshow_alon){
		this.busnshow_alon = busnshow_alon;
	}

	public void setTelfee_alon(String telfee_alon){
		this.telfee_alon = telfee_alon;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getBoemp_no(){
		return this.boemp_no;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getDeptnm(){
		return this.deptnm;
	}

	public String getBusn_alon(){
		return this.busn_alon;
	}

	public String getRslt_alon(){
		return this.rslt_alon;
	}

	public String getDcl_amt_alon(){
		return this.dcl_amt_alon;
	}

	public String getSpc_alon(){
		return this.spc_alon;
	}

	public String getPosi_alon(){
		return this.posi_alon;
	}

	public String getPrsnt_alon(){
		return this.prsnt_alon;
	}

	public String getCamp_alon(){
		return this.camp_alon;
	}

	public String getCash_alon(){
		return this.cash_alon;
	}

	public String getAdvn_alon(){
		return this.advn_alon;
	}

	public String getBusnshow_alon(){
		return this.busnshow_alon;
	}

	public String getTelfee_alon(){
		return this.telfee_alon;
	}
}

/* 작성시간 : Wed Mar 21 18:40:03 KST 2007 */