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


package chosun.ciis.hd.affr.rec;

import java.sql.*;
import chosun.ciis.hd.affr.dm.*;
import chosun.ciis.hd.affr.ds.*;

/**
 * 
 */


public class HD_AFFR_4301_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String occr_dt;
	public String seq;
	public String category_clsf;
	public String grp_indt_clsf;
	public String indt_cd;
	public String indt_nm;

	public HD_AFFR_4301_LCURLISTRecord(){}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setCategory_clsf(String category_clsf){
		this.category_clsf = category_clsf;
	}

	public void setGrp_indt_clsf(String grp_indt_clsf){
		this.grp_indt_clsf = grp_indt_clsf;
	}

	public void setIndt_cd(String indt_cd){
		this.indt_cd = indt_cd;
	}

	public void setIndt_nm(String indt_nm){
		this.indt_nm = indt_nm;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getCategory_clsf(){
		return this.category_clsf;
	}

	public String getGrp_indt_clsf(){
		return this.grp_indt_clsf;
	}

	public String getIndt_cd(){
		return this.indt_cd;
	}

	public String getIndt_nm(){
		return this.indt_nm;
	}
}

/* 작성시간 : Fri May 29 17:28:45 KST 2009 */