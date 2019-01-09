/***************************************************************************************************
* ���ϸ� : .java
* ��� : 
* �ۼ����� : 
* �ۼ��� : ������
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.ss.sls.brmgr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.rec.*;

/**
 * 
 */


public class SS_SLS_BRMGR_2710_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_SLS_BRMGR_2710_LDataSet(){}
	public SS_SLS_BRMGR_2710_LDataSet(String errcode, String errmsg){
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
			SS_SLS_BRMGR_2710_LCURCOMMLISTRecord rec = new SS_SLS_BRMGR_2710_LCURCOMMLISTRecord();
			rec.yymm = Util.checkString(rset0.getString("yymm"));
			rec.deptnm = Util.checkString(rset0.getString("deptnm"));
			rec.clsfnm = Util.checkString(rset0.getString("clsfnm"));
			rec.point_min = Util.checkString(rset0.getString("point_min"));
			rec.point_max = Util.checkString(rset0.getString("point_max"));
			rec.deptcd = Util.checkString(rset0.getString("deptcd"));
			rec.clsf = Util.checkString(rset0.getString("clsf"));
			this.curcommlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SS_SLS_BRMGR_2710_LDataSet ds = (SS_SLS_BRMGR_2710_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_SLS_BRMGR_2710_LCURCOMMLISTRecord curcommlistRec = (SS_SLS_BRMGR_2710_LCURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurcommlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curcommlistRec.yymm%>
<%= curcommlistRec.deptnm%>
<%= curcommlistRec.clsfnm%>
<%= curcommlistRec.point_min%>
<%= curcommlistRec.point_max%>
<%= curcommlistRec.deptcd%>
<%= curcommlistRec.clsf%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Jun 24 14:12:34 KST 2016 */