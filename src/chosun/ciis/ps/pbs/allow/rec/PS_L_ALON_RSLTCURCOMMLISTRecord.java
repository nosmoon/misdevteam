/***************************************************************************************************
* 파일명 : SP_PS_L_ALON_RSLT.java
* 수당-수당관리 수당처리 사원조회
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
 * 수당-수당관리 수당처리 사원조회
 *
 */



public class PS_L_ALON_RSLTCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String bonm;
	public String flnm;
	public String boemp_no;
	public String boemp_nm;
	public String dutycd_nm;
	public String aloncd;
	public int trgtnoit;
	public String fix_rateclsf;
	public int amt;
	public String ratiocalcclsf;
	public float ratio;

	public PS_L_ALON_RSLTCURCOMMLISTRecord(){}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setBoemp_no(String boemp_no){
		this.boemp_no = boemp_no;
	}

	public void setBoemp_nm(String boemp_nm){
		this.boemp_nm = boemp_nm;
	}

	public void setDutycd_nm(String dutycd_nm){
		this.dutycd_nm = dutycd_nm;
	}

	public void setAloncd(String aloncd){
		this.aloncd = aloncd;
	}

	public void setTrgtnoit(int trgtnoit){
		this.trgtnoit = trgtnoit;
	}

	public void setFix_rateclsf(String fix_rateclsf){
		this.fix_rateclsf = fix_rateclsf;
	}

	public void setAmt(int amt){
		this.amt = amt;
	}

	public void setRatiocalcclsf(String ratiocalcclsf){
		this.ratiocalcclsf = ratiocalcclsf;
	}

	public void setRatio(float ratio){
		this.ratio = ratio;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getBoemp_no(){
		return this.boemp_no;
	}

	public String getBoemp_nm(){
		return this.boemp_nm;
	}

	public String getDutycd_nm(){
		return this.dutycd_nm;
	}

	public String getAloncd(){
		return this.aloncd;
	}

	public int getTrgtnoit(){
		return this.trgtnoit;
	}

	public String getFix_rateclsf(){
		return this.fix_rateclsf;
	}

	public int getAmt(){
		return this.amt;
	}

	public String getRatiocalcclsf(){
		return this.ratiocalcclsf;
	}

	public float getRatio(){
		return this.ratio;
	}
}

/* 작성시간 : Tue Mar 09 12:42:11 KST 2004 */