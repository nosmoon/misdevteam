/***************************************************************************************************
* 파일명 : PR_PRTEXEC_2001_LCURLISTRecord.java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 양정녕
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.pr.prtexec.rec;

import java.sql.*;

import chosun.ciis.pr.prtexec.dm.*;
import chosun.ciis.pr.prtexec.ds.*;

/**
 * 
 */


public class PR_PRTEXEC_2001_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String medi_cd;
	public String medi_nm;
	public String issu_dt;
	public String week;
	public String tot_pcnt;
	public String sect_cd;
	public String sect_nm;
	public String sect_pcnt;
	public String clr_pcnt;

	public PR_PRTEXEC_2001_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setMedi_nm(String medi_nm){
		this.medi_nm = medi_nm;
	}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public void setWeek(String week){
		this.week = week;
	}

	public void setTot_pcnt(String tot_pcnt){
		this.tot_pcnt = tot_pcnt;
	}

	public void setSect_cd(String sect_cd){
		this.sect_cd = sect_cd;
	}

	public void setSect_nm(String sect_nm){
		this.sect_nm = sect_nm;
	}

	public void setSect_pcnt(String sect_pcnt){
		this.sect_pcnt = sect_pcnt;
	}

	public void setClr_pcnt(String clr_pcnt){
		this.clr_pcnt = clr_pcnt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getMedi_nm(){
		return this.medi_nm;
	}

	public String getIssu_dt(){
		return this.issu_dt;
	}

	public String getWeek(){
		return this.week;
	}

	public String getTot_pcnt(){
		return this.tot_pcnt;
	}

	public String getSect_cd(){
		return this.sect_cd;
	}

	public String getSect_nm(){
		return this.sect_nm;
	}

	public String getSect_pcnt(){
		return this.sect_pcnt;
	}

	public String getClr_pcnt(){
		return this.clr_pcnt;
	}
}

/* 작성시간 : Sat Apr 18 16:29:28 KST 2009 */