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


public class MT_ETCPC_4200_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_ETCPC_4200_LDataSet(){}
	public MT_ETCPC_4200_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			MT_ETCPC_4200_LCURLIST1Record rec = new MT_ETCPC_4200_LCURLIST1Record();
			rec.use_dept_nm = Util.checkString(rset0.getString("use_dept_nm"));
			rec.mchn_mang_no = Util.checkString(rset0.getString("mchn_mang_no"));
			rec.use_nm = Util.checkString(rset0.getString("use_nm"));
			rec.use_usag = Util.checkString(rset0.getString("use_usag"));
			rec.modl_mang_nonm = Util.checkString(rset0.getString("modl_mang_nonm"));
			rec.use_usag_sw = Util.checkString(rset0.getString("use_usag_sw"));
			rec.swnm = Util.checkString(rset0.getString("swnm"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(9);
		while(rset1.next()){
			MT_ETCPC_4200_LCURLIST2Record rec = new MT_ETCPC_4200_LCURLIST2Record();
			rec.swnm = Util.checkString(rset1.getString("swnm"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	MT_ETCPC_4200_LDataSet ds = (MT_ETCPC_4200_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		MT_ETCPC_4200_LCURLIST1Record curlist1Rec = (MT_ETCPC_4200_LCURLIST1Record)ds.curlist1.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		MT_ETCPC_4200_LCURLIST2Record curlist2Rec = (MT_ETCPC_4200_LCURLIST2Record)ds.curlist2.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
<%= ds.getCurlist2()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlist1Rec.use_dept_nm%>
<%= curlist1Rec.mchn_mang_no%>
<%= curlist1Rec.use_nm%>
<%= curlist1Rec.use_usag%>
<%= curlist1Rec.modl_mang_nonm%>
<%= curlist1Rec.use_usag_sw%>
<%= curlist1Rec.swnm%>
<%= curlist2Rec.swnm%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Apr 03 18:00:57 KST 2009 */