/***************************************************************************************************
* ���ϸ� : SS_MO_SLS_BRMGR_2510_LDataSet.java
* ��� : �������հ���-���Ͱ���-���Ͱ�����-Ȯ��μ�_����Ͽ�
* �ۼ����� : 2016-12-19
* �ۼ��� : �� �� ��
***************************************************************************************************/
/***************************************************************************************************
* �������� : �������ļ����� ����, ��,��Ʈ,�������� ���� ���� �� �ֵ��� �߰�.
* ������ : �� �� ��
* �������� : 2017-03-16
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


public class SS_MO_SLS_BRMGR_2510_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_MO_SLS_BRMGR_2510_LDataSet(){}
	public SS_MO_SLS_BRMGR_2510_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(10);
		while(rset0.next()){
			SS_MO_SLS_BRMGR_2510_LCURCOMMLISTRecord rec = new SS_MO_SLS_BRMGR_2510_LCURCOMMLISTRecord();
			rec.yymm = Util.checkString(rset0.getString("yymm"));
			rec.deptcd = Util.checkString(rset0.getString("deptcd"));
			rec.deptnm = Util.checkString(rset0.getString("deptnm"));
			rec.partcd = Util.checkString(rset0.getString("partcd"));
			rec.partnm = Util.checkString(rset0.getString("partnm"));
			rec.areacd = Util.checkString(rset0.getString("areacd"));
			rec.areanm = Util.checkString(rset0.getString("areanm"));
			rec.srtseq = Util.checkString(rset0.getString("srtseq"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.boclsf = Util.checkString(rset0.getString("boclsf"));
			rec.rdr_qty = Util.checkString(rset0.getString("rdr_qty"));
			rec.jm_qty = Util.checkString(rset0.getString("jm_qty"));
			rec.extn_qty = Util.checkString(rset0.getString("extn_qty"));
			rec.susp_qty = Util.checkString(rset0.getString("susp_qty"));
			rec.grow_qty = Util.checkString(rset0.getString("grow_qty"));
			rec.extn_rate = Util.checkString(rset0.getString("extn_rate"));
			rec.susp_rate = Util.checkString(rset0.getString("susp_rate"));
			rec.extn_qty2 = Util.checkString(rset0.getString("extn_qty2"));
			rec.susp_qty2 = Util.checkString(rset0.getString("susp_qty2"));
			rec.grow_qty2 = Util.checkString(rset0.getString("grow_qty2"));
			rec.extn_rate2 = Util.checkString(rset0.getString("extn_rate2"));
			rec.susp_rate2 = Util.checkString(rset0.getString("susp_rate2"));
			this.curcommlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SS_MO_SLS_BRMGR_2510_LDataSet ds = (SS_MO_SLS_BRMGR_2510_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_MO_SLS_BRMGR_2510_LCURCOMMLISTRecord curcommlistRec = (SS_MO_SLS_BRMGR_2510_LCURCOMMLISTRecord)ds.curcommlist.get(i);%>
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
<%= curcommlistRec.deptcd%>
<%= curcommlistRec.deptnm%>
<%= curcommlistRec.partcd%>
<%= curcommlistRec.partnm%>
<%= curcommlistRec.areacd%>
<%= curcommlistRec.areanm%>
<%= curcommlistRec.srtseq%>
<%= curcommlistRec.bocd%>
<%= curcommlistRec.bonm%>
<%= curcommlistRec.boclsf%>
<%= curcommlistRec.rdr_qty%>
<%= curcommlistRec.jm_qty%>
<%= curcommlistRec.extn_qty%>
<%= curcommlistRec.susp_qty%>
<%= curcommlistRec.grow_qty%>
<%= curcommlistRec.extn_rate%>
<%= curcommlistRec.susp_rate%>
<%= curcommlistRec.extn_qty2%>
<%= curcommlistRec.susp_qty2%>
<%= curcommlistRec.grow_qty2%>
<%= curcommlistRec.extn_rate2%>
<%= curcommlistRec.susp_rate2%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Mar 16 16:27:22 KST 2017 */