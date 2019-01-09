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


package chosun.ciis.is.bas.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.bas.dm.*;
import chosun.ciis.is.bas.rec.*;

/**
 * 
 */


public class IS_BAS_1410_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public IS_BAS_1410_LDataSet(){}
	public IS_BAS_1410_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(20);
		while(rset0.next()){
			IS_BAS_1410_LCURLISTRecord rec = new IS_BAS_1410_LCURLISTRecord();
			rec.dlco_cd_seq = Util.checkString(rset0.getString("dlco_cd_seq"));
			rec.dlco_abrv_nm = Util.checkString(rset0.getString("dlco_abrv_nm"));
			rec.ern = Util.checkString(rset0.getString("ern"));
			rec.tel_no = Util.checkString(rset0.getString("tel_no"));
			rec.fax_no = Util.checkString(rset0.getString("fax_no"));
			rec.corp_clsf_nm = Util.checkString(rset0.getString("corp_clsf_nm"));
			rec.presi_nm = Util.checkString(rset0.getString("presi_nm"));
			rec.bizcond = Util.checkString(rset0.getString("bizcond"));
			rec.item = Util.checkString(rset0.getString("item"));
			rec.addr = Util.checkString(rset0.getString("addr"));
			rec.chg_dt_tm = Util.checkString(rset0.getString("chg_dt_tm"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	IS_BAS_1410_LDataSet ds = (IS_BAS_1410_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		IS_BAS_1410_LCURLISTRecord curlistRec = (IS_BAS_1410_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.dlco_cd_seq%>
<%= curlistRec.dlco_abrv_nm%>
<%= curlistRec.ern%>
<%= curlistRec.tel_no%>
<%= curlistRec.fax_no%>
<%= curlistRec.corp_clsf_nm%>
<%= curlistRec.presi_nm%>
<%= curlistRec.bizcond%>
<%= curlistRec.item%>
<%= curlistRec.addr%>
<%= curlistRec.chg_dt_tm%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Apr 26 16:34:03 KST 2012 */