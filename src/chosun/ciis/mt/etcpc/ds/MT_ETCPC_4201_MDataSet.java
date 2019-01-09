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


public class MT_ETCPC_4201_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_ETCPC_4201_MDataSet(){}
	public MT_ETCPC_4201_MDataSet(String errcode, String errmsg){
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
			MT_ETCPC_4201_MCURLIST1Record rec = new MT_ETCPC_4201_MCURLIST1Record();
			rec.swmang_no = Util.checkString(rset0.getString("swmang_no"));
			rec.use_usag = Util.checkString(rset0.getString("use_usag"));
			rec.swlics_cnt = Util.checkString(rset0.getString("swlics_cnt"));
			rec.swnm = Util.checkString(rset0.getString("swnm"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(7);
		while(rset1.next()){
			MT_ETCPC_4201_MCURLIST2Record rec = new MT_ETCPC_4201_MCURLIST2Record();
			rec.swnm = Util.checkString(rset1.getString("swnm"));
			this.curlist2.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(8);
		while(rset2.next()){
			MT_ETCPC_4201_MCURLIST3Record rec = new MT_ETCPC_4201_MCURLIST3Record();
			rec.make_cmpy = Util.checkString(rset2.getString("make_cmpy"));
			this.curlist3.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	MT_ETCPC_4201_MDataSet ds = (MT_ETCPC_4201_MDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		MT_ETCPC_4201_MCURLIST1Record curlist1Rec = (MT_ETCPC_4201_MCURLIST1Record)ds.curlist1.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		MT_ETCPC_4201_MCURLIST2Record curlist2Rec = (MT_ETCPC_4201_MCURLIST2Record)ds.curlist2.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		MT_ETCPC_4201_MCURLIST3Record curlist3Rec = (MT_ETCPC_4201_MCURLIST3Record)ds.curlist3.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
<%= ds.getCurlist2()%>
<%= ds.getCurlist3()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlist1Rec.swmang_no%>
<%= curlist1Rec.use_usag%>
<%= curlist1Rec.swlics_cnt%>
<%= curlist1Rec.swnm%>
<%= curlist2Rec.swnm%>
<%= curlist3Rec.make_cmpy%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Apr 03 18:15:39 KST 2009 */