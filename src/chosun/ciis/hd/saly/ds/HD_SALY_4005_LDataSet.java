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


package chosun.ciis.hd.saly.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.saly.dm.*;
import chosun.ciis.hd.saly.rec.*;

/**
 * 
 */


public class HD_SALY_4005_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_SALY_4005_LDataSet(){}
	public HD_SALY_4005_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(9);
		while(rset0.next()){
			HD_SALY_4005_LCURLISTRecord rec = new HD_SALY_4005_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.lon_clsf_cd = Util.checkString(rset0.getString("lon_clsf_cd"));
			rec.lon_dt = Util.checkString(rset0.getString("lon_dt"));
			rec.dduc_seq = Util.checkString(rset0.getString("dduc_seq"));
			rec.flnm = Util.checkString(rset0.getString("flnm"));
			rec.proc_clsf = Util.checkString(rset0.getString("proc_clsf"));
			rec.dduc_dt = Util.checkString(rset0.getString("dduc_dt"));
			rec.saly_yy = Util.checkString(rset0.getString("saly_yy"));
			rec.saly_no = Util.checkString(rset0.getString("saly_no"));
			rec.prcp_dduc_amt = Util.checkString(rset0.getString("prcp_dduc_amt"));
			rec.int_dduc_amt = Util.checkString(rset0.getString("int_dduc_amt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	HD_SALY_4005_LDataSet ds = (HD_SALY_4005_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_SALY_4005_LCURLISTRecord curlistRec = (HD_SALY_4005_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.cmpy_cd%>
<%= curlistRec.emp_no%>
<%= curlistRec.lon_clsf_cd%>
<%= curlistRec.lon_dt%>
<%= curlistRec.dduc_seq%>
<%= curlistRec.flnm%>
<%= curlistRec.proc_clsf%>
<%= curlistRec.dduc_dt%>
<%= curlistRec.saly_yy%>
<%= curlistRec.saly_no%>
<%= curlistRec.prcp_dduc_amt%>
<%= curlistRec.int_dduc_amt%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu May 14 17:49:37 KST 2009 */