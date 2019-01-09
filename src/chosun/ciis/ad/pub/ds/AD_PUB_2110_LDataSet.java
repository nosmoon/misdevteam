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


package chosun.ciis.ad.pub.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.pub.dm.*;
import chosun.ciis.ad.pub.rec.*;

/**
 * 
 */


public class AD_PUB_2110_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{ 
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_PUB_2110_LDataSet(){}
	public AD_PUB_2110_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(12);
		while(rset0.next()){
			AD_PUB_2110_LCURLISTRecord rec = new AD_PUB_2110_LCURLISTRecord();
			rec.medi_nm = Util.checkString(rset0.getString("medi_nm"));
			rec.name_cd = Util.checkString(rset0.getString("name_cd"));
			rec.name = Util.checkString(rset0.getString("name"));
			rec.advt_fee = Util.checkString(rset0.getString("advt_fee"));
			rec.vat = Util.checkString(rset0.getString("vat"));
			rec.pubc_tot_amt = Util.checkString(rset0.getString("pubc_tot_amt"));
			rec.cnt = Util.checkString(rset0.getString("cnt"));
			rec.pubc_dt = Util.checkString(rset0.getString("pubc_dt"));
			rec.rnum = Util.checkString(rset0.getString("rnum"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(13);
		while(rset1.next()){
			AD_PUB_2110_LCURLIST2Record rec = new AD_PUB_2110_LCURLIST2Record();
			rec.medi_nm = Util.checkString(rset1.getString("medi_nm"));
			rec.name_cd = Util.checkString(rset1.getString("name_cd"));
			rec.name = Util.checkString(rset1.getString("name"));
			rec.advt_fee = Util.checkString(rset1.getString("advt_fee"));
			rec.vat = Util.checkString(rset1.getString("vat"));
			rec.pubc_tot_amt = Util.checkString(rset1.getString("pubc_tot_amt"));
			rec.cnt = Util.checkString(rset1.getString("cnt"));
			rec.pubc_dt = Util.checkString(rset1.getString("pubc_dt"));
			rec.rnum = Util.checkString(rset1.getString("rnum"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	AD_PUB_2110_LDataSet ds = (AD_PUB_2110_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_PUB_2110_LCURLISTRecord curlistRec = (AD_PUB_2110_LCURLISTRecord)ds.curlist.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		AD_PUB_2110_LCURLIST2Record curlist2Rec = (AD_PUB_2110_LCURLIST2Record)ds.curlist2.get(i);%>
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

<%= curlistRec.medi_nm%>
<%= curlistRec.name_cd%>
<%= curlistRec.name%>
<%= curlistRec.advt_fee%>
<%= curlistRec.vat%>
<%= curlistRec.pubc_tot_amt%>
<%= curlistRec.cnt%>
<%= curlistRec.pubc_dt%>
<%= curlistRec.rnum%>
<%= curlist2Rec.medi_nm%>
<%= curlist2Rec.name_cd%>
<%= curlist2Rec.name%>
<%= curlist2Rec.advt_fee%>
<%= curlist2Rec.vat%>
<%= curlist2Rec.pubc_tot_amt%>
<%= curlist2Rec.cnt%>
<%= curlist2Rec.pubc_dt%>
<%= curlist2Rec.rnum%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Nov 14 18:47:02 KST 2017 */