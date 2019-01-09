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


package chosun.ciis.is.rpt.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.rpt.dm.*;
import chosun.ciis.is.rpt.rec.*;

/**
 * 
 */


public class IS_RPT_1610_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public IS_RPT_1610_LDataSet(){}
	public IS_RPT_1610_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(10);
		while(rset0.next()){
			IS_RPT_1610_LCURLIST1Record rec = new IS_RPT_1610_LCURLIST1Record();
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.sub_dept_cd = Util.checkString(rset0.getString("sub_dept_cd"));
			rec.chrg_pers = Util.checkString(rset0.getString("chrg_pers"));
			rec.dept_cd_nm = Util.checkString(rset0.getString("dept_cd_nm"));
			rec.sub_dept_cd_nm = Util.checkString(rset0.getString("sub_dept_cd_nm"));
			rec.chrg_pers_nm = Util.checkString(rset0.getString("chrg_pers_nm"));
			rec.amt_01 = Util.checkString(rset0.getString("amt_01"));
			rec.amt_02 = Util.checkString(rset0.getString("amt_02"));
			rec.amt_03 = Util.checkString(rset0.getString("amt_03"));
			rec.amt_04 = Util.checkString(rset0.getString("amt_04"));
			rec.amt_05 = Util.checkString(rset0.getString("amt_05"));
			rec.amt_06 = Util.checkString(rset0.getString("amt_06"));
			rec.amt_07 = Util.checkString(rset0.getString("amt_07"));
			rec.amt_08 = Util.checkString(rset0.getString("amt_08"));
			rec.amt_09 = Util.checkString(rset0.getString("amt_09"));
			rec.amt_10 = Util.checkString(rset0.getString("amt_10"));
			rec.amt_11 = Util.checkString(rset0.getString("amt_11"));
			rec.amt_12 = Util.checkString(rset0.getString("amt_12"));
			rec.amt_tt = Util.checkString(rset0.getString("amt_tt"));
			this.curlist1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	IS_RPT_1610_LDataSet ds = (IS_RPT_1610_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		IS_RPT_1610_LCURLIST1Record curlist1Rec = (IS_RPT_1610_LCURLIST1Record)ds.curlist1.get(i);%>
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

<%= curlist1Rec.dept_cd%>
<%= curlist1Rec.sub_dept_cd%>
<%= curlist1Rec.chrg_pers%>
<%= curlist1Rec.dept_cd_nm%>
<%= curlist1Rec.sub_dept_cd_nm%>
<%= curlist1Rec.chrg_pers_nm%>
<%= curlist1Rec.amt_01%>
<%= curlist1Rec.amt_02%>
<%= curlist1Rec.amt_03%>
<%= curlist1Rec.amt_04%>
<%= curlist1Rec.amt_05%>
<%= curlist1Rec.amt_06%>
<%= curlist1Rec.amt_07%>
<%= curlist1Rec.amt_08%>
<%= curlist1Rec.amt_09%>
<%= curlist1Rec.amt_10%>
<%= curlist1Rec.amt_11%>
<%= curlist1Rec.amt_12%>
<%= curlist1Rec.amt_tt%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu May 31 16:17:19 KST 2012 */