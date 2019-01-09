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


package chosun.ciis.mt.etcpc.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.etcpc.dm.*;
import chosun.ciis.mt.etcpc.rec.*;

/**
 * 
 */


public class MT_ETCPC_4100_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_ETCPC_4100_LDataSet(){}
	public MT_ETCPC_4100_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(16);
		while(rset0.next()){
			MT_ETCPC_4100_LCURLIST1Record rec = new MT_ETCPC_4100_LCURLIST1Record();
			rec.use_dept_nm = Util.checkString(rset0.getString("use_dept_nm"));
			rec.mchn_mang_no = Util.checkString(rset0.getString("mchn_mang_no"));
			rec.use_pers_flnm = Util.checkString(rset0.getString("use_pers_flnm"));
			rec.use_usag = Util.checkString(rset0.getString("use_usag"));
			rec.mdnm = Util.checkString(rset0.getString("mdnm"));
			rec.mchn_stat = Util.checkString(rset0.getString("mchn_stat"));
			rec.kep_plac = Util.checkString(rset0.getString("kep_plac"));
			rec.buy_dt = Util.checkString(rset0.getString("buy_dt"));
			rec.pay_dt = Util.checkString(rset0.getString("pay_dt"));
			rec.sygg = Util.checkString(rset0.getString("sygg"));
			rec.wste_dd_pers = Util.checkString(rset0.getString("wste_dd_pers"));
			this.curlist1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	MT_ETCPC_4100_LDataSet ds = (MT_ETCPC_4100_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		MT_ETCPC_4100_LCURLIST1Record curlist1Rec = (MT_ETCPC_4100_LCURLIST1Record)ds.curlist1.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlist1Rec.use_dept_nm%>
<%= curlist1Rec.mchn_mang_no%>
<%= curlist1Rec.use_pers_flnm%>
<%= curlist1Rec.use_usag%>
<%= curlist1Rec.mdnm%>
<%= curlist1Rec.mchn_stat%>
<%= curlist1Rec.kep_plac%>
<%= curlist1Rec.buy_dt%>
<%= curlist1Rec.pay_dt%>
<%= curlist1Rec.sygg%>
<%= curlist1Rec.wste_dd_pers%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Mar 30 17:11:24 KST 2009 */