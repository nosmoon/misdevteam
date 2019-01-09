/***************************************************************************************************
* ���ϸ� : .java
* ��� : 
* �ۼ����� : 
* �ۼ��� : ���½�
***************************************************************************************************/
/***************************************************************************************************
* �������� : 
* ������ : 
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.tn.bas.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.tn.bas.dm.*;
import chosun.ciis.tn.bas.rec.*;

/**
 * 
 */


public class TN_BAS_1101_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public TN_BAS_1101_LDataSet(){}
	public TN_BAS_1101_LDataSet(String errcode, String errmsg){
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

		ResultSet rset20 = (ResultSet) cstmt.getObject(5);
		while(rset20.next()){
			TN_BAS_1101_LCURLISTRecord rec = new TN_BAS_1101_LCURLISTRecord();
			rec.deptidx = Util.checkString(rset20.getString("deptidx"));
			rec.organidx = Util.checkString(rset20.getString("organidx"));
			rec.deptname = Util.checkString(rset20.getString("deptname"));
			rec.deptcategory = Util.checkString(rset20.getString("deptcategory"));
			rec.deptcategory_nm = Util.checkString(rset20.getString("deptcategory_nm"));
			rec.description = Util.checkString(rset20.getString("description"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	TN_BAS_1101_LDataSet ds = (TN_BAS_1101_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		TN_BAS_1101_LCURLISTRecord curlistRec = (TN_BAS_1101_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.deptidx%>
<%= curlistRec.organidx%>
<%= curlistRec.deptname%>
<%= curlistRec.deptcategory%>
<%= curlistRec.deptcategory_nm%>
<%= curlistRec.description%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Jun 22 18:08:41 KST 2016 */