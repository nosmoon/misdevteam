/***************************************************************************************************
* 파일명 : SL_E_SUBS_CNTR_STOP_INIOBJCURRecord.java
* 기능 : 독자정보관리(중지독자팝업-초기화)
* 작성일자 : 2004-02-11
* 작성자 : 김영윤
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
 * 독자정보관리(중지독자팝업-초기화)-중지대상(구독계약목록)
 *
 */


public class SL_E_SUBS_CNTR_STOP_INIOBJCURRecord extends java.lang.Object implements java.io.Serializable{

	public String rdr_no;
	public String medicd;
	public String medinm;
	public String freeyn;
	public String freeynnm;
	public String freeclsf;
	public int qty;

	public SL_E_SUBS_CNTR_STOP_INIOBJCURRecord(){}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setMedinm(String medinm){
		this.medinm = medinm;
	}

	public void setFreeyn(String freeyn){
		this.freeyn = freeyn;
	}

	public void setFreeynnm(String freeynnm){
		this.freeynnm = freeynnm;
	}

	public void setFreeclsf(String freeclsf){
		this.freeclsf = freeclsf;
	}

	public void setQty(int qty){
		this.qty = qty;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getMedinm(){
		return this.medinm;
	}

	public String getFreeyn(){
		return this.freeyn;
	}

	public String getFreeynnm(){
		return this.freeynnm;
	}

	public String getFreeclsf(){
		return this.freeclsf;
	}

	public int getQty(){
		return this.qty;
	}
}

/* 작성시간 : Wed Feb 11 21:56:53 KST 2004 */