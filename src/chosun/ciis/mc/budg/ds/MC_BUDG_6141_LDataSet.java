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


package chosun.ciis.mc.budg.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mc.budg.dm.*;
import chosun.ciis.mc.budg.rec.*;

/**
 * 
 */


public class MC_BUDG_6141_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MC_BUDG_6141_LDataSet(){}
	public MC_BUDG_6141_LDataSet(String errcode, String errmsg){
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
			MC_BUDG_6141_LCURLISTRecord rec = new MC_BUDG_6141_LCURLISTRecord();
			rec.major_amt = Util.checkString(rset0.getString("major_amt"));
			rec.sub_amt = Util.checkString(rset0.getString("sub_amt"));
			rec.prt_labor_amt = Util.checkString(rset0.getString("prt_labor_amt"));
			rec.sub_tot = Util.checkString(rset0.getString("sub_tot"));
			rec.major_amt_local = Util.checkString(rset0.getString("major_amt_local"));
			rec.sub_amt_local = Util.checkString(rset0.getString("sub_amt_local"));
			rec.sub_tot_local = Util.checkString(rset0.getString("sub_tot_local"));
			rec.tot_avg = Util.checkString(rset0.getString("tot_avg"));
			rec.deduct_labor_amt = Util.checkString(rset0.getString("deduct_labor_amt"));
			rec.bmajor_amt = Util.checkString(rset0.getString("bmajor_amt"));
			rec.bsub_amt = Util.checkString(rset0.getString("bsub_amt"));
			rec.bprt_labor_amt = Util.checkString(rset0.getString("bprt_labor_amt"));
			rec.bsub_tot = Util.checkString(rset0.getString("bsub_tot"));
			rec.bmajor_amt_local = Util.checkString(rset0.getString("bmajor_amt_local"));
			rec.bsub_amt_local = Util.checkString(rset0.getString("bsub_amt_local"));
			rec.bsub_tot_local = Util.checkString(rset0.getString("bsub_tot_local"));
			rec.btot_avg = Util.checkString(rset0.getString("btot_avg"));
			rec.bdeduct_labor_amt = Util.checkString(rset0.getString("bdeduct_labor_amt"));
			rec.bmajor_cost = Util.checkString(rset0.getString("bmajor_cost"));
			rec.bsub_cost = Util.checkString(rset0.getString("bsub_cost"));
			rec.bprt_labor_cost = Util.checkString(rset0.getString("bprt_labor_cost"));
			rec.bsub_tot_cost = Util.checkString(rset0.getString("bsub_tot_cost"));
			rec.bmajor_local_cost = Util.checkString(rset0.getString("bmajor_local_cost"));
			rec.bsub_local_cost = Util.checkString(rset0.getString("bsub_local_cost"));
			rec.tot_local_cost = Util.checkString(rset0.getString("tot_local_cost"));
			rec.btot_avg_cost = Util.checkString(rset0.getString("btot_avg_cost"));
			rec.bdeduct_labor_cost = Util.checkString(rset0.getString("bdeduct_labor_cost"));
			rec.iss_cho = Util.checkString(rset0.getString("iss_cho"));
			rec.iss_local = Util.checkString(rset0.getString("iss_local"));
			rec.avg_qty = Util.checkString(rset0.getString("avg_qty"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	MC_BUDG_6141_LDataSet ds = (MC_BUDG_6141_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MC_BUDG_6141_LCURLISTRecord curlistRec = (MC_BUDG_6141_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.major_amt%>
<%= curlistRec.sub_amt%>
<%= curlistRec.prt_labor_amt%>
<%= curlistRec.sub_tot%>
<%= curlistRec.major_amt_local%>
<%= curlistRec.sub_amt_local%>
<%= curlistRec.sub_tot_local%>
<%= curlistRec.tot_avg%>
<%= curlistRec.deduct_labor_amt%>
<%= curlistRec.bmajor_amt%>
<%= curlistRec.bsub_amt%>
<%= curlistRec.bprt_labor_amt%>
<%= curlistRec.bsub_tot%>
<%= curlistRec.bmajor_amt_local%>
<%= curlistRec.bsub_amt_local%>
<%= curlistRec.bsub_tot_local%>
<%= curlistRec.btot_avg%>
<%= curlistRec.bdeduct_labor_amt%>
<%= curlistRec.bmajor_cost%>
<%= curlistRec.bsub_cost%>
<%= curlistRec.bprt_labor_cost%>
<%= curlistRec.bsub_tot_cost%>
<%= curlistRec.bmajor_local_cost%>
<%= curlistRec.bsub_local_cost%>
<%= curlistRec.tot_local_cost%>
<%= curlistRec.btot_avg_cost%>
<%= curlistRec.bdeduct_labor_cost%>
<%= curlistRec.iss_cho%>
<%= curlistRec.iss_local%>
<%= curlistRec.avg_qty%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Sat May 23 15:54:02 KST 2009 */