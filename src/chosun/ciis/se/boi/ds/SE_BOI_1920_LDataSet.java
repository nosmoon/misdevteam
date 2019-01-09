/***************************************************************************************************
* ���ϸ� : .java
* ��� : �ǸŽý���
* �ۼ����� : 2009-02-18
* �ۼ��� : ��â��
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.se.boi.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.boi.dm.*;
import chosun.ciis.se.boi.rec.*;

/**
 * 
 */


public class SE_BOI_1920_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_BOI_1920_LDataSet(){}
	public SE_BOI_1920_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(10);
		while(rset0.next()){
			SE_BOI_1920_LCURLISTRecord rec = new SE_BOI_1920_LCURLISTRecord();
			rec.bo_cd1 = Util.checkString(rset0.getString("bo_cd1"));
			rec.bo_seq1 = Util.checkString(rset0.getString("bo_seq1"));
			rec.bo_nm1 = Util.checkString(rset0.getString("bo_nm1"));
			rec.bo_head_nm1 = Util.checkString(rset0.getString("bo_head_nm1"));
			rec.cntr_stat_nm1 = Util.checkString(rset0.getString("cntr_stat_nm1"));
			rec.amt1 = Util.checkString(rset0.getString("amt1"));
			rec.leas_sply_amt_unrcp_occr_dt1 = Util.checkString(rset0.getString("leas_sply_amt_unrcp_occr_dt1"));
			rec.bo_cd2 = Util.checkString(rset0.getString("bo_cd2"));
			rec.bo_seq2 = Util.checkString(rset0.getString("bo_seq2"));
			rec.bo_nm2 = Util.checkString(rset0.getString("bo_nm2"));
			rec.bo_head_nm2 = Util.checkString(rset0.getString("bo_head_nm2"));
			rec.cntr_stat_nm2 = Util.checkString(rset0.getString("cntr_stat_nm2"));
			rec.amt2 = Util.checkString(rset0.getString("amt2"));
			rec.leas_sply_amt_unrcp_occr_dt2 = Util.checkString(rset0.getString("leas_sply_amt_unrcp_occr_dt2"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SE_BOI_1920_LDataSet ds = (SE_BOI_1920_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_BOI_1920_LCURLISTRecord curlistRec = (SE_BOI_1920_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.bo_cd1%>
<%= curlistRec.bo_seq1%>
<%= curlistRec.bo_nm1%>
<%= curlistRec.bo_head_nm1%>
<%= curlistRec.cntr_stat_nm1%>
<%= curlistRec.amt1%>
<%= curlistRec.leas_sply_amt_unrcp_occr_dt1%>
<%= curlistRec.bo_cd2%>
<%= curlistRec.bo_seq2%>
<%= curlistRec.bo_nm2%>
<%= curlistRec.bo_head_nm2%>
<%= curlistRec.cntr_stat_nm2%>
<%= curlistRec.amt2%>
<%= curlistRec.leas_sply_amt_unrcp_occr_dt2%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri May 22 17:17:33 KST 2009 */