/***************************************************************************************************
* ���ϸ� : SE_SRCP_5310_LDataSet.java
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


package chosun.ciis.se.rcp.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.rcp.dm.*;
import chosun.ciis.se.rcp.rec.*;

/**
 * 
 */


public class SE_RCP_5310_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_RCP_5310_LDataSet(){}
	public SE_RCP_5310_LDataSet(String errcode, String errmsg){
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
			SE_RCP_5310_LCURLISTRecord rec = new SE_RCP_5310_LCURLISTRecord();
			rec.yymm 				= Util.checkString(rset0.getString("yymm"				));
			rec.clos_yn_10 			= Util.checkString(rset0.getString("clos_yn_10"			));
			rec.clos_dt_tm_10 		= Util.checkString(rset0.getString("clos_dt_tm_10"		));
			rec.clos_yn_20 			= Util.checkString(rset0.getString("clos_yn_20"			));
			rec.actu_slip_no 		= Util.checkString(rset0.getString("actu_slip_no"		));
			rec.qty		 			= Util.checkString(rset0.getString("qty"				));
			rec.pdlv_fee	 		= Util.checkString(rset0.getString("pdlv_fee"			));
			rec.uprc		 		= Util.checkString(rset0.getString("uprc"				));
			rec.pdlv_altn_amt 		= Util.checkString(rset0.getString("pdlv_altn_amt"		));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SE_RCP_5310_LDataSet ds = (SE_RCP_5310_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_RCP_5310_LCURLISTRecord curlistRec = (SE_RCP_5310_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.clos_yn_10%>
<%= curlistRec.clos_dt_tm_10%>
<%= curlistRec.clos_yn_20%>
<%= curlistRec.acsu_slip_no%>
<%= curlistRec.qty%>
<%= curlistRec.pdlv_fee%>
<%= curlistRec.uprc%>
<%= curlistRec.pdlv_altn_amt%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Apr 10 16:13:39 KST 2009 */