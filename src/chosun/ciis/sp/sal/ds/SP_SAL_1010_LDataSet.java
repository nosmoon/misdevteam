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


package chosun.ciis.sp.sal.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.sp.sal.dm.*;
import chosun.ciis.sp.sal.rec.*;

/**
 * 
 */


public class SP_SAL_1010_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public SP_SAL_1010_LDataSet(){}
	public SP_SAL_1010_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			SP_SAL_1010_LCURLIST1Record rec = new SP_SAL_1010_LCURLIST1Record();
			rec.dlco_no = Util.checkString(rset0.getString("dlco_no"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.rcpm_clsf1 = Util.checkString(rset0.getString("rcpm_clsf1"));
			rec.sale_amt1 = Util.checkString(rset0.getString("sale_amt1"));
			rec.rcpm_clsf2 = Util.checkString(rset0.getString("rcpm_clsf2"));
			rec.sale_amt2 = Util.checkString(rset0.getString("sale_amt2"));
			rec.sale_amt3 = Util.checkString(rset0.getString("sale_amt3"));
			rec.sale_amt4 = Util.checkString(rset0.getString("sale_amt4"));
			this.curlist1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SP_SAL_1010_LDataSet ds = (SP_SAL_1010_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		SP_SAL_1010_LCURLIST1Record curlist1Rec = (SP_SAL_1010_LCURLIST1Record)ds.curlist1.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlist1Rec.dlco_no%>
<%= curlist1Rec.dlco_nm%>
<%= curlist1Rec.rcpm_clsf1%>
<%= curlist1Rec.sale_amt1%>
<%= curlist1Rec.rcpm_clsf2%>
<%= curlist1Rec.sale_amt2%>
<%= curlist1Rec.sale_amt3%>
<%= curlist1Rec.sale_amt4%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Jul 18 19:47:14 KST 2012 */