/***************************************************************************************************
* ���ϸ� : 
* ��� : 
* �ۼ����� : 
* �ۼ��� : 
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.pl.cls.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pl.cls.dm.*;
import chosun.ciis.pl.cls.rec.*;

/**
 * 
 */


public class PL_CLS_1110_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList ptcrlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public PL_CLS_1110_LDataSet(){}
	public PL_CLS_1110_LDataSet(String errcode, String errmsg){
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
			PL_CLS_1110_LPTCRLISTRecord rec = new PL_CLS_1110_LPTCRLISTRecord();
			rec.basi_dt = Util.checkString(rset0.getString("basi_dt"));
			rec.medi_clsf = Util.checkString(rset0.getString("medi_clsf"));
			rec.deli_qty = Util.checkString(rset0.getString("deli_qty"));
			rec.deli_amt = Util.checkString(rset0.getString("deli_amt"));
			rec.retn_qty = Util.checkString(rset0.getString("retn_qty"));
			rec.retn_amt = Util.checkString(rset0.getString("retn_amt"));
			rec.sale_qty = Util.checkString(rset0.getString("sale_qty"));
			rec.sale_amt = Util.checkString(rset0.getString("sale_amt"));
			rec.clos_yn = Util.checkString(rset0.getString("clos_yn"));
			rec.clos_pers_emp_no = Util.checkString(rset0.getString("clos_pers_emp_no"));
			this.ptcrlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	PL_CLS_1110_LDataSet ds = (PL_CLS_1110_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.ptcrlist.size(); i++){
		PL_CLS_1110_LPTCRLISTRecord ptcrlistRec = (PL_CLS_1110_LPTCRLISTRecord)ds.ptcrlist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getPtcrlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ptcrlistRec.basi_dt%>
<%= ptcrlistRec.medi_clsf%>
<%= ptcrlistRec.deli_qty%>
<%= ptcrlistRec.deli_amt%>
<%= ptcrlistRec.retn_qty%>
<%= ptcrlistRec.retn_amt%>
<%= ptcrlistRec.sale_qty%>
<%= ptcrlistRec.sale_amt%>
<%= ptcrlistRec.clos_yn%>
<%= ptcrlistRec.clos_pers_emp_no%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon May 11 20:35:50 KST 2009 */