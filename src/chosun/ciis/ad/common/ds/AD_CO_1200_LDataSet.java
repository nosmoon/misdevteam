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


package chosun.ciis.ad.common.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.common.dm.*;
import chosun.ciis.ad.common.rec.*;

/**
 * 
 */


public class AD_CO_1200_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_CO_1200_LDataSet(){}
	public AD_CO_1200_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(13);
		while(rset0.next()){
			AD_CO_1200_LCURLISTRecord rec = new AD_CO_1200_LCURLISTRecord();
			rec.dlco_no = Util.checkString(rset0.getString("dlco_no"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.ern = Util.checkString(rset0.getString("ern"));
			rec.presi_nm = Util.checkString(rset0.getString("presi_nm"));
			rec.eps_clsf_cd = Util.checkString(rset0.getString("eps_clsf_cd"));
			rec.addr = Util.checkString(rset0.getString("addr"));
			rec.chg_dt = Util.checkString(rset0.getString("chg_dt"));
			rec.del_yn = Util.checkString(rset0.getString("del_yn"));
			rec.dlco_clsf = Util.checkString(rset0.getString("dlco_clsf"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	AD_CO_1200_LDataSet ds = (AD_CO_1200_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_CO_1200_LCURLISTRecord curlistRec = (AD_CO_1200_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.dlco_no%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.ern%>
<%= curlistRec.presi_nm%>
<%= curlistRec.eps_clsf_cd%>
<%= curlistRec.addr%>
<%= curlistRec.chg_dt%>
<%= curlistRec.del_yn%>
<%= curlistRec.dlco_clsf%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Dec 10 11:30:37 KST 2012 */