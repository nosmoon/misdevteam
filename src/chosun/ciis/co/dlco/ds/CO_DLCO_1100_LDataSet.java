/***************************************************************************************************
* ���ϸ� : .java
* ��� : ���ڿ��-������û
* �ۼ����� : 2007-05-22
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.co.dlco.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.co.dlco.dm.*;
import chosun.ciis.co.dlco.rec.*;

/**
 * 
 */


public class CO_DLCO_1100_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public CO_DLCO_1100_LDataSet(){}
	public CO_DLCO_1100_LDataSet(String errcode, String errmsg){
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
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			CO_DLCO_1100_LCURLISTRecord rec = new CO_DLCO_1100_LCURLISTRecord();
			rec.dlco_no = Util.checkString(rset0.getString("dlco_no"));
			rec.ern = Util.checkString(rset0.getString("ern"));
			rec.dlco_abrv_nm = Util.checkString(rset0.getString("dlco_abrv_nm"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.presi_nm = Util.checkString(rset0.getString("presi_nm"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	CO_DLCO_1100_LDataSet ds = (CO_DLCO_1100_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		CO_DLCO_1100_LCURLISTRecord curlistRec = (CO_DLCO_1100_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.dlco_no%>
<%= curlistRec.ern%>
<%= curlistRec.dlco_abrv_nm%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.presi_nm%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Sat Feb 28 11:01:30 KST 2009 */