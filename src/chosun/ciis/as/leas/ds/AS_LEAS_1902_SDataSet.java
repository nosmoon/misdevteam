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


package chosun.ciis.as.leas.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.as.leas.dm.*;
import chosun.ciis.as.leas.rec.*;

/**
 * 
 */


public class AS_LEAS_1902_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public AS_LEAS_1902_SDataSet(){}
	public AS_LEAS_1902_SDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			AS_LEAS_1902_SCURLIST1Record rec = new AS_LEAS_1902_SCURLIST1Record();
			rec.leas_tot_amt = Util.checkString(rset0.getString("leas_tot_amt"));
			rec.leas_out_amt = Util.checkString(rset0.getString("leas_out_amt"));
			rec.gurt_tot_amt = Util.checkString(rset0.getString("gurt_tot_amt"));
			rec.gurt_out_amt = Util.checkString(rset0.getString("gurt_out_amt"));
			rec.precpt_tot_amt = Util.checkString(rset0.getString("precpt_tot_amt"));
			rec.precpt_out_amt = Util.checkString(rset0.getString("precpt_out_amt"));
			rec.bldg_cd = Util.checkString(rset0.getString("bldg_cd"));
			rec.cntr_yy = Util.checkString(rset0.getString("cntr_yy"));
			rec.cntr_seq = Util.checkString(rset0.getString("cntr_seq"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(8);
		while(rset1.next()){
			AS_LEAS_1902_SCURLIST2Record rec = new AS_LEAS_1902_SCURLIST2Record();
			rec.clam_tot_amt = Util.checkString(rset1.getString("clam_tot_amt"));
			rec.rcpm_tot_amt = Util.checkString(rset1.getString("rcpm_tot_amt"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	AS_LEAS_1902_SDataSet ds = (AS_LEAS_1902_SDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		AS_LEAS_1902_SCURLIST1Record curlist1Rec = (AS_LEAS_1902_SCURLIST1Record)ds.curlist1.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		AS_LEAS_1902_SCURLIST2Record curlist2Rec = (AS_LEAS_1902_SCURLIST2Record)ds.curlist2.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
<%= ds.getCurlist2()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlist1Rec.leas_tot_amt%>
<%= curlist1Rec.leas_out_amt%>
<%= curlist1Rec.gurt_tot_amt%>
<%= curlist1Rec.gurt_out_amt%>
<%= curlist1Rec.precpt_tot_amt%>
<%= curlist1Rec.precpt_out_amt%>
<%= curlist1Rec.bldg_cd%>
<%= curlist1Rec.cntr_yy%>
<%= curlist1Rec.cntr_seq%>
<%= curlist2Rec.clam_tot_amt%>
<%= curlist2Rec.rcpm_tot_amt%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri May 29 17:05:50 KST 2009 */