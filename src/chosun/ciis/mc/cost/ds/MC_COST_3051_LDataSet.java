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


package chosun.ciis.mc.cost.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mc.cost.dm.*;
import chosun.ciis.mc.cost.rec.*;

/**
 * 
 */


public class MC_COST_3051_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MC_COST_3051_LDataSet(){}
	public MC_COST_3051_LDataSet(String errcode, String errmsg){
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
			MC_COST_3051_LCURLISTRecord rec = new MC_COST_3051_LCURLISTRecord();
			rec.use_dept_cd = Util.checkString(rset0.getString("use_dept_cd"));
			rec.use_dept_nm = Util.checkString(rset0.getString("use_dept_nm"));
			rec.budg_cd = Util.checkString(rset0.getString("budg_cd"));
			rec.budg_nm = Util.checkString(rset0.getString("budg_nm"));
			rec.acct_cd = Util.checkString(rset0.getString("acct_cd"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.medi_nm = Util.checkString(rset0.getString("medi_nm"));
			rec.dtls_medi_cd = Util.checkString(rset0.getString("dtls_medi_cd"));
			rec.dtls_medi_nm = Util.checkString(rset0.getString("dtls_medi_nm"));
			rec.dstb_dept_cd1 = Util.checkString(rset0.getString("dstb_dept_cd1"));
			rec.dstb_dept_nm = Util.checkString(rset0.getString("dstb_dept_nm"));
			rec.cost_dstb_cd = Util.checkString(rset0.getString("cost_dstb_cd"));
			rec.cost_dstb_nm = Util.checkString(rset0.getString("cost_dstb_nm"));
			rec.dstb_ratio = Util.checkString(rset0.getString("dstb_ratio"));
			rec.amt = Util.checkString(rset0.getString("amt"));
			rec.qunt = Util.checkString(rset0.getString("qunt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	MC_COST_3051_LDataSet ds = (MC_COST_3051_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MC_COST_3051_LCURLISTRecord curlistRec = (MC_COST_3051_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.use_dept_cd%>
<%= curlistRec.use_dept_nm%>
<%= curlistRec.budg_cd%>
<%= curlistRec.budg_nm%>
<%= curlistRec.acct_cd%>
<%= curlistRec.medi_cd%>
<%= curlistRec.medi_nm%>
<%= curlistRec.dtls_medi_cd%>
<%= curlistRec.dtls_medi_nm%>
<%= curlistRec.dstb_dept_cd1%>
<%= curlistRec.dstb_dept_nm%>
<%= curlistRec.cost_dstb_cd%>
<%= curlistRec.cost_dstb_nm%>
<%= curlistRec.dstb_ratio%>
<%= curlistRec.amt%>
<%= curlistRec.qunt%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Aug 04 11:55:37 KST 2009 */