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


package chosun.ciis.pr.papmake.rec;

import java.sql.*;
import chosun.ciis.pr.papmake.dm.*;
import chosun.ciis.pr.papmake.ds.*;

/**
 * 
 */


public class PR_PAPMAKE_1003_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String issu_dt;
	public String medi_cd;
	public String medi_nm;
	public String ecnt;
	public String ledt_cd;
	public String prt_seq;
	public String fld_no;
	public String sect;
	public String last_edt_page;
	public String off_plat_tm;
	public String off_plat_end_tm;
	public String prt_ex_tm;
	public String prt_end_tm;
	public String prt_qty;

	public PR_PAPMAKE_1003_LCURLISTRecord(){}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setMedi_nm(String medi_nm){
		this.medi_nm = medi_nm;
	}

	public void setEcnt(String ecnt){
		this.ecnt = ecnt;
	}

	public void setLedt_cd(String ledt_cd){
		this.ledt_cd = ledt_cd;
	}

	public void setPrt_seq(String prt_seq){
		this.prt_seq = prt_seq;
	}

	public void setFld_no(String fld_no){
		this.fld_no = fld_no;
	}

	public void setSect(String sect){
		this.sect = sect;
	}

	public void setLast_edt_page(String last_edt_page){
		this.last_edt_page = last_edt_page;
	}

	public void setOff_plat_tm(String off_plat_tm){
		this.off_plat_tm = off_plat_tm;
	}

	public void setOff_plat_end_tm(String off_plat_end_tm){
		this.off_plat_end_tm = off_plat_end_tm;
	}

	public void setPrt_ex_tm(String prt_ex_tm){
		this.prt_ex_tm = prt_ex_tm;
	}

	public void setPrt_end_tm(String prt_end_tm){
		this.prt_end_tm = prt_end_tm;
	}

	public void setPrt_qty(String prt_qty){
		this.prt_qty = prt_qty;
	}

	public String getIssu_dt(){
		return this.issu_dt;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getMedi_nm(){
		return this.medi_nm;
	}

	public String getEcnt(){
		return this.ecnt;
	}

	public String getLedt_cd(){
		return this.ledt_cd;
	}

	public String getPrt_seq(){
		return this.prt_seq;
	}

	public String getFld_no(){
		return this.fld_no;
	}

	public String getSect(){
		return this.sect;
	}

	public String getLast_edt_page(){
		return this.last_edt_page;
	}

	public String getOff_plat_tm(){
		return this.off_plat_tm;
	}

	public String getOff_plat_end_tm(){
		return this.off_plat_end_tm;
	}

	public String getPrt_ex_tm(){
		return this.prt_ex_tm;
	}

	public String getPrt_end_tm(){
		return this.prt_end_tm;
	}

	public String getPrt_qty(){
		return this.prt_qty;
	}
}

/* 작성시간 : Sat May 16 16:02:14 KST 2009 */