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


package chosun.ciis.hd.insr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.insr.dm.*;
import chosun.ciis.hd.insr.rec.*;

/**
 * 
 */


public class HD_INSR_1520_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String msg;

	public HD_INSR_1520_LDataSet(){}
	public HD_INSR_1520_LDataSet(String errcode, String errmsg, String msg){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.msg = msg;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setMsg(String msg){
		this.msg = msg;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getMsg(){
		return this.msg;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.msg = Util.checkString(cstmt.getString(3));
		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			HD_INSR_1520_LCURLISTRecord rec = new HD_INSR_1520_LCURLISTRecord();
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.slf_burd_amt = Util.checkString(rset0.getString("slf_burd_amt"));
			rec.cmpy_burd_amt = Util.checkString(rset0.getString("cmpy_burd_amt"));
			rec.emp_insr_fee = Util.checkString(rset0.getString("emp_insr_fee"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(7);
		while(rset1.next()){
			HD_INSR_1520_LCURLIST1Record rec = new HD_INSR_1520_LCURLIST1Record();
			rec.emp_no = Util.checkString(rset1.getString("emp_no"));
			rec.emp_insr_fee = Util.checkString(rset1.getString("emp_insr_fee"));
			this.curlist1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	HD_INSR_1520_LDataSet ds = (HD_INSR_1520_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_INSR_1520_LCURLISTRecord curlistRec = (HD_INSR_1520_LCURLISTRecord)ds.curlist.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		HD_INSR_1520_LCURLIST1Record curlist1Rec = (HD_INSR_1520_LCURLIST1Record)ds.curlist1.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getMsg()%>
<%= ds.getCurlist()%>
<%= ds.getCurlist1()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlistRec.emp_no%>
<%= curlistRec.slf_burd_amt%>
<%= curlistRec.cmpy_burd_amt%>
<%= curlistRec.emp_insr_fee%>
<%= curlist1Rec.emp_no%>
<%= curlist1Rec.emp_insr_fee%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Oct 04 14:34:47 KST 2013 */