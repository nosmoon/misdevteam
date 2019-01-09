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


public class MC_BUDG_6143_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MC_BUDG_6143_LDataSet(){}
	public MC_BUDG_6143_LDataSet(String errcode, String errmsg){
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

		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			MC_BUDG_6143_LCURLISTRecord rec = new MC_BUDG_6143_LCURLISTRecord();
			rec.area_clsf = Util.checkString(rset1.getString("area_clsf"));
			rec.paper_amt = Util.checkString(rset1.getString("paper_amt"));
			rec.submat_amt = Util.checkString(rset1.getString("submat_amt"));
			rec.prt_amt = Util.checkString(rset1.getString("prt_amt"));
			rec.non_dduc_paper_amt = Util.checkString(rset1.getString("non_dduc_paper_amt"));
			rec.non_dduc_submat_amt = Util.checkString(rset1.getString("non_dduc_submat_amt"));
			rec.non_dduc_prt_amt = Util.checkString(rset1.getString("non_dduc_prt_amt"));
			rec.paper_amt_cost = Util.checkString(rset1.getString("paper_amt_cost"));
			rec.submat_amt_cost = Util.checkString(rset1.getString("submat_amt_cost"));
			rec.prt_amt_cost = Util.checkString(rset1.getString("prt_amt_cost"));
			rec.pcnt_cost = Util.checkString(rset1.getString("pcnt_cost"));
			rec.cho_issu_cnt = Util.checkString(rset1.getString("cho_issu_cnt"));
			rec.local_issu_cnt = Util.checkString(rset1.getString("local_issu_cnt"));
			rec.avg_cnt = Util.checkString(rset1.getString("avg_cnt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	MC_BUDG_6143_LDataSet ds = (MC_BUDG_6143_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MC_BUDG_6143_LCURLISTRecord curlistRec = (MC_BUDG_6143_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.area_clsf%>
<%= curlistRec.paper_amt%>
<%= curlistRec.submat_amt%>
<%= curlistRec.prt_amt%>
<%= curlistRec.non_dduc_paper_amt%>
<%= curlistRec.non_dduc_submat_amt%>
<%= curlistRec.non_dduc_prt_amt%>
<%= curlistRec.paper_amt_cost%>
<%= curlistRec.submat_amt_cost%>
<%= curlistRec.prt_amt_cost%>
<%= curlistRec.pcnt_cost%>
<%= curlistRec.cho_issu_cnt%>
<%= curlistRec.local_issu_cnt%>
<%= curlistRec.avg_cnt%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri May 22 10:30:46 KST 2009 */