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


package chosun.ciis.fc.func.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.func.dm.*;
import chosun.ciis.fc.func.rec.*;

/**
 * 
 */


public class FC_FUNC_8071_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_FUNC_8071_LDataSet(){}
	public FC_FUNC_8071_LDataSet(String errcode, String errmsg){
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
			FC_FUNC_8071_LCURLISTRecord rec = new FC_FUNC_8071_LCURLISTRecord();
			rec.leas_nm = Util.checkString(rset0.getString("leas_nm"));
			rec.compgbcdnm = Util.checkString(rset0.getString("compgbcdnm"));
			rec.dlco_cd = Util.checkString(rset0.getString("dlco_cd"));
			rec.compnm = Util.checkString(rset0.getString("compnm"));
			rec.frcr_amt = Util.checkString(rset0.getString("frcr_amt"));
			rec.pay_plan_tms = Util.checkString(rset0.getString("pay_plan_tms"));
			rec.pch_count = Util.checkString(rset0.getString("pch_count"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	FC_FUNC_8071_LDataSet ds = (FC_FUNC_8071_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_FUNC_8071_LCURLISTRecord curlistRec = (FC_FUNC_8071_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.leas_nm%>
<%= curlistRec.compgbcdnm%>
<%= curlistRec.dlco_cd%>
<%= curlistRec.compnm%>
<%= curlistRec.frcr_amt%>
<%= curlistRec.pay_plan_tms%>
<%= curlistRec.pch_count%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Apr 08 13:50:32 KST 2009 */