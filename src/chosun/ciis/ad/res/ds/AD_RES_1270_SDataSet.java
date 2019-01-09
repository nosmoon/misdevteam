/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ad.res.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.res.dm.*;
import chosun.ciis.ad.res.rec.*;

/**
 * 
 */


public class AD_RES_1270_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String surp_amt;
	public String basi_dt;
	public String info_yn;

	public AD_RES_1270_SDataSet(){}
	public AD_RES_1270_SDataSet(String errcode, String errmsg, String surp_amt, String basi_dt, String info_yn){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.surp_amt = surp_amt;
		this.basi_dt = basi_dt;
		this.info_yn = info_yn;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setSurp_amt(String surp_amt){
		this.surp_amt = surp_amt;
	}

	public void setBasi_dt(String basi_dt){
		this.basi_dt = basi_dt;
	}

	public void setInfo_yn(String info_yn){
		this.info_yn = info_yn;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getSurp_amt(){
		return this.surp_amt;
	}

	public String getBasi_dt(){
		return this.basi_dt;
	}

	public String getInfo_yn(){
		return this.info_yn;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.surp_amt = Util.checkString(cstmt.getString(5));
		this.basi_dt = Util.checkString(cstmt.getString(6));
		this.info_yn = Util.checkString(cstmt.getString(7));
		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			AD_RES_1270_SCURLISTRecord rec = new AD_RES_1270_SCURLISTRecord();
			rec.insrt_dt = Util.checkString(rset0.getString("insrt_dt"));
			rec.dlco_info = Util.checkString(rset0.getString("dlco_info"));
			rec.chrg_pers = Util.checkString(rset0.getString("chrg_pers"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_RES_1270_SDataSet ds = (AD_RES_1270_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_RES_1270_SCURLISTRecord curlistRec = (AD_RES_1270_SCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getSurp_amt()%>
<%= ds.getBasi_dt()%>
<%= ds.getInfo_yn()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.insrt_dt%>
<%= curlistRec.dlco_info%>
<%= curlistRec.chrg_pers%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jan 27 10:02:22 KST 2014 */