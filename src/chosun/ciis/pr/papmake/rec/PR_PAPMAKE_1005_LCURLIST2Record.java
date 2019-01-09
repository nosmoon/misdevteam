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


public class PR_PAPMAKE_1005_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String medi_cd;
	public String medi_nm;
	public String pcnt;
	public String clr_pcnt;
	public String pj_qty;
	public String remk;
	public String seq;

	public PR_PAPMAKE_1005_LCURLIST2Record(){}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setMedi_nm(String medi_nm){
		this.medi_nm = medi_nm;
	}

	public void setPcnt(String pcnt){
		this.pcnt = pcnt;
	}

	public void setClr_pcnt(String clr_pcnt){
		this.clr_pcnt = clr_pcnt;
	}

	public void setPj_qty(String pj_qty){
		this.pj_qty = pj_qty;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getMedi_nm(){
		return this.medi_nm;
	}

	public String getPcnt(){
		return this.pcnt;
	}

	public String getClr_pcnt(){
		return this.clr_pcnt;
	}

	public String getPj_qty(){
		return this.pj_qty;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getSeq(){
		return this.seq;
	}
}

/* 작성시간 : Fri Jul 17 20:39:13 KST 2009 */