/***************************************************************************************************
* 파일명 : .java
* 기능 : 판매-지국지원-이사독자수당현황
* 작성일자 : 2011-12-05
* 작성자 : 이기영
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
 * 
 */


public class SS_L_YEARLY_SUBS_GETUSERUSERLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String acct_cd;
	public String nm;
	public String cmpycd;
	public String cmpynm;
	public String deptcd;
	public String deptnm;
	public String teamcd;
	public String teamnm;
	public String ptph;

	public SS_L_YEARLY_SUBS_GETUSERUSERLISTRecord(){}

	public void setAcct_cd(String acct_cd){
		this.acct_cd = acct_cd;
	}

	public void setNm(String nm){
		this.nm = nm;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setCmpynm(String cmpynm){
		this.cmpynm = cmpynm;
	}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setDeptnm(String deptnm){
		this.deptnm = deptnm;
	}

	public void setTeamcd(String teamcd){
		this.teamcd = teamcd;
	}

	public void setTeamnm(String teamnm){
		this.teamnm = teamnm;
	}

	public void setPtph(String ptph){
		this.ptph = ptph;
	}

	public String getAcct_cd(){
		return this.acct_cd;
	}

	public String getNm(){
		return this.nm;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getCmpynm(){
		return this.cmpynm;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getDeptnm(){
		return this.deptnm;
	}

	public String getTeamcd(){
		return this.teamcd;
	}

	public String getTeamnm(){
		return this.teamnm;
	}

	public String getPtph(){
		return this.ptph;
	}
}

/* 작성시간 : Wed Jan 30 01:41:34 GMT 2013 */