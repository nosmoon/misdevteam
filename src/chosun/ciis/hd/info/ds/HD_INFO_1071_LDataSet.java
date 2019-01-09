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


package chosun.ciis.hd.info.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.info.dm.*;
import chosun.ciis.hd.info.rec.*;

/**
 * 
 */


public class HD_INFO_1071_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_INFO_1071_LDataSet(){}
	public HD_INFO_1071_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			HD_INFO_1071_LCURLISTRecord rec = new HD_INFO_1071_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.qulf_pems_seq = Util.checkString(rset0.getString("qulf_pems_seq"));
			rec.qulf_pems_cd = Util.checkString(rset0.getString("qulf_pems_cd"));
			rec.qulf_pems_flnm = Util.checkString(rset0.getString("qulf_pems_flnm"));
			rec.qulf_no = Util.checkString(rset0.getString("qulf_no"));
			rec.qulf_pems_nm = Util.checkString(rset0.getString("qulf_pems_nm"));
			rec.qulf_pems_issu_plac_cd = Util.checkString(rset0.getString("qulf_pems_issu_plac_cd"));
			rec.qulf_pems_issu_plac_flnm = Util.checkString(rset0.getString("qulf_pems_issu_plac_flnm"));
			rec.qulf_pems_issu_plac_nm = Util.checkString(rset0.getString("qulf_pems_issu_plac_nm"));
			rec.acqr_dt = Util.checkString(rset0.getString("acqr_dt"));
			rec.mtry_dt = Util.checkString(rset0.getString("mtry_dt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	HD_INFO_1071_LDataSet ds = (HD_INFO_1071_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_INFO_1071_LCURLISTRecord curlistRec = (HD_INFO_1071_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.qulf_pems_seq%>
<%= curlistRec.qulf_pems_cd%>
<%= curlistRec.qulf_pems_flnm%>
<%= curlistRec.qulf_no%>
<%= curlistRec.qulf_pems_nm%>
<%= curlistRec.qulf_pems_issu_plac_cd%>
<%= curlistRec.qulf_pems_issu_plac_flnm%>
<%= curlistRec.qulf_pems_issu_plac_nm%>
<%= curlistRec.acqr_dt%>
<%= curlistRec.mtry_dt%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Sat Feb 07 15:21:00 KST 2009 */