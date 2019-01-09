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


public class FC_ACCT_2601_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String curr_yymm;
	public String pre_yymm;

	public FC_ACCT_2601_LDataSet(){}
	public FC_ACCT_2601_LDataSet(String errcode, String errmsg, String curr_yymm, String pre_yymm){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.curr_yymm = curr_yymm;
		this.pre_yymm = pre_yymm;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setCurr_yymm(String curr_yymm){
		this.curr_yymm = curr_yymm;
	}

	public void setPre_yymm(String pre_yymm){
		this.pre_yymm = pre_yymm;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getCurr_yymm(){
		return this.curr_yymm;
	}

	public String getPre_yymm(){
		return this.pre_yymm;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.curr_yymm = Util.checkString(cstmt.getString(6));
		this.pre_yymm = Util.checkString(cstmt.getString(7));
		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			FC_ACCT_2601_LCURLISTRecord rec = new FC_ACCT_2601_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.acct_levl = Util.checkString(rset0.getString("acct_levl"));
			rec.acct_cd = Util.checkString(rset0.getString("acct_cd"));
			rec.acct_subj_nm = Util.checkString(rset0.getString("acct_subj_nm"));
			rec.acct_amt1 = rset0.getLong("acct_amt1");
			rec.acct_amt2 = rset0.getLong("acct_amt2");
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	FC_ACCT_2601_LDataSet ds = (FC_ACCT_2601_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_ACCT_2601_LCURLISTRecord curlistRec = (FC_ACCT_2601_LCURLISTRecord)ds.curlist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurr_yymm()%>
<%= ds.getPre_yymm()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlistRec.cmpy_cd%>
<%= curlistRec.acct_levl%>
<%= curlistRec.acct_cd%>
<%= curlistRec.acct_subj_nm%>
<%= curlistRec.acct_amt1%>
<%= curlistRec.acct_amt2%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Jul 04 11:43:37 KST 2014 */