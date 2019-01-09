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


package chosun.ciis.hd.srch.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.srch.dm.*;
import chosun.ciis.hd.srch.rec.*;

/**
 * 
 */


public class HD_SRCH_5131_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_SRCH_5131_LDataSet(){}
	public HD_SRCH_5131_LDataSet(String errcode, String errmsg){
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
			HD_SRCH_5131_LCURLISTRecord rec = new HD_SRCH_5131_LCURLISTRecord();
			rec.guk_nm = Util.checkString(rset0.getString("guk_nm"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.guk_cd = Util.checkString(rset0.getString("guk_cd"));
			rec.emp_clsf1 = Util.checkString(rset0.getString("emp_clsf1"));
			rec.emp_clsf2 = Util.checkString(rset0.getString("emp_clsf2"));
			rec.emp_clsf3 = Util.checkString(rset0.getString("emp_clsf3"));
			rec.emp_clsf4 = Util.checkString(rset0.getString("emp_clsf4"));
			rec.emp_cnt = Util.checkString(rset0.getString("emp_cnt"));
			rec.in_cmpy = Util.checkString(rset0.getString("in_cmpy"));
			rec.lvcmpy = Util.checkString(rset0.getString("lvcmpy"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	HD_SRCH_5131_LDataSet ds = (HD_SRCH_5131_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_SRCH_5131_LCURLISTRecord curlistRec = (HD_SRCH_5131_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.guk_nm%>
<%= curlistRec.dept_nm%>
<%= curlistRec.guk_cd%>
<%= curlistRec.emp_clsf1%>
<%= curlistRec.emp_clsf2%>
<%= curlistRec.emp_clsf3%>
<%= curlistRec.emp_clsf4%>
<%= curlistRec.emp_cnt%>
<%= curlistRec.in_cmpy%>
<%= curlistRec.lvcmpy%>
<%= curlistRec.renk%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Nov 22 16:41:44 KST 2018 */