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


package chosun.ciis.ad.res.rec;

import java.sql.*;
import chosun.ciis.ad.res.dm.*;
import chosun.ciis.ad.res.ds.*;

/**
 * 
 */


public class AD_RES_1270_SCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String insrt_dt;
	public String dlco_info;
	public String chrg_pers;

	public AD_RES_1270_SCURLISTRecord(){}

	public void setInsrt_dt(String insrt_dt){
		this.insrt_dt = insrt_dt;
	}

	public void setDlco_info(String dlco_info){
		this.dlco_info = dlco_info;
	}

	public void setChrg_pers(String chrg_pers){
		this.chrg_pers = chrg_pers;
	}

	public String getInsrt_dt(){
		return this.insrt_dt;
	}

	public String getDlco_info(){
		return this.dlco_info;
	}

	public String getChrg_pers(){
		return this.chrg_pers;
	}
}

/* 작성시간 : Mon Jan 27 10:02:21 KST 2014 */