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


package chosun.ciis.mt.etcpc.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.etcpc.dm.*;
import chosun.ciis.mt.etcpc.rec.*;

/**
 * 
 */


public class MT_ETCPC_3001_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_ETCPC_3001_MDataSet(){}
	public MT_ETCPC_3001_MDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			MT_ETCPC_3001_MCURLIST1Record rec = new MT_ETCPC_3001_MCURLIST1Record();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.swmang_no = Util.checkString(rset0.getString("swmang_no"));
			rec.swnm = Util.checkString(rset0.getString("swnm"));
			rec.swver = Util.checkString(rset0.getString("swver"));
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			this.curlist1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	MT_ETCPC_3001_MDataSet ds = (MT_ETCPC_3001_MDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		MT_ETCPC_3001_MCURLIST1Record curlist1Rec = (MT_ETCPC_3001_MCURLIST1Record)ds.curlist1.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlist1Rec.cmpy_cd%>
<%= curlist1Rec.swmang_no%>
<%= curlist1Rec.swnm%>
<%= curlist1Rec.swver%>
<%= curlist1Rec.cdnm%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Mar 26 11:20:57 KST 2009 */