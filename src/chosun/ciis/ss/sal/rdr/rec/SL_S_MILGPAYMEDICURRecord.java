/***************************************************************************************************
* 파일명 : SL_S_MILGPAYMEDICURRecord.java
* 기능 : 독자정보관리(마일리지지급내역팝업-상세조회)
* 작성일자 : 2004-06-03
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
 * 독자정보관리(마일리지지급내역팝업-상세조회)
 *
 */

public class SL_S_MILGPAYMEDICURRecord extends java.lang.Object implements java.io.Serializable{

	public String medicd;
	public String medinm;

	public SL_S_MILGPAYMEDICURRecord(){}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setMedinm(String medinm){
		this.medinm = medinm;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getMedinm(){
		return this.medinm;
	}
}

/* 작성시간 : Sat Jun 05 20:57:14 KST 2004 */