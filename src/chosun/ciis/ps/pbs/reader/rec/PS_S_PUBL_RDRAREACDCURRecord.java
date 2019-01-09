/***************************************************************************************************
* 파일명 : PS_S_PUBL_RDR.java
* 기능 :   독자-독자조회 초기화면
* 작성일자 : 2004-02-23
* 작성자 : 김건호
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ps.pbs.reader.rec;

import java.sql.*;
import chosun.ciis.ps.pbs.reader.dm.*;
import chosun.ciis.ps.pbs.reader.ds.*;

/**
 * 독자-독자조회 초기화면
 *
 */

public class PS_S_PUBL_RDRAREACDCURRecord extends java.lang.Object implements java.io.Serializable{

	public String areacd;
	public String areanm;

	public PS_S_PUBL_RDRAREACDCURRecord(){}

	public void setAreacd(String areacd){
		this.areacd = areacd;
	}

	public void setAreanm(String areanm){
		this.areanm = areanm;
	}

	public String getAreacd(){
		return this.areacd;
	}

	public String getAreanm(){
		return this.areanm;
	}
}

/* 작성시간 : Tue Jul 15 11:02:56 KST 2008 */