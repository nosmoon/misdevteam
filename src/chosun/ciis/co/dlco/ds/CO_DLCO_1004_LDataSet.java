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


package chosun.ciis.co.dlco.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.co.dlco.dm.*;
import chosun.ciis.co.dlco.rec.*;

/**
 * 
 */


public class CO_DLCO_1004_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public CO_DLCO_1004_LDataSet(){}
	public CO_DLCO_1004_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(4);
		while(rset0.next()){
			CO_DLCO_1004_LCURLISTRecord rec = new CO_DLCO_1004_LCURLISTRecord();
			rec.sys_clsf_1 = Util.checkString(rset0.getString("sys_clsf_1"));
			rec.sys_clsf_2 = Util.checkString(rset0.getString("sys_clsf_2"));
			rec.sys_clsf_3 = Util.checkString(rset0.getString("sys_clsf_3"));
			rec.sys_clsf_4 = Util.checkString(rset0.getString("sys_clsf_4"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	CO_DLCO_1004_LDataSet ds = (CO_DLCO_1004_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		CO_DLCO_1004_LCURLISTRecord curlistRec = (CO_DLCO_1004_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.sys_clsf_1%>
<%= curlistRec.sys_clsf_2%>
<%= curlistRec.sys_clsf_3%>
<%= curlistRec.sys_clsf_4%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Apr 06 16:46:20 KST 2009 */