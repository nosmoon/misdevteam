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


package chosun.ciis.en.comm.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.en.comm.dm.*;
import chosun.ciis.en.comm.rec.*;

/**
 * 
 */


public class EN_COMM_1200_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public EN_COMM_1200_MDataSet(){}
	public EN_COMM_1200_MDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(4);
		while(rset0.next()){
			EN_COMM_1200_MCURLIST1Record rec = new EN_COMM_1200_MCURLIST1Record();
			rec.evnt_cd = Util.checkString(rset0.getString("evnt_cd"));
			rec.evnt_nm = Util.checkString(rset0.getString("evnt_nm"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(5);
		while(rset1.next()){
			EN_COMM_1200_MCURLIST2Record rec = new EN_COMM_1200_MCURLIST2Record();
			rec.evnt_rcpm_unit_clsf = Util.checkString(rset1.getString("evnt_rcpm_unit_clsf"));
			rec.evnt_rcpm_unit_clsf_nm = Util.checkString(rset1.getString("evnt_rcpm_unit_clsf_nm"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	EN_COMM_1200_MDataSet ds = (EN_COMM_1200_MDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		EN_COMM_1200_MCURLIST1Record curlist1Rec = (EN_COMM_1200_MCURLIST1Record)ds.curlist1.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		EN_COMM_1200_MCURLIST2Record curlist2Rec = (EN_COMM_1200_MCURLIST2Record)ds.curlist2.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
<%= ds.getCurlist2()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlist1Rec.evnt_cd%>
<%= curlist1Rec.evnt_nm%>
<%= curlist2Rec.evnt_rcpm_unit_clsf%>
<%= curlist2Rec.evnt_rcpm_unit_clsf_nm%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu May 21 20:18:57 KST 2009 */