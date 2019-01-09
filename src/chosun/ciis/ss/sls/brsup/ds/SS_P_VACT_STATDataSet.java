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


package chosun.ciis.ss.sls.brsup.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
 * 
 */


public class SS_P_VACT_STATDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curprintlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_P_VACT_STATDataSet(){}
	public SS_P_VACT_STATDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			SS_P_VACT_STATCURPRINTLISTRecord rec = new SS_P_VACT_STATCURPRINTLISTRecord();
			rec.subsmappli = Util.checkString(rset0.getString("subsmappli"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.bank_cd = Util.checkString(rset0.getString("bank_cd"));
			rec.bank_nm = Util.checkString(rset0.getString("bank_nm"));
			rec.totcnt = Util.checkString(rset0.getString("totcnt"));
			rec.totamt = Util.checkString(rset0.getString("totamt"));
			this.curprintlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SS_P_VACT_STATDataSet ds = (SS_P_VACT_STATDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curprintlist.size(); i++){
		SS_P_VACT_STATCURPRINTLISTRecord curprintlistRec = (SS_P_VACT_STATCURPRINTLISTRecord)ds.curprintlist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurprintlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curprintlistRec.subsmappli%>
<%= curprintlistRec.bocd%>
<%= curprintlistRec.bonm%>
<%= curprintlistRec.bank_cd%>
<%= curprintlistRec.bank_nm%>
<%= curprintlistRec.totcnt%>
<%= curprintlistRec.totamt%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Oct 07 10:16:46 KST 2015 */