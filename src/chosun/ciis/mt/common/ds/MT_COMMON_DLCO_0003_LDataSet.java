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


package chosun.ciis.mt.common.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.common.dm.*;
import chosun.ciis.mt.common.rec.*;

/**
 * 
 */


public class MT_COMMON_DLCO_0003_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_COMMON_DLCO_0003_LDataSet(){}
	public MT_COMMON_DLCO_0003_LDataSet(String errcode, String errmsg){
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

		ResultSet rset4 = (ResultSet) cstmt.getObject(5);
		while(rset4.next()){
			MT_COMMON_DLCO_0003_LCURLISTRecord rec = new MT_COMMON_DLCO_0003_LCURLISTRecord();
			rec.ern = Util.checkString(rset4.getString("ern"));
			rec.dlco_no = Util.checkString(rset4.getString("dlco_no"));
			rec.dlco_nm = Util.checkString(rset4.getString("dlco_nm"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	MT_COMMON_DLCO_0003_LDataSet ds = (MT_COMMON_DLCO_0003_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_COMMON_DLCO_0003_LCURLISTRecord curlistRec = (MT_COMMON_DLCO_0003_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.ern%>
<%= curlistRec.dlco_no%>
<%= curlistRec.dlco_nm%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Apr 02 10:51:55 KST 2009 */