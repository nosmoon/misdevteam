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


public class IS_RPT_2320_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public IS_RPT_2320_LDataSet(){}
	public IS_RPT_2320_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(11);
		while(rset0.next()){
			IS_RPT_2320_LCURLIST1Record rec = new IS_RPT_2320_LCURLIST1Record();
			rec.sido = Util.checkString(rset0.getString("sido"));
			rec.gu = Util.checkString(rset0.getString("gu"));
			rec.purc_dlco_no_sort = Util.checkString(rset0.getString("purc_dlco_no_sort"));
			rec.yyyy = Util.checkString(rset0.getString("yyyy"));
			rec.sido_nm = Util.checkString(rset0.getString("sido_nm"));
			rec.gu_nm = Util.checkString(rset0.getString("gu_nm"));
			rec.purc_dlco_nm = Util.checkString(rset0.getString("purc_dlco_nm"));
			rec.purc_dlco_no = Util.checkString(rset0.getString("purc_dlco_no"));
			rec.o_amt = Util.checkString(rset0.getString("o_amt"));
			rec.p_amt = Util.checkString(rset0.getString("p_amt"));
			rec.r_amt = Util.checkString(rset0.getString("r_amt"));
			rec.r_rate = Util.checkString(rset0.getString("r_rate"));
			this.curlist1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	IS_RPT_2320_LDataSet ds = (IS_RPT_2320_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		IS_RPT_2320_LCURLIST1Record curlist1Rec = (IS_RPT_2320_LCURLIST1Record)ds.curlist1.get(i);%>
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

<%= curlist1Rec.sido%>
<%= curlist1Rec.gu%>
<%= curlist1Rec.purc_dlco_no_sort%>
<%= curlist1Rec.yyyy%>
<%= curlist1Rec.sido_nm%>
<%= curlist1Rec.gu_nm%>
<%= curlist1Rec.purc_dlco_nm%>
<%= curlist1Rec.purc_dlco_no%>
<%= curlist1Rec.o_amt%>
<%= curlist1Rec.p_amt%>
<%= curlist1Rec.r_amt%>
<%= curlist1Rec.r_rate%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Jun 04 18:54:00 KST 2012 */