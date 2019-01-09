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


package chosun.ciis.ss.sls.rdr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.rdr.dm.*;
import chosun.ciis.ss.sls.rdr.rec.*;

/**
 * 
 */


public class SS_L_TM_AGENTLISTDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curagentlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_TM_AGENTLISTDataSet(){}
	public SS_L_TM_AGENTLISTDataSet(String errcode, String errmsg){
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
			SS_L_TM_AGENTLISTCURAGENTLISTRecord rec = new SS_L_TM_AGENTLISTCURAGENTLISTRecord();
			rec.agentid = Util.checkString(rset0.getString("agentid"));
			rec.agentnm = Util.checkString(rset0.getString("agentnm"));
			this.curagentlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SS_L_TM_AGENTLISTDataSet ds = (SS_L_TM_AGENTLISTDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curagentlist.size(); i++){
		SS_L_TM_AGENTLISTCURAGENTLISTRecord curagentlistRec = (SS_L_TM_AGENTLISTCURAGENTLISTRecord)ds.curagentlist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCuragentlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curagentlistRec.agentid%>
<%= curagentlistRec.agentnm%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed May 29 07:08:39 GMT 2013 */