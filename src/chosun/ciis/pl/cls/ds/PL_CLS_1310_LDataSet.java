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


public class PL_CLS_1310_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList ptcrlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public PL_CLS_1310_LDataSet(){}
	public PL_CLS_1310_LDataSet(String errcode, String errmsg){
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

		ResultSet rset2 = (ResultSet) cstmt.getObject(8);
		while(rset2.next()){
			PL_CLS_1310_LPTCRLISTRecord rec = new PL_CLS_1310_LPTCRLISTRecord();
			rec.basi_yymm = Util.checkString(rset2.getString("basi_yymm"));
			rec.basi_dt = Util.checkString(rset2.getString("basi_dt"));
			rec.cyov_bal = Util.checkString(rset2.getString("cyov_bal"));
			rec.sale_amt = Util.checkString(rset2.getString("sale_amt"));
			rec.rcpm_amt = Util.checkString(rset2.getString("rcpm_amt"));
			rec.retn_amt = Util.checkString(rset2.getString("retn_amt"));
			rec.meda_amt = Util.checkString(rset2.getString("meda_amt"));
			rec.mmbal_amt = Util.checkString(rset2.getString("mmbal_amt"));
			rec.totbal_amt = Util.checkString(rset2.getString("totbal_amt"));
			rec.clos_yn = Util.checkString(rset2.getString("clos_yn"));
			rec.temp_clos_emp_no = Util.checkString(rset2.getString("temp_clos_emp_no"));
			rec.sale_clos_emp_no = Util.checkString(rset2.getString("sale_clos_emp_no"));
			rec.medi_clsf = Util.checkString(rset2.getString("medi_clsf"));
			this.ptcrlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	PL_CLS_1310_LDataSet ds = (PL_CLS_1310_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.ptcrlist.size(); i++){
		PL_CLS_1310_LPTCRLISTRecord ptcrlistRec = (PL_CLS_1310_LPTCRLISTRecord)ds.ptcrlist.get(i);%>
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

<%= ptcrlistRec.basi_yymm%>
<%= ptcrlistRec.basi_dt%>
<%= ptcrlistRec.cyov_bal%>
<%= ptcrlistRec.sale_amt%>
<%= ptcrlistRec.rcpm_amt%>
<%= ptcrlistRec.retn_amt%>
<%= ptcrlistRec.meda_amt%>
<%= ptcrlistRec.mmbal_amt%>
<%= ptcrlistRec.totbal_amt%>
<%= ptcrlistRec.clos_yn%>
<%= ptcrlistRec.temp_clos_emp_no%>
<%= ptcrlistRec.sale_clos_emp_no%>
<%= ptcrlistRec.medi_clsf%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Aug 26 11:14:57 KST 2009 */