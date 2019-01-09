/***************************************************************************************************
* 파일명 : SL_MO_L_AREALISTAREACURRecord.java
* 기능 : 공통코드-지역리스트
* 작성일자 : 2016-12-14
* 작성자 : 장선희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ss.sls.common.rec;

import java.sql.*;
import chosun.ciis.ss.sls.common.dm.*;
import chosun.ciis.ss.sls.common.ds.*;

/**
 *
 */


public class SL_MO_L_AREALISTAREACURRecord extends java.lang.Object implements java.io.Serializable{

	public String cd;
	public String cdnm;
	public String chrg_pers;
	public String chrg_persnm;

	public SL_MO_L_AREALISTAREACURRecord(){}

	public void setCd(String cd){
		this.cd = cd;
	}

	public void setCdnm(String cdnm){
		this.cdnm = cdnm;
	}

	public void setChrg_pers(String chrg_pers){
		this.chrg_pers = chrg_pers;
	}

	public void setChrg_persnm(String chrg_persnm){
		this.chrg_persnm = chrg_persnm;
	}

	public String getCd(){
		return this.cd;
	}

	public String getCdnm(){
		return this.cdnm;
	}

	public String getChrg_pers(){
		return this.chrg_pers;
	}

	public String getChrg_persnm(){
		return this.chrg_persnm;
	}
}

/* 작성시간 : Wed Dec 14 17:16:29 KST 2016 */