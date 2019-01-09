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
import chosun.ciis.ad.bas.rec.AD_BAS_3010_LCURLISTRecord;

/**
 * 
 */


public class AD_BAS_3010_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_BAS_3010_LDataSet(){}
	public AD_BAS_3010_LDataSet(String errcode, String errmsg){
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
			AD_BAS_3010_LCURLISTRecord rec = new AD_BAS_3010_LCURLISTRecord();
			rec.oth_clsf = Util.checkString(rset0.getString("oth_clsf"));
			rec.pubc_dt = Util.checkString(rset0.getString("pubc_dt"));
			rec.pubc_side = Util.checkString(rset0.getString("pubc_side"));
			rec.advcs = Util.checkString(rset0.getString("advcs"));
			rec.advt_cont = Util.checkString(rset0.getString("advt_cont"));
			rec.grp_cmpy = Util.checkString(rset0.getString("grp_cmpy"));
			rec.dn = Util.checkString(rset0.getString("dn"));
			rec.cm = Util.checkString(rset0.getString("cm"));
			rec.indt_clsf = Util.checkString(rset0.getString("indt_clsf"));
			rec.indt_clsf_nm = Util.checkString(rset0.getString("indt_clsf_nm"));
			rec.slcrg_pers = Util.checkString(rset0.getString("slcrg_pers"));
			rec.slcrg_pers_opn = Util.checkString(rset0.getString("slcrg_pers_opn"));
			rec.pubc_seq = Util.checkString(rset0.getString("pubc_seq"));
			rec.side_cd = Util.checkString(rset0.getString("side_cd"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	AD_BAS_3010_LDataSet ds = (AD_BAS_3010_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_BAS_3010_LCURLISTRecord curlistRec = (AD_BAS_3010_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.oth_clsf%>
<%= curlistRec.pubc_dt%>
<%= curlistRec.pubc_side%>
<%= curlistRec.advcs%>
<%= curlistRec.advt_cont%>
<%= curlistRec.grp_cmpy%>
<%= curlistRec.dn%>
<%= curlistRec.cm%>
<%= curlistRec.indt_clsf%>
<%= curlistRec.indt_clsf_nm%>
<%= curlistRec.slcrg_pers%>
<%= curlistRec.slcrg_pers_opn%>
<%= curlistRec.pubc_seq%>
<%= curlistRec.side_cd%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Jul 24 16:55:17 KST 2009 */