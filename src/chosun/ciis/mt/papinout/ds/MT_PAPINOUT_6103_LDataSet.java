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


public class MT_PAPINOUT_6103_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_PAPINOUT_6103_LDataSet(){}
	public MT_PAPINOUT_6103_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(10);
		while(rset0.next()){
			MT_PAPINOUT_6103_LCURLISTRecord rec = new MT_PAPINOUT_6103_LCURLISTRecord();
			rec.ewh_dt = Util.checkString(rset0.getString("ewh_dt"));
			rec.fac_clsf = Util.checkString(rset0.getString("fac_clsf"));
			rec.usag = Util.checkString(rset0.getString("usag"));
			rec.ewh_roll = Util.checkString(rset0.getString("ewh_roll"));
			rec.ewh_amt = Util.checkString(rset0.getString("ewh_amt"));
			rec.ewh_vat = Util.checkString(rset0.getString("ewh_vat"));
			rec.sum_amt = Util.checkString(rset0.getString("sum_amt"));
			rec.ewh_wgt = Util.checkString(rset0.getString("ewh_wgt"));
			rec.matr_cd = Util.checkString(rset0.getString("matr_cd"));
			rec.matr_nm = Util.checkString(rset0.getString("matr_nm"));
			rec.ewh_uprc = Util.checkString(rset0.getString("ewh_uprc"));
			rec.wisgno = Util.checkString(rset0.getString("wisgno"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	MT_PAPINOUT_6103_LDataSet ds = (MT_PAPINOUT_6103_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_PAPINOUT_6103_LCURLISTRecord curlistRec = (MT_PAPINOUT_6103_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.ewh_dt%>
<%= curlistRec.fac_clsf%>
<%= curlistRec.usag%>
<%= curlistRec.ewh_roll%>
<%= curlistRec.ewh_amt%>
<%= curlistRec.ewh_vat%>
<%= curlistRec.sum_amt%>
<%= curlistRec.ewh_wgt%>
<%= curlistRec.matr_cd%>
<%= curlistRec.matr_nm%>
<%= curlistRec.ewh_uprc%>
<%= curlistRec.wisgno%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu May 21 18:04:36 KST 2009 */