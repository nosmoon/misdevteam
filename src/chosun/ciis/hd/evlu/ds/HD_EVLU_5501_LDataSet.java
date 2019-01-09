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


public class HD_EVLU_5501_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_EVLU_5501_LDataSet(){}
	public HD_EVLU_5501_LDataSet(String errcode, String errmsg){
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
			HD_EVLU_5501_LCURLISTRecord rec = new HD_EVLU_5501_LCURLISTRecord();
			rec.rnum = Util.checkString(rset0.getString("rnum"));
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			rec.t1 = Util.checkString(rset0.getString("t1"));
			rec.t2 = Util.checkString(rset0.getString("t2"));
			rec.t3 = Util.checkString(rset0.getString("t3"));
			rec.t4 = Util.checkString(rset0.getString("t4"));
			rec.t5 = Util.checkString(rset0.getString("t5"));
			rec.t6 = Util.checkString(rset0.getString("t6"));
			rec.t7 = Util.checkString(rset0.getString("t7"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	HD_EVLU_5501_LDataSet ds = (HD_EVLU_5501_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_EVLU_5501_LCURLISTRecord curlistRec = (HD_EVLU_5501_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.rnum%>
<%= curlistRec.cd%>
<%= curlistRec.cdnm%>
<%= curlistRec.t1%>
<%= curlistRec.t2%>
<%= curlistRec.t3%>
<%= curlistRec.t4%>
<%= curlistRec.t5%>
<%= curlistRec.t6%>
<%= curlistRec.t7%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Jun 04 15:18:22 KST 2009 */