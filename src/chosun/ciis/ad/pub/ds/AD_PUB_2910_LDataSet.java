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


public class AD_PUB_2910_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_PUB_2910_LDataSet(){}
	public AD_PUB_2910_LDataSet(String errcode, String errmsg){
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
			AD_PUB_2910_LCURLISTRecord rec = new AD_PUB_2910_LCURLISTRecord();
			rec.medi_nm = Util.checkString(rset0.getString("medi_nm"));
			rec.pubc_dt = Util.checkString(rset0.getString("pubc_dt"));
			rec.advt_clas = Util.checkString(rset0.getString("advt_clas"));
			rec.sect_cd = Util.checkString(rset0.getString("sect_cd"));
			rec.sect_seq = Util.checkString(rset0.getString("sect_seq"));
			rec.pubc_dn = Util.checkString(rset0.getString("pubc_dn"));
			rec.pubc_cm = Util.checkString(rset0.getString("pubc_cm"));
			rec.dlco_nm1 = Util.checkString(rset0.getString("dlco_nm1"));
			rec.make_dn = Util.checkString(rset0.getString("make_dn"));
			rec.make_cm = Util.checkString(rset0.getString("make_cm"));
			rec.dlco_nm2 = Util.checkString(rset0.getString("dlco_nm2"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	AD_PUB_2910_LDataSet ds = (AD_PUB_2910_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_PUB_2910_LCURLISTRecord curlistRec = (AD_PUB_2910_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.medi_nm%>
<%= curlistRec.pubc_dt%>
<%= curlistRec.advt_clas%>
<%= curlistRec.sect_cd%>
<%= curlistRec.sect_seq%>
<%= curlistRec.pubc_dn%>
<%= curlistRec.pubc_cm%>
<%= curlistRec.dlco_nm1%>
<%= curlistRec.make_dn%>
<%= curlistRec.make_cm%>
<%= curlistRec.dlco_nm2%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Sep 09 11:56:56 KST 2009 */