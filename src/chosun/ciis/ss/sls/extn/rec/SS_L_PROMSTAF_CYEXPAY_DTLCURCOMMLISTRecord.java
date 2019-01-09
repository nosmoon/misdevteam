/***************************************************************************************************
* 파일명 : SS_L_PROMSTAF_CYEXPAY_DTLCURCOMMLISTRecord.java
* 기능 : 확장현황-사이버확장-수당-상세
* 작성일자 : 2004-04-06
* 작성자 : 고윤홍
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.rec;

import java.sql.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.ds.*;

/**
 * 확장현황-사이버확장-수당-상세
 *
 */

public class SS_L_PROMSTAF_CYEXPAY_DTLCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String rdr_extncampno;
	public String campnm;
	public String medicd;
	public String medicdnm;
	public String stafclsfcd;
	public String stafno;
	public int rdr_extnqty;
	public int calcqty;
	public int basialonamt;
	public int basialonpont;
	public int alonamt;
	public int alonpont;

	public SS_L_PROMSTAF_CYEXPAY_DTLCURCOMMLISTRecord(){}

	public void setRdr_extncampno(String rdr_extncampno){
		this.rdr_extncampno = rdr_extncampno;
	}

	public void setCampnm(String campnm){
		this.campnm = campnm;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setMedicdnm(String medicdnm){
		this.medicdnm = medicdnm;
	}

	public void setStafclsfcd(String stafclsfcd){
		this.stafclsfcd = stafclsfcd;
	}

	public void setStafno(String stafno){
		this.stafno = stafno;
	}

	public void setRdr_extnqty(int rdr_extnqty){
		this.rdr_extnqty = rdr_extnqty;
	}

	public void setCalcqty(int calcqty){
		this.calcqty = calcqty;
	}

	public void setBasialonamt(int basialonamt){
		this.basialonamt = basialonamt;
	}

	public void setBasialonpont(int basialonpont){
		this.basialonpont = basialonpont;
	}

	public void setAlonamt(int alonamt){
		this.alonamt = alonamt;
	}

	public void setAlonpont(int alonpont){
		this.alonpont = alonpont;
	}

	public String getRdr_extncampno(){
		return this.rdr_extncampno;
	}

	public String getCampnm(){
		return this.campnm;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getMedicdnm(){
		return this.medicdnm;
	}

	public String getStafclsfcd(){
		return this.stafclsfcd;
	}

	public String getStafno(){
		return this.stafno;
	}

	public int getRdr_extnqty(){
		return this.rdr_extnqty;
	}

	public int getCalcqty(){
		return this.calcqty;
	}

	public int getBasialonamt(){
		return this.basialonamt;
	}

	public int getBasialonpont(){
		return this.basialonpont;
	}

	public int getAlonamt(){
		return this.alonamt;
	}

	public int getAlonpont(){
		return this.alonpont;
	}
}

/* 작성시간 : Tue Apr 06 10:58:32 KST 2004 */