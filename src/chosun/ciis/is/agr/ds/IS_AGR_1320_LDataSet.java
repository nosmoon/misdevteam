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


package chosun.ciis.is.agr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.agr.dm.*;
import chosun.ciis.is.agr.rec.*;

/**
 * 
 */


public class IS_AGR_1320_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public IS_AGR_1320_LDataSet(){}
	public IS_AGR_1320_LDataSet(String errcode, String errmsg){
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
			IS_AGR_1320_LCURLISTRecord rec = new IS_AGR_1320_LCURLISTRecord();
			rec.scat_dt = Util.checkString(rset0.getString("scat_dt"));
			rec.advcs_cd = Util.checkString(rset0.getString("advcs_cd"));
			rec.advcs_cd_nm = Util.checkString(rset0.getString("advcs_cd_nm"));
			rec.advt_nm = Util.checkString(rset0.getString("advt_nm"));
			rec.sale_clsf_nm = Util.checkString(rset0.getString("sale_clsf_nm"));
			rec.std_cd_nm = Util.checkString(rset0.getString("std_cd_nm"));
			rec.purc_uprc = Util.checkString(rset0.getString("purc_uprc"));
			rec.purc_qunt = Util.checkString(rset0.getString("purc_qunt"));
			rec.purc_amt = Util.checkString(rset0.getString("purc_amt"));
			rec.rvord_dt = Util.checkString(rset0.getString("rvord_dt"));
			rec.chrg_pers = Util.checkString(rset0.getString("chrg_pers"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	IS_AGR_1320_LDataSet ds = (IS_AGR_1320_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		IS_AGR_1320_LCURLISTRecord curlistRec = (IS_AGR_1320_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.scat_dt%>
<%= curlistRec.advcs_cd%>
<%= curlistRec.advcs_cd_nm%>
<%= curlistRec.advt_nm%>
<%= curlistRec.sale_clsf_nm%>
<%= curlistRec.std_cd_nm%>
<%= curlistRec.purc_uprc%>
<%= curlistRec.purc_qunt%>
<%= curlistRec.purc_amt%>
<%= curlistRec.rvord_dt%>
<%= curlistRec.chrg_pers%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed May 23 11:57:30 KST 2012 */