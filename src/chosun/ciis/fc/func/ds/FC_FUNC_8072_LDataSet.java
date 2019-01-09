/***************************************************************************************************
* ���ϸ� : .java
* ��� : ���ڿ��-������û
* �ۼ����� : 2007-05-22
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.fc.func.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.func.dm.*;
import chosun.ciis.fc.func.rec.*;

/**
 * 
 */


public class FC_FUNC_8072_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_FUNC_8072_LDataSet(){}
	public FC_FUNC_8072_LDataSet(String errcode, String errmsg){
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

		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			FC_FUNC_8072_LCURLISTRecord rec = new FC_FUNC_8072_LCURLISTRecord();
			rec.pymt_plan_dt = Util.checkString(rset1.getString("pymt_plan_dt"));
			rec.pay_cost_clsfnm = Util.checkString(rset1.getString("pay_cost_clsfnm"));
			rec.frex_cdnm = Util.checkString(rset1.getString("frex_cdnm"));
			rec.libiwgamtint = Util.checkString(rset1.getString("libiwgamtint"));
			rec.exrate = Util.checkString(rset1.getString("exrate"));
			rec.won_amt = Util.checkString(rset1.getString("won_amt"));
			rec.fst_leas_no = Util.checkString(rset1.getString("fst_leas_no"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	FC_FUNC_8072_LDataSet ds = (FC_FUNC_8072_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_FUNC_8072_LCURLISTRecord curlistRec = (FC_FUNC_8072_LCURLISTRecord)ds.curlist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlistRec.pymt_plan_dt%>
<%= curlistRec.pay_cost_clsfnm%>
<%= curlistRec.frex_cdnm%>
<%= curlistRec.libiwgamtint%>
<%= curlistRec.exrate%>
<%= curlistRec.won_amt%>
<%= curlistRec.fst_leas_no%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Apr 08 13:50:32 KST 2009 */