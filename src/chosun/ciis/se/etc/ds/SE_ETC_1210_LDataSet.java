/***************************************************************************************************
* ���ϸ� : SE_ETC_1210_LDataSet.java
* ��� : �Ǹ�-��Ÿ����-������ ���޵��
* �ۼ����� : 2009-03-05
* �ۼ��� : �����
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.se.etc.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.etc.dm.*;
import chosun.ciis.se.etc.rec.*;

/**
 * 
 */


public class SE_ETC_1210_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode	;
	public String errmsg	;

	public SE_ETC_1210_LDataSet(){}
	public SE_ETC_1210_LDataSet(String errcode, String errmsg){
		this.errcode 	= errcode	;
		this.errmsg 	= errmsg	;
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
		ResultSet rset0 		= (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			SE_ETC_1210_LCURLISTRecord rec = new SE_ETC_1210_LCURLISTRecord();
			rec.yymm 			= Util.checkString(rset0.getString("yymm"			));
			rec.pay_seq 		= Util.checkString(rset0.getString("pay_seq"		));
			rec.pay_descri 		= Util.checkString(rset0.getString("pay_descri"		));
			rec.pay_mthd_clsf 	= Util.checkString(rset0.getString("pay_mthd_clsf"	));
			rec.dept_cd 		= Util.checkString(rset0.getString("dept_cd"		));
			rec.uprc 			= Util.checkString(rset0.getString("uprc"			));
			rec.draft_doc_no 	= Util.checkString(rset0.getString("draft_doc_no"	));
			rec.pay_dt 			= Util.checkString(rset0.getString("pay_dt"			));
			rec.decid_stat 		= Util.checkString(rset0.getString("decid_stat"		));
			rec.clos_yn 		= Util.checkString(rset0.getString("clos_yn"		));
			rec.actu_slip_no 	= Util.checkString(rset0.getString("actu_slip_no"	));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SE_ETC_1210_LDataSet ds = (SE_ETC_1210_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_ETC_1210_LCURLISTRecord curlistRec = (SE_ETC_1210_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.pay_seq%>
<%= curlistRec.pay_descri%>
<%= curlistRec.pay_mthd_clsf%>
<%= curlistRec.dept_cd%>
<%= curlistRec.uprc%>
<%= curlistRec.draft_doc_no%>
<%= curlistRec.pay_dt%>
<%= curlistRec.decid_stat%>
<%= curlistRec.clos_yn%>
<%= curlistRec.actu_slip_no%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Mar 05 10:50:54 KST 2009 */