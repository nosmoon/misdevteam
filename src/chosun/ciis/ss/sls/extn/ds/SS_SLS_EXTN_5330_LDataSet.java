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


public class SS_SLS_EXTN_5330_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curmodlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_SLS_EXTN_5330_LDataSet(){}
	public SS_SLS_EXTN_5330_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			SS_SLS_EXTN_5330_LCURMODLISTRecord rec = new SS_SLS_EXTN_5330_LCURMODLISTRecord();
			rec.gubun = Util.checkString(rset0.getString("gubun"));
			rec.dncomp = Util.checkString(rset0.getString("dncomp"));
			rec.dncompnm = Util.checkString(rset0.getString("dncompnm"));
			rec.valmm = Util.checkString(rset0.getString("valmm"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.rdr_no = Util.checkString(rset0.getString("rdr_no"));
			rec.rdrnm = Util.checkString(rset0.getString("rdrnm"));
			rec.qty = Util.checkString(rset0.getString("qty"));
			rec.subsuprc = Util.checkString(rset0.getString("subsuprc"));
			rec.cnfm_amt = Util.checkString(rset0.getString("cnfm_amt"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			this.curmodlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SS_SLS_EXTN_5330_LDataSet ds = (SS_SLS_EXTN_5330_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curmodlist.size(); i++){
		SS_SLS_EXTN_5330_LCURMODLISTRecord curmodlistRec = (SS_SLS_EXTN_5330_LCURMODLISTRecord)ds.curmodlist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurmodlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curmodlistRec.gubun%>
<%= curmodlistRec.dncomp%>
<%= curmodlistRec.dncompnm%>
<%= curmodlistRec.valmm%>
<%= curmodlistRec.bonm%>
<%= curmodlistRec.rdr_no%>
<%= curmodlistRec.rdrnm%>
<%= curmodlistRec.qty%>
<%= curmodlistRec.subsuprc%>
<%= curmodlistRec.cnfm_amt%>
<%= curmodlistRec.bocd%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Oct 11 15:31:10 KST 2017 */