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


package chosun.ciis.pr.prtcnsg.rec;

import java.sql.*;
import chosun.ciis.pr.prtcnsg.dm.*;
import chosun.ciis.pr.prtcnsg.ds.*;

/**
 * 
 */


public class PR_OTHCNSM_1100_LCURLIST3Record extends java.lang.Object implements java.io.Serializable{

	public String film_use_qunt;
	public String paper_wgt;
	public String seq;

	public PR_OTHCNSM_1100_LCURLIST3Record(){}

	public void setFilm_use_qunt(String film_use_qunt){
		this.film_use_qunt = film_use_qunt;
	}

	public void setPaper_wgt(String paper_wgt){
		this.paper_wgt = paper_wgt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public String getFilm_use_qunt(){
		return this.film_use_qunt;
	}

	public String getPaper_wgt(){
		return this.paper_wgt;
	}

	public String getSeq(){
		return this.seq;
	}
}

/* 작성시간 : Wed Aug 26 16:34:34 KST 2009 */