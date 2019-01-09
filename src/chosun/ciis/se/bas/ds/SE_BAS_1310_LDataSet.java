/***************************************************************************************************
* ���ϸ� : SE_BAS_1310_LDataSet.java
* ��� : ������������ - ��ü�ܰ���ȸ
* �ۼ����� : 2009-03-11
* �ۼ��� : �̹�ȿ
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.se.bas.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.bas.dm.*;
import chosun.ciis.se.bas.rec.*;

/**
 * 
 */


public class SE_BAS_1310_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList sendlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String title;

	public SE_BAS_1310_LDataSet(){}
	public SE_BAS_1310_LDataSet(String errcode, String errmsg, String title){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.title = title;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getTitle(){
		return this.title;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			SE_BAS_1310_LSENDLISTRecord rec = new SE_BAS_1310_LSENDLISTRecord();
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.bhilsu = Util.checkString(rset0.getString("bhilsu"));
			rec.amt = Util.checkString(rset0.getString("amt"));
			this.sendlist.add(rec);
		}
		this.title = Util.checkString(cstmt.getString(7));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SE_BAS_1310_LDataSet ds = (SE_BAS_1310_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.sendlist.size(); i++){
		SE_BAS_1310_LSENDLISTRecord sendlistRec = (SE_BAS_1310_LSENDLISTRecord)ds.sendlist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getSendlist()%>
<%= ds.getTitle()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= sendlistRec.medi_cd%>
<%= sendlistRec.bhilsu%>
<%= sendlistRec.amt%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Feb 24 10:13:32 KST 2009 */