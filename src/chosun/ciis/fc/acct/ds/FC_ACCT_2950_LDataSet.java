/***************************************************************************************************
* ���ϸ� : FC_ACCT_2950_L.java
* ��� :   �����������ǥ��� ��ȸ
* �ۼ����� :
* �ۼ��� : ����ǥ
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
 * �����������ǥ��� ��ȸ
 */

public class FC_ACCT_2950_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList vexc_coms_slip_list = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_2950_LDataSet(){}
	public FC_ACCT_2950_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(9);
		while(rset0.next()){
			FC_ACCT_2950_LVEXC_COMS_SLIP_LISTRecord rec = new FC_ACCT_2950_LVEXC_COMS_SLIP_LISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.pay_dt = Util.checkString(rset0.getString("pay_dt"));
			rec.prof_type_cd = Util.checkString(rset0.getString("prof_type_cd"));
			rec.slip_clsf_cd = Util.checkString(rset0.getString("slip_clsf_cd"));
			rec.slip_occr_dt = Util.checkString(rset0.getString("slip_occr_dt"));
			rec.slip_seq = Util.checkString(rset0.getString("slip_seq"));
			rec.slip_no = Util.checkString(rset0.getString("slip_no"));
			rec.vexc_cmpy_cd = Util.checkString(rset0.getString("vexc_cmpy_cd"));
			rec.suply_amt = Util.checkString(rset0.getString("suply_amt"));
			rec.vat_amt = Util.checkString(rset0.getString("vat_amt"));
			rec.acct_no = Util.checkString(rset0.getString("acct_no"));
			rec.vexc_cmpy_nm = Util.checkString(rset0.getString("vexc_cmpy_nm"));
			rec.medi_nm = Util.checkString(rset0.getString("medi_nm"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			this.vexc_coms_slip_list.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	FC_ACCT_2950_LDataSet ds = (FC_ACCT_2950_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.vexc_coms_slip_list.size(); i++){
		FC_ACCT_2950_LVEXC_COMS_SLIP_LISTRecord vexc_coms_slip_listRec = (FC_ACCT_2950_LVEXC_COMS_SLIP_LISTRecord)ds.vexc_coms_slip_list.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getVexc_coms_slip_list()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= vexc_coms_slip_listRec.cmpy_cd%>
<%= vexc_coms_slip_listRec.pay_dt%>
<%= vexc_coms_slip_listRec.prof_type_cd%>
<%= vexc_coms_slip_listRec.slip_clsf_cd%>
<%= vexc_coms_slip_listRec.slip_occr_dt%>
<%= vexc_coms_slip_listRec.slip_seq%>
<%= vexc_coms_slip_listRec.slip_no%>
<%= vexc_coms_slip_listRec.vexc_cmpy_cd%>
<%= vexc_coms_slip_listRec.suply_amt%>
<%= vexc_coms_slip_listRec.vat_amt%>
<%= vexc_coms_slip_listRec.acct_no%>
<%= vexc_coms_slip_listRec.vexc_cmpy_nm%>
<%= vexc_coms_slip_listRec.medi_nm%>
<%= vexc_coms_slip_listRec.medi_cd%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu May 28 16:03:07 KST 2009 */