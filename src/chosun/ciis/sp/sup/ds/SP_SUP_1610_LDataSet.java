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


public class SP_SUP_1610_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SP_SUP_1610_LDataSet(){}
	public SP_SUP_1610_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			SP_SUP_1610_LCURLISTRecord rec = new SP_SUP_1610_LCURLISTRecord();
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.req_clsf = Util.checkString(rset0.getString("req_clsf"));
			rec.titl = Util.checkString(rset0.getString("titl"));
			rec.make_pers_nm = Util.checkString(rset0.getString("make_pers_nm"));
			rec.make_dt = Util.checkString(rset0.getString("make_dt"));
			rec.brws_cnt = Util.checkString(rset0.getString("brws_cnt"));
			rec.proc_stat = Util.checkString(rset0.getString("proc_stat"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SP_SUP_1610_LDataSet ds = (SP_SUP_1610_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SP_SUP_1610_LCURLISTRecord curlistRec = (SP_SUP_1610_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.seq%>
<%= curlistRec.req_clsf%>
<%= curlistRec.titl%>
<%= curlistRec.make_pers_nm%>
<%= curlistRec.make_dt%>
<%= curlistRec.brws_cnt%>
<%= curlistRec.proc_stat%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Jul 05 16:40:40 KST 2012 */