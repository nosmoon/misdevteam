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


package chosun.ciis.mt.commatr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.commatr.dm.*;
import chosun.ciis.mt.commatr.rec.*;

/**
 * 
 */


public class MT_COMMATR_2200_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_COMMATR_2200_LDataSet(){}
	public MT_COMMATR_2200_LDataSet(String errcode, String errmsg){
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
			MT_COMMATR_2200_LCURLISTRecord rec = new MT_COMMATR_2200_LCURLISTRecord();
			rec.uprc_meda_dt = Util.checkString(rset0.getString("uprc_meda_dt"));
			rec.dlco_eps_no = Util.checkString(rset0.getString("dlco_eps_no"));
			rec.matr_cd = Util.checkString(rset0.getString("matr_cd"));
			rec.purc_uprc = Util.checkString(rset0.getString("purc_uprc"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(9);
		while(rset1.next()){
			MT_COMMATR_2200_LCURLIST1Record rec = new MT_COMMATR_2200_LCURLIST1Record();
			rec.matr_cd = Util.checkString(rset1.getString("matr_cd"));
			this.curlist1.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(10);
		while(rset2.next()){
			MT_COMMATR_2200_LCURLIST2Record rec = new MT_COMMATR_2200_LCURLIST2Record();
			rec.dlco_eps_no = Util.checkString(rset2.getString("dlco_eps_no"));
			rec.uprc_meda_dt = Util.checkString(rset2.getString("uprc_meda_dt"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	MT_COMMATR_2200_LDataSet ds = (MT_COMMATR_2200_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_COMMATR_2200_LCURLISTRecord curlistRec = (MT_COMMATR_2200_LCURLISTRecord)ds.curlist.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		MT_COMMATR_2200_LCURLIST1Record curlist1Rec = (MT_COMMATR_2200_LCURLIST1Record)ds.curlist1.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		MT_COMMATR_2200_LCURLIST2Record curlist2Rec = (MT_COMMATR_2200_LCURLIST2Record)ds.curlist2.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getCurlist1()%>
<%= ds.getCurlist2()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlistRec.uprc_meda_dt%>
<%= curlistRec.dlco_eps_no%>
<%= curlistRec.matr_cd%>
<%= curlistRec.purc_uprc%>
<%= curlist1Rec.matr_cd%>
<%= curlist2Rec.dlco_eps_no%>
<%= curlist2Rec.uprc_meda_dt%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Jul 07 21:17:21 KST 2009 */