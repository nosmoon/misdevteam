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


package chosun.ciis.hd.evlu.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.evlu.dm.*;
import chosun.ciis.hd.evlu.rec.*;

/**
 * 
 */


public class HD_EVLU_2101_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_EVLU_2101_LDataSet(){}
	public HD_EVLU_2101_LDataSet(String errcode, String errmsg){
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
			HD_EVLU_2101_LCURLISTRecord rec = new HD_EVLU_2101_LCURLISTRecord();
			rec.evlu_pers_nops = Util.checkString(rset0.getString("evlu_pers_nops"));
			rec.s_nops_1tms = Util.checkString(rset0.getString("s_nops_1tms"));
			rec.a_pls_nops_1tms = Util.checkString(rset0.getString("a_pls_nops_1tms"));
			rec.a_nops_1tms = Util.checkString(rset0.getString("a_nops_1tms"));
			rec.s_nops_2tms = Util.checkString(rset0.getString("s_nops_2tms"));
			rec.a_pls_nops_2tms = Util.checkString(rset0.getString("a_pls_nops_2tms"));
			rec.s_a_nops_2tms_sum = Util.checkString(rset0.getString("s_a_nops_2tms_sum"));
			rec.db_status = Util.checkString(rset0.getString("db_status"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	HD_EVLU_2101_LDataSet ds = (HD_EVLU_2101_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_EVLU_2101_LCURLISTRecord curlistRec = (HD_EVLU_2101_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.evlu_pers_nops%>
<%= curlistRec.s_nops_1tms%>
<%= curlistRec.a_pls_nops_1tms%>
<%= curlistRec.a_nops_1tms%>
<%= curlistRec.s_nops_2tms%>
<%= curlistRec.a_pls_nops_2tms%>
<%= curlistRec.s_a_nops_2tms_sum%>
<%= curlistRec.db_status%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Mar 06 16:14:20 KST 2014 */