/***************************************************************************************************
* ���ϸ� : MT_PRNPAP_1000_LDataSet.java
* ��� :  �������� / �μ���� ����
* �ۼ����� : 2009-03-30 
* �ۼ��� : �����
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/


package chosun.ciis.mt.prnpap.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.prnpap.dm.*;
import chosun.ciis.mt.prnpap.rec.*;

/**
 * 
 */


public class MT_PRNPAP_1000_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_PRNPAP_1000_LDataSet(){}
	public MT_PRNPAP_1000_LDataSet(String errcode, String errmsg){
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
			MT_PRNPAP_1000_LCURLISTRecord rec = new MT_PRNPAP_1000_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.occr_qq = Util.checkString(rset0.getString("occr_qq"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.fac_clsf = Util.checkString(rset0.getString("fac_clsf"));
			rec.fac_clsf_nm = Util.checkString(rset0.getString("fac_clsf_nm"));
			rec.papcmpy_cd = Util.checkString(rset0.getString("papcmpy_cd"));
			rec.papcmpy_nm = Util.checkString(rset0.getString("papcmpy_nm"));
			rec.eqp_mchn_no = Util.checkString(rset0.getString("eqp_mchn_no"));
			rec.test_ask_dt = Util.checkString(rset0.getString("test_ask_dt"));
			rec.test_frdt = Util.checkString(rset0.getString("test_frdt"));
			rec.test_todt = Util.checkString(rset0.getString("test_todt"));
			rec.test_instt = Util.checkString(rset0.getString("test_instt"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	MT_PRNPAP_1000_LDataSet ds = (MT_PRNPAP_1000_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_PRNPAP_1000_LCURLISTRecord curlistRec = (MT_PRNPAP_1000_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.cmpy_cd%>
<%= curlistRec.occr_dt%>
<%= curlistRec.occr_qq%>
<%= curlistRec.seq%>
<%= curlistRec.fac_clsf%>
<%= curlistRec.fac_clsf_nm%>
<%= curlistRec.papcmpy_cd%>
<%= curlistRec.papcmpy_nm%>
<%= curlistRec.eqp_mchn_no%>
<%= curlistRec.test_ask_dt%>
<%= curlistRec.test_frdt%>
<%= curlistRec.test_todt%>
<%= curlistRec.test_instt%>
<%= curlistRec.remk%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Mar 30 17:09:10 KST 2009 */