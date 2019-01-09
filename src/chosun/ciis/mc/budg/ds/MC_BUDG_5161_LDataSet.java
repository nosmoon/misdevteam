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


public class MC_BUDG_5161_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MC_BUDG_5161_LDataSet(){}
	public MC_BUDG_5161_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(14);
		while(rset0.next()){
			MC_BUDG_5161_LCURLISTRecord rec = new MC_BUDG_5161_LCURLISTRecord();
			rec.budg_yymm = Util.checkString(rset0.getString("budg_yymm"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.buseonm = Util.checkString(rset0.getString("buseonm"));
			rec.budg_cd = Util.checkString(rset0.getString("budg_cd"));
			rec.evnt_nm = Util.checkString(rset0.getString("evnt_nm"));
			rec.ysnm = Util.checkString(rset0.getString("ysnm"));
			rec.cjysbjamt = Util.checkString(rset0.getString("cjysbjamt"));
			rec.budg_ask_amt = Util.checkString(rset0.getString("budg_ask_amt"));
			rec.budg_cndt_amt = Util.checkString(rset0.getString("budg_cndt_amt"));
			rec.chamt = Util.checkString(rset0.getString("chamt"));
			rec.evnt_cd = Util.checkString(rset0.getString("evnt_cd"));
			rec.slip_no = Util.checkString(rset0.getString("slip_no"));
			rec.amt = Util.checkString(rset0.getString("amt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	MC_BUDG_5161_LDataSet ds = (MC_BUDG_5161_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MC_BUDG_5161_LCURLISTRecord curlistRec = (MC_BUDG_5161_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.budg_yymm%>
<%= curlistRec.dept_cd%>
<%= curlistRec.buseonm%>
<%= curlistRec.budg_cd%>
<%= curlistRec.evnt_nm%>
<%= curlistRec.ysnm%>
<%= curlistRec.cjysbjamt%>
<%= curlistRec.budg_ask_amt%>
<%= curlistRec.budg_cndt_amt%>
<%= curlistRec.chamt%>
<%= curlistRec.evnt_cd%>
<%= curlistRec.slip_no%>
<%= curlistRec.amt%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Sat Jul 11 13:42:07 KST 2009 */