/***************************************************************************************************
* ���ϸ� : SS_MO_SLS_BRMGR_2513_LDataSet.java
* ��� : �������հ���-���Ͱ���-���Ͱ�����-���������_����Ͽ�
* �ۼ����� : 2016-12-19
* �ۼ��� : �� �� ��
***************************************************************************************************/
/***************************************************************************************************
* �������� : �������ļ����� ����, ��,��Ʈ,�������� ���� ���� �� �ֵ��� �߰�.
* ������ : �� �� ��
* �������� : 2017-03-15
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


public class SS_MO_SLS_BRMGR_2513_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_MO_SLS_BRMGR_2513_LDataSet(){}
	public SS_MO_SLS_BRMGR_2513_LDataSet(String errcode, String errmsg){
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
			SS_MO_SLS_BRMGR_2513_LCURCOMMLISTRecord rec = new SS_MO_SLS_BRMGR_2513_LCURCOMMLISTRecord();
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
			rec.medaqty = Util.checkString(rset0.getString("medaqty"));
			rec.meda_amt = Util.checkString(rset0.getString("meda_amt"));
			rec.repm_amt = Util.checkString(rset0.getString("repm_amt"));
			rec.repm_rate = Util.checkString(rset0.getString("repm_rate"));
			rec.longmisu = Util.checkString(rset0.getString("longmisu"));
			rec.lm_rate = Util.checkString(rset0.getString("lm_rate"));
			this.curcommlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SS_MO_SLS_BRMGR_2513_LDataSet ds = (SS_MO_SLS_BRMGR_2513_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_MO_SLS_BRMGR_2513_LCURCOMMLISTRecord curcommlistRec = (SS_MO_SLS_BRMGR_2513_LCURCOMMLISTRecord)ds.curcommlist.get(i);%>
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
<%= curcommlistRec.medaqty%>
<%= curcommlistRec.meda_amt%>
<%= curcommlistRec.repm_amt%>
<%= curcommlistRec.repm_rate%>
<%= curcommlistRec.longmisu%>
<%= curcommlistRec.lm_rate%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Mar 16 17:50:40 KST 2017 */