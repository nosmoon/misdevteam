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


package chosun.ciis.fc.func.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.func.dm.*;
import chosun.ciis.fc.func.rec.*;

/**
 * 
 */


public class FC_FUNC_1401_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_FUNC_1401_LDataSet(){}
	public FC_FUNC_1401_LDataSet(String errcode, String errmsg){
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
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(12);
		while(rset0.next()){
			FC_FUNC_1401_LCURLISTRecord rec = new FC_FUNC_1401_LCURLISTRecord();
			rec.eenosb = Util.checkString(rset0.getString("eenosb"));
			rec.note_clsf_cd_nm = Util.checkString(rset0.getString("note_clsf_cd_nm"));
			rec.stcdnm = Util.checkString(rset0.getString("stcdnm"));
			rec.stat_dt = Util.checkString(rset0.getString("stat_dt"));
			rec.mtry_dt = Util.checkString(rset0.getString("mtry_dt"));
			rec.note_amt = Util.checkString(rset0.getString("note_amt"));
			rec.eejpno = Util.checkString(rset0.getString("eejpno"));
			rec.issu_pers_nm = Util.checkString(rset0.getString("issu_pers_nm"));
			rec.bank_cd_nm = Util.checkString(rset0.getString("bank_cd_nm"));
			rec.pay_plac_cd_nm = Util.checkString(rset0.getString("pay_plac_cd_nm"));
			rec.dlco_cd = Util.checkString(rset0.getString("dlco_cd"));
			rec.eecompnm = Util.checkString(rset0.getString("eecompnm"));
			rec.eseecompcd = Util.checkString(rset0.getString("eseecompcd"));
			rec.eseecompnm = Util.checkString(rset0.getString("eseecompnm"));
			rec.eeghcdnm = Util.checkString(rset0.getString("eeghcdnm"));
			rec.esjphno = Util.checkString(rset0.getString("esjphno"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	FC_FUNC_1401_LDataSet ds = (FC_FUNC_1401_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_FUNC_1401_LCURLISTRecord curlistRec = (FC_FUNC_1401_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.eenosb%>
<%= curlistRec.note_clsf_cd_nm%>
<%= curlistRec.stcdnm%>
<%= curlistRec.stat_dt%>
<%= curlistRec.mtry_dt%>
<%= curlistRec.note_amt%>
<%= curlistRec.eejpno%>
<%= curlistRec.issu_pers_nm%>
<%= curlistRec.bank_cd_nm%>
<%= curlistRec.pay_plac_cd_nm%>
<%= curlistRec.dlco_cd%>
<%= curlistRec.eecompnm%>
<%= curlistRec.eseecompcd%>
<%= curlistRec.eseecompnm%>
<%= curlistRec.eeghcdnm%>
<%= curlistRec.esjphno%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Mar 09 14:16:02 KST 2009 */