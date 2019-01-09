/***************************************************************************************************
* 파일명 : SL_A_NWSPSUBSCNTRMEDICURRecord.java
* 기능 : 독자정보관리-구독추가변경팝업(구독계약등록,수정)-매체코드목록
* 작성일자 : 2004-02-16
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
 * 독자정보관리-구독추가변경팝업(구독계약등록,수정)-매체코드목록
 *
 */


public class SL_A_NWSPSUBSCNTRMEDICURRecord extends java.lang.Object implements java.io.Serializable{

	public String medicd;
	public String abrv;
	public int dlvqty;

	public SL_A_NWSPSUBSCNTRMEDICURRecord(){}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setAbrv(String abrv){
		this.abrv = abrv;
	}

	public void setDlvqty(int dlvqty){
		this.dlvqty = dlvqty;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getAbrv(){
		return this.abrv;
	}

	public int getDlvqty(){
		return this.dlvqty;
	}
}

/* 작성시간 : Mon Feb 16 17:14:51 KST 2004 */