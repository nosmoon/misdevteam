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


package chosun.ciis.mc.budg.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mc.budg.dm.*;
import chosun.ciis.mc.budg.rec.*;

/**
 * 
 */


public class MC_BUDG_2291_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MC_BUDG_2291_LDataSet(){}
	public MC_BUDG_2291_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(14);
		while(rset0.next()){
			MC_BUDG_2291_LCURLISTRecord rec = new MC_BUDG_2291_LCURLISTRecord();
			rec.buseonm = Util.checkString(rset0.getString("buseonm"));
			rec.buseocd = Util.checkString(rset0.getString("buseocd"));
			rec.hsanm = Util.checkString(rset0.getString("hsanm"));
			rec.hsacd = Util.checkString(rset0.getString("hsacd"));
			rec.brnm = Util.checkString(rset0.getString("brnm"));
			rec.brcd = Util.checkString(rset0.getString("brcd"));
			rec.budg_cd = Util.checkString(rset0.getString("budg_cd"));
			rec.yscdnm = Util.checkString(rset0.getString("yscdnm"));
			rec.budg_yymm = Util.checkString(rset0.getString("budg_yymm"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.maenm = Util.checkString(rset0.getString("maenm"));
			rec.dtls_medi_cd = Util.checkString(rset0.getString("dtls_medi_cd"));
			rec.dtls_medi_nm = Util.checkString(rset0.getString("dtls_medi_nm"));
			rec.use_dept_cd = Util.checkString(rset0.getString("use_dept_cd"));
			rec.bscdnm = Util.checkString(rset0.getString("bscdnm"));
			rec.req_amt_sum = Util.checkString(rset0.getString("req_amt_sum"));
			rec.fix_asin_amt_sum = Util.checkString(rset0.getString("fix_asin_amt_sum"));
			rec.fix_asin_qunt = Util.checkString(rset0.getString("fix_asin_qunt"));
			rec.fix_asin_uprc = Util.checkString(rset0.getString("fix_asin_uprc"));
			rec.fix_asin_amt = Util.checkString(rset0.getString("fix_asin_amt"));
			rec.budg_cndt_amt = Util.checkString(rset0.getString("budg_cndt_amt"));
			rec.fix_cndt_amt = Util.checkString(rset0.getString("fix_cndt_amt"));
			rec.rmks = Util.checkString(rset0.getString("rmks"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	MC_BUDG_2291_LDataSet ds = (MC_BUDG_2291_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MC_BUDG_2291_LCURLISTRecord curlistRec = (MC_BUDG_2291_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.buseonm%>
<%= curlistRec.buseocd%>
<%= curlistRec.hsanm%>
<%= curlistRec.hsacd%>
<%= curlistRec.brnm%>
<%= curlistRec.brcd%>
<%= curlistRec.budg_cd%>
<%= curlistRec.yscdnm%>
<%= curlistRec.budg_yymm%>
<%= curlistRec.medi_cd%>
<%= curlistRec.maenm%>
<%= curlistRec.dtls_medi_cd%>
<%= curlistRec.dtls_medi_nm%>
<%= curlistRec.use_dept_cd%>
<%= curlistRec.bscdnm%>
<%= curlistRec.req_amt_sum%>
<%= curlistRec.fix_asin_amt_sum%>
<%= curlistRec.fix_asin_qunt%>
<%= curlistRec.fix_asin_uprc%>
<%= curlistRec.fix_asin_amt%>
<%= curlistRec.budg_cndt_amt%>
<%= curlistRec.fix_cndt_amt%>
<%= curlistRec.rmks%>
<%= curlistRec.seq%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Aug 12 16:51:47 KST 2015 */