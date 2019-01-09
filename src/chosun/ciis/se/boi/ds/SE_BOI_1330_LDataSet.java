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


public class SE_BOI_1330_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_BOI_1330_LDataSet(){}
	public SE_BOI_1330_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(16);
		while(rset0.next()){
			SE_BOI_1330_LCURLISTRecord rec = new SE_BOI_1330_LCURLISTRecord();
			rec.area_nm = Util.checkString(rset0.getString("area_nm"));
			rec.bo_nm = Util.checkString(rset0.getString("bo_nm"));
			rec.bo_head_nm = Util.checkString(rset0.getString("bo_head_nm"));
			rec.cntr_stat_nm = Util.checkString(rset0.getString("cntr_stat_nm"));
			rec.bo_cntr_dt = Util.checkString(rset0.getString("bo_cntr_dt"));
			rec.bo_expy_dt = Util.checkString(rset0.getString("bo_expy_dt"));
			rec.out_gurt_amt = Util.checkString(rset0.getString("out_gurt_amt"));
			rec.out_amt_dt = Util.checkString(rset0.getString("out_amt_dt"));
			rec.in_gurt_amt = Util.checkString(rset0.getString("in_gurt_amt"));
			rec.in_amt_dt = Util.checkString(rset0.getString("in_amt_dt"));
			rec.leas_sply_amt_unrcp_occr_dt = Util.checkString(rset0.getString("leas_sply_amt_unrcp_occr_dt"));
			rec.leas_sply_amt_bal = Util.checkString(rset0.getString("leas_sply_amt_bal"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SE_BOI_1330_LDataSet ds = (SE_BOI_1330_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_BOI_1330_LCURLISTRecord curlistRec = (SE_BOI_1330_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.area_nm%>
<%= curlistRec.bo_nm%>
<%= curlistRec.bo_head_nm%>
<%= curlistRec.cntr_stat_nm%>
<%= curlistRec.bo_cntr_dt%>
<%= curlistRec.bo_expy_dt%>
<%= curlistRec.out_gurt_amt%>
<%= curlistRec.out_amt_dt%>
<%= curlistRec.in_gurt_amt%>
<%= curlistRec.in_amt_dt%>
<%= curlistRec.leas_sply_amt_unrcp_occr_dt%>
<%= curlistRec.leas_sply_amt_bal%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Feb 03 15:32:14 KST 2009 */