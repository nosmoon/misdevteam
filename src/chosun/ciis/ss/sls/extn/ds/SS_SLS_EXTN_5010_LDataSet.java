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


package chosun.ciis.ss.sls.extn.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * 
 */


public class SS_SLS_EXTN_5010_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_SLS_EXTN_5010_LDataSet(){}
	public SS_SLS_EXTN_5010_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(10);
		while(rset0.next()){
			SS_SLS_EXTN_5010_LCURCOMMLISTRecord rec = new SS_SLS_EXTN_5010_LCURCOMMLISTRecord();
			rec.yymm = Util.checkString(rset0.getString("yymm"));
			rec.dncompnm = Util.checkString(rset0.getString("dncompnm"));
			rec.deptnm = Util.checkString(rset0.getString("deptnm"));
			rec.adv_nm = Util.checkString(rset0.getString("adv_nm"));
			rec.medi_qty = Util.checkString(rset0.getString("medi_qty"));
			rec.mob_qty = Util.checkString(rset0.getString("mob_qty"));
			rec.regdt = Util.checkString(rset0.getString("regdt"));
			rec.regno = Util.checkString(rset0.getString("regno"));
			rec.medi_err = Util.checkString(rset0.getString("medi_err"));
			rec.mob_err = Util.checkString(rset0.getString("mob_err"));
			this.curcommlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SS_SLS_EXTN_5010_LDataSet ds = (SS_SLS_EXTN_5010_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_SLS_EXTN_5010_LCURCOMMLISTRecord curcommlistRec = (SS_SLS_EXTN_5010_LCURCOMMLISTRecord)ds.curcommlist.get(i);%>
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

<%= curcommlistRec.yymm%>
<%= curcommlistRec.dncompnm%>
<%= curcommlistRec.deptnm%>
<%= curcommlistRec.adv_nm%>
<%= curcommlistRec.medi_qty%>
<%= curcommlistRec.mob_qty%>
<%= curcommlistRec.regdt%>
<%= curcommlistRec.regno%>
<%= curcommlistRec.medi_err%>
<%= curcommlistRec.mob_err%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Aug 08 11:55:44 KST 2016 */