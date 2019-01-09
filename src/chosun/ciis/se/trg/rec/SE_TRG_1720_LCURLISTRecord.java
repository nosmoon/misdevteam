/***************************************************************************************************
* 파일명 : .java
* 기능 : 판매시스템
* 작성일자 : 2009-02-18
* 작성자 : 배창희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.trg.rec;

import java.sql.*;
import chosun.ciis.se.trg.dm.*;
import chosun.ciis.se.trg.ds.*;

/**
 * 
 */


public class SE_TRG_1720_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String evlu_clsf;
	public String evlu_clsf_nm;
	public String bgn_yymm;
	public String end_yymm;
	public String psdo_midl_val;
	public String remk;

	public SE_TRG_1720_LCURLISTRecord(){}

	public void setEvlu_clsf(String evlu_clsf){
		this.evlu_clsf = evlu_clsf;
	}

	public void setEvlu_clsf_nm(String evlu_clsf_nm){
		this.evlu_clsf_nm = evlu_clsf_nm;
	}

	public void setBgn_yymm(String bgn_yymm){
		this.bgn_yymm = bgn_yymm;
	}

	public void setEnd_yymm(String end_yymm){
		this.end_yymm = end_yymm;
	}

	public void setPsdo_midl_val(String psdo_midl_val){
		this.psdo_midl_val = psdo_midl_val;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getEvlu_clsf(){
		return this.evlu_clsf;
	}

	public String getEvlu_clsf_nm(){
		return this.evlu_clsf_nm;
	}

	public String getBgn_yymm(){
		return this.bgn_yymm;
	}

	public String getEnd_yymm(){
		return this.end_yymm;
	}

	public String getPsdo_midl_val(){
		return this.psdo_midl_val;
	}

	public String getRemk(){
		return this.remk;
	}
}

/* 작성시간 : Tue Apr 07 20:05:56 KST 2009 */