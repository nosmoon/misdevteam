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


public class MT_SUBMATROUT_3000_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_SUBMATROUT_3000_LDataSet(){}
	public MT_SUBMATROUT_3000_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			MT_SUBMATROUT_3000_LCURLISTRecord rec = new MT_SUBMATROUT_3000_LCURLISTRecord();
			rec.sub_seq = Util.checkString(rset0.getString("sub_seq"));
			rec.matr_cd = Util.checkString(rset0.getString("matr_cd"));
			rec.item_nm = Util.checkString(rset0.getString("item_nm"));
			rec.std_modl = Util.checkString(rset0.getString("std_modl"));
			rec.unit = Util.checkString(rset0.getString("unit"));
			rec.ordr_qunt = Util.checkString(rset0.getString("ordr_qunt"));
			rec.ordr_uprc = Util.checkString(rset0.getString("ordr_uprc"));
			rec.ordr_amt = Util.checkString(rset0.getString("ordr_amt"));
			rec.ordr_req_dd = Util.checkString(rset0.getString("ordr_req_dd"));
			rec.remk_ar = Util.checkString(rset0.getString("remk_ar"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	MT_SUBMATROUT_3000_LDataSet ds = (MT_SUBMATROUT_3000_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_SUBMATROUT_3000_LCURLISTRecord curlistRec = (MT_SUBMATROUT_3000_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.sub_seq%>
<%= curlistRec.matr_cd%>
<%= curlistRec.item_nm%>
<%= curlistRec.std_modl%>
<%= curlistRec.unit%>
<%= curlistRec.ordr_qunt%>
<%= curlistRec.ordr_uprc%>
<%= curlistRec.ordr_amt%>
<%= curlistRec.ordr_req_dd%>
<%= curlistRec.remk_ar%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri May 08 11:43:23 KST 2009 */