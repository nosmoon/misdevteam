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


package chosun.ciis.ss.sls.health.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.health.dm.*;
import chosun.ciis.ss.sls.health.rec.*;

/**
 * 
 */


public class SS_L_WORKBOOK_APLCDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String totcnt;
	public String totqty;

	public SS_L_WORKBOOK_APLCDataSet(){}
	public SS_L_WORKBOOK_APLCDataSet(String errcode, String errmsg, String totcnt, String totqty){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.totcnt = totcnt;
		this.totqty = totqty;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setTotcnt(String totcnt){
		this.totcnt = totcnt;
	}

	public void setTotqty(String totqty){
		this.totqty = totqty;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getTotcnt(){
		return this.totcnt;
	}

	public String getTotqty(){
		return this.totqty;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(12);
		while(rset0.next()){
			SS_L_WORKBOOK_APLCCURCOMMLISTRecord rec = new SS_L_WORKBOOK_APLCCURCOMMLISTRecord();
			rec.aplcname = Util.checkString(rset0.getString("aplcname"));
			rec.dpname = Util.checkString(rset0.getString("dpname"));
			rec.banknm = Util.checkString(rset0.getString("banknm"));
			rec.medinm = Util.checkString(rset0.getString("medinm"));
			rec.recvaddr = Util.checkString(rset0.getString("recvaddr"));
			rec.subsqty = Util.checkString(rset0.getString("subsqty"));
			rec.aplcpath = Util.checkString(rset0.getString("aplcpath"));
			rec.areanm = Util.checkString(rset0.getString("areanm"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.aplcdt = Util.checkString(rset0.getString("aplcdt"));
			rec.collcdt = Util.checkString(rset0.getString("collcdt"));
			rec.status = Util.checkString(rset0.getString("status"));
			rec.incmgpers = Util.checkString(rset0.getString("incmgpers"));
			rec.aplcno = Util.checkString(rset0.getString("aplcno"));
			rec.prt_plac_nm = Util.checkString(rset0.getString("prt_plac_nm"));
			rec.route_nm = Util.checkString(rset0.getString("route_nm"));
			rec.route_cd = Util.checkString(rset0.getString("route_cd"));
			rec.bo_headcnfmyn = Util.checkString(rset0.getString("bo_headcnfmyn"));
			this.curcommlist.add(rec);
		}
		this.totcnt = Util.checkString(cstmt.getString(13));
		this.totqty = Util.checkString(cstmt.getString(14));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SS_L_WORKBOOK_APLCDataSet ds = (SS_L_WORKBOOK_APLCDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_WORKBOOK_APLCCURCOMMLISTRecord curcommlistRec = (SS_L_WORKBOOK_APLCCURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurcommlist()%>
<%= ds.getTotcnt()%>
<%= ds.getTotqty()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curcommlistRec.aplcname%>
<%= curcommlistRec.dpname%>
<%= curcommlistRec.banknm%>
<%= curcommlistRec.medinm%>
<%= curcommlistRec.recvaddr%>
<%= curcommlistRec.subsqty%>
<%= curcommlistRec.aplcpath%>
<%= curcommlistRec.areanm%>
<%= curcommlistRec.bocd%>
<%= curcommlistRec.bonm%>
<%= curcommlistRec.aplcdt%>
<%= curcommlistRec.status%>
<%= curcommlistRec.incmgpers%>
<%= curcommlistRec.aplcno%>
<%= curcommlistRec.prt_plac_nm%>
<%= curcommlistRec.route_nm%>
<%= curcommlistRec.route_cd%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Jan 07 09:42:12 KST 2015 */