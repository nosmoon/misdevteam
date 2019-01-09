/***************************************************************************************************
* 파일명 : .java
* 기능 : 	   
* 작성일자 : 
* 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.tn.rpt.rec;

import java.sql.*;
import chosun.ciis.tn.rpt.dm.*;
import chosun.ciis.tn.rpt.ds.*;

/**
 * 
 */


public class TN_RPT_1141_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String sms_send_date;
	public int cnt;

	public TN_RPT_1141_LCURLISTRecord(){}

	public void setSms_send_date(String sms_send_date){
		this.sms_send_date = sms_send_date;
	}

	public void setCnt(int cnt){
		this.cnt = cnt;
	}

	public String getSms_send_date(){
		return this.sms_send_date;
	}

	public int getCnt(){
		return this.cnt;
	}
}

/* 작성시간 : Fri Jun 01 10:45:07 KST 2018 */