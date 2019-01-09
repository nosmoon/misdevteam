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


package chosun.ciis.mc.budg.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mc.budg.dm.*;
import chosun.ciis.mc.budg.rec.*;

/**
 * 
 */


public class MC_BUDG_4052_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MC_BUDG_4052_LDataSet(){}
	public MC_BUDG_4052_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(11);
		while(rset0.next()){
			MC_BUDG_4052_LCURLISTRecord rec = new MC_BUDG_4052_LCURLISTRecord();
			rec.amt_s = Util.checkString(rset0.getString("amt_s"));
			rec.work_dt = Util.checkString(rset0.getString("work_dt"));
			rec.budg_cd = Util.checkString(rset0.getString("budg_cd"));
			rec.budg_nm = Util.checkString(rset0.getString("budg_nm"));
			rec.rmks = Util.checkString(rset0.getString("rmks"));
			rec.yramt = Util.checkString(rset0.getString("yramt"));
			rec.amt = Util.checkString(rset0.getString("amt"));
			rec.hsty_no = Util.checkString(rset0.getString("hsty_no"));
			rec.sub_no = Util.checkString(rset0.getString("sub_no"));
			rec.fix_asin_amt = Util.checkString(rset0.getString("fix_asin_amt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	MC_BUDG_4052_LDataSet ds = (MC_BUDG_4052_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MC_BUDG_4052_LCURLISTRecord curlistRec = (MC_BUDG_4052_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.amt_s%>
<%= curlistRec.work_dt%>
<%= curlistRec.budg_cd%>
<%= curlistRec.budg_nm%>
<%= curlistRec.rmks%>
<%= curlistRec.yramt%>
<%= curlistRec.amt%>
<%= curlistRec.hsty_no%>
<%= curlistRec.sub_no%>
<%= curlistRec.fix_asin_amt%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Jun 02 10:54:36 KST 2009 */