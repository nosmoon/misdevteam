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


package chosun.ciis.hd.lvcmpy.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.lvcmpy.dm.*;
import chosun.ciis.hd.lvcmpy.rec.*;

/**
 * 
 */


public class HD_LVCMPY_3200_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_LVCMPY_3200_LDataSet(){}
	public HD_LVCMPY_3200_LDataSet(String errcode, String errmsg){
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
			HD_LVCMPY_3200_LCURLISTRecord rec = new HD_LVCMPY_3200_LCURLISTRecord();
			rec.emp_dtls_clsf_nm = Util.checkString(rset0.getString("emp_dtls_clsf_nm"));
			rec.tot_cnt = Util.checkString(rset0.getString("tot_cnt"));
			rec.in_lv_cmpy_cnt = Util.checkString(rset0.getString("in_lv_cmpy_cnt"));
			rec.year_cnt = Util.checkString(rset0.getString("year_cnt"));
			rec.tot_amt = Util.checkString(rset0.getString("tot_amt"));
			rec.in_lv_cmpy_amt = Util.checkString(rset0.getString("in_lv_cmpy_amt"));
			rec.year_amt = Util.checkString(rset0.getString("year_amt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	HD_LVCMPY_3200_LDataSet ds = (HD_LVCMPY_3200_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_LVCMPY_3200_LCURLISTRecord curlistRec = (HD_LVCMPY_3200_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.emp_dtls_clsf_nm%>
<%= curlistRec.tot_cnt%>
<%= curlistRec.in_lv_cmpy_cnt%>
<%= curlistRec.year_cnt%>
<%= curlistRec.tot_amt%>
<%= curlistRec.in_lv_cmpy_amt%>
<%= curlistRec.year_amt%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Jun 17 10:50:16 KST 2009 */