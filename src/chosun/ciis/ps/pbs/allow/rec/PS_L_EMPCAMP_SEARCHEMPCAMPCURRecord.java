/***************************************************************************************************
* 파일명 : SP_PS_L_EMPCAMP_SEARCH.java
* 수당-캠페인관리 캠페인수당 내역조회
* 작성일자 : 2004-03-08
* 작성자 : 김건호 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :   
* 백업 :   
***************************************************************************************************/


package chosun.ciis.ps.pbs.allow.rec;

import java.sql.*;
import chosun.ciis.ps.pbs.allow.dm.*;
import chosun.ciis.ps.pbs.allow.ds.*;

/**
 * 수당-캠페인관리 캠페인수당내역 조회
 *
 */

  

public class PS_L_EMPCAMP_SEARCHEMPCAMPCURRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpycd;
	public String bocd;
	public String bonm;
	public String boemp_no;
	public String boemp_nm;
	public String dept_nm;
	public String aloncd;
	public String campseq;
	public int amt;
	public String deptcd;
	public int rnum;

	public PS_L_EMPCAMP_SEARCHEMPCAMPCURRecord(){}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setBoemp_no(String boemp_no){
		this.boemp_no = boemp_no;
	}

	public void setBoemp_nm(String boemp_nm){
		this.boemp_nm = boemp_nm;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setAloncd(String aloncd){
		this.aloncd = aloncd;
	}

	public void setCampseq(String campseq){
		this.campseq = campseq;
	}

	public void setAmt(int amt){
		this.amt = amt;
	}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setRnum(int rnum){
		this.rnum = rnum;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getBoemp_no(){
		return this.boemp_no;
	}

	public String getBoemp_nm(){
		return this.boemp_nm;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getAloncd(){
		return this.aloncd;
	}

	public String getCampseq(){
		return this.campseq;
	}

	public int getAmt(){
		return this.amt;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public int getRnum(){
		return this.rnum;
	}
}

/* 작성시간 : Thu Mar 11 17:51:23 KST 2004 */