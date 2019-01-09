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


package chosun.ciis.fc.acct.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.rec.*;

/**
 * 
 */


public class FC_ACCT_2170_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList cur_prof_kind_list = new ArrayList();
	public ArrayList semuro_id = new ArrayList();
	public ArrayList cur_slip_clsf_list = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_2170_MDataSet(){}
	public FC_ACCT_2170_MDataSet(String errcode, String errmsg){
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
			FC_ACCT_2170_MCUR_PROF_KIND_LISTRecord rec = new FC_ACCT_2170_MCUR_PROF_KIND_LISTRecord();
			rec.cd_nm = Util.checkString(rset0.getString("cd_nm"));
			rec.cd = Util.checkString(rset0.getString("cd"));
			this.cur_prof_kind_list.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			FC_ACCT_2170_MCUR_SLIP_CLSF_LISTRecord rec = new FC_ACCT_2170_MCUR_SLIP_CLSF_LISTRecord();
			rec.cd_nm = Util.checkString(rset1.getString("cd_nm"));
			rec.cd = Util.checkString(rset1.getString("cd"));
			this.cur_slip_clsf_list.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(7);
		while(rset2.next()){
			FC_ACCT_2170_MSEMURO_IDRecord rec = new FC_ACCT_2170_MSEMURO_IDRecord();
			rec.semuro_id = Util.checkString(rset2.getString("semuro_id"));
			this.semuro_id.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	FC_ACCT_2170_MDataSet ds = (FC_ACCT_2170_MDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.cur_prof_kind_list.size(); i++){
		FC_ACCT_2170_MCUR_PROF_KIND_LISTRecord cur_prof_kind_listRec = (FC_ACCT_2170_MCUR_PROF_KIND_LISTRecord)ds.cur_prof_kind_list.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.cur_slip_clsf_list.size(); i++){
		FC_ACCT_2170_MCUR_SLIP_CLSF_LISTRecord cur_slip_clsf_listRec = (FC_ACCT_2170_MCUR_SLIP_CLSF_LISTRecord)ds.cur_slip_clsf_list.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.semuro_id.size(); i++){
		FC_ACCT_2170_MSEMURO_IDRecord semuro_idRec = (FC_ACCT_2170_MSEMURO_IDRecord)ds.semuro_id.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCur_prof_kind_list()%>
<%= ds.getCur_slip_clsf_list()%>
<%= ds.getSemuro_id()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= cur_prof_kind_listRec.cd_nm%>
<%= cur_prof_kind_listRec.cd%>
<%= cur_slip_clsf_listRec.cd_nm%>
<%= cur_slip_clsf_listRec.cd%>
<%= semuro_idRec.semuro_id%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Aug 13 16:28:41 KST 2009 */