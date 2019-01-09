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


package chosun.ciis.mt.prnpap.rec;

import java.sql.*;
import chosun.ciis.mt.prnpap.dm.*;
import chosun.ciis.mt.prnpap.ds.*;

/**
 * 
 */


public class MT_PRNPAP_3407_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String title;
	public String medi_cd_nm;
	public String sect_cd_nm;
	public String cd;
	public String cdnm;
	public String mang_cd_1;
	public String tmpdata;
	public String cnt;
	public String wgt;
	public String hdqt_paper_clsf;
	public String medi_cd;
	public String sect_cd;
	public String pre_prt_clsf;
	public String issu_dt;
	public String prt_dt;

	public MT_PRNPAP_3407_LCURLIST2Record(){}

	public void setTitle(String title){
		this.title = title;
	}

	public void setMedi_cd_nm(String medi_cd_nm){
		this.medi_cd_nm = medi_cd_nm;
	}

	public void setSect_cd_nm(String sect_cd_nm){
		this.sect_cd_nm = sect_cd_nm;
	}

	public void setCd(String cd){
		this.cd = cd;
	}

	public void setCdnm(String cdnm){
		this.cdnm = cdnm;
	}

	public void setMang_cd_1(String mang_cd_1){
		this.mang_cd_1 = mang_cd_1;
	}

	public void setTmpdata(String tmpdata){
		this.tmpdata = tmpdata;
	}

	public void setCnt(String cnt){
		this.cnt = cnt;
	}

	public void setWgt(String wgt){
		this.wgt = wgt;
	}

	public void setHdqt_paper_clsf(String hdqt_paper_clsf){
		this.hdqt_paper_clsf = hdqt_paper_clsf;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setSect_cd(String sect_cd){
		this.sect_cd = sect_cd;
	}

	public void setPre_prt_clsf(String pre_prt_clsf){
		this.pre_prt_clsf = pre_prt_clsf;
	}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public void setPrt_dt(String prt_dt){
		this.prt_dt = prt_dt;
	}

	public String getTitle(){
		return this.title;
	}

	public String getMedi_cd_nm(){
		return this.medi_cd_nm;
	}

	public String getSect_cd_nm(){
		return this.sect_cd_nm;
	}

	public String getCd(){
		return this.cd;
	}

	public String getCdnm(){
		return this.cdnm;
	}

	public String getMang_cd_1(){
		return this.mang_cd_1;
	}

	public String getTmpdata(){
		return this.tmpdata;
	}

	public String getCnt(){
		return this.cnt;
	}

	public String getWgt(){
		return this.wgt;
	}

	public String getHdqt_paper_clsf(){
		return this.hdqt_paper_clsf;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getSect_cd(){
		return this.sect_cd;
	}

	public String getPre_prt_clsf(){
		return this.pre_prt_clsf;
	}

	public String getIssu_dt(){
		return this.issu_dt;
	}

	public String getPrt_dt(){
		return this.prt_dt;
	}
}

/* 작성시간 : Wed Aug 19 23:57:37 KST 2009 */