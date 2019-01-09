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


package chosun.ciis.se.rcp.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.rcp.dm.*;
import chosun.ciis.se.rcp.rec.*;

/**
 * 
 */


public class SE_RCP_1120_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_RCP_1120_LDataSet(){}
	public SE_RCP_1120_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			SE_RCP_1120_LCURLISTRecord rec = new SE_RCP_1120_LCURLISTRecord();
			rec.bo_nm = Util.checkString(rset0.getString("bo_nm"));
			rec.area_nm = Util.checkString(rset0.getString("area_nm"));
			rec.bo_head_nm = Util.checkString(rset0.getString("bo_head_nm"));
			rec.acct_rcpm_cnfm_tot_amt = Util.checkString(rset0.getString("acct_rcpm_cnfm_tot_amt"));
			rec.acct_rcpm_reg_tot_amt = Util.checkString(rset0.getString("acct_rcpm_reg_tot_amt"));
			rec.acct_rcpm_rem_amt = Util.checkString(rset0.getString("acct_rcpm_rem_amt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SE_RCP_1120_LDataSet ds = (SE_RCP_1120_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_RCP_1120_LCURLISTRecord curlistRec = (SE_RCP_1120_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.bo_nm%>
<%= curlistRec.area_nm%>
<%= curlistRec.bo_head_nm%>
<%= curlistRec.acct_rcpm_cnfm_tot_amt%>
<%= curlistRec.acct_rcpm_reg_tot_amt%>
<%= curlistRec.acct_rcpm_rem_amt%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Apr 15 19:09:50 KST 2009 */