/***************************************************************************************************
* ���ϸ� : SE_SAL_1740_ADataSet.java
* ��� : �Ǹ� - ������� - ������� - ��꼭 ����
* �ۼ����� : 2009-04-21
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


public class SE_SAL_1740_ADataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList sendlist = new ArrayList();
	public String errcode	;
	public String errmsg	;
	
	public SE_SAL_1740_ADataSet(){}
	public SE_SAL_1740_ADataSet(String errcode, String errmsg){
		this.errcode 	= errcode		;
		this.errmsg 	= errmsg		;
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
		this.errcode 	= Util.checkString(cstmt.getString(1));
		this.errmsg 	= Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(14);
		while(rset0.next()){
			SE_SAL_1740_ASENDLISTRecord rec = new SE_SAL_1740_ASENDLISTRecord();
			rec.col 			= Util.checkString(rset0.getString("col"			));
			rec.slip_occr_dt 	= Util.checkString(rset0.getString("slip_occr_dt"	));
			rec.slip_occr_cd 	= Util.checkString(rset0.getString("slip_occr_cd"	));
			rec.slip_seq	 	= Util.checkString(rset0.getString("slip_seq"		));
			
			this.sendlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SE_SAL_1740_ADataSet ds = (SE_SAL_1740_ADataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.sendlist.size(); i++){
		SE_SAL_1740_ASENDLISTRecord sendlistRec = (SE_SAL_1740_ASENDLISTRecord)ds.sendlist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getSendlist()%>
<%= ds.getSemuro_id()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= sendlistRec.col%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Apr 21 18:02:01 KST 2009 */