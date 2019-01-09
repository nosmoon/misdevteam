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
import chosun.ciis.ad.bas.rec.AD_BAS_1051_LCURLISTRecord;

/**
 * 
 */


public class AD_BAS_1051_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_BAS_1051_LDataSet(){}
	public AD_BAS_1051_LDataSet(String errcode, String errmsg) {
		this.errcode = errcode;
		this.errmsg = errmsg;
	}


	public ArrayList getCurlist() {
		return curlist;
	}


	public void setCurlist(ArrayList curlist) {
		this.curlist = curlist;
	}


	public String getErrcode() {
		return errcode;
	}


	public void setErrcode(String errcode) {
		this.errcode = errcode;
	}


	public String getErrmsg() {
		return errmsg;
	}


	public void setErrmsg(String errmsg) {
		this.errmsg = errmsg;
	}


	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}
		
		ResultSet rset0 = (ResultSet) cstmt.getObject(13);
		while(rset0.next()){
			AD_BAS_1051_LCURLISTRecord rec = new AD_BAS_1051_LCURLISTRecord();
			rec.dlco_no 		= Util.checkString(rset0.getString("dlco_no"));
			rec.dlco_nm 		= Util.checkString(rset0.getString("dlco_nm"));
			rec.ern 			= Util.checkString(rset0.getString("ern"));
			rec.grp_cmpy_cd 	= Util.checkString(rset0.getString("grp_cmpy_cd"));
			rec.grp_cmpy_nm 	= Util.checkString(rset0.getString("grp_cmpy_nm"));
			rec.indt_cd 		= Util.checkString(rset0.getString("indt_cd"));
			rec.indt_nm_1 		= Util.checkString(rset0.getString("indt_nm_1"));
			rec.indt_nm_2 		= Util.checkString(rset0.getString("indt_nm_2"));
			rec.type_cd 		= Util.checkString(rset0.getString("type_cd"));
			rec.type_nm 		= Util.checkString(rset0.getString("type_nm"));
			rec.slcrg_pers 		= Util.checkString(rset0.getString("slcrg_pers"));
			rec.slcrg_pers_nm	= Util.checkString(rset0.getString("slcrg_pers_nm"));
			rec.mchrg_pers 		= Util.checkString(rset0.getString("mchrg_pers"));
			rec.mchrg_pers_nm	= Util.checkString(rset0.getString("mchrg_pers_nm"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	AD_BAS_1120_LDataSet ds = (AD_BAS_1120_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_BAS_1120_LCURLISTRecord curlistRec = (AD_BAS_1120_LCURLISTRecord)ds.curlist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getPubc_amt()%>
<%= ds.getRcpm_amt()%>
<%= ds.getRcpm_rate()%>
<%= ds.getVexc_fee()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlistRec.advcs_nm%>
<%= curlistRec.pubc_amt%>
<%= curlistRec.rcpm_amt%>
<%= curlistRec.rcpm_rate%>
<%= curlistRec.vexc_fee%>
<%= curlistRec.avg_due_dd%>
<%= curlistRec.colt_rate%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Jun 25 19:30:42 KST 2009 */