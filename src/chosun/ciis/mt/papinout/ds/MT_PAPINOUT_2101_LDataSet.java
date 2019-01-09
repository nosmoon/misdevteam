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


public class MT_PAPINOUT_2101_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_PAPINOUT_2101_LDataSet(){}
	public MT_PAPINOUT_2101_LDataSet(String errcode, String errmsg){
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
			MT_PAPINOUT_2101_LCURLISTRecord rec = new MT_PAPINOUT_2101_LCURLISTRecord();
			rec.fac_clsf = Util.checkString(rset0.getString("fac_clsf"));
			rec.fac_clsf_nm = Util.checkString(rset0.getString("fac_clsf_nm"));
			rec.mg_30 = Util.checkString(rset0.getString("mg_30"));
			rec.mg_20 = Util.checkString(rset0.getString("mg_20"));
			rec.mg_40 = Util.checkString(rset0.getString("mg_40"));
			rec.mg_50 = Util.checkString(rset0.getString("mg_50"));
			rec.mg_60 = Util.checkString(rset0.getString("mg_60"));
			rec.nm_30 = Util.checkString(rset0.getString("nm_30"));
			rec.nm_20 = Util.checkString(rset0.getString("nm_20"));
			rec.nm_40 = Util.checkString(rset0.getString("nm_40"));
			rec.nm_50 = Util.checkString(rset0.getString("nm_50"));
			rec.nm_60 = Util.checkString(rset0.getString("nm_60"));
			rec.tm_30 = Util.checkString(rset0.getString("tm_30"));
			rec.tm_20 = Util.checkString(rset0.getString("tm_20"));
			rec.tm_40 = Util.checkString(rset0.getString("tm_40"));
			rec.tm_50 = Util.checkString(rset0.getString("tm_50"));
			rec.tm_60 = Util.checkString(rset0.getString("tm_60"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	MT_PAPINOUT_2101_LDataSet ds = (MT_PAPINOUT_2101_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_PAPINOUT_2101_LCURLISTRecord curlistRec = (MT_PAPINOUT_2101_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.fac_clsf%>
<%= curlistRec.fac_clsf_nm%>
<%= curlistRec.mg_30%>
<%= curlistRec.mg_20%>
<%= curlistRec.mg_40%>
<%= curlistRec.mg_50%>
<%= curlistRec.mg_60%>
<%= curlistRec.nm_30%>
<%= curlistRec.nm_20%>
<%= curlistRec.nm_40%>
<%= curlistRec.nm_50%>
<%= curlistRec.nm_60%>
<%= curlistRec.tm_30%>
<%= curlistRec.tm_20%>
<%= curlistRec.tm_40%>
<%= curlistRec.tm_50%>
<%= curlistRec.tm_60%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Sep 17 23:11:24 KST 2009 */