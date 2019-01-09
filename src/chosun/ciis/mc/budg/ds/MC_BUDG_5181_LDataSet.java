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


public class MC_BUDG_5181_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MC_BUDG_5181_LDataSet(){}
	public MC_BUDG_5181_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			MC_BUDG_5181_LCURLISTRecord rec = new MC_BUDG_5181_LCURLISTRecord();
			rec.brcd1 = Util.checkString(rset0.getString("brcd1"));
			rec.brnm1 = Util.checkString(rset0.getString("brnm1"));
			rec.brcd2 = Util.checkString(rset0.getString("brcd2"));
			rec.brnm2 = Util.checkString(rset0.getString("brnm2"));
			rec.brcd3 = Util.checkString(rset0.getString("brcd3"));
			rec.brnm3 = Util.checkString(rset0.getString("brnm3"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.medi_cdnm = Util.checkString(rset0.getString("medi_cdnm"));
			rec.dtls_medi_cd = Util.checkString(rset0.getString("dtls_medi_cd"));
			rec.dtls_medi_nm = Util.checkString(rset0.getString("dtls_medi_nm"));
			rec.curmm_budg_amt = Util.checkString(rset0.getString("curmm_budg_amt"));
			rec.curmm_cndt_amt = Util.checkString(rset0.getString("curmm_cndt_amt"));
			rec.mon_gap = Util.checkString(rset0.getString("mon_gap"));
			rec.befmm_cndt_amt = Util.checkString(rset0.getString("befmm_cndt_amt"));
			rec.mon_rate = Util.checkString(rset0.getString("mon_rate"));
			rec.tot_budg_amt = Util.checkString(rset0.getString("tot_budg_amt"));
			rec.tot_cndt_amt = Util.checkString(rset0.getString("tot_cndt_amt"));
			rec.tot_gap = Util.checkString(rset0.getString("tot_gap"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	MC_BUDG_5181_LDataSet ds = (MC_BUDG_5181_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MC_BUDG_5181_LCURLISTRecord curlistRec = (MC_BUDG_5181_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.brcd1%>
<%= curlistRec.brnm1%>
<%= curlistRec.brcd2%>
<%= curlistRec.brnm2%>
<%= curlistRec.brcd3%>
<%= curlistRec.brnm3%>
<%= curlistRec.medi_cd%>
<%= curlistRec.medi_cdnm%>
<%= curlistRec.dtls_medi_cd%>
<%= curlistRec.dtls_medi_nm%>
<%= curlistRec.curmm_budg_amt%>
<%= curlistRec.curmm_cndt_amt%>
<%= curlistRec.mon_gap%>
<%= curlistRec.befmm_cndt_amt%>
<%= curlistRec.mon_rate%>
<%= curlistRec.tot_budg_amt%>
<%= curlistRec.tot_cndt_amt%>
<%= curlistRec.tot_gap%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Jul 21 18:01:41 KST 2014 */