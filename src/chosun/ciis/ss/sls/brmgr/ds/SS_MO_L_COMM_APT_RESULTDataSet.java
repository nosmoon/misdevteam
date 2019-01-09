/***************************************************************************************************
* ���ϸ� : SS_MO_L_COMM_APT_RESULTDataSet.java
* ��� :  ���Ͱ���-���Է�����-��Ȳ�˻�_����Ͽ�(ciis��)
* �ۼ����� : 2017-04-04
* �ۼ��� : �� �� ��
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


public class SS_MO_L_COMM_APT_RESULTDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curthrwrtlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_MO_L_COMM_APT_RESULTDataSet(){}
	public SS_MO_L_COMM_APT_RESULTDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(12);
		while(rset0.next()){
			SS_MO_L_COMM_APT_RESULTCURTHRWRTLISTRecord rec = new SS_MO_L_COMM_APT_RESULTCURTHRWRTLISTRecord();
			rec.areacd = Util.checkString(rset0.getString("areacd"));
			rec.areanm = Util.checkString(rset0.getString("areanm"));
			rec.invsgdt = Util.checkString(rset0.getString("invsgdt"));
			rec.pyong = Util.checkString(rset0.getString("pyong"));
			rec.invsgno = Util.checkString(rset0.getString("invsgno"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.addrcd = Util.checkString(rset0.getString("addrcd"));
			rec.addrnm = Util.checkString(rset0.getString("addrnm"));
			rec.dongno = Util.checkString(rset0.getString("dongno"));
			rec.hoscnt = Util.checkString(rset0.getString("hoscnt"));
			rec.cho_cnt = Util.checkString(rset0.getString("cho_cnt"));
			rec.cho_rate = Util.checkString(rset0.getString("cho_rate"));
			rec.jung_cnt = Util.checkString(rset0.getString("jung_cnt"));
			rec.jung_rate = Util.checkString(rset0.getString("jung_rate"));
			rec.dong_cnt = Util.checkString(rset0.getString("dong_cnt"));
			rec.dong_rate = Util.checkString(rset0.getString("dong_rate"));
			rec.etc_cnt = Util.checkString(rset0.getString("etc_cnt"));
			rec.etc_rate = Util.checkString(rset0.getString("etc_rate"));
			rec.remkclsf = Util.checkString(rset0.getString("remkclsf"));
			rec.invsgpers = Util.checkString(rset0.getString("invsgpers"));
			rec.regtype1 = Util.checkString(rset0.getString("regtype1"));
			rec.regtype2 = Util.checkString(rset0.getString("regtype2"));
			this.curthrwrtlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SS_MO_L_COMM_APT_RESULTDataSet ds = (SS_MO_L_COMM_APT_RESULTDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curthrwrtlist.size(); i++){
		SS_MO_L_COMM_APT_RESULTCURTHRWRTLISTRecord curthrwrtlistRec = (SS_MO_L_COMM_APT_RESULTCURTHRWRTLISTRecord)ds.curthrwrtlist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurthrwrtlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curthrwrtlistRec.areacd%>
<%= curthrwrtlistRec.areanm%>
<%= curthrwrtlistRec.invsgdt%>
<%= curthrwrtlistRec.pyong%>
<%= curthrwrtlistRec.invsgno%>
<%= curthrwrtlistRec.bocd%>
<%= curthrwrtlistRec.bonm%>
<%= curthrwrtlistRec.addrcd%>
<%= curthrwrtlistRec.addrnm%>
<%= curthrwrtlistRec.dongno%>
<%= curthrwrtlistRec.hoscnt%>
<%= curthrwrtlistRec.cho_cnt%>
<%= curthrwrtlistRec.cho_rate%>
<%= curthrwrtlistRec.jung_cnt%>
<%= curthrwrtlistRec.jung_rate%>
<%= curthrwrtlistRec.dong_cnt%>
<%= curthrwrtlistRec.dong_rate%>
<%= curthrwrtlistRec.etc_cnt%>
<%= curthrwrtlistRec.etc_rate%>
<%= curthrwrtlistRec.remkclsf%>
<%= curthrwrtlistRec.invsgpers%>
<%= curthrwrtlistRec.regtype1%>
<%= curthrwrtlistRec.regtype2%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Apr 04 15:54:07 KST 2017 */