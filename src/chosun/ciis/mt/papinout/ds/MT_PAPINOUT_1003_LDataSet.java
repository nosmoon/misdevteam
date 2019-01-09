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


public class MT_PAPINOUT_1003_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_PAPINOUT_1003_LDataSet(){}
	public MT_PAPINOUT_1003_LDataSet(String errcode, String errmsg){
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
			MT_PAPINOUT_1003_LCURLIST1Record rec = new MT_PAPINOUT_1003_LCURLIST1Record();
			rec.pj_kind = Util.checkString(rset0.getString("pj_kind"));
			rec.qunt = Util.checkString(rset0.getString("qunt"));
			rec.wgt = Util.checkString(rset0.getString("wgt"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(7);
		while(rset1.next()){
			MT_PAPINOUT_1003_LCURLIST2Record rec = new MT_PAPINOUT_1003_LCURLIST2Record();
			rec.gajung_py = Util.checkString(rset1.getString("gajung_py"));
			this.curlist2.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(8);
		while(rset2.next()){
			MT_PAPINOUT_1003_LCURLIST3Record rec = new MT_PAPINOUT_1003_LCURLIST3Record();
			rec.pap_std = Util.checkString(rset2.getString("pap_std"));
			rec.issu_pcnt = Util.checkString(rset2.getString("issu_pcnt"));
			rec.slip_qty = Util.checkString(rset2.getString("slip_qty"));
			this.curlist3.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	MT_PAPINOUT_1003_LDataSet ds = (MT_PAPINOUT_1003_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		MT_PAPINOUT_1003_LCURLIST1Record curlist1Rec = (MT_PAPINOUT_1003_LCURLIST1Record)ds.curlist1.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		MT_PAPINOUT_1003_LCURLIST2Record curlist2Rec = (MT_PAPINOUT_1003_LCURLIST2Record)ds.curlist2.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		MT_PAPINOUT_1003_LCURLIST3Record curlist3Rec = (MT_PAPINOUT_1003_LCURLIST3Record)ds.curlist3.get(i);%>
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

<%= curlist1Rec.pj_kind%>
<%= curlist1Rec.qunt%>
<%= curlist1Rec.wgt%>
<%= curlist2Rec.gajung_py%>
<%= curlist3Rec.pap_std%>
<%= curlist3Rec.issu_pcnt%>
<%= curlist3Rec.slip_qty%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Apr 14 20:36:25 KST 2009 */