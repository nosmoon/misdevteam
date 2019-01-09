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


package chosun.ciis.ad.bas.rec;

import java.sql.*;
import chosun.ciis.ad.bas.dm.*;
import chosun.ciis.ad.bas.ds.*;

/**
 * 
 */


public class AD_BAS_1521_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String insrt_dt;
	public String dlco_nm;
	public String chrg_pers;
	public String dlco_info;
	public String seq;

	public AD_BAS_1521_LCURLISTRecord(){}

	public void setInsrt_dt(String insrt_dt){
		this.insrt_dt = insrt_dt;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setChrg_pers(String chrg_pers){
		this.chrg_pers = chrg_pers;
	}

	public void setDlco_info(String dlco_info){
		this.dlco_info = dlco_info;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public String getInsrt_dt(){
		return this.insrt_dt;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getChrg_pers(){
		return this.chrg_pers;
	}

	public String getDlco_info(){
		return this.dlco_info;
	}

	public String getSeq(){
		return this.seq;
	}
}

/* 작성시간 : Mon Oct 31 16:10:07 KST 2016 */