/***************************************************************************************************
* ���ϸ� : SE_QTY_2810_LDataSet.java
* ��� : �μ����� - �߼ۺμ� - �������ں�����μ�
* �ۼ����� : 2009-03-11
* �ۼ��� : �����
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.se.qty.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.qty.dm.*;
import chosun.ciis.se.qty.rec.*;

/**
 * 
 */


public class SE_QTY_2810_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_QTY_2810_LDataSet(){}
	public SE_QTY_2810_LDataSet(String errcode, String errmsg){
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
		this.errcode 	= Util.checkString(cstmt.getString(1));
		this.errmsg 	= Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(11);
		while(rset0.next()){
			SE_QTY_2810_LCURLISTRecord rec = new SE_QTY_2810_LCURLISTRecord();
			rec.issu_dt = Util.checkString(rset0.getString("issu_dt"));
			rec.pcnt	= Util.checkString(rset0.getString("pcnt"	));
			rec.qty 	= Util.checkString(rset0.getString("qty"	));
			rec.qty_11 	= Util.checkString(rset0.getString("qty_11"	));
			rec.qty_21 	= Util.checkString(rset0.getString("qty_21"	));
			rec.qty_31 	= Util.checkString(rset0.getString("qty_31"	));
			rec.qty_41 	= Util.checkString(rset0.getString("qty_41"	));
			rec.qty_51 	= Util.checkString(rset0.getString("qty_51"	));
			rec.qty_61 	= Util.checkString(rset0.getString("qty_61"	));
			rec.qty_71 	= Util.checkString(rset0.getString("qty_71"	));
			rec.qty_81 	= Util.checkString(rset0.getString("qty_81"	));
			rec.qty_91 	= Util.checkString(rset0.getString("qty_91"	));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SE_QTY_2810_LDataSet ds = (SE_QTY_2810_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_QTY_2810_LCURLISTRecord curlistRec = (SE_QTY_2810_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.issu_dt%>
<%= curlistRec.qty%>
<%= curlistRec.qty_11%>
<%= curlistRec.qty_21%>
<%= curlistRec.qty_31%>
<%= curlistRec.qty_41%>
<%= curlistRec.qty_51%>
<%= curlistRec.qty_61%>
<%= curlistRec.qty_71%>
<%= curlistRec.qty_81%>
<%= curlistRec.qty_91%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Mar 11 21:05:21 KST 2009 */