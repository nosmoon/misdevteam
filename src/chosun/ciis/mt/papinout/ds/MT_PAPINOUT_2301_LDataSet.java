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


public class MT_PAPINOUT_2301_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_PAPINOUT_2301_LDataSet(){}
	public MT_PAPINOUT_2301_LDataSet(String errcode, String errmsg){
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
			MT_PAPINOUT_2301_LCURLISTRecord rec = new MT_PAPINOUT_2301_LCURLISTRecord();
			rec.title = Util.checkString(rset0.getString("title"));
			rec.s_ibgoamt = Util.checkString(rset0.getString("s_ibgoamt"));
			rec.s_jiamt = Util.checkString(rset0.getString("s_jiamt"));
			rec.tot_ibgoamt = Util.checkString(rset0.getString("tot_ibgoamt"));
			rec.di_ibgojo_amt = Util.checkString(rset0.getString("di_ibgojo_amt"));
			rec.di_ibgojovat = Util.checkString(rset0.getString("di_ibgojovat"));
			rec.s_cgamt = Util.checkString(rset0.getString("s_cgamt"));
			rec.s_jcamt = Util.checkString(rset0.getString("s_jcamt"));
			rec.tot_cgamt = Util.checkString(rset0.getString("tot_cgamt"));
			rec.di_cgjo_amt = Util.checkString(rset0.getString("di_cgjo_amt"));
			rec.di_cgjo_vat = Util.checkString(rset0.getString("di_cgjo_vat"));
			rec.matr_cd = Util.checkString(rset0.getString("matr_cd"));
			rec.grp = Util.checkString(rset0.getString("grp"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	MT_PAPINOUT_2301_LDataSet ds = (MT_PAPINOUT_2301_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_PAPINOUT_2301_LCURLISTRecord curlistRec = (MT_PAPINOUT_2301_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.title%>
<%= curlistRec.s_ibgoamt%>
<%= curlistRec.s_jiamt%>
<%= curlistRec.tot_ibgoamt%>
<%= curlistRec.di_ibgojo_amt%>
<%= curlistRec.di_ibgojovat%>
<%= curlistRec.s_cgamt%>
<%= curlistRec.s_jcamt%>
<%= curlistRec.tot_cgamt%>
<%= curlistRec.di_cgjo_amt%>
<%= curlistRec.di_cgjo_vat%>
<%= curlistRec.matr_cd%>
<%= curlistRec.grp%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Apr 21 18:58:36 KST 2009 */