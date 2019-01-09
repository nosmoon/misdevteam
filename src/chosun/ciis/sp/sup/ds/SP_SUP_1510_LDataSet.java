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


package chosun.ciis.sp.sup.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.sp.sup.dm.*;
import chosun.ciis.sp.sup.rec.*;

/**
 * 
 */


public class SP_SUP_1510_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SP_SUP_1510_LDataSet(){}
	public SP_SUP_1510_LDataSet(String errcode, String errmsg){
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
			SP_SUP_1510_LCURLISTRecord rec = new SP_SUP_1510_LCURLISTRecord();
			rec.yymm = Util.checkString(rset0.getString("yymm"));
			rec.l1 = Util.checkString(rset0.getString("l1"));
			rec.l2 = Util.checkString(rset0.getString("l2"));
			rec.l3 = Util.checkString(rset0.getString("l3"));
			rec.l4 = Util.checkString(rset0.getString("l4"));
			rec.l5 = Util.checkString(rset0.getString("l5"));
			rec.l6 = Util.checkString(rset0.getString("l6"));
			rec.r1 = Util.checkString(rset0.getString("r1"));
			rec.r2 = Util.checkString(rset0.getString("r2"));
			rec.r3 = Util.checkString(rset0.getString("r3"));
			rec.r4 = Util.checkString(rset0.getString("r4"));
			rec.r5 = Util.checkString(rset0.getString("r5"));
			rec.r6 = Util.checkString(rset0.getString("r6"));
			rec.r7 = Util.checkString(rset0.getString("r7"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SP_SUP_1510_LDataSet ds = (SP_SUP_1510_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SP_SUP_1510_LCURLISTRecord curlistRec = (SP_SUP_1510_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.yymm%>
<%= curlistRec.l1%>
<%= curlistRec.l2%>
<%= curlistRec.l3%>
<%= curlistRec.l4%>
<%= curlistRec.l5%>
<%= curlistRec.l6%>
<%= curlistRec.r1%>
<%= curlistRec.r2%>
<%= curlistRec.r3%>
<%= curlistRec.r4%>
<%= curlistRec.r5%>
<%= curlistRec.r6%>
<%= curlistRec.r7%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Jul 05 14:35:53 KST 2012 */