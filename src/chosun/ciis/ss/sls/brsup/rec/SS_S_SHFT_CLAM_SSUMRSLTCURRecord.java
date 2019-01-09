/***************************************************************************************************
 * 파일명   : aaaa.java
 * 기능     : 지국업무지원-Billing자동이체-청구관리-이체구분별 청구목록
 * 작성일자 : 2004/04/16
 * 작성자   : 김상열
 **************************************************************************************************/
 /**************************************************************************************************
 * 수정내역 : 이체방법별 지국수 가져오도록 수정
 * 수정자   : 이혁
 * 수정일자 : 2005-03-28
 * 백업     :
 **************************************************************************************************/


package chosun.ciis.ss.sls.brsup.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.ds.*;

/**
 * 지국업무지원-Billing자동이체-청구관리-이체구분별 청구목록
 */

public class SS_S_SHFT_CLAM_SSUMRSLTCURRecord extends java.lang.Object implements java.io.Serializable{

	public String basidt;
	public String pymtdt;
	public String shftclsfcd;
	public String shftclsfnm;
	public int clamnoit;
	public long clamtotamt;
	public int recpnoit;
	public long recptotamt;
	public int billcoms;
	public String clamcrtedt;
	public String clamreqdt;
	public String recprmsgdt;
	public String clamstat;
	public String clamstatnm;
	public int bocnt;

	public SS_S_SHFT_CLAM_SSUMRSLTCURRecord(){}

	public void setBasidt(String basidt){
		this.basidt = basidt;
	}

	public void setPymtdt(String pymtdt){
		this.pymtdt = pymtdt;
	}

	public void setShftclsfcd(String shftclsfcd){
		this.shftclsfcd = shftclsfcd;
	}

	public void setShftclsfnm(String shftclsfnm){
		this.shftclsfnm = shftclsfnm;
	}

	public void setClamnoit(int clamnoit){
		this.clamnoit = clamnoit;
	}

	public void setClamtotamt(long clamtotamt){
		this.clamtotamt = clamtotamt;
	}

	public void setRecpnoit(int recpnoit){
		this.recpnoit = recpnoit;
	}

	public void setRecptotamt(long recptotamt){
		this.recptotamt = recptotamt;
	}

	public void setBillcoms(int billcoms){
		this.billcoms = billcoms;
	}

	public void setClamcrtedt(String clamcrtedt){
		this.clamcrtedt = clamcrtedt;
	}

	public void setClamreqdt(String clamreqdt){
		this.clamreqdt = clamreqdt;
	}

	public void setRecprmsgdt(String recprmsgdt){
		this.recprmsgdt = recprmsgdt;
	}

	public void setClamstat(String clamstat){
		this.clamstat = clamstat;
	}

	public void setClamstatnm(String clamstatnm){
		this.clamstatnm = clamstatnm;
	}

	public void setBocnt(int bocnt){
		this.bocnt = bocnt;
	}

	public String getBasidt(){
		return this.basidt;
	}

	public String getPymtdt(){
		return this.pymtdt;
	}

	public String getShftclsfcd(){
		return this.shftclsfcd;
	}

	public String getShftclsfnm(){
		return this.shftclsfnm;
	}

	public int getClamnoit(){
		return this.clamnoit;
	}

	public long getClamtotamt(){
		return this.clamtotamt;
	}

	public int getRecpnoit(){
		return this.recpnoit;
	}

	public long getRecptotamt(){
		return this.recptotamt;
	}

	public int getBillcoms(){
		return this.billcoms;
	}

	public String getClamcrtedt(){
		return this.clamcrtedt;
	}

	public String getClamreqdt(){
		return this.clamreqdt;
	}

	public String getRecprmsgdt(){
		return this.recprmsgdt;
	}

	public String getClamstat(){
		return this.clamstat;
	}

	public String getClamstatnm(){
		return this.clamstatnm;
	}

	public int getBocnt(){
		return this.bocnt;
	}
}

/* 작성시간 : Tue Mar 29 13:39:07 KST 2005 */
