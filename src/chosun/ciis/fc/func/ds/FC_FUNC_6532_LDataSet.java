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


public class FC_FUNC_6532_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_FUNC_6532_LDataSet(){}
	public FC_FUNC_6532_LDataSet(String errcode, String errmsg){
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
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(6);
		while(rset2.next()){
			FC_FUNC_6532_LCURLISTRecord rec = new FC_FUNC_6532_LCURLISTRecord();
			rec.recp_dt = Util.checkString(rset2.getString("recp_dt"));
			rec.tot_int_amt = Util.checkString(rset2.getString("tot_int_amt"));
			rec.corp_tax_amt = Util.checkString(rset2.getString("corp_tax_amt"));
			rec.aft_tax_int_amt = Util.checkString(rset2.getString("aft_tax_int_amt"));
			rec.rmks = Util.checkString(rset2.getString("rmks"));
			rec.unrcp_precpt_bal = Util.checkString(rset2.getString("unrcp_precpt_bal"));
			rec.jpno = Util.checkString(rset2.getString("jpno"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	FC_FUNC_6032_LDataSet ds = (FC_FUNC_6032_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_FUNC_6032_LCURLISTRecord curlistRec = (FC_FUNC_6032_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.recp_dt%>
<%= curlistRec.tot_int_amt%>
<%= curlistRec.corp_tax_amt%>
<%= curlistRec.aft_tax_int_amt%>
<%= curlistRec.rmks%>
<%= curlistRec.unrcp_precpt_bal%>
<%= curlistRec.jpno%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Mar 17 15:47:29 KST 2009 */