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


public class IS_RPT_1050_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public IS_RPT_1050_LDataSet(){}
	public IS_RPT_1050_LDataSet(String errcode, String errmsg){
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
			IS_RPT_1050_LCURLIST1Record rec = new IS_RPT_1050_LCURLIST1Record();
			rec.scat_dt = Util.checkString(rset0.getString("scat_dt"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.advcs_cd_nm = Util.checkString(rset0.getString("advcs_cd_nm"));
			rec.advt_nm = Util.checkString(rset0.getString("advt_nm"));
			rec.sale_clsf_nm = Util.checkString(rset0.getString("sale_clsf_nm"));
			rec.dept_cd_nm = Util.checkString(rset0.getString("dept_cd_nm"));
			rec.sub_dept_cd_nm = Util.checkString(rset0.getString("sub_dept_cd_nm"));
			rec.chrg_pers = Util.checkString(rset0.getString("chrg_pers"));
			rec.std_cd_nm = Util.checkString(rset0.getString("std_cd_nm"));
			rec.uprc = Util.checkString(rset0.getString("uprc"));
			rec.qunt = Util.checkString(rset0.getString("qunt"));
			rec.suply_amt = Util.checkString(rset0.getString("suply_amt"));
			rec.avg_purc_uprc = Util.checkString(rset0.getString("avg_purc_uprc"));
			rec.tot_purc_amt = Util.checkString(rset0.getString("tot_purc_amt"));
			rec.i_amt = Util.checkString(rset0.getString("i_amt"));
			rec.i_amt_rate = Util.checkString(rset0.getString("i_amt_rate"));
			this.curlist1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	IS_RPT_1050_LDataSet ds = (IS_RPT_1050_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		IS_RPT_1050_LCURLIST1Record curlist1Rec = (IS_RPT_1050_LCURLIST1Record)ds.curlist1.get(i);%>
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

<%= curlist1Rec.scat_dt%>
<%= curlist1Rec.dlco_nm%>
<%= curlist1Rec.advcs_cd_nm%>
<%= curlist1Rec.advt_nm%>
<%= curlist1Rec.sale_clsf_nm%>
<%= curlist1Rec.dept_cd_nm%>
<%= curlist1Rec.sub_dept_cd_nm%>
<%= curlist1Rec.chrg_pers%>
<%= curlist1Rec.std_cd_nm%>
<%= curlist1Rec.uprc%>
<%= curlist1Rec.qunt%>
<%= curlist1Rec.suply_amt%>
<%= curlist1Rec.avg_purc_uprc%>
<%= curlist1Rec.tot_purc_amt%>
<%= curlist1Rec.i_amt%>
<%= curlist1Rec.i_amt_rate%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Jun 05 11:53:45 KST 2012 */