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


public class ABC_L_AUTHRATIODataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curauthratio = new ArrayList();
	public String errcode;
	public String errmsg;

	public ABC_L_AUTHRATIODataSet(){}
	public ABC_L_AUTHRATIODataSet(String errcode, String errmsg){
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
			ABC_L_AUTHRATIOCURAUTHRATIORecord rec = new ABC_L_AUTHRATIOCURAUTHRATIORecord();
			rec.subsmappli = Util.checkString(rset0.getString("subsmappli"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.abcclsf = Util.checkString(rset0.getString("abcclsf"));
			rec.cnt = Util.checkString(rset0.getString("cnt"));
			this.curauthratio.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	ABC_L_AUTHRATIODataSet ds = (ABC_L_AUTHRATIODataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curauthratio.size(); i++){
		ABC_L_AUTHRATIOCURAUTHRATIORecord curauthratioRec = (ABC_L_AUTHRATIOCURAUTHRATIORecord)ds.curauthratio.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurauthratio()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curauthratioRec.subsmappli%>
<%= curauthratioRec.bocd%>
<%= curauthratioRec.abcclsf%>
<%= curauthratioRec.cnt%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Apr 03 07:50:27 GMT 2013 */