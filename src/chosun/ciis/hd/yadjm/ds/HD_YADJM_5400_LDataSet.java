/***************************************************************************************************
* ���ϸ� : .java
* ��� : �λ�޿�-�����������
* �ۼ����� : 2014-12-30
* �ۼ��� : ���½�
***************************************************************************************************/
/***************************************************************************************************
* �������� : �ű��÷� �߰�( ��������, ���ð�����)
* ������ : ���½�
* �������� :2014-12-30
* ��� : 
***************************************************************************************************/


package chosun.ciis.hd.yadjm.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.yadjm.dm.*;
import chosun.ciis.hd.yadjm.rec.*;

/**
 * 
 */


public class HD_YADJM_5400_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_YADJM_5400_LDataSet(){}
	public HD_YADJM_5400_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			HD_YADJM_5400_LCURLISTRecord rec = new HD_YADJM_5400_LCURLISTRecord();
			rec.adjm_rvrs_yy = Util.checkString(rset0.getString("adjm_rvrs_yy"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.leas_flnm = Util.checkString(rset0.getString("leas_flnm"));
			rec.leas_prn = Util.checkString(rset0.getString("leas_prn"));
			rec.addr = Util.checkString(rset0.getString("addr"));
			rec.leas_fr_dt = Util.checkString(rset0.getString("leas_fr_dt"));
			rec.leas_to_dt = Util.checkString(rset0.getString("leas_to_dt"));
			rec.month_rent_amt = Util.checkString(rset0.getString("month_rent_amt"));
			rec.resi_clsf_cd = Util.checkString(rset0.getString("resi_clsf_cd"));
			rec.hous_cntr_sqr = Util.checkString(rset0.getString("hous_cntr_sqr"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	HD_YADJM_5400_LDataSet ds = (HD_YADJM_5400_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_YADJM_5400_LCURLISTRecord curlistRec = (HD_YADJM_5400_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.adjm_rvrs_yy%>
<%= curlistRec.seq%>
<%= curlistRec.emp_no%>
<%= curlistRec.leas_flnm%>
<%= curlistRec.leas_prn%>
<%= curlistRec.addr%>
<%= curlistRec.leas_fr_dt%>
<%= curlistRec.leas_to_dt%>
<%= curlistRec.month_rent_amt%>
<%= curlistRec.resi_clsf_cd%>
<%= curlistRec.hous_cntr_sqr%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Dec 30 13:51:46 KST 2014 */