/***************************************************************************************************
* 파일명 : SL_L_MILGPAY_INITBASICURRecord.java
* 기능 : 독자정보관리(마일리지지급내역팝업-초기화면)
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
 * 독자정보관리(마일리지지급내역팝업-초기화면)
 *
 */

public class SL_L_MILGPAY_INITBASICURRecord extends java.lang.Object implements java.io.Serializable{

	public String medicd;
	public String medinm;
	public String paybasicd;
	public String paybasinm;

	public SL_L_MILGPAY_INITBASICURRecord(){}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setMedinm(String medinm){
		this.medinm = medinm;
	}

	public void setPaybasicd(String paybasicd){
		this.paybasicd = paybasicd;
	}

	public void setPaybasinm(String paybasinm){
		this.paybasinm = paybasinm;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getMedinm(){
		return this.medinm;
	}

	public String getPaybasicd(){
		return this.paybasicd;
	}

	public String getPaybasinm(){
		return this.paybasinm;
	}
}

/* 작성시간 : Sun Jun 06 20:37:00 KST 2004 */