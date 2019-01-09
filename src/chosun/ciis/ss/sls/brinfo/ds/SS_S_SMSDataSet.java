/**************************************************************************************************
* 파일명 	: SS_S_SMSDataSet.java
* 기능 : 지국INFO-발송노선 SMS불러오기 DS
* 작성일자 	: 2004-04-01
* 작성자 	: 배창희
**************************************************************************************************/
/**************************************************************************************************
* 수정내역 	:
* 수정자 	:
* 수정일자 	:
* 백업 		:
**************************************************************************************************/


package chosun.ciis.ss.sls.brinfo.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brinfo.dm.*;
import chosun.ciis.ss.sls.brinfo.rec.*;

/**
 * 지국INFO-발송노선 SMS불러오기 DS
 */

public class SS_S_SMSDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String bocd;
	public String sms1;
	public String sms2;
	public String sms3;
	public String emailnm;
	public String smsset;
	public String emailset;

	public SS_S_SMSDataSet(){}
	public SS_S_SMSDataSet(String errcode, String errmsg, String bocd, String sms1, String sms2, String sms3, String emailnm, String smsset, String emailset ){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.bocd = bocd;
		this.sms1 = sms1;
		this.sms2 = sms2;
		this.sms3 = sms3;
		this.emailnm = emailnm;
		this.smsset = smsset;
		this.emailset = emailset;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
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

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
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

    public void getValues(CallableStatement cstmt) throws SQLException{
        this.errcode = Util.checkString(cstmt.getString(1));
        this.errmsg = Util.checkString(cstmt.getString(2));
    }
    
}

/* 작성시간 : Wed Feb 11 11:39:13 KST 2004 */