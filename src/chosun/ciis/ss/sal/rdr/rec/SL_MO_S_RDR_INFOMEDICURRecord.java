/***************************************************************************************************
* 파일명 :
* 기능 :
* 작성일자 : 2015-10-21
* 작성자 : 장 선 희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ss.sal.rdr.rec;

import java.sql.*;
import chosun.ciis.ss.sal.rdr.dm.*;
import chosun.ciis.ss.sal.rdr.ds.*;

/**
 *
 */


public class SL_MO_S_RDR_INFOMEDICURRecord extends java.lang.Object implements java.io.Serializable{

	public String medicd;
	public String medinm;
	public String abrv;
	public int dlvqty;
	public int cntrcnt;

	public SL_MO_S_RDR_INFOMEDICURRecord(){}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setMedinm(String medinm){
		this.medinm = medinm;
	}

	public void setAbrv(String abrv){
		this.abrv = abrv;
	}

	public void setDlvqty(int dlvqty){
		this.dlvqty = dlvqty;
	}

	public void setCntrcnt(int cntrcnt){
		this.cntrcnt = cntrcnt;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getMedinm(){
		return this.medinm;
	}

	public String getAbrv(){
		return this.abrv;
	}

	public int getDlvqty(){
		return this.dlvqty;
	}

	public int getCntrcnt(){
		return this.cntrcnt;
	}
}

/* 작성시간 : Mon Dec 05 11:41:10 KST 2016 */