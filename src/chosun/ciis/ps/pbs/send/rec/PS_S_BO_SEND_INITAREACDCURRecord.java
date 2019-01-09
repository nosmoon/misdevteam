/***************************************************************************************************
* 파일명 : PS_S_BO_SEND_INIT.java
* 기능   : 발송 - 초기화면
* 작성일자 : 2007-04-23
* 작성자 : 전현표
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ps.pbs.send.rec;

import java.sql.*;
import chosun.ciis.ps.pbs.send.dm.*;
import chosun.ciis.ps.pbs.send.ds.*;

/**
 * 발송 - 초기화면
 */

public class PS_S_BO_SEND_INITAREACDCURRecord extends java.lang.Object implements java.io.Serializable{

	public String areacd;
	public String areanm;

	public PS_S_BO_SEND_INITAREACDCURRecord(){}

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

/* 작성시간 : Tue Apr 24 16:33:14 KST 2007 */