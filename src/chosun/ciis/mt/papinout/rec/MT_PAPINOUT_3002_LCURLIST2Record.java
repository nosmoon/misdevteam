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


package chosun.ciis.mt.papinout.rec;

import java.sql.*;
import chosun.ciis.mt.papinout.dm.*;
import chosun.ciis.mt.papinout.ds.*;

/**
 * 
 */


public class MT_PAPINOUT_3002_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String medi_cd;
	public String sect_cd;
	public String hdqt_paper_clsf;
	public String prt_clsf;
	public String pj_kind;
	public String pj_cnt;
	public String pj_wgt;
	public String prt_dt;

	public MT_PAPINOUT_3002_LCURLIST2Record(){}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setSect_cd(String sect_cd){
		this.sect_cd = sect_cd;
	}

	public void setHdqt_paper_clsf(String hdqt_paper_clsf){
		this.hdqt_paper_clsf = hdqt_paper_clsf;
	}

	public void setPrt_clsf(String prt_clsf){
		this.prt_clsf = prt_clsf;
	}

	public void setPj_kind(String pj_kind){
		this.pj_kind = pj_kind;
	}

	public void setPj_cnt(String pj_cnt){
		this.pj_cnt = pj_cnt;
	}

	public void setPj_wgt(String pj_wgt){
		this.pj_wgt = pj_wgt;
	}

	public void setPrt_dt(String prt_dt){
		this.prt_dt = prt_dt;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getSect_cd(){
		return this.sect_cd;
	}

	public String getHdqt_paper_clsf(){
		return this.hdqt_paper_clsf;
	}

	public String getPrt_clsf(){
		return this.prt_clsf;
	}

	public String getPj_kind(){
		return this.pj_kind;
	}

	public String getPj_cnt(){
		return this.pj_cnt;
	}

	public String getPj_wgt(){
		return this.pj_wgt;
	}

	public String getPrt_dt(){
		return this.prt_dt;
	}
}

/* 작성시간 : Tue Sep 08 01:15:57 KST 2009 */