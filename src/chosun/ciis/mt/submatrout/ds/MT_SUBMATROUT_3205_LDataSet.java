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


package chosun.ciis.mt.submatrout.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.submatrout.dm.*;
import chosun.ciis.mt.submatrout.rec.*;

/**
 * 
 */


public class MT_SUBMATROUT_3205_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_SUBMATROUT_3205_LDataSet(){}
	public MT_SUBMATROUT_3205_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			MT_SUBMATROUT_3205_LCURLISTRecord rec = new MT_SUBMATROUT_3205_LCURLISTRecord();
			rec.matr_cd = Util.checkString(rset0.getString("matr_cd"));
			rec.matr_nm = Util.checkString(rset0.getString("matr_nm"));
			rec.purc_uprc = Util.checkString(rset0.getString("purc_uprc"));
			rec.unit = Util.checkString(rset0.getString("unit"));
			rec.std_modl = Util.checkString(rset0.getString("std_modl"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	MT_SUBMATROUT_3205_LDataSet ds = (MT_SUBMATROUT_3205_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_SUBMATROUT_3205_LCURLISTRecord curlistRec = (MT_SUBMATROUT_3205_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.matr_cd%>
<%= curlistRec.matr_nm%>
<%= curlistRec.purc_uprc%>
<%= curlistRec.unit%>
<%= curlistRec.std_modl%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed May 06 20:26:41 KST 2009 */