/***************************************************************************************************
* ���ϸ� : .java
* ��� : 
* �ۼ����� : 
* �ۼ��� : ������
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.ss.sls.rdr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.rdr.dm.*;
import chosun.ciis.ss.sls.rdr.rec.*;

/**
 * 
 */


public class SS_L_CAMP_TM_EXTNDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_CAMP_TM_EXTNDataSet(){}
	public SS_L_CAMP_TM_EXTNDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(17);
		while(rset0.next()){
			SS_L_CAMP_TM_EXTNCURCOMMLISTRecord rec = new SS_L_CAMP_TM_EXTNCURCOMMLISTRecord();
			rec.campid = Util.checkString(rset0.getString("campid"));
			rec.campnm = Util.checkString(rset0.getString("campnm"));
			rec.dbgb = Util.checkString(rset0.getString("dbgb"));
			rec.asigndy = Util.checkString(rset0.getString("asigndy"));
			rec.agentid = Util.checkString(rset0.getString("agentid"));
			rec.agentnm = Util.checkString(rset0.getString("agentnm"));
			rec.rdrno = Util.checkString(rset0.getString("rdrno"));
			rec.custno = Util.checkString(rset0.getString("custno"));
			rec.custnm = Util.checkString(rset0.getString("custnm"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.lastcall = Util.checkString(rset0.getString("lastcall"));
			rec.result1 = Util.checkString(rset0.getString("result1"));
			rec.result2 = Util.checkString(rset0.getString("result2"));
			rec.result3 = Util.checkString(rset0.getString("result3"));
			rec.result4 = Util.checkString(rset0.getString("result4"));
			rec.rdr_extndt = Util.checkString(rset0.getString("rdr_extndt"));
			rec.bocnfm = Util.checkString(rset0.getString("bocnfm"));
			rec.subscnfmstat = Util.checkString(rset0.getString("subscnfmstat"));
			rec.lstres1 = Util.checkString(rset0.getString("lstres1"));
			rec.lstres2 = Util.checkString(rset0.getString("lstres2"));
			rec.lstres3 = Util.checkString(rset0.getString("lstres3"));
			rec.callcnt = Util.checkString(rset0.getString("callcnt"));
			this.curcommlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SS_L_CAMP_TM_EXTNDataSet ds = (SS_L_CAMP_TM_EXTNDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_CAMP_TM_EXTNCURCOMMLISTRecord curcommlistRec = (SS_L_CAMP_TM_EXTNCURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurcommlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curcommlistRec.campid%>
<%= curcommlistRec.campnm%>
<%= curcommlistRec.dbgb%>
<%= curcommlistRec.asigndy%>
<%= curcommlistRec.agentid%>
<%= curcommlistRec.agentnm%>
<%= curcommlistRec.rdrno%>
<%= curcommlistRec.custno%>
<%= curcommlistRec.custnm%>
<%= curcommlistRec.bocd%>
<%= curcommlistRec.bonm%>
<%= curcommlistRec.lastcall%>
<%= curcommlistRec.result1%>
<%= curcommlistRec.result2%>
<%= curcommlistRec.result3%>
<%= curcommlistRec.result4%>
<%= curcommlistRec.rdr_extndt%>
<%= curcommlistRec.bocnfm%>
<%= curcommlistRec.bocnfmdy%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Feb 27 10:14:51 GMT 2014 */