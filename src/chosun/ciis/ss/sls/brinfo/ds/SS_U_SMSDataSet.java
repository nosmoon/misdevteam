/***************************************************************************************************
* 파일명 : SS_U_SMSDataSet.java
* 기능 : 지국INFO-발송노선 SMS수정 DS
* 작성일자 	: 2004-04-01
* 작성자 	: 배창희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ss.sls.brinfo.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brinfo.dm.*;
import chosun.ciis.ss.sls.brinfo.rec.*;

/**
 * 지국INFO-발송노선 SMS수정 DS
 */


public class SS_U_SMSDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;

	public SS_U_SMSDataSet(){}
	public SS_U_SMSDataSet(String errcode, String errmsg){
		this.errcode = errcode;
		this.errmsg = errmsg;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = "";
		this.errmsg = "";
	}
}

/* 작성시간 : Tue Feb 17 16:29:37 KST 2004 */