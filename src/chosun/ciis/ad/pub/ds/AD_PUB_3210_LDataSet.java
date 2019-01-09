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


public class AD_PUB_3210_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_PUB_3210_LDataSet(){}
	public AD_PUB_3210_LDataSet(String errcode, String errmsg){
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
			AD_PUB_3210_LCURLISTRecord rec = new AD_PUB_3210_LCURLISTRecord();
			rec.pubc_dt = Util.checkString(rset0.getString("pubc_dt"));
			rec.yoil = Util.checkString(rset0.getString("yoil"));
			rec.sect_cd = Util.checkString(rset0.getString("sect_cd"));
			rec.sect_seq = Util.checkString(rset0.getString("sect_seq"));
			rec.sect_nm_cd = Util.checkString(rset0.getString("sect_nm_cd"));
			rec.chro_clsf = Util.checkString(rset0.getString("chro_clsf"));
			rec.advt_fee = Util.checkString(rset0.getString("advt_fee"));
			rec.pubc_cnt = Util.checkString(rset0.getString("pubc_cnt"));
			rec.pubc_uprc = Util.checkString(rset0.getString("pubc_uprc"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	AD_PUB_3210_LDataSet ds = (AD_PUB_3210_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_PUB_3210_LCURLISTRecord curlistRec = (AD_PUB_3210_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.pubc_dt%>
<%= curlistRec.yoil%>
<%= curlistRec.sect_cd%>
<%= curlistRec.sect_seq%>
<%= curlistRec.sect_nm_cd%>
<%= curlistRec.chro_clsf%>
<%= curlistRec.advt_fee%>
<%= curlistRec.pubc_cnt%>
<%= curlistRec.pubc_uprc%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Apr 08 10:05:41 KST 2013 */