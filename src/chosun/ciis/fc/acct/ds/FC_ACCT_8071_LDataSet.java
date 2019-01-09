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


package chosun.ciis.fc.acct.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.rec.*;

/**
 * 
 */


public class FC_ACCT_8071_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_8071_LDataSet(){}
	public FC_ACCT_8071_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			FC_ACCT_8071_LCURLISTRecord rec = new FC_ACCT_8071_LCURLISTRecord();
			rec.sdgb = Util.checkString(rset0.getString("sdgb"));
			rec.dlco_clsf_cd = Util.checkString(rset0.getString("dlco_clsf_cd"));
			rec.dlco_cd = Util.checkString(rset0.getString("dlco_cd"));
			rec.acct_cd = Util.checkString(rset0.getString("acct_cd"));
			rec.cucustnm = Util.checkString(rset0.getString("cucustnm"));
			rec.dfgubun = Util.checkString(rset0.getString("dfgubun"));
			rec.obj_amt = Util.checkString(rset0.getString("obj_amt"));
			rec.crdt_amt = Util.checkString(rset0.getString("crdt_amt"));
			rec.cnt = Util.checkString(rset0.getString("cnt"));
			rec.pyamt = Util.checkString(rset0.getString("pyamt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	FC_ACCT_8071_LDataSet ds = (FC_ACCT_8071_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_ACCT_8071_LCURLISTRecord curlistRec = (FC_ACCT_8071_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.sdgb%>
<%= curlistRec.dlco_clsf_cd%>
<%= curlistRec.dlco_cd%>
<%= curlistRec.acct_cd%>
<%= curlistRec.cucustnm%>
<%= curlistRec.dfgubun%>
<%= curlistRec.obj_amt%>
<%= curlistRec.crdt_amt%>
<%= curlistRec.cnt%>
<%= curlistRec.pyamt%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Jul 09 13:17:02 KST 2015 */