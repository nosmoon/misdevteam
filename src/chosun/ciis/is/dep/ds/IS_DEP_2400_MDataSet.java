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


package chosun.ciis.is.dep.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.dep.dm.*;
import chosun.ciis.is.dep.rec.*;

/**
 * 
 */


public class IS_DEP_2400_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public IS_DEP_2400_MDataSet(){}
	public IS_DEP_2400_MDataSet(String errcode, String errmsg){
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
			IS_DEP_2400_MCURLISTRecord rec = new IS_DEP_2400_MCURLISTRecord();
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			IS_DEP_2400_MCURLIST1Record rec = new IS_DEP_2400_MCURLIST1Record();
			rec.cd = Util.checkString(rset1.getString("cd"));
			rec.cd_abrv_nm = Util.checkString(rset1.getString("cd_abrv_nm"));
			this.curlist1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	IS_DEP_2400_MDataSet ds = (IS_DEP_2400_MDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		IS_DEP_2400_MCURLISTRecord curlistRec = (IS_DEP_2400_MCURLISTRecord)ds.curlist.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		IS_DEP_2400_MCURLIST1Record curlist1Rec = (IS_DEP_2400_MCURLIST1Record)ds.curlist1.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getCurlist1()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlistRec.cd%>
<%= curlistRec.cdnm%>
<%= curlist1Rec.cd%>
<%= curlist1Rec.cd_abrv_nm%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue May 22 13:17:13 KST 2012 */