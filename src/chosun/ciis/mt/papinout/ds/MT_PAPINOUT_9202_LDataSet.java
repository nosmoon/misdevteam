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


public class MT_PAPINOUT_9202_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_PAPINOUT_9202_LDataSet(){}
	public MT_PAPINOUT_9202_LDataSet(String errcode, String errmsg){
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

		ResultSet rset3 = (ResultSet) cstmt.getObject(8);
		while(rset3.next()){
			MT_PAPINOUT_9202_LCURLIST1Record rec = new MT_PAPINOUT_9202_LCURLIST1Record();
			rec.ewh_dt = Util.checkString(rset3.getString("ewh_dt"));
			rec.fac_clsf = Util.checkString(rset3.getString("fac_clsf"));
			rec.ewh_wgt = Util.checkString(rset3.getString("ewh_wgt"));
			rec.ewh_amt = Util.checkString(rset3.getString("ewh_amt"));
			this.curlist1.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(9);
		while(rset4.next()){
			MT_PAPINOUT_9202_LCURLIST2Record rec = new MT_PAPINOUT_9202_LCURLIST2Record();
			rec.ewh_dt = Util.checkString(rset4.getString("ewh_dt"));
			this.curlist2.add(rec);
		}
		ResultSet rset5 = (ResultSet) cstmt.getObject(10);
		while(rset5.next()){
			MT_PAPINOUT_9202_LCURLIST3Record rec = new MT_PAPINOUT_9202_LCURLIST3Record();
			rec.fac_clsf = Util.checkString(rset5.getString("fac_clsf"));
			this.curlist3.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	MT_PAPINOUT_9202_LDataSet ds = (MT_PAPINOUT_9202_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		MT_PAPINOUT_9202_LCURLIST1Record curlist1Rec = (MT_PAPINOUT_9202_LCURLIST1Record)ds.curlist1.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		MT_PAPINOUT_9202_LCURLIST2Record curlist2Rec = (MT_PAPINOUT_9202_LCURLIST2Record)ds.curlist2.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		MT_PAPINOUT_9202_LCURLIST3Record curlist3Rec = (MT_PAPINOUT_9202_LCURLIST3Record)ds.curlist3.get(i);%>
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

<%= curlist1Rec.ewh_dt%>
<%= curlist1Rec.fac_clsf%>
<%= curlist1Rec.ewh_wgt%>
<%= curlist1Rec.ewh_amt%>
<%= curlist2Rec.ewh_dt%>
<%= curlist3Rec.fac_clsf%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed May 20 08:58:24 KST 2009 */