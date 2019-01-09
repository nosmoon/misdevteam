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


public class PL_CLS_1010_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList ptcrlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public PL_CLS_1010_LDataSet(){}
	public PL_CLS_1010_LDataSet(String errcode, String errmsg){
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

		ResultSet rset1 = (ResultSet) cstmt.getObject(7);
		while(rset1.next()){
			PL_CLS_1010_LPTCRLISTRecord rec = new PL_CLS_1010_LPTCRLISTRecord();
			rec.basi_dt = Util.checkString(rset1.getString("basi_dt"));
			rec.slip_no = Util.checkString(rset1.getString("slip_no"));
			rec.rcpm_amt = Util.checkString(rset1.getString("rcpm_amt"));
			rec.retn_amt = Util.checkString(rset1.getString("retn_amt"));
			rec.meda_amt = Util.checkString(rset1.getString("meda_amt"));
			rec.clos_yn = Util.checkString(rset1.getString("clos_yn"));
			rec.clos_pers_emp_no = Util.checkString(rset1.getString("clos_pers_emp_no"));
			this.ptcrlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	PL_CLS_1010_LDataSet ds = (PL_CLS_1010_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.ptcrlist.size(); i++){
		PL_CLS_1010_LPTCRLISTRecord ptcrlistRec = (PL_CLS_1010_LPTCRLISTRecord)ds.ptcrlist.get(i);%>
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
<%= ptcrlistRec.slip_no%>
<%= ptcrlistRec.rcpm_amt%>
<%= ptcrlistRec.retn_amt%>
<%= ptcrlistRec.meda_amt%>
<%= ptcrlistRec.clos_yn%>
<%= ptcrlistRec.clos_pers_emp_no%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Sep 16 16:46:24 KST 2009 */