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


package chosun.ciis.is.bus.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.bus.dm.*;
import chosun.ciis.is.bus.rec.*;

/**
 * 
 */


public class IS_BUS_2110_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist_1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public IS_BUS_2110_LDataSet(){}
	public IS_BUS_2110_LDataSet(String errcode, String errmsg){
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
			IS_BUS_2110_LCURLIST_1Record rec = new IS_BUS_2110_LCURLIST_1Record();
			rec.dlco_cd = Util.checkString(rset0.getString("dlco_cd"));
			rec.grp_row_number = Util.checkString(rset0.getString("grp_row_number"));
			rec.purc_dlco_nm = Util.checkString(rset0.getString("purc_dlco_nm"));
			rec.feed_dt = Util.checkString(rset0.getString("feed_dt"));
			rec.advcs_nm = Util.checkString(rset0.getString("advcs_nm"));
			rec.asnt_dstc_cd_nm = Util.checkString(rset0.getString("asnt_dstc_cd_nm"));
			rec.std = Util.checkString(rset0.getString("std"));
			rec.cnt_01 = Util.checkString(rset0.getString("cnt_01"));
			rec.cnt_02 = Util.checkString(rset0.getString("cnt_02"));
			rec.cnt_2 = Util.checkString(rset0.getString("cnt_2"));
			rec.cnt_3 = Util.checkString(rset0.getString("cnt_3"));
			rec.cnt_4 = Util.checkString(rset0.getString("cnt_4"));
			rec.etc_nm = Util.checkString(rset0.getString("etc_nm"));
			this.curlist_1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	IS_BUS_2110_LDataSet ds = (IS_BUS_2110_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist_1.size(); i++){
		IS_BUS_2110_LCURLIST_1Record curlist_1Rec = (IS_BUS_2110_LCURLIST_1Record)ds.curlist_1.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist_1()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlist_1Rec.dlco_cd%>
<%= curlist_1Rec.grp_row_number%>
<%= curlist_1Rec.purc_dlco_nm%>
<%= curlist_1Rec.feed_dt%>
<%= curlist_1Rec.advcs_nm%>
<%= curlist_1Rec.asnt_dstc_cd_nm%>
<%= curlist_1Rec.std%>
<%= curlist_1Rec.cnt_01%>
<%= curlist_1Rec.cnt_02%>
<%= curlist_1Rec.cnt_2%>
<%= curlist_1Rec.cnt_3%>
<%= curlist_1Rec.cnt_4%>
<%= curlist_1Rec.etc_nm%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Jun 21 13:39:12 KST 2012 */