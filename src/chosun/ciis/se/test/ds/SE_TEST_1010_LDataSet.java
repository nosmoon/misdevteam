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


package chosun.ciis.se.test.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.test.dm.*;
import chosun.ciis.se.test.rec.*;

/**
 * 
 */


public class SE_TEST_1010_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String week;

	public SE_TEST_1010_LDataSet(){}
	public SE_TEST_1010_LDataSet(String errcode, String errmsg, String week){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.week = week;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setWeek(String week){
		this.week = week;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getWeek(){
		return this.week;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.week = Util.checkString(cstmt.getString(9));
		ResultSet rset0 = (ResultSet) cstmt.getObject(10);
		while(rset0.next()){
			SE_TEST_1010_LCURCOMMLISTRecord rec = new SE_TEST_1010_LCURCOMMLISTRecord();
			rec.emp_nm = Util.checkString(rset0.getString("emp_nm"));
			rec.cmpycd = Util.checkString(rset0.getString("cmpycd"));
			rec.workcd = Util.checkString(rset0.getString("workcd"));
			rec.vip_lastweek = Util.checkString(rset0.getString("vip_lastweek"));
			rec.lastweek = Util.checkString(rset0.getString("lastweek"));
			rec.thisweek = Util.checkString(rset0.getString("thisweek"));
			this.curcommlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SE_TEST_1010_LDataSet ds = (SE_TEST_1010_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SE_TEST_1010_LCURCOMMLISTRecord curcommlistRec = (SE_TEST_1010_LCURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getWeek()%>
<%= ds.getCurcommlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curcommlistRec.emp_nm%>
<%= curcommlistRec.cmpycd%>
<%= curcommlistRec.workcd%>
<%= curcommlistRec.vip_lastweek%>
<%= curcommlistRec.lastweek%>
<%= curcommlistRec.thisweek%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu May 23 17:03:18 KST 2013 */