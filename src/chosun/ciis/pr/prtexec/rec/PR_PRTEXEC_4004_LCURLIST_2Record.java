/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
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


public class PR_PRTEXEC_4004_LCURLIST_2Record extends java.lang.Object implements java.io.Serializable{

	public String issu_dt;
	public String medi_nm;
	public String sect_nm;
	public String pcnt;
	public String clr_pcnt;
	public String std;
	public String prt_dt;
	public String prt_tm;
	public String dual_out_nm;
	public String tm_in_yn;
	public String remk;

	public PR_PRTEXEC_4004_LCURLIST_2Record(){}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public void setMedi_nm(String medi_nm){
		this.medi_nm = medi_nm;
	}

	public void setSect_nm(String sect_nm){
		this.sect_nm = sect_nm;
	}

	public void setPcnt(String pcnt){
		this.pcnt = pcnt;
	}

	public void setClr_pcnt(String clr_pcnt){
		this.clr_pcnt = clr_pcnt;
	}

	public void setStd(String std){
		this.std = std;
	}

	public void setPrt_dt(String prt_dt){
		this.prt_dt = prt_dt;
	}

	public void setPrt_tm(String prt_tm){
		this.prt_tm = prt_tm;
	}

	public void setDual_out_nm(String dual_out_nm){
		this.dual_out_nm = dual_out_nm;
	}

	public void setTm_in_yn(String tm_in_yn){
		this.tm_in_yn = tm_in_yn;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getIssu_dt(){
		return this.issu_dt;
	}

	public String getMedi_nm(){
		return this.medi_nm;
	}

	public String getSect_nm(){
		return this.sect_nm;
	}

	public String getPcnt(){
		return this.pcnt;
	}

	public String getClr_pcnt(){
		return this.clr_pcnt;
	}

	public String getStd(){
		return this.std;
	}

	public String getPrt_dt(){
		return this.prt_dt;
	}

	public String getPrt_tm(){
		return this.prt_tm;
	}

	public String getDual_out_nm(){
		return this.dual_out_nm;
	}

	public String getTm_in_yn(){
		return this.tm_in_yn;
	}

	public String getRemk(){
		return this.remk;
	}
}

/* 작성시간 : Wed Jun 10 18:51:42 KST 2009 */