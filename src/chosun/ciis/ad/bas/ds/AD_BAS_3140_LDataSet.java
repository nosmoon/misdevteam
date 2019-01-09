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


package chosun.ciis.ad.bas.ds;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import somo.framework.util.Util;
import chosun.ciis.ad.bas.rec.AD_BAS_3140_LCURLIST1Record;
import chosun.ciis.ad.bas.rec.AD_BAS_3140_LCURLIST2Record;

/**
 * 
 */


public class AD_BAS_3140_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_BAS_3140_LDataSet(){}
	public AD_BAS_3140_LDataSet(String errcode, String errmsg){
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
			AD_BAS_3140_LCURLIST1Record rec = new AD_BAS_3140_LCURLIST1Record();
			rec.medi_nm = Util.checkString(rset0.getString("medi_nm"));
			rec.pubc_dt = Util.checkString(rset0.getString("pubc_dt"));
			rec.wkdy = Util.checkString(rset0.getString("wkdy"));
			rec.tot_pcnt = Util.checkString(rset0.getString("tot_pcnt"));
			rec.sect_01_pcnt = Util.checkString(rset0.getString("sect_01_pcnt"));
			rec.sect_02_pcnt = Util.checkString(rset0.getString("sect_02_pcnt"));
			rec.sect_03_01_nm = Util.checkString(rset0.getString("sect_03_01_nm"));
			rec.sect_03_01_pcnt = Util.checkString(rset0.getString("sect_03_01_pcnt"));
			rec.sect_03_02_nm = Util.checkString(rset0.getString("sect_03_02_nm"));
			rec.sect_03_02_pcnt = Util.checkString(rset0.getString("sect_03_02_pcnt"));
			rec.sect_04_01_nm = Util.checkString(rset0.getString("sect_04_01_nm"));
			rec.sect_04_01_pcnt = Util.checkString(rset0.getString("sect_04_01_pcnt"));
			rec.sect_04_02_nm = Util.checkString(rset0.getString("sect_04_02_nm"));
			rec.sect_04_02_pcnt = Util.checkString(rset0.getString("sect_04_02_pcnt"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(7);
		while(rset1.next()){
			AD_BAS_3140_LCURLIST2Record rec = new AD_BAS_3140_LCURLIST2Record();
			rec.medi_nm = Util.checkString(rset1.getString("medi_nm"));
			rec.pubc_dt = Util.checkString(rset1.getString("pubc_dt"));
			rec.wkdy = Util.checkString(rset1.getString("wkdy"));
			rec.tot_pcnt = Util.checkString(rset1.getString("tot_pcnt"));
			rec.sect_01_pcnt = Util.checkString(rset1.getString("sect_01_pcnt"));
			rec.sect_02_pcnt = Util.checkString(rset1.getString("sect_02_pcnt"));
			rec.sect_03_01_nm = Util.checkString(rset1.getString("sect_03_01_nm"));
			rec.sect_03_01_pcnt = Util.checkString(rset1.getString("sect_03_01_pcnt"));
			rec.sect_03_02_nm = Util.checkString(rset1.getString("sect_03_02_nm"));
			rec.sect_03_02_pcnt = Util.checkString(rset1.getString("sect_03_02_pcnt"));
			rec.sect_04_01_nm = Util.checkString(rset1.getString("sect_04_01_nm"));
			rec.sect_04_01_pcnt = Util.checkString(rset1.getString("sect_04_01_pcnt"));
			rec.sect_04_02_nm = Util.checkString(rset1.getString("sect_04_02_nm"));
			rec.sect_04_02_pcnt = Util.checkString(rset1.getString("sect_04_02_pcnt"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	AD_BAS_3140_LDataSet ds = (AD_BAS_3140_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		AD_BAS_3140_LCURLIST1Record curlist1Rec = (AD_BAS_3140_LCURLIST1Record)ds.curlist1.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		AD_BAS_3140_LCURLIST2Record curlist2Rec = (AD_BAS_3140_LCURLIST2Record)ds.curlist2.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
<%= ds.getCurlist2()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlist1Rec.medi_nm%>
<%= curlist1Rec.pubc_dt%>
<%= curlist1Rec.wkdy%>
<%= curlist1Rec.tot_pcnt%>
<%= curlist1Rec.sect_01_pcnt%>
<%= curlist1Rec.sect_02_pcnt%>
<%= curlist1Rec.sect_03_01_nm%>
<%= curlist1Rec.sect_03_01_pcnt%>
<%= curlist1Rec.sect_03_02_nm%>
<%= curlist1Rec.sect_03_02_pcnt%>
<%= curlist1Rec.sect_04_01_nm%>
<%= curlist1Rec.sect_04_01_pcnt%>
<%= curlist1Rec.sect_04_02_nm%>
<%= curlist1Rec.sect_04_02_pcnt%>
<%= curlist2Rec.medi_nm%>
<%= curlist2Rec.pubc_dt%>
<%= curlist2Rec.wkdy%>
<%= curlist2Rec.tot_pcnt%>
<%= curlist2Rec.sect_01_pcnt%>
<%= curlist2Rec.sect_02_pcnt%>
<%= curlist2Rec.sect_03_01_nm%>
<%= curlist2Rec.sect_03_01_pcnt%>
<%= curlist2Rec.sect_03_02_nm%>
<%= curlist2Rec.sect_03_02_pcnt%>
<%= curlist2Rec.sect_04_01_nm%>
<%= curlist2Rec.sect_04_01_pcnt%>
<%= curlist2Rec.sect_04_02_nm%>
<%= curlist2Rec.sect_04_02_pcnt%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Apr 20 19:04:46 KST 2009 */