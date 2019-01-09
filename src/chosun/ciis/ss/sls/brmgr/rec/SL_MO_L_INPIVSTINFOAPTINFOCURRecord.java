/***************************************************************************************************
* 파일명 : SL_MO_L_INPIVSTINFOAPTINFOCURRecord.java
* 기능 :  아파트투입률조회(아파트형태리스트 or 투입률등록리스트)_모바일만존재
* 작성일자 : 2017-01-12
* 작성자 : 장 선 희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ss.sls.brmgr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.ds.*;

/**
 *
 */


public class SL_MO_L_INPIVSTINFOAPTINFOCURRecord extends java.lang.Object implements java.io.Serializable{

	public String dongno;
	public String florcnt;
	public String flor_houscnt;
	public String hoscnt;
	public String pyong;
	public String stairyn;
	public String under_exne;

	public SL_MO_L_INPIVSTINFOAPTINFOCURRecord(){}

	public void setDongno(String dongno){
		this.dongno = dongno;
	}

	public void setFlorcnt(String florcnt){
		this.florcnt = florcnt;
	}

	public void setFlor_houscnt(String flor_houscnt){
		this.flor_houscnt = flor_houscnt;
	}

	public void setHoscnt(String hoscnt){
		this.hoscnt = hoscnt;
	}

	public void setPyong(String pyong){
		this.pyong = pyong;
	}

	public void setStairyn(String stairyn){
		this.stairyn = stairyn;
	}

	public void setUnder_exne(String under_exne){
		this.under_exne = under_exne;
	}

	public String getDongno(){
		return this.dongno;
	}

	public String getFlorcnt(){
		return this.florcnt;
	}

	public String getFlor_houscnt(){
		return this.flor_houscnt;
	}

	public String getHoscnt(){
		return this.hoscnt;
	}

	public String getPyong(){
		return this.pyong;
	}

	public String getStairyn(){
		return this.stairyn;
	}

	public String getUnder_exne(){
		return this.under_exne;
	}
}

/* 작성시간 : Thu Jan 12 17:26:47 KST 2017 */