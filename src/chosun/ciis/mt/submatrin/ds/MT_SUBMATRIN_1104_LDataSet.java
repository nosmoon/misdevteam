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


package chosun.ciis.mt.submatrin.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.submatrin.dm.*;
import chosun.ciis.mt.submatrin.rec.*;

/**
 *
 */


public class MT_SUBMATRIN_1104_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_SUBMATRIN_1104_LDataSet(){}
	public MT_SUBMATRIN_1104_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			MT_SUBMATRIN_1104_LCURLISTRecord rec = new MT_SUBMATRIN_1104_LCURLISTRecord();
			rec.matr_cd = Util.checkString(rset0.getString("matr_cd"));
			rec.matr_nm = Util.checkString(rset0.getString("matr_nm"));
			rec.purc_uprc = Util.checkString(rset0.getString("purc_uprc"));
			rec.unit = Util.checkString(rset0.getString("unit"));
			rec.ewh_budg_cd = Util.checkString(rset0.getString("ewh_budg_cd"));
			rec.owh_budg_cd = Util.checkString(rset0.getString("owh_budg_cd"));
			rec.dstb_rat_cd = Util.checkString(rset0.getString("dstb_rat_cd"));
			this.curlist.add(rec);
		}

		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			MT_SUBMATRIN_1104_LCURLIST2Record rec = new MT_SUBMATRIN_1104_LCURLIST2Record();

			rec.cnt = rset1.getInt("cnt");
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	MT_SUBMATRIN_1104_LDataSet ds = (MT_SUBMATRIN_1104_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_SUBMATRIN_1104_LCURLISTRecord curlistRec = (MT_SUBMATRIN_1104_LCURLISTRecord)ds.curlist.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		MT_SUBMATRIN_1104_LCURLIST2Record curlist2Rec = (MT_SUBMATRIN_1104_LCURLIST2Record)ds.curlist2.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getCurlist2()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlistRec.matr_cd%>
<%= curlistRec.matr_nm%>
<%= curlistRec.purc_uprc%>
<%= curlistRec.unit%>
<%= curlistRec.ewh_budg_cd%>
<%= curlistRec.owh_budg_cd%>
<%= curlistRec.dstb_rat_cd%>
<%= curlist2Rec.cnt%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Mar 12 10:23:16 KST 2009 */