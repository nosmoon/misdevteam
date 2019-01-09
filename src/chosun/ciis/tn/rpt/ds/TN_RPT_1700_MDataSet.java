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


package chosun.ciis.tn.rpt.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.tn.rpt.dm.*;
import chosun.ciis.tn.rpt.rec.*;

/**
 * 
 */


public class TN_RPT_1700_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList paymethod_list = new ArrayList();
	public ArrayList fund_list = new ArrayList();
	public String errcode;
	public String errmsg;

	public TN_RPT_1700_MDataSet(){}
	public TN_RPT_1700_MDataSet(String errcode, String errmsg){
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
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(4);
		while(rset0.next()){
			TN_RPT_1700_MFUND_LISTRecord rec = new TN_RPT_1700_MFUND_LISTRecord();
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			this.fund_list.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(5);
		while(rset1.next()){
			TN_RPT_1700_MPAYMETHOD_LISTRecord rec = new TN_RPT_1700_MPAYMETHOD_LISTRecord();
			rec.cd = Util.checkString(rset1.getString("cd"));
			rec.cdnm = Util.checkString(rset1.getString("cdnm"));
			this.paymethod_list.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	TN_RPT_1700_MDataSet ds = (TN_RPT_1700_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.fund_list.size(); i++){
		TN_RPT_1700_MFUND_LISTRecord fund_listRec = (TN_RPT_1700_MFUND_LISTRecord)ds.fund_list.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.paymethod_list.size(); i++){
		TN_RPT_1700_MPAYMETHOD_LISTRecord paymethod_listRec = (TN_RPT_1700_MPAYMETHOD_LISTRecord)ds.paymethod_list.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getFund_list()%>
<%= ds.getPaymethod_list()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= fund_listRec.cd%>
<%= fund_listRec.cdnm%>
<%= paymethod_listRec.cd%>
<%= paymethod_listRec.cdnm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Dec 01 17:14:31 KST 2016 */