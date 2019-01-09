/***************************************************************************************************
* 파일명 : SS_U_SMSDM.java
* 기능 		: 지국INFO-발송노선 SMS수정 DM
* 작성일자 	: 2004-04-01
* 작성자 	: 배창희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ss.sls.brinfo.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brinfo.ds.*;
import chosun.ciis.ss.sls.brinfo.rec.*;

/**
 * 지국INFO-발송노선 SMS수정 DM
 */


public class SS_U_SMSDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String bocd;
	public String sms1;
	public String sms2;
	public String sms3;
	public String emailnm;
	public String smsset;
	public String emailset;

	public SS_U_SMSDM(){}
	public SS_U_SMSDM(String bocd, String sms1, String sms2, String sms3, String emailnm, String smsset, String emailset){
		this.bocd = bocd;
		this.sms1 = sms1;
		this.sms2 = sms2;
		this.sms3 = sms3;
		this.emailnm = emailnm;
		this.smsset = smsset;
		this.emailset = emailset;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setSms1(String sms1){
		this.sms1 = sms1;
	}

	public void setSms2(String sms2){
		this.sms2 = sms2;
	}

	public void setSms3(String sms3){
		this.sms3 = sms3;
	}

	public void setEmailnm(String emailnm){
		this.emailnm = emailnm;
	}

	public void setSmsset(String smsset){
		this.smsset = smsset;
	}

	public void setEmailset(String emailset){
		this.emailset = emailset;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getSms1(){
		return this.sms1;
	}

	public String getSms2(){
		return this.sms2;
	}

	public String getSms3(){
		return this.sms3;
	}

	public String getEmailnm(){
		return this.emailnm;
	}

	public String getSmsset(){
		return this.smsset;
	}

	public String getEmailset(){
		return this.emailset;
	}

	public String getSQL(){
         return "";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_U_SMSDM dm = (SS_U_SMSDM)bdm;
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brinfo.ds.SS_U_SMSDataSet();
	}
}

/* 작성시간 : Tue Feb 17 16:29:37 KST 2004 */