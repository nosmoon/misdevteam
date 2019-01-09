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


public class PR_PRTEXEC_2002_LCURLIST_DRecord extends java.lang.Object implements java.io.Serializable{

	public String new_flag;
	public String medi_cd;
	public String issu_dt;
	public String sect_cd;
	public String pcnt;
	public String clr_pcnt;
	public String issu_clsf;

	public PR_PRTEXEC_2002_LCURLIST_DRecord(){}

	public void setNew_flag(String new_flag){
		this.new_flag = new_flag;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public void setSect_cd(String sect_cd){
		this.sect_cd = sect_cd;
	}

	public void setPcnt(String pcnt){
		this.pcnt = pcnt;
	}

	public void setClr_pcnt(String clr_pcnt){
		this.clr_pcnt = clr_pcnt;
	}

	public void setIssu_clsf(String issu_clsf){
		this.issu_clsf = issu_clsf;
	}

	public String getNew_flag(){
		return this.new_flag;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getIssu_dt(){
		return this.issu_dt;
	}

	public String getSect_cd(){
		return this.sect_cd;
	}

	public String getPcnt(){
		return this.pcnt;
	}

	public String getClr_pcnt(){
		return this.clr_pcnt;
	}

	public String getIssu_clsf(){
		return this.issu_clsf;
	}
}

/* 작성시간 : Fri Jun 19 18:31:15 KST 2009 */