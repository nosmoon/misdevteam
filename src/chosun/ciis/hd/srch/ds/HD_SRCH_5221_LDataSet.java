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


public class HD_SRCH_5221_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_SRCH_5221_LDataSet(){}
	public HD_SRCH_5221_LDataSet(String errcode, String errmsg){
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

		ResultSet rset2 = (ResultSet) cstmt.getObject(5);
		while(rset2.next()){
			HD_SRCH_5221_LCURLIST1Record rec = new HD_SRCH_5221_LCURLIST1Record();
			rec.emp_clsf_nm = Util.checkString(rset2.getString("emp_clsf_nm"));
			rec.dept_nm = Util.checkString(rset2.getString("dept_nm"));
			rec.flnm = Util.checkString(rset2.getString("flnm"));
			rec.posi_nm = Util.checkString(rset2.getString("posi_nm"));
			rec.dspch_prd = Util.checkString(rset2.getString("dspch_prd"));
			rec.remk = Util.checkString(rset2.getString("remk"));
			this.curlist1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	HD_SRCH_5221_LDataSet ds = (HD_SRCH_5221_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		HD_SRCH_5221_LCURLIST1Record curlist1Rec = (HD_SRCH_5221_LCURLIST1Record)ds.curlist1.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlist1Rec.emp_clsf_nm%>
<%= curlist1Rec.dept_nm%>
<%= curlist1Rec.flnm%>
<%= curlist1Rec.posi_nm%>
<%= curlist1Rec.dspch_prd%>
<%= curlist1Rec.remk%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Sep 18 15:28:03 KST 2018 */