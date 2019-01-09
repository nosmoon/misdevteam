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


package chosun.ciis.mt.etcimpt.rec;

import java.sql.*;
import chosun.ciis.mt.etcimpt.dm.*;
import chosun.ciis.mt.etcimpt.ds.*;

/**
 * 
 */


public class MT_ETCIMPT_1210_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String cd;
	public String cd_abrv_nm;
	public String impt_occr_cost;
	public String vat_clsf;
	public String remk;
	public String yy;
	public String seq;
	public String leas_clsf;
	public String sub_seq;

	public MT_ETCIMPT_1210_LCURLIST2Record(){}

	public void setCd(String cd){
		this.cd = cd;
	}

	public void setCd_abrv_nm(String cd_abrv_nm){
		this.cd_abrv_nm = cd_abrv_nm;
	}

	public void setImpt_occr_cost(String impt_occr_cost){
		this.impt_occr_cost = impt_occr_cost;
	}

	public void setVat_clsf(String vat_clsf){
		this.vat_clsf = vat_clsf;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setYy(String yy){
		this.yy = yy;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setLeas_clsf(String leas_clsf){
		this.leas_clsf = leas_clsf;
	}

	public void setSub_seq(String sub_seq){
		this.sub_seq = sub_seq;
	}

	public String getCd(){
		return this.cd;
	}

	public String getCd_abrv_nm(){
		return this.cd_abrv_nm;
	}

	public String getImpt_occr_cost(){
		return this.impt_occr_cost;
	}

	public String getVat_clsf(){
		return this.vat_clsf;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getYy(){
		return this.yy;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getLeas_clsf(){
		return this.leas_clsf;
	}

	public String getSub_seq(){
		return this.sub_seq;
	}
}

/* 작성시간 : Sat Jul 04 18:33:50 KST 2009 */