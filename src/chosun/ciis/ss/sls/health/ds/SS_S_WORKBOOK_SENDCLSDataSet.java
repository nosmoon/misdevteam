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


public class SS_S_WORKBOOK_SENDCLSDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_S_WORKBOOK_SENDCLSDataSet(){}
	public SS_S_WORKBOOK_SENDCLSDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(4);
		while(rset0.next()){
			SS_S_WORKBOOK_SENDCLSCURCOMMLISTRecord rec = new SS_S_WORKBOOK_SENDCLSCURCOMMLISTRecord();
			rec.medinm = Util.checkString(rset0.getString("medinm"));
			rec.area_nm = Util.checkString(rset0.getString("area_nm"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.subsno = Util.checkString(rset0.getString("subsno"));
			rec.clstotqty = Util.checkString(rset0.getString("clstotqty"));
			rec.clstotamt = Util.checkString(rset0.getString("clstotamt"));
			rec.route_cd = Util.checkString(rset0.getString("route_cd"));
			rec.route_nm = Util.checkString(rset0.getString("route_nm"));
			rec.prt_plac_cd = Util.checkString(rset0.getString("prt_plac_cd"));
			rec.prt_plac_nm = Util.checkString(rset0.getString("prt_plac_nm"));
			this.curcommlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SS_S_WORKBOOK_SENDCLSDataSet ds = (SS_S_WORKBOOK_SENDCLSDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_S_WORKBOOK_SENDCLSCURCOMMLISTRecord curcommlistRec = (SS_S_WORKBOOK_SENDCLSCURCOMMLISTRecord)ds.curcommlist.get(i);%>
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

<%= curcommlistRec.medinm%>
<%= curcommlistRec.area_nm%>
<%= curcommlistRec.bonm%>
<%= curcommlistRec.subsno%>
<%= curcommlistRec.clstotqty%>
<%= curcommlistRec.route_cd%>
<%= curcommlistRec.route_nm%>
<%= curcommlistRec.prt_plac_cd%>
<%= curcommlistRec.prt_plac_nm%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Jan 05 13:53:59 KST 2015 */