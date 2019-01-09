/***************************************************************************************************
* ���ϸ� : SE_SAL_1810_LDataSet.java
* ��� : �Ǹ� - ������� - ������� - ���⸶��
* �ۼ����� : 2009-04-10
* �ۼ��� : �����
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.se.sal.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.sal.dm.*;
import chosun.ciis.se.sal.rec.*;

/**
 * 
 */


public class SE_SAL_1810_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_SAL_1810_LDataSet(){}
	public SE_SAL_1810_LDataSet(String errcode, String errmsg){
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
		this.errcode 				= Util.checkString(cstmt.getString(1));
		this.errmsg 				= Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 			= (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			SE_SAL_1810_LCURLISTRecord rec = new SE_SAL_1810_LCURLISTRecord();
			rec.yymm 				= Util.checkString(rset0.getString("yymm"				));
			rec.clos_yn_40 			= Util.checkString(rset0.getString("clos_yn_40"			));
			rec.clos_dt_tm_40 		= Util.checkString(rset0.getString("clos_dt_tm_40"		));
			rec.clos_yn_50 			= Util.checkString(rset0.getString("clos_yn_50"			));
			rec.clos_dt_tm_50 		= Util.checkString(rset0.getString("clos_dt_tm_50"		));
			rec.qty_110 			= Util.checkString(rset0.getString("qty_110"			));
			rec.avg_uprc_110 		= Util.checkString(rset0.getString("avg_uprc_110"		));
			rec.sale_amt_110 		= Util.checkString(rset0.getString("sale_amt_110"		));
			rec.net_sale_amt_110 	= Util.checkString(rset0.getString("net_sale_amt_110"	));
			rec.fpymt_amt_110 		= Util.checkString(rset0.getString("fpymt_amt_110"		));
			rec.qty_130 			= Util.checkString(rset0.getString("qty_130"			));
			rec.avg_uprc_130 		= Util.checkString(rset0.getString("avg_uprc_130"		));
			rec.sale_amt_130 		= Util.checkString(rset0.getString("sale_amt_130"		));
			rec.net_sale_amt_130 	= Util.checkString(rset0.getString("net_sale_amt_130"	));
			rec.fpymt_amt_130 		= Util.checkString(rset0.getString("fpymt_amt_130"		));
			rec.sale_amt 			= Util.checkString(rset0.getString("sale_amt"			));
			rec.fpymt_amt 			= Util.checkString(rset0.getString("fpymt_amt"			));
			rec.net_sale_amt 		= Util.checkString(rset0.getString("net_sale_amt"		));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SE_SAL_1810_LDataSet ds = (SE_SAL_1810_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_SAL_1810_LCURLISTRecord curlistRec = (SE_SAL_1810_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.yymm%>
<%= curlistRec.clos_yn_40%>
<%= curlistRec.clos_dt_tm_40%>
<%= curlistRec.clos_yn_50%>
<%= curlistRec.clos_dt_tm_50%>
<%= curlistRec.qty_110%>
<%= curlistRec.avg_uprc_110%>
<%= curlistRec.sale_amt_110%>
<%= curlistRec.net_sale_amt_110%>
<%= curlistRec.fpymt_amt_110%>
<%= curlistRec.qty_130%>
<%= curlistRec.avg_uprc_130%>
<%= curlistRec.sale_amt_130%>
<%= curlistRec.net_sale_amt_130%>
<%= curlistRec.fpymt_amt_130%>
<%= curlistRec.sale_amt%>
<%= curlistRec.fpymt_amt%>
<%= curlistRec.net_sale_amt%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Apr 10 16:13:39 KST 2009 */