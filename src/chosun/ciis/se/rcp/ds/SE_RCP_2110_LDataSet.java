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


public class SE_RCP_2110_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_RCP_2110_LDataSet(){}
	public SE_RCP_2110_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(11);
		while(rset0.next()){
			SE_RCP_2110_LCURLISTRecord rec = new SE_RCP_2110_LCURLISTRecord();
			rec.rcpm_dt = Util.checkString(rset0.getString("rcpm_dt"));
			rec.slip_number = Util.checkString(rset0.getString("slip_number"));
			rec.bo_nm = Util.checkString(rset0.getString("bo_nm"));
			rec.budg_nm1 = Util.checkString(rset0.getString("budg_nm1"));
			rec.d_amt = Util.checkString(rset0.getString("d_amt"));
			rec.budg_nm2 = Util.checkString(rset0.getString("budg_nm2"));
			rec.c_amt = Util.checkString(rset0.getString("c_amt"));
			rec.bank_nm = Util.checkString(rset0.getString("bank_nm"));
			rec.rcpm_shet_no = Util.checkString(rset0.getString("rcpm_shet_no"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SE_RCP_2110_LDataSet ds = (SE_RCP_2110_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_RCP_2110_LCURLISTRecord curlistRec = (SE_RCP_2110_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.rcpm_dt%>
<%= curlistRec.slip_number%>
<%= curlistRec.bo_nm%>
<%= curlistRec.budg_nm1%>
<%= curlistRec.d_amt%>
<%= curlistRec.budg_nm2%>
<%= curlistRec.c_amt%>
<%= curlistRec.bank_nm%>
<%= curlistRec.rcpm_shet_no%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu May 07 17:38:48 KST 2009 */