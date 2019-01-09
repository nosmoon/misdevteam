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


public class MC_BUDG_4105_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MC_BUDG_4105_LDataSet(){}
	public MC_BUDG_4105_LDataSet(String errcode, String errmsg){
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

		ResultSet rset1 = (ResultSet) cstmt.getObject(8);
		while(rset1.next()){
			MC_BUDG_4105_LCURLISTRecord rec = new MC_BUDG_4105_LCURLISTRecord();
			rec.dept_nm = Util.checkString(rset1.getString("dept_nm"));
			rec.budg_cd = Util.checkString(rset1.getString("budg_cd"));
			rec.budg_req_amt = Util.checkString(rset1.getString("budg_req_amt"));
			rec.fix_asin_amt = Util.checkString(rset1.getString("fix_asin_amt"));
			rec.last_asin_amt = Util.checkString(rset1.getString("last_asin_amt"));
			rec.budg_ask_amt = Util.checkString(rset1.getString("budg_ask_amt"));
			rec.budg_cndt_amt = Util.checkString(rset1.getString("budg_cndt_amt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	MC_BUDG_4105_LDataSet ds = (MC_BUDG_4105_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MC_BUDG_4105_LCURLISTRecord curlistRec = (MC_BUDG_4105_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.dept_nm%>
<%= curlistRec.budg_cd%>
<%= curlistRec.budg_req_amt%>
<%= curlistRec.fix_asin_amt%>
<%= curlistRec.last_asin_amt%>
<%= curlistRec.budg_ask_amt%>
<%= curlistRec.budg_cndt_amt%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Jun 02 16:07:15 KST 2009 */