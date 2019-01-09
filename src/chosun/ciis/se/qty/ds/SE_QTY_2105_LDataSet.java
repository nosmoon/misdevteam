/***************************************************************************************************
* ���ϸ� : .java
* ��� : �ǸŽý���
* �ۼ����� : 2009-02-18
* �ۼ��� : ��â��
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


public class SE_QTY_2105_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList commcdcur2 = new ArrayList();
	public ArrayList commcdcur1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_QTY_2105_LDataSet(){}
	public SE_QTY_2105_LDataSet(String errcode, String errmsg){
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
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			SE_QTY_2105_LCOMMCDCUR1Record rec = new SE_QTY_2105_LCOMMCDCUR1Record();
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.medi_nm = Util.checkString(rset0.getString("medi_nm"));
			this.commcdcur1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(7);
		while(rset1.next()){
			SE_QTY_2105_LCOMMCDCUR2Record rec = new SE_QTY_2105_LCOMMCDCUR2Record();
			rec.medi_cd = Util.checkString(rset1.getString("medi_cd"));
			rec.sect_nm_cd = Util.checkString(rset1.getString("sect_nm_cd"));
			rec.sect_nm = Util.checkString(rset1.getString("sect_nm"));
			this.commcdcur2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SE_QTY_2105_LDataSet ds = (SE_QTY_2105_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.commcdcur1.size(); i++){
		SE_QTY_2105_LCOMMCDCUR1Record commcdcur1Rec = (SE_QTY_2105_LCOMMCDCUR1Record)ds.commcdcur1.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.commcdcur2.size(); i++){
		SE_QTY_2105_LCOMMCDCUR2Record commcdcur2Rec = (SE_QTY_2105_LCOMMCDCUR2Record)ds.commcdcur2.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCommcdcur1()%>
<%= ds.getCommcdcur2()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= commcdcur1Rec.medi_cd%>
<%= commcdcur1Rec.medi_nm%>
<%= commcdcur2Rec.medi_cd%>
<%= commcdcur2Rec.sect_nm_cd%>
<%= commcdcur2Rec.sect_nm%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Mar 04 16:13:37 KST 2009 */