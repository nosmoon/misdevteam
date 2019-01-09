/***************************************************************************************************
* ���ϸ� : SE_BNS_1910_LDataSet.java
* ��� : �Ǹ�-���˹����� - ���˹�(����)��꼭
* �ۼ����� : 2009-04-30
* �ۼ��� : �����
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.se.bns.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.bns.dm.*;
import chosun.ciis.se.bns.rec.*;

/**
 * 
 */


public class SE_BNS_1910_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_BNS_1910_LDataSet(){}
	public SE_BNS_1910_LDataSet(String errcode, String errmsg){
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
		this.errcode 			= Util.checkString(cstmt.getString(1));
		this.errmsg 			= Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 		= (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			SE_BNS_1910_LCURLISTRecord rec = new SE_BNS_1910_LCURLISTRecord();
			rec.yymm 			= Util.checkString(rset0.getString("yymm"			));
			rec.clos_yn_1 		= Util.checkString(rset0.getString("clos_yn_1"		));
			rec.clos_yn_2 		= Util.checkString(rset0.getString("clos_yn_2"		));
			rec.qunt 			= Util.checkString(rset0.getString("qunt"			));
			rec.uprc 			= Util.checkString(rset0.getString("uprc"			));
			rec.sale_amt 		= Util.checkString(rset0.getString("sale_amt"		));
			rec.fpymt_amt 		= Util.checkString(rset0.getString("fpymt_amt"		));
			rec.net_sale_amt 	= Util.checkString(rset0.getString("net_sale_amt"	));
			rec.vat_amt 		= Util.checkString(rset0.getString("vat_amt"		));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SE_BNS_1910_LDataSet ds = (SE_BNS_1910_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_BNS_1910_LCURLISTRecord curlistRec = (SE_BNS_1910_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.clos_yn_1%>
<%= curlistRec.clos_yn_2%>
<%= curlistRec.qunt%>
<%= curlistRec.uprc%>
<%= curlistRec.sale_amt%>
<%= curlistRec.fpymt_amt%>
<%= curlistRec.net_sale_amt%>
<%= curlistRec.vat_amt%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Apr 30 20:37:39 KST 2009 */