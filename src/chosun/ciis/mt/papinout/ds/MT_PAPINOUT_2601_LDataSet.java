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


package chosun.ciis.mt.papinout.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.papinout.dm.*;
import chosun.ciis.mt.papinout.rec.*;

/**
 * 
 */


public class MT_PAPINOUT_2601_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_PAPINOUT_2601_LDataSet(){}
	public MT_PAPINOUT_2601_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(9);
		while(rset0.next()){
			MT_PAPINOUT_2601_LCURLISTRecord rec = new MT_PAPINOUT_2601_LCURLISTRecord();
			rec.owh_dt = Util.checkString(rset0.getString("owh_dt"));
			rec.factcdnm = Util.checkString(rset0.getString("factcdnm"));
			rec.matr_cd = Util.checkString(rset0.getString("matr_cd"));
			rec.owh_uprc = Util.checkString(rset0.getString("owh_uprc"));
			rec.owh_roll = Util.checkString(rset0.getString("owh_roll"));
			rec.owh_wgt = Util.checkString(rset0.getString("owh_wgt"));
			rec.owh_amt = Util.checkString(rset0.getString("owh_amt"));
			rec.mov_factcdnm = Util.checkString(rset0.getString("mov_factcdnm"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	MT_PAPINOUT_2601_LDataSet ds = (MT_PAPINOUT_2601_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_PAPINOUT_2601_LCURLISTRecord curlistRec = (MT_PAPINOUT_2601_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.owh_dt%>
<%= curlistRec.factcdnm%>
<%= curlistRec.matr_cd%>
<%= curlistRec.owh_uprc%>
<%= curlistRec.owh_roll%>
<%= curlistRec.owh_wgt%>
<%= curlistRec.owh_amt%>
<%= curlistRec.mov_factcdnm%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Sat Apr 25 12:31:53 KST 2009 */