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


package chosun.ciis.mt.papinout.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.papinout.dm.*;
import chosun.ciis.mt.papinout.rec.*;

/**
 * 
 */


public class MT_PAPINOUT_2103_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_PAPINOUT_2103_LDataSet(){}
	public MT_PAPINOUT_2103_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			MT_PAPINOUT_2103_LCURLISTRecord rec = new MT_PAPINOUT_2103_LCURLISTRecord();
			rec.base_dt = Util.checkString(rset0.getString("base_dt"));
			rec.mg_chk_10 = Util.checkString(rset0.getString("mg_chk_10"));
			rec.mg_chk_20 = Util.checkString(rset0.getString("mg_chk_20"));
			rec.mg_user_10 = Util.checkString(rset0.getString("mg_user_10"));
			rec.mg_user_20 = Util.checkString(rset0.getString("mg_user_20"));
			rec.mg_dt_10 = Util.checkString(rset0.getString("mg_dt_10"));
			rec.mg_dt_20 = Util.checkString(rset0.getString("mg_dt_20"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	MT_PAPINOUT_2103_LDataSet ds = (MT_PAPINOUT_2103_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_PAPINOUT_2103_LCURLISTRecord curlistRec = (MT_PAPINOUT_2103_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.base_dt%>
<%= curlistRec.mg_chk_10%>
<%= curlistRec.mg_chk_20%>
<%= curlistRec.mg_user_10%>
<%= curlistRec.mg_user_20%>
<%= curlistRec.mg_dt_10%>
<%= curlistRec.mg_dt_20%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Sep 23 21:38:15 KST 2009 */