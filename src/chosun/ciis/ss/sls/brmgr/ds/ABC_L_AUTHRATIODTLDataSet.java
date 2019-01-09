/***************************************************************************************************
* ���ϸ� : .java
* ��� : �Ǹ�-��������-�̻絶�ڼ�����Ȳ
* �ۼ����� : 2011-12-05
* �ۼ��� : �̱⿵
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


public class ABC_L_AUTHRATIODTLDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curauthratiodtl = new ArrayList();
	public String errcode;
	public String errmsg;

	public ABC_L_AUTHRATIODTLDataSet(){}
	public ABC_L_AUTHRATIODTLDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			ABC_L_AUTHRATIODTLCURAUTHRATIODTLRecord rec = new ABC_L_AUTHRATIODTLCURAUTHRATIODTLRecord();
			rec.subsmappli = Util.checkString(rset0.getString("subsmappli"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.abcclsf = Util.checkString(rset0.getString("abcclsf"));
			rec.abc = Util.checkString(rset0.getString("abc"));
			rec.rdr_no = Util.checkString(rset0.getString("rdr_no"));
			rec.valmm = Util.checkString(rset0.getString("valmm"));
			rec.clamlist = Util.checkString(rset0.getString("clamlist"));
			this.curauthratiodtl.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	ABC_L_AUTHRATIODTLDataSet ds = (ABC_L_AUTHRATIODTLDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curauthratiodtl.size(); i++){
		ABC_L_AUTHRATIODTLCURAUTHRATIODTLRecord curauthratiodtlRec = (ABC_L_AUTHRATIODTLCURAUTHRATIODTLRecord)ds.curauthratiodtl.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurauthratiodtl()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curauthratiodtlRec.subsmappli%>
<%= curauthratiodtlRec.bocd%>
<%= curauthratiodtlRec.abcclsf%>
<%= curauthratiodtlRec.abc%>
<%= curauthratiodtlRec.rdr_no%>
<%= curauthratiodtlRec.valmm%>
<%= curauthratiodtlRec.clamlist%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Apr 03 08:16:01 GMT 2013 */