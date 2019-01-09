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


public class MT_PAPINOUT_3017_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String hdqt_paper_clsf;
	public String pj_kind;
	public String cnt;
	public String wgt;

	public MT_PAPINOUT_3017_LCURLIST1Record(){}

	public void setHdqt_paper_clsf(String hdqt_paper_clsf){
		this.hdqt_paper_clsf = hdqt_paper_clsf;
	}

	public void setPj_kind(String pj_kind){
		this.pj_kind = pj_kind;
	}

	public void setCnt(String cnt){
		this.cnt = cnt;
	}

	public void setWgt(String wgt){
		this.wgt = wgt;
	}

	public String getHdqt_paper_clsf(){
		return this.hdqt_paper_clsf;
	}

	public String getPj_kind(){
		return this.pj_kind;
	}

	public String getCnt(){
		return this.cnt;
	}

	public String getWgt(){
		return this.wgt;
	}
}

/* 작성시간 : Mon Aug 24 18:26:11 KST 2009 */