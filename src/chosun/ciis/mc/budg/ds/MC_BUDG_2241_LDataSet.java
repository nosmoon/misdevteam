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


package chosun.ciis.mc.budg.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mc.budg.dm.*;
import chosun.ciis.mc.budg.rec.*;

/**
 * 
 */


public class MC_BUDG_2241_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MC_BUDG_2241_LDataSet(){}
	public MC_BUDG_2241_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			MC_BUDG_2241_LCURLISTRecord rec = new MC_BUDG_2241_LCURLISTRecord();
			rec.code1 = Util.checkString(rset0.getString("code1"));
			rec.code2 = Util.checkString(rset0.getString("code2"));
			rec.exec_no = Util.checkString(rset0.getString("exec_no"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.clos_yn = Util.checkString(rset0.getString("clos_yn"));
			rec.to_char_incmg_dt_tm = Util.checkString(rset0.getString("to_char_incmg_dt_tm"));
			rec.cnt = Util.checkString(rset0.getString("cnt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	MC_BUDG_2241_LDataSet ds = (MC_BUDG_2241_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MC_BUDG_2241_LCURLISTRecord curlistRec = (MC_BUDG_2241_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.code1%>
<%= curlistRec.code2%>
<%= curlistRec.exec_no%>
<%= curlistRec.dept_nm%>
<%= curlistRec.clos_yn%>
<%= curlistRec.to_char_incmg_dt_tm%>
<%= curlistRec.cnt%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Jul 16 10:45:23 KST 2009 */